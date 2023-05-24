package Program.ConexãoBD;

import java.sql.*;
import java.util.*;

import Program.Classes.ClientePJ;

public class DAOCliPj {
    private Connection conexao;

    public DAOCliPj() {
        conexao = (Connection) new FabricaDeConexoes().solicitaConexao("db4free.net:3306", "bd_poo_ftc", "bcjrs_2023",
                "Poo@2023");

    }

    public void insert(ClientePJ p) {

        String sql = "INSERT INTO Pessoa" +
                "(nome, cpf, contato)" +
                " VALUES(?,?,?)";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, p.getRazao());
            stmt.setString(2, p.getCnpj());
            stmt.setString(3, p.getEmail());
            stmt.setString(4, p.getContato());
            stmt.setString(5, p.getResponsavel());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ClientePJ busca(String n) {
        ClientePJ p = new ClientePJ();
        try {
            String sql = "select * from clipf where nome like ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, "%" + n + "%");

            ResultSet rs = stmt.executeQuery();

            p.setRazao("Não Encontrado!"); // ANTES p.setNome("Não Encontrado!");-- ta dando erro

            while (rs.next()) {
                if (rs.getString("nome").equals(n)) {
                    p.setRazao(rs.getString("Razao"));
                    p.setCnpj(rs.getString("Cnpj"));
                    p.setEmail(rs.getString("Email"));
                    p.setContato(rs.getString("Contato"));
                    p.setResponsavel(rs.getString("Responsavel"));
                }
            }

            rs.close();
            stmt.close();
            return p;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ClientePJ> lista() {
        try {
            List<ClientePJ> clientes = new ArrayList<ClientePJ>();
            PreparedStatement stmt = conexao.prepareStatement("select * from Pessoa");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                ClientePJ c = new ClientePJ();
                c.setRazao(rs.getString("Razao"));
                c.setCnpj(rs.getString("Cnpj"));
                c.setEmail(rs.getString("Email"));
                c.setContato(rs.getString("Contato"));
                c.setResponsavel(rs.getString("Responsavel"));

                clientes.add(c);
            }
            rs.close();
            stmt.close();
            return clientes;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void altera(ClientePJ c, String n) {
        String sql = "update Cliente set" + "nome=?, cpf=?, contato=?" + "where nome=?";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, c.getRazao());
            stmt.setString(2, c.getCnpj());
            stmt.setString(3, c.getEmail());
            stmt.setString(3, c.getContato());
            stmt.setString(3, c.getResponsavel());
            stmt.setString(4, n);

            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
