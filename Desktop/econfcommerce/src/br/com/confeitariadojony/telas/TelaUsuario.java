/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.confeitariadojony.telas;

/**
 *
 * @author johna
 */

import java.sql.*;
import br.com.confeitariadojony.dal.ModuloConexao;
import javax.swing.JOptionPane;
public class TelaUsuario extends javax.swing.JInternalFrame {

      Connection conexao = null;
      PreparedStatement pst = null;
      ResultSet rs = null;
      
    /**
     * Creates new form TelaUsuario
     */
    public TelaUsuario() {
        initComponents();
        conexao = ModuloConexao.conector();
    }
    
    
   
    //Metodo Consultar usuario
    private void consultar(){
    String sql = "select * from tbusuarios where  iduser=?";
    //tratamento de excessao
        try {
            //setando o interroga
          pst = conexao.prepareStatement(sql);
          pst.setString(1,txtUsuId.getText());
          //EXECUTANDO A QUERY
          rs = pst.executeQuery();
          
          //Estrutua usuario correspondente preenche formulario
            if (rs.next()) {
                //pegando o 2 campo da tabela
                txtUsuNome.setText(rs.getString(2));
                txtUsuFone.setText(rs.getString(3));
                txtUsuLogin.setText(rs.getString(4));
                txtUsuSenha.setText(rs.getString(5));
                //A linha Abaixo se refere ao conboBox
                cboUsuPerfil.setSelectedItem(rs.getString(6));
            } else {
                //Quando nao encontrar usuario
                JOptionPane.showMessageDialog(null,"Usuario Não Cadastrado No Sistema"); 
                //As Linhas abaixo Limpam os campo
                txtUsuNome.setText(null);//mudando o campo para nulo vazio
                txtUsuFone.setText(null);//mudando o campo para nulo vazio
                txtUsuLogin.setText(null);//mudando o campo para nulo vazio
                txtUsuSenha.setText(null);//mudando o campo para nulo vazio
                cboUsuPerfil.setSelectedItem(null);//mudando o campo para nulo vazio


            }
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
    
    }
    
    //Metodo adicionar usuarios
    private void adicionar(){
    //Criando a Instrução de inserção de Usuarios na tabela Usuarios
    String sql = "insert into tbusuarios(iduser,usuario,fone,login,senha,perfil) values(?,?,?,?,?,?)";
        try {
            //Setando os campos do formulario 
            pst = conexao.prepareStatement(sql);
            pst.setString(1,txtUsuId.getText());
            pst.setString(2,txtUsuNome.getText());
            pst.setString(3,txtUsuFone.getText());
            pst.setString(4,txtUsuLogin.getText());
            pst.setString(5,txtUsuSenha.getText());
            pst.setString(6,cboUsuPerfil.getSelectedItem().toString());//toString converte em string
            
            //validação dos campos obrigatorios
            if (txtUsuId.getText().isEmpty() || (txtUsuNome.getText().isEmpty()) || (txtUsuFone.getText().isEmpty())
                ||(txtUsuLogin.getText().isEmpty())||(txtUsuSenha.getText().isEmpty())) {
                 JOptionPane.showMessageDialog(null,"Preencha Todos os campos Obrigatórios!");
            }else{
            //A linha Abaixo Atualiza a Tabela Usuario com os Dados do Formulario
            //A estrutura Abaixo é ultilizada para confirmar a inserção dos Dados na Tabela
            int adicionado = pst.executeUpdate();
            //A linha Abaixo serve de Apoio  ao entendimento da logica
            //System.out.println(adicionado);
                if (adicionado > 0) {
                 JOptionPane.showMessageDialog(null,"Usuario Adicionado com Sucesso!");
                 txtUsuId.setText(null);
                 txtUsuNome.setText(null);
                 txtUsuFone.setText(null);
                 txtUsuLogin.setText(null);
                 txtUsuSenha.setText(null);
 
                }
            
            
            }
            
//           
            
            
        } catch (Exception e) {
            //Caso Ocorra uma excessao vai mostrar qual
         JOptionPane.showMessageDialog(null, e);
        }
    
    }
    
    //Criando o metodo pra atualizar ou alterar Usuarios
    private void alterar(){
        //Atualiza os campos da tabela tbusuario
    String sql ="update tbusuarios set usuario=?,fone=?,login=?,senha=?,perfil=? where iduser=?";
        try {
          pst = conexao.prepareStatement(sql);
          pst.setString(1,txtUsuNome.getText());
          pst.setString(2,txtUsuFone.getText());
          pst.setString(3,txtUsuLogin.getText());
          pst.setString(4,txtUsuSenha.getText());
          pst.setString(5,cboUsuPerfil.getSelectedItem().toString());//toString converte em string
          pst.setString(6,txtUsuId.getText());
          
           //validação dos campos obrigatorios
            if (txtUsuId.getText().isEmpty() || (txtUsuNome.getText().isEmpty()) || (txtUsuFone.getText().isEmpty())
                ||(txtUsuLogin.getText().isEmpty())||(txtUsuSenha.getText().isEmpty())) {
                 JOptionPane.showMessageDialog(null,"Preencha Todos os campos Obrigatórios!");
            }else{
            //A linha Abaixo Atualiza a Tabela Usuario com os Dados do Formulario
            //A estrutura Abaixo é ultilizada para confirmar a Alteração dos Dados do Usuario na Tabela
            int adicionado = pst.executeUpdate();
            //A linha Abaixo serve de Apoio  ao entendimento da logica
            //System.out.println(adicionado);
                if (adicionado > 0) {
                 JOptionPane.showMessageDialog(null," Dados do Usuario Alterados com Sucesso!");
                 txtUsuId.setText(null);
                 txtUsuNome.setText(null);
                 txtUsuFone.setText(null);
                 txtUsuLogin.setText(null);
                 txtUsuSenha.setText(null);
 
                }
            
            
            }
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);

        }
    }
    
