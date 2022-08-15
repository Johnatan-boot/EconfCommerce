/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.confeitariadojony.telas;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author johna
 */
public class TelaClientes extends javax.swing.JInternalFrame {

     // 3 framework dentro da biblioteca sql
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs          = null;
    /**
     * Creates new form TelaClientes
     */
    public TelaClientes() {
        initComponents();
    }
    
     //Metodo adicionar Clientes
    private void adicionar(){
    //Criando a Instrução de inserção de Usuarios na tabela Usuarios
    String sql = "insert into tbclientes(nomecli,endcli,foncli,emailcli) values(?,?,?,?)";
        try {
            //Setando os campos do formulario 
            pst = conexao.prepareStatement(sql);
            pst.setString(1,txtCliNome.getText());
            pst.setString(2,txtCliEndereco.getText());
            pst.setString(3,txtCliFone.getText());
            pst.setString(4,txtCliEmail.getText());
           
            
            //validação dos campos obrigatorios
            if (txtCliNome.getText().isEmpty() ||(txtCliFone.getText().isEmpty())) {
                 JOptionPane.showMessageDialog(null,"Preencha Todos os campos Obrigatórios!");
            }else{
            //A linha Abaixo Atualiza a Tabela Usuario com os Dados do Formulario
            //A estrutura Abaixo é ultilizada para confirmar a inserção dos Dados na Tabela
            //A linha abaixo Atualiza a Tabela Usuarios no Banco de Dados Com os Dados novos no  Formulario
            int adicionado = pst.executeUpdate();
            //A linha Abaixo serve de Apoio  ao entendimento da logica
            //System.out.println(adicionado);
                if (adicionado > 0) {
                 JOptionPane.showMessageDialog(null,"Cliente Adicionado com Sucesso!");
                 //Chamando o Metodo Limpar
                 limpar();
                
 
                }
            
            
            }
            
            
           
            
            
        } catch (Exception e) {
            //Caso Ocorra uma excessao vai mostrar qual
         JOptionPane.showMessageDialog(null, e);
        }
    
    }
    
    //Metodo Para Pesquisar Clientes pelo nome com Filtro
    private void pesquisar_cliente(){
    String sql = "select idcli as id, nomecli as nome, endcli as endereco, foncli as fone,emailcli as email from  tbclientes  where nomecli like ?";
        try {
         pst = conexao.prepareStatement(sql);
         //Passando o conteudo da caixa de Pesquisa Para o Interroga
         //Atencao ao % que é a continuação da String
            pst.setString(1,txtCliPesquisar.getText()+"%");
            rs = pst.executeQuery();
            //A linha Abaixo usa a biblioteca rs2xml.jar Para preencher a tabela
            tblClientes.setModel(DbUtils.resultSetToTableModel(rs));

            
        } catch (Exception e) {
            //Caso Ocorra uma excessao vai mostrar qual
         JOptionPane.showMessageDialog(null, e);
        }
    
    
    }
    
    //Metodo Para Setar os Campos do Conteudo da Tabela
    public void setar_campos(){
    int setar = tblClientes.getSelectedRow();
    txtCliId.setText(tblClientes.getModel().getValueAt(setar,0).toString());
    txtCliNome.setText(tblClientes.getModel().getValueAt(setar,1).toString());
    txtCliEndereco.setText(tblClientes.getModel().getValueAt(setar,2).toString());
    txtCliFone.setText(tblClientes.getModel().getValueAt(setar,3).toString());
    txtCliEmail.setText(tblClientes.getModel().getValueAt(setar,4).toString());
     //Desabilitando o botao adicionar
     btnAdicionar.setEnabled(false);
    
    }
    
     //Criando o metodo pra atualizar ou alterar Dados do Cliente
     
