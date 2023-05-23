package Program.ConexãoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexoes {

    public Connection solicitaConexao(String host, String banco, String usuario, String senha) {

        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            System.out.println("\n Ocorreu um erro!\nDrive não localizado!");
            System.exit(1);

        }

    }

    public static String url = "jdbc:mysql//db4free.net:3306/bd_poo_ftc";
    public static String user = "bcjrs_2023";
    public static String password = "Poo@2023";

    public static Connection conn;

    public static Connection getConexaoBD() {

        try {
            if (conn == null) {
                conn = DriverManager.getConnection(url, user, password);
                return conn;
            } else {
                return conn;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
}
