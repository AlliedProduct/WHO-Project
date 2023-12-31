/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package WHO;

import WHO.TopGUI;

/**
 *
 * @author kdoma
 */
public class RepGUI extends javax.swing.JFrame {

    /**
     * Creates new form RepGUI
     */
    public RepGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PIDlbl = new javax.swing.JLabel();
        PIDtf = new javax.swing.JTextField();
        Namelbl = new javax.swing.JLabel();
        Nametf = new javax.swing.JTextField();
        Locationlbl = new javax.swing.JLabel();
        Locationtf = new javax.swing.JTextField();
        Serviceslbl = new javax.swing.JLabel();
        Servicestf = new javax.swing.JTextField();
        GoBackbtn = new javax.swing.JButton();
        ShowDetailsbtn = new javax.swing.JButton();
        Titlelbl = new javax.swing.JLabel();
        BackgroundPIC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PIDlbl.setForeground(new java.awt.Color(255, 255, 255));
        PIDlbl.setText("ProviderID:");
        getContentPane().add(PIDlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));
        getContentPane().add(PIDtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 120, -1));

        Namelbl.setForeground(new java.awt.Color(255, 255, 255));
        Namelbl.setText("Name:");
        getContentPane().add(Namelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, 20));
        getContentPane().add(Nametf, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 120, -1));

        Locationlbl.setForeground(new java.awt.Color(255, 255, 255));
        Locationlbl.setText("Location:");
        getContentPane().add(Locationlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));
        getContentPane().add(Locationtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 120, -1));

        Serviceslbl.setForeground(new java.awt.Color(255, 255, 255));
        Serviceslbl.setText("Services:");
        getContentPane().add(Serviceslbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));
        getContentPane().add(Servicestf, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 120, -1));

        GoBackbtn.setText("Go Back");
        GoBackbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBackbtnActionPerformed(evt);
            }
        });
        getContentPane().add(GoBackbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, -1, -1));

        ShowDetailsbtn.setText("Show Provider Details");
        ShowDetailsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowDetailsbtnActionPerformed(evt);
            }
        });
        getContentPane().add(ShowDetailsbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        Titlelbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Titlelbl.setForeground(new java.awt.Color(255, 255, 255));
        Titlelbl.setText("Renewable Energy Provider");
        getContentPane().add(Titlelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        BackgroundPIC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bkg.png"))); // NOI18N
        getContentPane().add(BackgroundPIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowDetailsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowDetailsbtnActionPerformed
        // TODO add your handling code here:
        String providerID = PIDtf.getText();
        String name = Nametf.getText();
        String location = Locationtf.getText();
        String services = Servicestf.getText();

        String details = "Provider ID: " + providerID + "\n"
                + "Name: " + name + "\n"
                + "Location: " + location + "\n"
                + "Services: " + services;

        javax.swing.JOptionPane.showMessageDialog(this, details, "Provider Details", javax.swing.JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_ShowDetailsbtnActionPerformed

    private void GoBackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBackbtnActionPerformed
        TopGUI tGUI = new TopGUI();
        tGUI.show();

        dispose();
    }//GEN-LAST:event_GoBackbtnActionPerformed

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
            java.util.logging.Logger.getLogger(RepGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RepGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RepGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RepGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RepGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundPIC;
    private javax.swing.JButton GoBackbtn;
    private javax.swing.JLabel Locationlbl;
    private javax.swing.JTextField Locationtf;
    private javax.swing.JLabel Namelbl;
    private javax.swing.JTextField Nametf;
    private javax.swing.JLabel PIDlbl;
    private javax.swing.JTextField PIDtf;
    private javax.swing.JLabel Serviceslbl;
    private javax.swing.JTextField Servicestf;
    private javax.swing.JButton ShowDetailsbtn;
    private javax.swing.JLabel Titlelbl;
    // End of variables declaration//GEN-END:variables
}