    //Metodo Responsavel por remover Usuarios
    private void remover(){
    //Validando a Remoção do Usuario
    int confirma =JOptionPane.showConfirmDialog(null,"Tem Certeza que deseja Remover Este Usuario?");
        if (confirma==JOptionPane.YES_OPTION) {
            String sql="delete from tbusuarios where iduser=?";
            try {
          pst = conexao.prepareStatement(sql);
           pst.setString(1,txtUsuId.getText());
           int apagado = pst.executeUpdate();
                if (apagado > 0) {
                 JOptionPane.showMessageDialog(null," Usuario Removido com Sucesso!");
                 txtUsuId.setText(null);
                 txtUsuNome.setText(null);
                 txtUsuFone.setText(null);
                 txtUsuLogin.setText(null);
                 txtUsuSenha.setText(null);

                }
          
                
            } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);

            }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsuId = new javax.swing.JTextField();
        txtUsuLogin = new javax.swing.JTextField();
        txtUsuNome = new javax.swing.JTextField();
        txtUsuSenha = new javax.swing.JTextField();
        cboUsuPerfil = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtUsuFone = new javax.swing.JTextField();
        btnUsuDelete = new javax.swing.JButton();
        btnUsuCreate = new javax.swing.JButton();
        btnUsuRead = new javax.swing.JButton();
        btnUsuUpdate = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Confeitaria do Jony | Usuarios");
        setPreferredSize(new java.awt.Dimension(600, 700));

        jPanel1.setBackground(new java.awt.Color(125, 105, 172));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 700));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("*Id");

        jLabel2.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("*Login");

        jLabel3.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("*Nome");

        jLabel4.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("*Perfil");

        jLabel5.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fone");

        cboUsuPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "TI", "Vendedor", "Adm", "Gerente", "RH" }));

        jLabel6.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("*Senha");

        btnUsuDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnUsuDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/confeitariadojony/icones/DeletarAlt.png"))); // NOI18N
        btnUsuDelete.setToolTipText("Deletar");
        btnUsuDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuDeleteActionPerformed(evt);
            }
        });

        btnUsuCreate.setBackground(new java.awt.Color(102, 255, 0));
        btnUsuCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/confeitariadojony/icones/CRIACAOAlt.png"))); // NOI18N
        btnUsuCreate.setToolTipText("Adicionar");
        btnUsuCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuCreateActionPerformed(evt);
            }
        });

        btnUsuRead.setBackground(new java.awt.Color(102, 102, 255));
        btnUsuRead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/confeitariadojony/icones/PesquisaAlt.png"))); // NOI18N
        btnUsuRead.setToolTipText("Pesquisar");
        btnUsuRead.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuReadActionPerformed(evt);
            }
        });

        btnUsuUpdate.setBackground(new java.awt.Color(255, 102, 0));
        btnUsuUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/confeitariadojony/icones/AtualizarAlt.png"))); // NOI18N
        btnUsuUpdate.setToolTipText("Atualizar");
        btnUsuUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuUpdateActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("*Campos Obrigatorios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuFone)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtUsuId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtUsuLogin)
                            .addComponent(txtUsuSenha)
                            .addComponent(cboUsuPerfil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnUsuCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(btnUsuRead, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(btnUsuUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(btnUsuDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(99, Short.MAX_VALUE)
                    .addComponent(txtUsuNome, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(8, 8, 8)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnUsuCreate, btnUsuDelete, btnUsuRead, btnUsuUpdate});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(txtUsuId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(10, 10, 10)))
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsuSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(txtUsuFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cboUsuPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnUsuCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUsuRead, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUsuUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUsuDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(97, 97, 97)
                    .addComponent(txtUsuNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(592, Short.MAX_VALUE)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnUsuCreate, btnUsuDelete, btnUsuRead, btnUsuUpdate});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBounds(0, 0, 616, 739);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuReadActionPerformed
        // Chamando o Metodo Pesquisar Usuarios
        consultar();
    }//GEN-LAST:event_btnUsuReadActionPerformed

    private void btnUsuCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuCreateActionPerformed
        // Chamando o Metodo Adicionar Usuarios
        adicionar();
    }//GEN-LAST:event_btnUsuCreateActionPerformed

    private void btnUsuUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuUpdateActionPerformed
        // Chamando o Metodo Atualizar Usuarios
        alterar();
    }//GEN-LAST:event_btnUsuUpdateActionPerformed

    private void btnUsuDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuDeleteActionPerformed
        // Chamando o Metodo Excluir Usuarios
        remover();
    }//GEN-LAST:event_btnUsuDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUsuCreate;
    private javax.swing.JButton btnUsuDelete;
    private javax.swing.JButton btnUsuRead;
    private javax.swing.JButton btnUsuUpdate;
    private javax.swing.JComboBox<String> cboUsuPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtUsuFone;
    private javax.swing.JTextField txtUsuId;
    private javax.swing.JTextField txtUsuLogin;
    private javax.swing.JTextField txtUsuNome;
    private javax.swing.JTextField txtUsuSenha;
    // End of variables declaration//GEN-END:variables
}
