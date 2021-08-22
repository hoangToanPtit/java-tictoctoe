/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagame;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author Nguyen Van Toan
 */
public class IFTic extends javax.swing.JFrame {

    /**
     * Creates new form IFTic
     */
    public IFTic() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        but3 = new javax.swing.JButton();
        but2 = new javax.swing.JButton();
        but1 = new javax.swing.JButton();
        but6 = new javax.swing.JButton();
        but5 = new javax.swing.JButton();
        but4 = new javax.swing.JButton();
        but9 = new javax.swing.JButton();
        but8 = new javax.swing.JButton();
        but7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labTurn = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        txtWinner = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TestTicTacToe");
        setBackground(new java.awt.Color(204, 255, 51));

        but3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        but3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but3ActionPerformed(evt);
            }
        });

        but2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        but2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but2ActionPerformed(evt);
            }
        });

        but1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        but1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but1ActionPerformed(evt);
            }
        });

        but6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        but6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but6ActionPerformed(evt);
            }
        });

        but5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        but5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but5ActionPerformed(evt);
            }
        });

        but4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        but4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but4ActionPerformed(evt);
            }
        });

        but9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        but9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but9ActionPerformed(evt);
            }
        });

        but8.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        but8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but8ActionPerformed(evt);
            }
        });

        but7.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        but7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but7ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("TIC TAC TOE");

        labTurn.setBackground(new java.awt.Color(51, 255, 102));
        labTurn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labTurn.setForeground(new java.awt.Color(51, 255, 102));
        labTurn.setText("TURN OF A");

        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton10.setText("EXIT");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton11.setText("NEW GAME");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        txtWinner.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtWinner.setForeground(new java.awt.Color(255, 51, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(but4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(but5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(but6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(but1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(but2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(but3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(labTurn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(but7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(but8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(but9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(135, 135, 135))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(127, 127, 127))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jButton11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jButton10)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtWinner, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(labTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(but1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(but4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(but7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(txtWinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean checkButtonUsed(JButton x) {
        if (x.getText().length() == 0) {
            return false;
        } else {
            return true;
        }
    }
    
    private boolean checkWinner(String s) {
        if (but1.getText().equals(s) && but2.getText().equals(s) && but3.getText().equals(s)) {
            but1.setForeground(Color.PINK);
            but2.setForeground(Color.PINK);
            but3.setForeground(Color.PINK);
            if (s.equals("X")) {
                txtWinner.setText("A WIN");
            } else {
                txtWinner.setText("B WIN");
            }
            win=true;
            return true;
        }
        if (but1.getText().equals(s) && but4.getText().equals(s) && but7.getText().equals(s)) {
            but1.setForeground(Color.PINK);
            but4.setForeground(Color.PINK);
            but7.setForeground(Color.PINK);
            if (s.equals("X")) {
                txtWinner.setText("A WIN");
            } else {
                txtWinner.setText("B WIN");
            }
            win=true;
            return true;
        }
        if (but1.getText().equals(s) && but5.getText().equals(s) && but9.getText().equals(s)) {
            but1.setForeground(Color.PINK);
            but5.setForeground(Color.PINK);
            but9.setForeground(Color.PINK);
            if (s.equals("X")) {
                txtWinner.setText("A WIN");
            } else {
                txtWinner.setText("B WIN");
            }
            win=true;
            return true;
        }
        if (but2.getText().equals(s) && but5.getText().equals(s) && but8.getText().equals(s)) {
            but2.setForeground(Color.PINK);
            but5.setForeground(Color.PINK);
            but8.setForeground(Color.PINK);
            if (s.equals("X")) {
                txtWinner.setText("A WIN");
            } else {
                txtWinner.setText("B WIN");
            }
            win=true;
            return true;
        }
        if (but4.getText().equals(s) && but5.getText().equals(s) && but6.getText().equals(s)) {
            but4.setForeground(Color.PINK);
            but5.setForeground(Color.PINK);
            but6.setForeground(Color.PINK);
            return true;
        }
        if (but7.getText().equals(s) && but8.getText().equals(s) && but9.getText().equals(s)) {
            but7.setForeground(Color.PINK);
            but8.setForeground(Color.PINK);
            but9.setForeground(Color.PINK);
            if (s.equals("X")) {
                txtWinner.setText("A WIN");
            } else {
                txtWinner.setText("B WIN");
            }
            return true;
        }
        if (but3.getText().equals(s) && but6.getText().equals(s) && but9.getText().equals(s)) {
            but3.setForeground(Color.PINK);
            but6.setForeground(Color.PINK);
            but9.setForeground(Color.PINK);
            if (s.equals("X")) {
                txtWinner.setText("A WIN");
            } else {
                txtWinner.setText("B WIN");
            }
            win=true;
            return true;
        }
        if (but3.getText().equals(s) && but5.getText().equals(s) && but7.getText().equals(s)) {
            but3.setForeground(Color.PINK);
            but5.setForeground(Color.PINK);
            but7.setForeground(Color.PINK);
            if (s.equals("X")) {
                txtWinner.setText("A WIN");
            } else {
                txtWinner.setText("B WIN");
            }
            win=true;
            return true;
        }
        return false;
    }

    private void but1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but1ActionPerformed
        // TODO add your handling code here:
        if (!checkButtonUsed(but1) && !win) {
            if (labTurn.getText().equals("TURN OF A")) {
                but1.setText("X");
                labTurn.setForeground(new java.awt.Color(255, 0, 0));
                labTurn.setText("TURN OF B");
                checkWinner("X");
            } else {
                but1.setText("O");
                labTurn.setBackground(new java.awt.Color(0, 255, 0));
                labTurn.setText("TURN OF A");
                checkWinner("O");
            }
        }
    }//GEN-LAST:event_but1ActionPerformed

    private void but4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but4ActionPerformed
        // TODO add your handling code here:
        if (!checkButtonUsed(but4) && !win) {
            if (labTurn.getText().equals("TURN OF A")) {
                but4.setText("X");
                labTurn.setForeground(new java.awt.Color(255, 0, 0));
                labTurn.setText("TURN OF B");
                checkWinner("X");
            } else {
                but4.setText("O");
                labTurn.setBackground(new java.awt.Color(0, 255, 0));
                labTurn.setText("TURN OF A");
                checkWinner("O");
            }
        }
    }//GEN-LAST:event_but4ActionPerformed

    private void but7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but7ActionPerformed
        // TODO add your handling code here:
        if (!checkButtonUsed(but7)&& !win) {
            if (labTurn.getText().equals("TURN OF A")) {
                but7.setText("X");
                labTurn.setForeground(new java.awt.Color(255, 0, 0));
                labTurn.setText("TURN OF B");
                checkWinner("X");
            } else {
                but7.setText("O");
                labTurn.setForeground(new java.awt.Color(0, 255, 0));
                labTurn.setText("TURN OF A");
                checkWinner("0");
            }
            
        }
    }//GEN-LAST:event_but7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void but2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but2ActionPerformed
        // TODO add your handling code here:
        if (!checkButtonUsed(but2)&& !win) {
            if (labTurn.getText().equals("TURN OF A")) {
                but2.setText("X");
                labTurn.setForeground(new java.awt.Color(255, 0, 0));
                labTurn.setText("TURN OF B");
                checkWinner("X");
            } else {
                but2.setText("O");
                labTurn.setForeground(new java.awt.Color(0, 255, 0));
                labTurn.setText("TURN OF A");
                checkWinner("O");
            }
        }
    }//GEN-LAST:event_but2ActionPerformed

    private void but3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but3ActionPerformed
        // TODO add your handling code here:
        if (!checkButtonUsed(but3)&& !win) {
            if (labTurn.getText().equals("TURN OF A")) {
                but3.setText("X");
                labTurn.setForeground(new java.awt.Color(255, 0, 0));
                labTurn.setText("TURN OF B");
                checkWinner("X");
            } else {
                but3.setText("O");
                labTurn.setForeground(new java.awt.Color(0, 255, 0));
                labTurn.setText("TURN OF A");
                checkWinner("O");
            }
        }
    }//GEN-LAST:event_but3ActionPerformed

    private void but5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but5ActionPerformed
        // TODO add your handling code here:
        if (!checkButtonUsed(but5)&& !win) {
            if (labTurn.getText().equals("TURN OF A")) {
                but5.setText("X");
                labTurn.setForeground(new java.awt.Color(255, 0, 0));
                labTurn.setText("TURN OF B");
                checkWinner("X");
            } else {
                but5.setText("O");
                labTurn.setForeground(new java.awt.Color(0, 255, 0));
                labTurn.setText("TURN OF A");
                checkWinner("O");
            }
        }
    }//GEN-LAST:event_but5ActionPerformed

    private void but6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but6ActionPerformed
        // TODO add your handling code here:
        if (!checkButtonUsed(but6)&& !win) {
            if (labTurn.getText().equals("TURN OF A")) {
                but6.setText("X");
                labTurn.setForeground(new java.awt.Color(255, 0, 0));
                labTurn.setText("TURN OF B");
                checkWinner("X");
            } else {
                but6.setText("O");
                labTurn.setForeground(new java.awt.Color(0, 255, 0));
                labTurn.setText("TURN OF A");
                checkWinner("O");
            }
        }
    }//GEN-LAST:event_but6ActionPerformed

    private void but8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but8ActionPerformed
        // TODO add your handling code here:
        if (!checkButtonUsed(but8)&& !win) {
            if (labTurn.getText().equals("TURN OF A")) {
                but8.setText("X");
                labTurn.setForeground(new java.awt.Color(255, 0, 0));
                labTurn.setText("TURN OF B");
                checkWinner("X");
            } else {
                but8.setText("O");
                labTurn.setForeground(new java.awt.Color(0, 255, 0));
                labTurn.setText("TURN OF A");
                checkWinner("O");
            }
        }
    }//GEN-LAST:event_but8ActionPerformed

    private void but9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but9ActionPerformed
        // TODO add your handling code here:
        if (!checkButtonUsed(but9)&& !win) {
            if (labTurn.getText().equals("TURN OF A")) {
                but9.setText("X");
                labTurn.setForeground(new java.awt.Color(255, 0, 0));
                labTurn.setText("TURN OF B");
                checkWinner("X");
            } else {
                but9.setText("O");
                labTurn.setForeground(new java.awt.Color(0, 255, 0));
                labTurn.setText("TURN OF A");
                checkWinner("O");
            }
        }
    }//GEN-LAST:event_but9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        labTurn.setForeground(new java.awt.Color(0, 255, 0));
        labTurn.setText("TURN OF A");
        
        but3.setText("");
        but2.setText("");
        but1.setText("");
        but6.setText("");
        but5.setText("");
        but4.setText("");
        but9.setText("");
        but8.setText("");
        but7.setText("");
        
        but1.setForeground(Color.black);
        but2.setForeground(Color.black);
        but3.setForeground(Color.black);
        but4.setForeground(Color.black);
        but5.setForeground(Color.black);
        but6.setForeground(Color.black);
        but7.setForeground(Color.black);
        but8.setForeground(Color.black);
        but9.setForeground(Color.black);
        
        txtWinner.setText("");
        win=false;
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(IFTic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IFTic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IFTic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IFTic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IFTic().setVisible(true);
            }
        });
    }
    private boolean win=false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but1;
    private javax.swing.JButton but2;
    private javax.swing.JButton but3;
    private javax.swing.JButton but4;
    private javax.swing.JButton but5;
    private javax.swing.JButton but6;
    private javax.swing.JButton but7;
    private javax.swing.JButton but8;
    private javax.swing.JButton but9;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labTurn;
    private javax.swing.JTextField txtWinner;
    // End of variables declaration//GEN-END:variables
}
