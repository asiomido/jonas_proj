/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.m226.brötli;

/**
 *
 * @author Jonas
 */
public abstract class Gebaeck {

    private int durchmesser;
    private int backZeit;
    private int benötigtHitze;
    private int maxHitze;
    private int fertigGebackt;

    public void bache(int zeit) {

    }

    public Gebaeck(int durchmesser, int backZeit, int benötigtHitze, int maxHitze, int fertigGebackt) {
        this.durchmesser = durchmesser;
        this.backZeit = backZeit;
        this.benötigtHitze = benötigtHitze;
        this.maxHitze = maxHitze;
        this.fertigGebackt = fertigGebackt;
        
        
    }

    public int getDurchmesser() {
        return durchmesser;
    }

    public int getBackZeit() {
        return backZeit;
    }

    public int getBenötigtHitze() {
        return benötigtHitze;
    }

    public int getMaxHitze() {
        return maxHitze;
    }

    public int getFertigGebackt() {
        return fertigGebackt;
    }

    public int getFertiggebackt() {
        return 0;
        
    }

}
