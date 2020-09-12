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
public class Randomizer {
    
      public Randomizer(){
        
    }
    /** Retourne une valeur aléatoire entre 1 et 6
     * @return the valeur
     */
    public int getValeur() {
        return (int)(Math.random()*6)+1;
    }
    
  
}
