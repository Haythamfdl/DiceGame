/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance;

import Metier.HighScores;

/**
 *
 * @author DEV
 */
public class XmlKit implements PersitKit{

    public XmlKit() {
    }
    
    //Retourner l'instance unique de l'objet HighscoresXML
    @Override
    public HighScores MakeKit(){
        return HighScoresXML.getInstance();
    }
}
