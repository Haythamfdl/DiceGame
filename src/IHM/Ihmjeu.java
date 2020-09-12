/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Metier.De;
import Metier.Entree;
import Metier.HighScores;
import Metier.Jeu;
import Metier.Joueur;
import Persistance.JdbcKit;
import Persistance.PersisKit;
import Persistance.XmlKit;
import Utilities.CareTaker;
import Utilities.Memento;
import Utilities.Observer;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author DEV
 */
public class Ihmjeu extends javax.swing.JFrame {
    
    De d1 = new De();
    De d2 = new De();
    Observer o1= new Observer();
    Observer o2= new Observer();
    int s=0;
    int l=0;
    int ul= -1;
    CareTaker c = new CareTaker();
    Joueur j = Joueur.getInstance();
    
    /**
     * Creates new form Ihmjeu
     */
    public Ihmjeu() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lScore = new javax.swing.JLabel();
        lTotal = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lnumLancer = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lDe2 = new javax.swing.JLabel();
        lDe1 = new javax.swing.JLabel();
        Id2 = new javax.swing.JLabel();
        Id1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bLancer = new javax.swing.JButton();
        bUndo = new javax.swing.JButton();
        bNext = new javax.swing.JButton();
        bQuitter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lScore.setText("Score: 0");

        lTotal.setText("Total: 0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lScore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lTotal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lnumLancer.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lnumLancer.setText("0 Lancer");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(234, Short.MAX_VALUE)
                .addComponent(lnumLancer)
                .addContainerGap(233, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lnumLancer))
        );

        lDe2.setText(" ");

        lDe1.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lDe1)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(lDe2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(Id1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(Id2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDe2)
                    .addComponent(lDe1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Id1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Id2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        bLancer.setText("Lancer les Dés");
        bLancer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLancerActionPerformed(evt);
            }
        });

        bUndo.setText("Précédant");
        bUndo.setEnabled(false);
        bUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUndoActionPerformed(evt);
            }
        });

        bNext.setText("Suivant");
        bNext.setEnabled(false);
        bNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(bUndo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(bNext, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bLancer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(bLancer, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bUndo)
                    .addComponent(bNext)))
        );

        bQuitter.setBackground(new java.awt.Color(255, 0, 0));
        bQuitter.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bQuitter.setForeground(new java.awt.Color(102, 255, 255));
        bQuitter.setText("Quitter");
        bQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bQuitterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(bQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Attachement des observers et la défintion du titre de la fenétre avec le nom du Joueur
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setTitle("Jeu de "+j.getNom());
        d1.ajouter(o1);
        d2.ajouter(o2);
    }//GEN-LAST:event_formWindowOpened

    private void bQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bQuitterActionPerformed
        Ihmmenu w = new Ihmmenu();
        w.setVisible(true);
        dispose();
    }//GEN-LAST:event_bQuitterActionPerformed

    //Afficher le lancer suivant enregistrer dans l'historique
    private void bNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNextActionPerformed
        if(ul<l-1){
            bUndo.setEnabled(true);
            ul++;
            Memento m = c.getMemento(ul);
            lDe1.setText(Integer.toString(m.getValeurDe1()));
            lDe2.setText(Integer.toString(m.getValeurDe2()));
            Id1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Img/"+lDe1.getText()+".png")).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
            Id2.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Img/"+lDe2.getText()+".png")).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
            int t=m.getValeurDe1()+m.getValeurDe2();
            lTotal.setText("Total: "+ Integer.toString(t));
            if(ul==l-1)
                bNext.setEnabled(false);
        }
    }//GEN-LAST:event_bNextActionPerformed

    //Afficher le lancer précedant enregistrer dans l'historique
    private void bUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUndoActionPerformed
        if(ul>0){
            bNext.setEnabled(true);
            ul--;
            Memento m = c.getMemento(ul);
            lDe1.setText(Integer.toString(m.getValeurDe1()));
            lDe2.setText(Integer.toString(m.getValeurDe2()));
            Id1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Img/"+lDe1.getText()+".png")).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
            Id2.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Img/"+lDe2.getText()+".png")).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
            int t=m.getValeurDe1()+m.getValeurDe2();
            lTotal.setText("Total: "+ Integer.toString(t));
            if(ul==0)
                bUndo.setEnabled(false);
        }
    }//GEN-LAST:event_bUndoActionPerformed

    //Action pour lancer les dés
    private void bLancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLancerActionPerformed
        if(l<10){
            bUndo.setEnabled(true);
            bNext.setEnabled(false);
            l++;                                                                //Incrémentation du compteur des lancers
            ul=l-1;                                                             //Incrémentation du compteur de l'historique des lancers
            d1.lancer(lDe1);
            d2.lancer(lDe2);
            Memento m = new Memento(d1.getValeur(), d2.getValeur());            
            c.ajouterMemento(m);                                                //Enregistrement des valeurs du lancer courant dans l'historique
            int t=d1.getValeur()+d2.getValeur();                                //Calcule du total des valeurs des deux dés  
            if(t==7){                                                           //Ajout au score si le total des valeurs des dés est éguale a 7
                s=j.getScore()+10;
                j.setScore(s);
            }
            lTotal.setText("Total: "+ Integer.toString(t));
            lScore.setText("Score: "+ Integer.toString(s));
            lnumLancer.setText(Integer.toString(l)+" Lancer");
            Id1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Img/"+lDe1.getText()+".png")).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));         //Chargement de l'image du dé avec la valeur reçue
            Id2.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Img/"+lDe2.getText()+".png")).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));         
            if(l==10){
                bLancer.setEnabled(false);
                Entree e=new Entree(j.getNom(), j.getScore());                  //Création d'une nouvelle Entrée 
                PersisKit p;
                HighScores hs;
                if(Jeu.getInstance().getTypePersistance().equals("Xml"))        //Vérification du type de pérsitance
                    p=new XmlKit();
                else
                    p=new JdbcKit();
                hs = p.MakeKit();
                hs.charger();                                                   //Chargement des Highscores d'un fichier Xml ou de la base mySQL (Création d'un nouveau fichier Xml si il n'éxiste pas)
                hs.ajouter(e);                                                  //Ajout du nouveau score
                hs.sauvegarder();                                               //Sauvegarde des nouvelles données dans un fichier Xml ou dans mySQL 
                hs.afficher();                                                  //Ourir la fenétre des Highscores
            }
        }
    }//GEN-LAST:event_bLancerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ihmjeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ihmjeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ihmjeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ihmjeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
     
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ihmjeu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Id1;
    private javax.swing.JLabel Id2;
    private javax.swing.JButton bLancer;
    private javax.swing.JButton bNext;
    private javax.swing.JButton bQuitter;
    private javax.swing.JButton bUndo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JLabel lDe1;
    public javax.swing.JLabel lDe2;
    private javax.swing.JLabel lScore;
    private javax.swing.JLabel lTotal;
    private javax.swing.JLabel lnumLancer;
    // End of variables declaration//GEN-END:variables

    //Définition de l'icone de la fenétre
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/AppIcon.png")));
    }
}
