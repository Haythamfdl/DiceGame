/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

/**
 *
 * @author DEV
 */
public class Memento {
    private int valeurDe1;
    private int valeurDe2;

    /**
     * @return the valeurDe1
     */
    public int getValeurDe1() {
        return valeurDe1;
    }

    /**
     * @return the valeurDe2
     */
    public int getValeurDe2() {
        return valeurDe2;
    }
    
    public Memento(int valeurDe1, int valeurDe2){
        this.valeurDe1 = valeurDe1;
        this.valeurDe2 = valeurDe2;
    }
}
