/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance;
import IHM.IhmHighscore;
import Metier.Entree;
import java.sql.*;
import Metier.HighScores;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DEV
 */
public class HighScoresJdbc extends HighScores{
    
    private static HighScores uniqueInstHS;
    private final String user;
    private final String pass;
    private final String url;
    
    protected HighScoresJdbc(){
        this.url = "jdbc:mysql://localhost:3306/dicegame";
        this.pass = "root";
        this.user = "root";
        this.scores = new ArrayList<>();
    }
    
    //Retourner l'instance unique de l'objet HighscoresJdbc
    public static HighScores getInstance(){
        if (uniqueInstHS == null) {
			uniqueInstHS = new HighScoresJdbc();
		}
		return uniqueInstHS;
    }
    
    //Charger et afficher la fenétre des Highscores
    @Override
       public void afficher(){
       IhmHighscore w=new IhmHighscore();
         try {
            Connection con=DriverManager.getConnection(url,user,pass);          //Test de la connexion
            this.charger();
            w.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(HighScoresJdbc.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(new Frame(), "Erreur de connection","Erreur",JOptionPane.ERROR_MESSAGE); //Message d'erreur
            }
    }
    
    //Charger les données d'une base mySql 
    @Override
    public void charger(){
        this.empty();
        Connection con;
        String sql="SELECT * FROM highscores";
        ResultSet rs;
        try {
            con=DriverManager.getConnection(url,user,pass);
            PreparedStatement ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                this.ajouter(new Entree(rs.getString("Nom"), rs.getInt("Score")));
            }
            Collections.sort(scores);
        } catch (SQLException ex) {
            Logger.getLogger(HighScoresJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    //Sauvegarder le dernier score ajouter dans la base mySql
    @Override
    public void sauvegarder(){
        Connection con;
        String sql="INSERT INTO highscores VALUES (null,?,?)";
        int i =scores.size()-1;
        try {
            con=DriverManager.getConnection(url,user,pass);
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1,this.getEntree(i).getNom());
                ps.setString(2,Integer.toString(this.getEntree(i).getScore()));
                ps.execute();
            }   
        } catch (SQLException ex) {
            Logger.getLogger(HighScoresJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
