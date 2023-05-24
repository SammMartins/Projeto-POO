package Program.Telas;

public class SamLindo {

    public void apaga(String n){

        String sql = "delete from Pessoa" + "where nome=?";

        try{
            PreparedStatement stmt = conexao.prepareStatement(sql);
              stmt.setString(l,n);

              stmt.execute();
              stmt.close();
          } catch (SQLException e){
             throw new RuntimeException(e);
         }
        }
    }
    
}
