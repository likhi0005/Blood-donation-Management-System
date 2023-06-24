
import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class loginform extends javax.swing.JFrame {

    /**
     * Creates new form loginform
     */
    public loginform() {
        initComponents();
        Toolkit tk=Toolkit.getDefaultToolkit();
        int x_size=(int)tk.getScreenSize().getWidth();
        int y_size=(int)tk.getScreenSize().getHeight();
        Insets scnMax=Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration());
        int taskBarSize=scnMax.bottom;
        this.setSize(x_size,y_size);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usrnamelbl = new javax.swing.JLabel();
        pswrdlbl = new javax.swing.JLabel();
        usrnametxt = new javax.swing.JTextField();
        loginbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        pswrdtxt = new javax.swing.JPasswordField();
        showhidebtn = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usrnamelbl.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        usrnamelbl.setForeground(java.awt.Color.lightGray);
        usrnamelbl.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Downloads\\icons8-user-64.png")); // NOI18N
        usrnamelbl.setText("Username");
        getContentPane().add(usrnamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 270, -1));

        pswrdlbl.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        pswrdlbl.setForeground(java.awt.Color.gray);
        pswrdlbl.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Downloads\\icons8-forgot-password-40.png")); // NOI18N
        pswrdlbl.setText("Password");
        getContentPane().add(pswrdlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 250, 70));

        usrnametxt.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        getContentPane().add(usrnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 366, 64));

        loginbtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        loginbtn.setText("Login");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 145, 68));

        exitbtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        exitbtn.setText("Exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 510, 130, 70));

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -40, -1, -1));

        pswrdtxt.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        getContentPane().add(pswrdtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 370, 60));

        showhidebtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        showhidebtn.setForeground(new java.awt.Color(0, 102, 255));
        showhidebtn.setText("Show");
        showhidebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showhidebtnActionPerformed(evt);
            }
        });
        getContentPane().add(showhidebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 280, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\OneDrive\\Pictures\\—Pngtree—black background blood splash blood_1351647.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        // TODO add your handling code here:
        int x=JOptionPane.showConfirmDialog(null,"Do you want to close application","Select",JOptionPane.YES_NO_OPTION);
        if(x==0)
            System.exit(0);
    }//GEN-LAST:event_exitbtnActionPerformed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        // TODO add your handling code here:
        if(usrnametxt.getText().equals("Blood") && pswrdtxt.getText().equals("IT-1"))
        {
            setVisible(false);
            new home_page().setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(null,"Incorrect username or password");
    }//GEN-LAST:event_loginbtnActionPerformed

    private void showhidebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showhidebtnActionPerformed
        // TODO add your handling code here:
        if(showhidebtn.isSelected())
        {
            pswrdtxt.setEchoChar((char)0);
        }
        else
        {
            pswrdtxt.setEchoChar('*');
        }
    }//GEN-LAST:event_showhidebtnActionPerformed

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
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginbtn;
    private javax.swing.JLabel pswrdlbl;
    private javax.swing.JPasswordField pswrdtxt;
    private javax.swing.JCheckBox showhidebtn;
    private javax.swing.JLabel usrnamelbl;
    private javax.swing.JTextField usrnametxt;
    // End of variables declaration//GEN-END:variables
}
