package model.dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {

    public static void main(String[] args) throws SQLException{
        // TODO Auto-generated method stub
    	
       Connection conn = ConexaoSQL.getConexaoSQL();
    
       
       Statement stmt = conn.createStatement();
       ResultSet rs = stmt.executeQuery("select * from testado");
       String nome = "";
       int id = 0;
       System.out.println("ID" + "\t" + "Nome" + "\t\t\t" + "Idade" + "\t\t\t" + "Compra");
       while(rs.next()){
    	   id = rs.getInt("id");
    	   nome = rs.getString("nome");
    	   System.out.println(id + "\t" + nome);
       }
       
    }
}