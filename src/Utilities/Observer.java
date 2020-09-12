/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import javax.swing.JLabel;

/**
 *
 * @author DEV
 */
public class Observer {
        
        public Observer(){
            
        }
        
        //Modifie la valeur afficher dans le JLabel qui se trouve dans la fenétre du Jeu utiliser avec la valeur du dé dans les paramétres
    	public void update(JLabel l ,int valeur){
            l.setText(Integer.toString(valeur));
        }
}
