/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DEV
 */
public class CareTaker {
    private List<Memento> listMementos;
    
    public CareTaker(){
        this.listMementos = new ArrayList<>();
    }
    
    public void ajouterMemento(Memento m){
        listMementos.add(m);
    }
    
    public Memento getMemento(int p){
        return listMementos.get(p);
    }
}
