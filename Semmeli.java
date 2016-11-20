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
public class Semmeli extends Gebaeck implements Bachbares{

    private int fertiggebackt;
    
    public void bache(int zeit) {

    }
    
    

    public void incFertigGebackt() {
        fertiggebackt++;
    }

    @Override
    public void incFertigGebackt(int hitze) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
