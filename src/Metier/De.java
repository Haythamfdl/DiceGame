/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import Utilities.Observer;
import Utilities.Randomizer;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author DEV
 */
public class De extends Utilities.Sujet{
    private int valeur;
    private List<Observer> observers = new ArrayList<>(); 

    /**
     * @return the valeur
     */
    public int getValeur() {
        return valeur;
    }

    /**
     * @param l le JLabel ou il faut ecrire la valer du dé
     * @param valeur the valeur to set
     */
    public void setValeur(JLabel l ,int valeur) {
        this.valeur = valeur;
        notifierObservers(l, valeur);
    }
    
    public De(){
        valeur=1;
    }
    
    //Demande d'une valeur aléatoire du randomizer
    public void lancer(JLabel l){
        Randomizer r=new Randomizer();
        this.setValeur(l, r.getValeur());
    }
    
    //Attacher un Observer
    @Override
    public void ajouter(Observer o){
         observers.add(o);
    }

    //Déttacher un Observer
    @Override
    public void supprimer(Observer o){
        observers.remove(o);
    }

    //Notifier les Observers attacher
    public void notifierObservers(JLabel l ,int valeur){
        observers.stream().forEach((observer) -> {
            observer.update(l, valeur);
        });        
    }
    
}
