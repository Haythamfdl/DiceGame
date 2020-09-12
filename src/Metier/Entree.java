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
public class Entree implements Comparable<Entree>{
    private String nom;
    private int score;
    
    public Entree(String nom, int score){
        this.nom = nom;
        this.score = score;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    //Fonction de Comparable qui permet de faire le trie des Entrée de maniére décroissante
    @Override
    public int compareTo(Entree o) {
        if(this.score == o.score)
            return 0;
        if(this.score < o.score)
            return 1;
        else
            return -1;
    }
}
