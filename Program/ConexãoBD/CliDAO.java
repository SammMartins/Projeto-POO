package Program.ConexãoBD;

import java.sql.*;
import java.util.*;

public class CliDAO {
    private Connection conexao;

    public CliDAO() {
        conexao = (Connection) new FabricaDeConexoes().solicitaConexao("db4free.net:3306", "bd_poo_ftc", "bcjrs_2023",
                "Poo@2023");

    }

    public void insert(Pessoa p) {

        String sql = "INSERT INTO Pessoa" +
                "(nome, cpf, contato)" +
                " VALUES(?,?,?)";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cadastropf.getNome());
            stmt.setString(2, cadastropf.getCpf());
            stmt.setString(3, cadastropf.getContato());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Cliente busca (String n) {
        Cliente p = new Pessoa();
        try{
            String sql = "select * from clipf where nome like ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1,"%"+ n + "%");
    
            ResultSet rs = stmt.executeQuery();
    
            p.setNome("Não Encontrado!");
    
            While(rs.next()){
                if(rs.getString("nome").equals(n)){
                    p.setNome(rs.getString("nome"));
                    p.setEndereco(rs.getString("Endereco"));
                    p.setFone(rs.getString("Fone"));
                }
            }
    
            rs.close();
            stmt.close();
            return p;
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public List<Cliente> lista() {
        try {
            List<Cliente> clientes = new ArrayList<Cliente>();
            PreparedStatement stmt = conexao.prepareStatement("select * from Pessoa");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();
                p.setNome(rs.getString("nome"));
                p.setEndereco(rs.getString("endereco"));
                p.setFone(rs.getString("fone"));
                p.setEmail(rs.getStrting("email"));

                cliente.add(c);
            }
            rs.close();
            stmt.close();
            return clientes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void altera(Cliente c, String s){
        String sql = "update Cliente set" + "nome=?, cpf=?, contato=?" + "where nome=?";
    
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1,c.getNome());
            stmt.setString(2,c.getCpf());
            stmt.setString(3,c.getContato());
            stmt.setString(4,n);
    
            stmt.execute();
            stmt.close();
    
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
