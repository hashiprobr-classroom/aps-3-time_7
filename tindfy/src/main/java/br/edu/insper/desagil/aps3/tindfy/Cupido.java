package br.edu.insper.desagil.aps3.tindfy;

import br.edu.insper.desagil.aps3.tindfy.Usuario;

import java.util.*;

public class Cupido {
    private Map<Integer, List<Integer>> likes;

    public Cupido() {
        this.likes = new HashMap<>();
    }

    public void daLike(int id1, int id2) {
        likes.putIfAbsent(id1, new ArrayList<>());
        List<Integer> lista = likes.get(id1);
        if (!lista.contains(id2)) {
            lista.add(id2);
        }
    }

    public boolean deuMatch(Usuario u1, Usuario u2) {
        int id1 = u1.getID();
        int id2 = u2.getID();

        return likes.containsKey(id1) && likes.get(id1).contains(id2) &&
                likes.containsKey(id2) && likes.get(id2).contains(id1);
    }
}
