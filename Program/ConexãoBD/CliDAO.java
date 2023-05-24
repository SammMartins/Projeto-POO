package Program.ConexãoBD;
/* 
import java.sql.*;
import java.util.*;

public class CliDAO {
    private Connection conexao;

    public CliDAO() {
        conexao = (Connection) new FabricaDeConexoes().solicitaConexao("db4free.net:3306", "bd_poo_ftc", "bcjrs_2023",
                "Poo@2023");

    }

    public void insert(Pessoa n){

    public Pessoa buscar(String n){

    public void altera (Pessoa p, String n) {

    public void apaga (String n) {

    public List<Pessoa> lista(){ 
        }
}}}

}
}



 	public void insert(Pessoa p) {
		
		String sql = "INSERT INTO Pessoa"+
        "(nome, cpf, contato)" +
        " VALUES(?,?,?)";
		
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1,cadastropf.getNome());
			stmt.setString(2,cadastropf.getCpf());
			stmt.setString(3, cadastropf.getContato());

		
			stmt.execute();	
            stmt.close();
		} catch (SQLException e) {
            throw new RuntimeException(e)
        }
    }
 */