    private void alterar(){
        //Atualiza os campos da tabela tbusuario
    String sql ="update tbclientes set nomecli=?,endcli=?,foncli=?,emailcli=? where idcli=?";
        try {
          pst = conexao.prepareStatement(sql);
          pst.setString(1,txtCliNome.getText());
          pst.setString(2,txtCliEndereco.getText());
          pst.setString(3,txtCliFone.getText());
          pst.setString(4,txtCliEmail.getText());
          pst.setString(5,txtCliId.getText());
          
           //validação dos campos obrigatorios
            if (txtCliNome.getText().isEmpty() || (txtCliFone.getText().isEmpty())) {
                 JOptionPane.showMessageDialog(null,"Preencha Todos os campos Obrigatórios!");
            }else{
            //A linha Abaixo Atualiza a Tabela Cliente com os Dados do Formulario
            //A estrutura Abaixo é ultilizada para confirmar a Alteração dos Dados do Usuario na Tabela
            int adicionado = pst.executeUpdate();
            //A linha Abaixo serve de Apoio  ao entendimento da logica
            //System.out.println(adicionado);
                if (adicionado > 0) {
                 JOptionPane.showMessageDialog(null," Dados do Cliente Alterados com Sucesso!");
                 
                 //Chamando o Metodo Limpar
                 limpar();
                 btnAdicionar.setEnabled(true);
 
                }
            
            
            }
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);

        }
    }
    
    
     //Metodo Responsavel por remover Clientes
    private void remover(){
    //Validando a Remoção do Usuario
    int confirma =JOptionPane.showConfirmDialog(null,"Tem Certeza que deseja Remover Este Cliente?");
        if (confirma==JOptionPane.YES_OPTION) {
            String sql="delete from tbclientes where idcli=?";
            try {
          pst = conexao.prepareStatement(sql);
           pst.setString(1,txtCliId.getText());
           int apagado = pst.executeUpdate();
                if (apagado > 0) {
                 JOptionPane.showMessageDialog(null," Cliente Removido com Sucesso!");
                  //Chamando o Metodo Limpar
                 limpar();
                 btnAdicionar.setEnabled(true);

                }
          
                
            } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);

            }
        }
    
    
    }
    //Metodo Responsavel Por Limpar os Campos Do Formulario
    private void limpar(){
    txtCliPesquisar.setText(null);
    txtCliId.setText(null);
    txtCliNome.setText(null);
    txtCliEndereco.setText(null);
    txtCliFone.setText(null);
    txtCliEmail.setText(null);
    //Limpa os campos da tabela
    ((DefaultTableModel) tblClientes.getModel()).setRowCount(0);
    
    
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
        txtCliNome = new javax.swing.JTextField();
        txtCliEndereco = new javax.swing.JTextField();
        txtCliFone = new javax.swing.JTextField();
        txtCliEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        txtCliPesquisar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        txtCliId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Confeitaria do Jony | Clientes");
        setPreferredSize(new java.awt.Dimension(600, 700));

        jPanel1.setBackground(new java.awt.Color(125, 105, 172));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 700));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Email");

        jLabel2.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("*Nome");

        jLabel3.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("*Telefone");

        jLabel4.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Endereco");

        jLabel5.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("*ID");

        btnAdicionar.setBackground(new java.awt.Color(102, 153, 0));
        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/confeitariadojony/icones/CRIACAOAlt.png"))); // NOI18N
        btnAdicionar.setToolTipText("Adicionar");
        btnAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(255, 102, 0));
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/confeitariadojony/icones/AtualizarAlt.png"))); // NOI18N
        btnAlterar.setToolTipText("Adicionar");
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnRemover.setBackground(new java.awt.Color(255, 0, 0));
        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/confeitariadojony/icones/DeletarAlt.png"))); // NOI18N
        btnRemover.setToolTipText("Adicionar");
        btnRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/confeitariadojony/icones/Lupa2Alt.png"))); // NOI18N

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblClientes);

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
                        .addComponent(btnAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                        .addComponent(btnAlterar)
                        .addGap(144, 144, 144)
                        .addComponent(btnRemover))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                            .addComponent(txtCliNome, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtCliFone))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(jLabel4)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCliEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                                .addComponent(txtCliEmail)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCliId, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtCliPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7)))
                            .addGap(8, 8, 8))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCliPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCliId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCliNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCliFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCliEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtCliEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // Chamando o Metodo Adicionar
        adicionar();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        //Chamando o Metodo Alterar
        alterar();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // Chamando o Metodo Remover
        remover();
    }//GEN-LAST:event_btnRemoverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtCliEmail;
    private javax.swing.JTextField txtCliEndereco;
    private javax.swing.JTextField txtCliFone;
    private javax.swing.JTextField txtCliId;
    private javax.swing.JTextField txtCliNome;
    private javax.swing.JTextField txtCliPesquisar;
    // End of variables declaration//GEN-END:variables
}
