package Program.ConexãoBD;

import Program.Classes.ClientePF;
import java.sql.*;
import java.util.*;

public class DAOCliPf {
    private Connection conexao;

    public DAOCliPf() {
        conexao = (Connection) new FabricaDeConexoes().solicitaConexao("db4free.net:3306", 
        "bd_poo_ftc", "bcjrs_2023","Poo@2023");
    }
    public void insert(ClientePF c) {
        String sql = "INSERT INTO cliPF" +
                "(nome, cpf, contato)" +
                " VALUES(?,?,?)";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getCPF());
            stmt.setString(3, c.getContato()); 
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public ClientePF busca (String n) {
        ClientePF p = new ClientePF();
        try{
            String sql = "select * from clipf where nome like ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1,"%"+ n + "%");
            ResultSet rs = stmt.executeQuery();
    
            p.setNome("Não Encontrado!");
    
            while(rs.next()){
                if(rs.getString("nome").equals(n)){
                    p.setNome(rs.getString("nome"));
                    p.setContato(rs.getString("contato"));
                    p.setCPF(rs.getString("CPF"));
                }
            }
            rs.close();
            stmt.close();
            return p;
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    public List<ClientePF> lista() {
        try {
            List<ClientePF> clipf = new ArrayList<ClientePF>();
            PreparedStatement stmt = conexao.prepareStatement("select * from Pessoa");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                ClientePF c = new ClientePF();
                c.setNome(rs.getString("nome"));
                c.setContato(rs.getString("contato"));
                c.setCPF(rs.getString("CPF"));    

                clipf.add(c);
            }
            rs.close();
            stmt.close();
            return clipf;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void altera(ClientePF c, String s){
        String sql = "update CliPF set" + "nome=?, cpf=?, contato=?" + "where nome=?";
    
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1,c.getNome());
            stmt.setString(2,c.getCPF());
            stmt.setString(3,c.getContato());
    
            stmt.execute();
            stmt.close();
    
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
