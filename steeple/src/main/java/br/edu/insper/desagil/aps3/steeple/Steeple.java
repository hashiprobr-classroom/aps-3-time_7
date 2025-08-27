package br.edu.insper.desagil.aps3.steeple;

import java.util.ArrayList;
import java.util.List;

public class Steeple extends Element {
    private List<Defender> defenders;

    public Steeple(int x, int y, int width, int height) {
        super(x, y, width, height);
        this.defenders = new ArrayList<>();
    }

    public List<Defender> getDefenders() {
        return defenders;
    }

    public void add(Defender defender) {
        defenders.add(defender);
    }
}
