/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

/**
 *
 * @author DEV
 */
public class Joueur {
    private String nom;
    private int score = 0;
    private static Joueur uniqueInstJou;

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }
    
    private Joueur(){
    }
    
    //Retourner l'instance Unique de l'objet Joueur
    public static Joueur getInstance(){
        if (uniqueInstJou == null) {
			uniqueInstJou = new Joueur();
		}
		return uniqueInstJou;
    }
    
    //Faire appelle a l'objet Jeu pour le démarrer 
    public void jouer(){
        Jeu j = Jeu.getInstance();
        this.setScore(0);
        j.demarrer();
    }
}
