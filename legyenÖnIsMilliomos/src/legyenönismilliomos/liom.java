/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legyenönismilliomos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.paint.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import model.DBModel;
import model.IModel;
import model.Kerdes;

/**
 *
 * @author Kata
 */
public class liom extends javax.swing.JFrame implements ActionListener {

    private IModel model;
    private Vector<Kerdes> kerdesek;
    int szamlalo = 0;



   private void ellenorzes(int tipp, JButton button){
        
         try {
            kerdesek = model.getAllKerdes();
            Kerdes aktkerdes = kerdesek.get(szamlalo);
            if (aktkerdes.getHelyesvalasz() == tipp) {
                button.setBackground(java.awt.Color.green);
                szamlalo++;
                
            } else {
                button.setBackground(java.awt.Color.red);

            }
        } catch (SQLException ex) {
            Logger.getLogger(liom.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    

    public liom() {
        initComponents();

        setLocationRelativeTo(null);
        setTitle("Legyen Ön is milliomos!");

        String dbURL = "jdbc:mysql://localhost:3306/loim";
        String dbUser = "root";
        String dbPass = "1234";

        try {
            Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
            model = new DBModel(conn);

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        jlstnyeremeny.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Start = new javax.swing.JButton();
        kerdes = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlstnyeremeny = new javax.swing.JList<>();
        valasz0 = new javax.swing.JButton();
        valasz2 = new javax.swing.JButton();
        valasz1 = new javax.swing.JButton();
        valasz3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/kerdezoKep.png"))); // NOI18N
        Start.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });

        kerdes.setBackground(new java.awt.Color(255, 51, 255));
        kerdes.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        kerdes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kerdes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kerdesActionPerformed(evt);
            }
        });

        jlstnyeremeny.setBackground(new java.awt.Color(255, 0, 255));
        jlstnyeremeny.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jlstnyeremeny.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlstnyeremeny.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "40 000 000", "20 000 000", "10 000 000", "5 000 000", "3 000 000", "1 500 000", "800 000", "500 000", "300 000", "200 000", "100 000", "50 000", "25 000", "10 000", "5 000" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlstnyeremeny.setFocusable(false);
        jScrollPane1.setViewportView(jlstnyeremeny);

        valasz0.setBackground(new java.awt.Color(255, 0, 255));
        valasz0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        valasz0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        valasz0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valasz0ActionPerformed(evt);
            }
        });

        valasz2.setBackground(new java.awt.Color(255, 0, 255));
        valasz2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        valasz2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        valasz2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valasz2ActionPerformed(evt);
            }
        });

        valasz1.setBackground(new java.awt.Color(255, 0, 255));
        valasz1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        valasz1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        valasz1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valasz1ActionPerformed(evt);
            }
        });

        valasz3.setBackground(new java.awt.Color(255, 51, 255));
        valasz3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        valasz3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        valasz3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valasz3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(Start, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kerdes, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(valasz2, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                                    .addComponent(valasz0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valasz1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(valasz3, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Start, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(kerdes, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(valasz0, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(valasz1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(valasz2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valasz3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed

        try {

            kerdesek = model.getAllKerdes();
            kerdes.setText(" " + kerdesek.get(szamlalo).getKerdes());

            valasz0.setText(kerdesek.get(szamlalo).getValasz0());
            valasz0.setBackground(java.awt.Color.white);
            valasz1.setText(kerdesek.get(szamlalo).getValasz1());
            valasz1.setBackground(java.awt.Color.white);
            valasz2.setText(kerdesek.get(szamlalo).getValasz2());
            valasz2.setBackground(java.awt.Color.white);
            valasz3.setText(kerdesek.get(szamlalo).getValasz3());
            valasz3.setBackground(java.awt.Color.white);
            jlstnyeremeny.setSelectedIndex(14-szamlalo);
            if (szamlalo>14) {
                JOptionPane.showMessageDialog(rootPane, "Gratulálok, nyertél!", "Gratulálok, nyertél!", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        if (szamlalo == 15) {
            
        }
     }//GEN-LAST:event_StartActionPerformed

    private void valasz0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valasz0ActionPerformed
        ellenorzes(0, valasz0);
    }//GEN-LAST:event_valasz0ActionPerformed

    private void valasz1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valasz1ActionPerformed
        ellenorzes(1, valasz1);
     }//GEN-LAST:event_valasz1ActionPerformed

    private void valasz2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valasz2ActionPerformed
         ellenorzes(2, valasz2);
     }//GEN-LAST:event_valasz2ActionPerformed

    private void valasz3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valasz3ActionPerformed
        ellenorzes(3, valasz3);
        {
        
        }     }//GEN-LAST:event_valasz3ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
getContentPane().setBackground(java.awt.Color.DARK_GRAY);    }//GEN-LAST:event_formWindowActivated

    private void kerdesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kerdesActionPerformed
        
    }//GEN-LAST:event_kerdesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new liom().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Start;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> jlstnyeremeny;
    private javax.swing.JTextField kerdes;
    private javax.swing.JButton valasz0;
    private javax.swing.JButton valasz1;
    private javax.swing.JButton valasz2;
    private javax.swing.JButton valasz3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

