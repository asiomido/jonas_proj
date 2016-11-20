/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.m226.brötli;

import java.util.ArrayList;

/**
 *
 * @author Jonas
 */
public class Backofen {

    private int maxplaetze = 0;
    private int zielHitze;
    private int hitze;
    private int neuGebäck;
    private ArrayList<Bachbares> imOfen;
    
    public Backofen(int maxplaetze) {

    }

    public void heizen() {
        hitze++;
    }

    public void kühlen() {
        hitze--;
    }
        
    public void schiebRein(Bachbares bachbares) {
        this.imOfen.add(bachbares);
    }

    public void nimmRaus(Bachbares bachbares) {
        this.imOfen.remove(imOfen);
    }

    public void bache() {
        for (Bachbares bachbares : imOfen)
        {
            bachbares.incFertigGebackt(this.hitze);
        }
    }

    public int getHitze() {
        return 0;
    }

}
