package Program.Interface_graf.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

    public static String url = "jdbc:mysql//localhost:3306/cadastro";
    public static String user = "root";
    public static String password = "";

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
