package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.cj.api.jdbc.Statement;

public class ConexaoMySQL {

	public static void main(String[] args) throws SQLException {
        new ConnectionFactory();
        
//        Scanner leia = new Scanner(System.in);
//        System.out.print("Digite o nome: ");
//        String nome = leia.nextLine();
//        System.out.print("\nDigite o email: ");
//        String email = leia.nextLine();;
//        System.out.print("\nDigite o endereço: ");
//        String endereco = leia.nextLine();
//		// conectando
        Connection instance = ConnectionFactory.getConnection();
//        // cria um preparedStatement
//        String insert = "insert into contatos" +
//                " (nome,email,endereco,dataNascimento)" +
//                " values (?,?,?,?)";
//        PreparedStatement stmt = instance.prepareStatement(insert);
//
//        // preenche os valores
//        stmt.setString(1, nome);
//        stmt.setString(2, email);
//        stmt.setString(3, endereco);
//        stmt.setDate(4, new java.sql.Date(
//        Calendar.getInstance().getTimeInMillis()));
//      
//        // executa
//        stmt.execute();
//        stmt.close();

//        System.out.println("Gravado!");
        
        String select = "SELECT * FROM contatos";
        
        Statement statement = (Statement) instance.createStatement();
        ResultSet result = statement.executeQuery(select);
         
        int count = 0;
         
        while (result.next()){
            String name = result.getString(2);
            String pass = result.getString(3);
            String nome2 = result.getString("nome");
            String email2 = result.getString("email");
         
            String output = "User #%d: %s - %s";
            System.out.println(String.format(output, ++count, name, pass ));
        }
        instance.close();
	}

}
