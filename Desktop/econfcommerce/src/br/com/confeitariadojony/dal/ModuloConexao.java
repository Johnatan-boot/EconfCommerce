/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.confeitariadojony.dal;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author johna
 */
public class ModuloConexao {
    //Metodo Responsavel Por Estabelecer Conexao com o Banco de Dados
    public static Connection conector(){
    Connection conexao = null;
    String driver = "com.mysql.cj.jdbc.Driver";
    //Aramazenando informações Referente ao Banco colocar nome do banco 
    //nao do sistema
    String url= "jdbc:mysql://localhost:3306/econfcommerce";
    String user = "root";
    String password = "Jony9677@$";
    
    //estabelecendo Conexao Com o Banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user,password);
            return  conexao;
        } catch (Exception e) {
            return  null;
        }
    }
}
