package Program.Telas;
import Program.ConexãoBD.DAOCliPf;
import Program.ConexãoBD.DAOCliPj;

public class Start  {
    public static void main(String[] args) {
        new Inicio(); 
        new DAOCliPf();
        new DAOCliPj();          
    }
}
