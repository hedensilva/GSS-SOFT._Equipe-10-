/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_L;

import javax.swing.JOptionPane;


/**
 *
 * @author Joao Pedro
 */
public class TelaPrincipal extends javax.swing.JFrame {
TelaAdmin telaAdmin = new TelaAdmin();
private InternalAjuda Ajuda;
private funcionario.fuLista FL;
//private TelaAdmin telaAdmin;  
    
    public TelaPrincipal() {
        initComponents();
       
        
        jDesktopPane1.add(telaAdmin);
        telaAdmin.setVisible(true);
        
        
        
        
            
            
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        labelStatusLogin = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuLogin = new javax.swing.JMenu();
        loginTelaLogin = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemFuncionario = new javax.swing.JMenuItem();
        jMenuItemProdutos = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem23 = new javax.swing.JMenuItem();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setLayer(labelStatusLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(498, Short.MAX_VALUE)
                .addComponent(labelStatusLogin)
                .addGap(23, 23, 23))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelStatusLogin)
                .addContainerGap(271, Short.MAX_VALUE))
        );

        jMenuLogin.setText("Login");
        jMenuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLoginActionPerformed(evt);
            }
        });

        loginTelaLogin.setText("Tela Login");
        loginTelaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTelaLoginActionPerformed(evt);
            }
        });
        jMenuLogin.add(loginTelaLogin);

        jMenuBar1.add(jMenuLogin);

        jMenu1.setText("Menus");

        jMenuItemFuncionario.setText("Funcionários");
        jMenuItemFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFuncionarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemFuncionario);

        jMenuItemProdutos.setText("Produtos");
        jMenuItemProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdutosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemProdutos);

        jMenuItem1.setText(".");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu5.setText("Ajuda");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenuItem23.setText("Sobre");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem23);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        setSize(new java.awt.Dimension(537, 357));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void jMenuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLoginActionPerformed
        
    }//GEN-LAST:event_jMenuLoginActionPerformed

    private void loginTelaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTelaLoginActionPerformed
        jDesktopPane1.add(telaAdmin);
        telaAdmin.setVisible(true);
    }//GEN-LAST:event_loginTelaLoginActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

    if(telaAdmin.getStatusLogin()==true){    
        
    InternalFrameCadastro cadastro = new InternalFrameCadastro();
    jDesktopPane1.add(cadastro);
    cadastro.setVisible(true);
    }else{
        JOptionPane.showMessageDialog(null, "Voce Precisa Estar Logado para Realizar esta ação");
    }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFuncionarioActionPerformed
        if(telaAdmin.getStatusLogin()==true){
            
          new funcionario.fuLista().setVisible(true);   

        }else{
            JOptionPane.showMessageDialog(null, "Voce Precisa Estar Logado para Realizar esta ação");
        }
    }//GEN-LAST:event_jMenuItemFuncionarioActionPerformed

    private void jMenuItemProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdutosActionPerformed
          if(telaAdmin.getStatusLogin()==true){
            
          new produto.produtoLista().setVisible(true);   

        }else{
            JOptionPane.showMessageDialog(null, "Voce Precisa Estar Logado para Realizar esta ação");
        }
    }//GEN-LAST:event_jMenuItemProdutosActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed

    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed

        if(telaAdmin.getStatusLogin()==true){
            InternalAjuda Ajuda = new InternalAjuda();
            jDesktopPane1.add(Ajuda);
            Ajuda.setVisible(true);

        }else{
            JOptionPane.showMessageDialog(null, "Voce Precisa Estar Logado para Realizar esta ação");
        }
    }//GEN-LAST:event_jMenuItem23ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItemFuncionario;
    private javax.swing.JMenuItem jMenuItemProdutos;
    private javax.swing.JMenu jMenuLogin;
    private javax.swing.JLabel labelStatusLogin;
    private javax.swing.JMenuItem loginTelaLogin;
    // End of variables declaration//GEN-END:variables
}