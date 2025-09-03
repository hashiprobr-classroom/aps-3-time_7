package br.edu.insper.desagil.aps3.tindfy;

public class CupidoMusical extends Cupido {

    @Override
    public boolean deuMatch(Usuario u1, Usuario u2) {
        // verifica se já deu match normal
        if (super.deuMatch(u1, u2)) {
            //  verifica se tem pelo menos uma música em comum
            for (Musica m1 : u1.getMusicas()) {
                if (u2.jaAdicionou(m1)) {
                    return true;
                }
            }
        }
        return false;
    }
}

