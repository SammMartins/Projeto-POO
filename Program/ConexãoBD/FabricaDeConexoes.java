package Program.ConexãoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexoes {

    public Connection solicitaConexao(String host, String banco, String usuario, String senha) {

        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            System.out.println("\n Ocorreu um erro!\nDrive não localizado!"+ e.toString());
            System.exit(1);

        }
        try{
            return DriverManager.getConnection("jdbc:mysql//" + host + "/" + banco, usuario, senha);
        }catch(SQLException e){
            System.out.println("\n Ocorreu um erro!\nBanco não encontrado" + e.toString());
            System.exit(2);
            return null;
            
        }

    }
}

