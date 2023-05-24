package Program.ConexãoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexoes {


    public static String url = "jdbc:mysql//db4free.net:3306/bd_poo_ftc";
    public static String user = "bcjrs_2023";
    public static String password = "Poo@2023";
    
    public Connection solicitaConexao() {

        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            System.out.println("\n Ocorreu um erro!\nDrive não localizado!"+ e.toString());
            System.exit(1);

        }
        try{
            return DriverManager.getConnection(url,user,password);
        }catch(SQLException e){
            System.out.println("\n Ocorreu um erro!\nBanco não encontrado" + e.toString());
            System.exit(2);
            return null;
            
        }

    }
}

