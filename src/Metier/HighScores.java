/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DEV
 */
public abstract class HighScores {
    protected List<Entree> scores;
    
    public void ajouter(Entree e){
        scores.add(e);
    }
    
    protected HighScores(){
        this.scores = new ArrayList<>();
    }
    
    public void afficher(){
       
    }
    
    public void charger(){
        
    }
    
    public void sauvegarder(){
        
    }
    
    //Retourner une Entrée a l'aide d'un Index
    public Entree getEntree(int i){
        return scores.get(i);
    }
    
    //Retourner la taille de liste des scores 
    public int getSize(){
        return this.scores.size();
    }
    
    //Vider la list des scores
    public void empty(){
        this.scores.clear();
    }
}
