/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import IHM.Ihmjeu;

/**
 *
 * @author DEV
 */
public class Jeu {
    private String typePersistance = "Xml";
    private static Jeu uniqueInstJeu;

    /**
     * @return the typePersistance
     */
    public String getTypePersistance() {
        return typePersistance;
    }

    /**
     * @param typePersistance the typePersistance to set
     */
    public void setTypePersistance(String typePersistance) {
        this.typePersistance = typePersistance;
    }
    
    private Jeu(){
        
    }
    
    //Retourner l'instance Unique de l'objet Jeu
    public static Jeu getInstance(){
        if (uniqueInstJeu == null) {
			uniqueInstJeu = new Jeu();
		}
		return uniqueInstJeu;
    }
    
    //Ouvrir la fenétre du Jeu
    public void demarrer(){
       Ihmjeu w=new Ihmjeu();
       w.setVisible(true);
    }
}
