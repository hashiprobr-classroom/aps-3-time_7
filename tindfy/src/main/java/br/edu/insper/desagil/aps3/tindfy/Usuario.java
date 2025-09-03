package br.edu.insper.desagil.aps3.tindfy;


import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa {

    private final List<Musica> musicas;

    // Construtor NÃO recebe música: a lista começa vazia
    public Usuario(int id, String nome) {
        super(id, nome);
        this.musicas = new ArrayList<>();
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    // verifica se já existe música do mesmo ARTISTA (comparando id) e mesmo TÍTULO (equals)
    public boolean jaAdicionou(Musica musica) {
        for (Musica m : musicas) {
            if (m.getArtista().getID() == musica.getArtista().getID()
                    && m.getTitulo().equals(musica.getTitulo())) {
                return true;
            }
        }
        return false;
    }

    public void adiciona(Musica musica) {
        if (!jaAdicionou(musica)) {
            musicas.add(musica);
        }
    }
}
