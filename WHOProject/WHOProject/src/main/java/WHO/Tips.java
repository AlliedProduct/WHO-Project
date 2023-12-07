/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package WHO;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author nojus
 */
public class Tips extends javax.swing.JFrame {
    private class ListItem {
        private String text;
        private String checkBox1Text;
        private String checkBox2Text;
        private String checkBox3Text;
        private String checkBox4Text;
        private String checkBox5Text;
        private String checkBox6Text;
        private String checkBox7Text;

        public ListItem(String text, String checkBox1Text, String checkBox2Text,
                        String checkBox3Text, String checkBox4Text, String checkBox5Text,
                        String checkBox6Text, String checkBox7Text) {
            this.text = text;
            this.checkBox1Text = checkBox1Text;
            this.checkBox2Text = checkBox2Text;
            this.checkBox3Text = checkBox3Text;
            this.checkBox4Text = checkBox4Text;
            this.checkBox5Text = checkBox5Text;
            this.checkBox6Text = checkBox6Text;
            this.checkBox7Text = checkBox7Text;
        }

        public String getText() {
            return text;
        }

        public String getCheckBox1Text() {
            return checkBox1Text;
        }

        public String getCheckBox2Text() {
            return checkBox2Text;
        }

        public String getCheckBox3Text() {
            return checkBox3Text;
        }

        public String getCheckBox4Text() {
            return checkBox4Text;
        }

        public String getCheckBox5Text() {
            return checkBox5Text;
        }

        public String getCheckBox6Text() {
            return checkBox6Text;
        }

        public String getCheckBox7Text() {
            return checkBox7Text;
        }
    }

    private List<ListItem> itemList;
     
    public Tips() {
        initComponents();
         initializeList();
    }
private void initializeList() {
        itemList = new ArrayList<>();
        itemList.add(new ListItem("Lights", "Always turn off your lights when not in use", "Replace bulbs to LED bulbs",
                                   "Minimise the use of lights in room, e.g 1 light on per room", "Use light colored lampshades", "Use sensors on lights outside the home",
                                   "Choose energy efficient light bulbs", "Consider using solar powered lights"));
        itemList.add(new ListItem("Heating", "Only turn on the heat when it is needed", "Turn your radiators down or off in rooms you dont use much",
                                   "Service your boiler every year", "Consider improving the insulation in your home", "Set your immersion on a timer so you are not overheating water",
                                   "If you have a thermostat consider dropping 2C", "Smart heater gadgets help being efficient with your heating"));
        itemList.add(new ListItem("Appliances", "Always switch off your appliances when not in use", "Run dishwashers & washing machines at a lower temperature",
                                   "Consider not using a dryer and a washing line instead", "Dont leave the fridge door open", "Dont put hot foods in your fridge straight away",
                                   "Try buy energy efficient appliances", "Service appliances to make sure they are operating properly"));
        itemList.add(new ListItem("Immersion", "Try avoid using baths", "Dont let hot water run from the tap when not in use",
                                   "Always turn off your immersion when not in use", "Change the heat of your immersion", "Service your boiler every year",
                                   "Insulate your boiler", "Install a timer"));
        itemList.add(new ListItem("Cooking", "Only heat the water you need for cooking or making hot drinks", "Use a microwave, air fryer or slow cooker instead of your oven when possible",
                                   "Match your pan size to your burner on the hob and cover your food when it’s cooking", "Steam your vegetables or use less water for boiling", "Only pre-heat your oven when required and defrost food before cooking",
                                   "Only use the dishwasher when it is full", "Check the energy rating on your hob"));
        itemList.add(new ListItem("Home Improvements", "Upgrade insulation in your home", "Install solar panels on your roof",
                                   "Install a heat pump", "Install smart heating controls", "Look into home energy improvement grants (Ireland)",
                                   "Repair your windows if they are letting in draughts", "Upgrade your boiler"));

        jList1.setModel(new AbstractListModel<String>() {
            public int getSize() {
                return itemList.size();
            }

            public String getElementAt(int i) {
                return itemList.get(i).getText();
            }
        });
    }

 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        BackB = new javax.swing.JButton();
        MainB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Tips Checklist");
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, -1, -1));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, -1, -1));
        jCheckBox1.setOpaque(false);

        jCheckBox2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));
        jCheckBox2.setOpaque(false);

        jCheckBox3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, -1, -1));
        jCheckBox3.setOpaque(false);

        jCheckBox4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, -1, -1));
        jCheckBox4.setOpaque(false);

        jCheckBox5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jCheckBox5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, -1, -1));
        jCheckBox5.setOpaque(false);

        jCheckBox6.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jCheckBox6.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, -1, -1));
        jCheckBox6.setOpaque(false);

        jCheckBox7.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jCheckBox7.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, -1, -1));
        jCheckBox7.setOpaque(false);

        BackB.setText("Back");
        BackB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBActionPerformed(evt);
            }
        });
        getContentPane().add(BackB, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, -1, -1));

        MainB.setText("Main Menu");
        MainB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainBActionPerformed(evt);
            }
        });
        getContentPane().add(MainB, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, -1, -1));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Lights", "Heating", "Appliances", "Immersion", "placeholder", "placeholder" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 140, 140));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Choose one of the following :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bkg.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void BackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBActionPerformed

        Tips frm1 = new Tips();
        Calculator frm2 = new Calculator();
        frm2.setVisible(true);
        frm1.setVisible(false);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_BackBActionPerformed

    private void MainBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainBActionPerformed

        Tips frm1 = new Tips();
        Landing frm2 = new Landing();
        frm2.setVisible(true);
        frm1.setVisible(false);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_MainBActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        int selectedIndex = jList1.getSelectedIndex();

        if (selectedIndex >= 0 && selectedIndex < itemList.size()) {
            ListItem selectedItem = itemList.get(selectedIndex);
            jCheckBox1.setText(selectedItem.getCheckBox1Text());
            jCheckBox2.setText(selectedItem.getCheckBox2Text());
            jCheckBox3.setText(selectedItem.getCheckBox3Text());
            jCheckBox4.setText(selectedItem.getCheckBox4Text());
            jCheckBox5.setText(selectedItem.getCheckBox5Text());
            jCheckBox6.setText(selectedItem.getCheckBox6Text());
            jCheckBox7.setText(selectedItem.getCheckBox7Text());
        }
    
        // TODO add your handling code here:
    }//GEN-LAST:event_jList1ValueChanged

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox7ActionPerformed

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
            java.util.logging.Logger.getLogger(Tips.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tips.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tips.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tips.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tips().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackB;
    private javax.swing.JLabel Background;
    private javax.swing.JButton MainB;
    private javax.swing.JLabel Title;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
