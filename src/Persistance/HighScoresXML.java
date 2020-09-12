/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance;

import IHM.IhmHighscore;
import Metier.Entree;
import Metier.HighScores;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author DEV
 */
public class HighScoresXML extends HighScores{
    
    private static HighScores uniqueInstHS;
    private final String path ="./Dicesave.xml"; 
   
    private HighScoresXML(){
        this.scores = new ArrayList<>();
    }
    
    //Retourner l'instance unique de l'objet HighscoresXML
    public static HighScores getInstance(){
        if (uniqueInstHS == null) {
			uniqueInstHS = new HighScoresXML();
		}
		return uniqueInstHS;
    }
    
    //Charger et afficher la fenétre des Highscores
    @Override
       public void afficher(){
       IhmHighscore w=new IhmHighscore();
       this.charger();
       w.setVisible(true);
    }
    
    //Charger les données d'un fichier XML 
    @Override
    public void charger(){
        File xml = new File(path);
        if (!xml.isFile()){                                                     //Vérification de l'éxistance d'un fichier sauvegarde
                this.empty();                                                   //Création d'un fichier Xml contenant des scores générique
                this.ajouter(new Entree("JOUEUR 1", 0));  
                this.ajouter(new Entree("JOUEUR 2", 10));
                this.ajouter(new Entree("JOUEUR 3", 20));
                this.ajouter(new Entree("JOUEUR 4", 30));
                this.ajouter(new Entree("JOUEUR 5", 40));
                this.ajouter(new Entree("JOUEUR 6", 50));
                this.ajouter(new Entree("JOUEUR 7", 60));
                this.ajouter(new Entree("JOUEUR 8", 70));
                this.ajouter(new Entree("JOUEUR 9", 80));
                this.ajouter(new Entree("JOUEUR 10", 90));
                this.sauvegarder();
            }
        this.empty();
        try {
            DocumentBuilderFactory bf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = bf.newDocumentBuilder();
            Document doc = db.parse(xml);
            doc.getDocumentElement().normalize();
            NodeList nlist =doc.getElementsByTagName("JOUEUR");
            for (int i = 0; i < nlist.getLength(); i++) {
                Node n = nlist.item(i);
                if(n.getNodeType() == Node.ELEMENT_NODE){
                    Element e = (Element) n;
                    String nom = e.getElementsByTagName("Nom").item(0).getTextContent();
                    int score =Integer.valueOf(e.getElementsByTagName("Score").item(0).getTextContent());
                    this.ajouter(new Entree(nom, score));
                }
                Collections.sort(scores);                                       //Le trie des scores
            }
            
        } catch (ParserConfigurationException | SAXException | IOException ex) {
            Logger.getLogger(HighScoresXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Sauvegarder les scores dans un fichier XML
    @Override
     public void sauvegarder(){
        try {
            DocumentBuilderFactory bf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = bf.newDocumentBuilder();
            Document doc = db.newDocument();
            Element root = doc.createElement("HIGHSCORES");
            doc.appendChild(root);
            for (int i = 0; i < scores.size(); i++) {
                Element joueur = doc.createElement("JOUEUR");
                root.appendChild(joueur);
                Element entreen =doc.createElement("Nom");
                Element entrees =doc.createElement("Score");
                entreen.appendChild(doc.createTextNode(this.getEntree(i).getNom()));
                entrees.appendChild(doc.createTextNode(Integer.toString(this.getEntree(i).getScore())));
                joueur.appendChild(entreen);
                joueur.appendChild(entrees);
            }
            TransformerFactory tf=TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();
            DOMSource source = new DOMSource(doc);
            File xml = new File(path);
            StreamResult sr=new StreamResult(xml);
            t.transform(source, sr);
            
        } catch (ParserConfigurationException | TransformerConfigurationException ex) {
            Logger.getLogger(HighScoresXML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(HighScoresXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}
