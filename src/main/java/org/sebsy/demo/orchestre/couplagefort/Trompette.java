package org.sebsy.demo.orchestre.couplagefort;

public class Trompette implements Instrument {
    @Override
    public void afficher() {
        System.out.println("Je suis une trompette...");
    }

    @Override
    public void jouer() {
        System.out.println("TUT TUT TUT");
    }
}
