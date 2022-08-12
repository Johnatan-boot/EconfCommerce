/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.confeitariadojony.telas;
import java.sql.*;
import br.com.confeitariadojony.dal.ModuloConexao;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author johna
 */
public class TelaLogin extends javax.swing.JFrame {

      Connection conexao = null;
      PreparedStatement pst = null;
      ResultSet rs = null;
    /**
     * Creates new form TelaLogin
     */
      
       //metodo logar
    public void logar(){
    //variavel que vai executar instrucao sql de pesquisa no banco
    //usuario e senha correspondente
    
    String sql ="select * from tbusuarios where login =? and senha=?";
       
      
        try {
            //Preparando uma Consulta ao Banco de Dados em funcao do que foi digitado
            //nas caixas de texto o ? e substituido pelo conteudo das variaveis
             pst = conexao.prepareStatement(sql);
             pst.setString(1,txtUsuario.getText());
             //Capturando e Recuperando uma Senha 
             String captura = new String(txtSenha.getPassword());
             pst.setString(2,captura);
             // A LINHA ABAIXO EXECUTA A QUERY
             rs = pst.executeQuery();
             
             
             //Se existir usuario e senha correspondente libera a proxima tela tela principal
             
             if (rs.next()) {
                 //A linha Abaixo Captura ou obtém o campo perfil da tabela tbusuario
                 String perfil  = rs.getString(6);
                 //System.out.println(perfil);
                 
                 //A estrutura Abaixo faz o Tratamento do Perfil arpovado libera a tela para o usuario
                 if (perfil.equals("admin")) {
                     //Instanciando um Objeto
                     //Abrir a Tela Principal
                     TelaPrincipal principal = new TelaPrincipal();
                     principal.setVisible(true);
                    //Campo desabilitado vou habilitar fornecendo acesso aos campos bloqueados
                    TelaPrincipal.menRelVen.setEnabled(true);
                    TelaPrincipal.menCadUsu.setEnabled(true);
                    //Ação de fechar a tela Login Para acesso a tela principal
                    this.dispose();
                    //Setando o campo usuario pelo campo Administrador ou Usuario substituicao 
                    //da label escrita usuario pelo usuario que esta entrando no sistema
                    TelaPrincipal.lblUsuario.setText(rs.getString(2));
                    TelaPrincipal.lblUsuario.setForeground(Color.red);
                     
                 }else if (perfil.equals("TI")) {
                       //Instanciando um Objeto
                     //Abrir a Tela Principal
                     TelaPrincipal principal = new TelaPrincipal();
                     principal.setVisible(true);
                    //Campo desabilitado vou habilitar fornecendo acesso aos campos bloqueados
                    TelaPrincipal.menRelVen.setEnabled(true);
                    TelaPrincipal.menCadUsu.setEnabled(true);
                    //Ação de fechar a tela Login Para acesso a tela principal
                    this.dispose();
                    //Setando o campo usuario pelo campo Administrador ou Usuario substituicao 
                    //da label escrita usuario pelo usuario que esta entrando no sistema
                    TelaPrincipal.lblUsuario.setText(rs.getString(2));
                    TelaPrincipal.lblUsuario.setForeground(Color.green);
                 }else if (perfil.equals("Vendedor")) {
                       //Instanciando um Objeto
                     //Abrir a Tela Principal
                     TelaPrincipal principal = new TelaPrincipal();
                     principal.setVisible(true);
                    //Campo desabilitado vou habilitar fornecendo acesso aos campos bloqueados
                    TelaPrincipal.menRelVen.setEnabled(false);
                    TelaPrincipal.menCadUsu.setEnabled(false);
                    //Ação de fechar a tela Login Para acesso a tela principal
                    this.dispose();
                    //Setando o campo usuario pelo campo Administrador ou Usuario substituicao 
                    //da label escrita usuario pelo usuario que esta entrando no sistema
                    TelaPrincipal.lblUsuario.setText(rs.getString(2));
                    TelaPrincipal.lblUsuario.setForeground(Color.blue);
                 }else if (perfil.equals("Adm")) {
                       //Instanciando um Objeto
                     //Abrir a Tela Principal
                     TelaPrincipal principal = new TelaPrincipal();
                     principal.setVisible(true);
                    //Campo desabilitado vou habilitar fornecendo acesso aos campos bloqueados
                     TelaPrincipal.menRelVen.setEnabled(false);
                    TelaPrincipal.menCadUsu.setEnabled(false);
                    //Ação de fechar a tela Login Para acesso a tela principal
                    this.dispose();
                    //Setando o campo usuario pelo campo Administrador ou Usuario substituicao 
                    //da label escrita usuario pelo usuario que esta entrando no sistema
                    TelaPrincipal.lblUsuario.setText(rs.getString(2));
                    TelaPrincipal.lblUsuario.setForeground(Color.yellow);
                 }else if (perfil.equals("Gerente")) {
                       //Instanciando um Objeto
                     //Abrir a Tela Principal
                     TelaPrincipal principal = new TelaPrincipal();
                     principal.setVisible(true);
                    //Campo desabilitado vou habilitar fornecendo acesso aos campos bloqueados
                    TelaPrincipal.menRelVen.setEnabled(false);
                    TelaPrincipal.menCadUsu.setEnabled(false);
                    //Ação de fechar a tela Login Para acesso a tela principal
                    this.dispose();
                    //Setando o campo usuario pelo campo Administrador ou Usuario substituicao 
                    //da label escrita usuario pelo usuario que esta entrando no sistema
                    TelaPrincipal.lblUsuario.setText(rs.getString(2));
                    TelaPrincipal.lblUsuario.setForeground(Color.darkGray);
                 }else if (perfil.equals("RH")) {
                       //Instanciando um Objeto
                     //Abrir a Tela Principal
                     TelaPrincipal principal = new TelaPrincipal();
                     principal.setVisible(true);
                    //Campo desabilitado vou habilitar fornecendo acesso aos campos bloqueados
                    TelaPrincipal.menRelVen.setEnabled(false);
                    TelaPrincipal.menCadUsu.setEnabled(false);
                    //Ação de fechar a tela Login Para acesso a tela principal
                    this.dispose();
                    //Setando o campo usuario pelo campo Administrador ou Usuario substituicao 
                    //da label escrita usuario pelo usuario que esta entrando no sistema
                    TelaPrincipal.lblUsuario.setText(rs.getString(2));
                    TelaPrincipal.lblUsuario.setForeground(Color.magenta);
                 }else{
                     //Abrir a Tela Principal
                     TelaPrincipal principal = new TelaPrincipal();
                     principal.setVisible(true);
                     TelaPrincipal.lblUsuario.setText(rs.getString(2));
                    //Ação de fechar a tela Login Para acesso a tela principal
                    this.dispose();
                    TelaPrincipal.lblUsuario.setText(rs.getString(2));
                    TelaPrincipal.lblUsuario.setForeground(Color.green);
                 
                 }
                 //fechando a conexao com o banco de dados
                conexao.close();
            }else{
                 JOptionPane.showMessageDialog(null,"Usuario e Senha Invalido(s)!");
             }
            
                 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
    
    }
      
      
      
    public TelaLogin() {
        initComponents();
        conexao = ModuloConexao.conector();
        System.out.println(conexao);
        
         if (conexao != null) {
            lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/confeitariadojony/icones/dbconexao.png")));
        }else{
            lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/confeitariadojony/icones/dberror.png")));
        
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Confeitaria do Jony | Login");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(125, 105, 172));

        jLabel2.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Senha");

        jLabel3.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario");

        btnLogin.setBackground(new java.awt.Color(147, 209, 244));
        btnLogin.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(102, 0, 0));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/confeitariadojony/icones/bolo-de-aniversario.png"))); // NOI18N

        lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/confeitariadojony/icones/dbconexao.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario)
                            .addComponent(txtSenha))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblStatus)
                        .addGap(183, 183, 183))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(176, 176, 176))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(lblStatus)
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // Chamando o Metodo Logar
        logar();
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
