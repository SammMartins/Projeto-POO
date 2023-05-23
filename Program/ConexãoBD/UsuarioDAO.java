package Program.ConexãoBD;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {   

    public void cadastrarUsuario(Usuario usuario) throws SQLException{

String sql = "INSERT INTO pessoa_fi(NOME, CELULAR, CPF)VALUES(?,?,?)";

PreparedStatement ps = null;

try {
    ps = ConexaoBD.getConexaoBD().prepareStatement(sql);
    ps.setString(1, usuario.getNome());
    ps.setString(2, usuario.getCelular());
    ps.setString(3, usuario.getCpf());

    ps.execute();
    ps.close();

} catch (SQLException e) {
    e.printStackTrace();

    }
}
}