package Program.Interface_graf;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.text.PasswordView;

public class Tela extends JFrame implements ActionListener {
    
    public Tela(){
        setTitle("");
        setVisible(true);                            //configura visibilidade da tela.
        setSize(750, 650);               //configurando tamanho da tela.  
        setDefaultCloseOperation(EXIT_ON_CLOSE);     //definindo operação de fechamento de tela.
        setResizable(false);              //impossibilita o redimensionamento da tela.
        setLocationRelativeTo(null);             //configura a localização de nascimento da tela
        setLayout(null);                  //"reseta" o layout da tela.
        getContentPane().setBackground(new Color(200,200,200));;

        /*                          Forma Alternativa
        *JFrame jFrame = new JFrame("Tela 1");//criamos um objeto tela com o titulo Tela 1.
        *jFrame.setVisible(true);
        *jFrame.setSize(400, 600);
        *jFrame.setDefaultCloseOperation(tela.EXIT_ON_CLOSE);
        *jFrame.setResizable(false);
        *jFrame.setLocationRelativeTo(null);
        */
        
        
        
    //                          Criação de Labels

        JLabel usuario = new JLabel("Usuário: ");
        usuario.setBounds(100, 150, 100, 100);
        usuario.setVisible(true);
        usuario.setForeground(new Color(70, 70, 70));
        add(usuario);

        JLabel senha = new JLabel("Senha: ");
        senha.setBounds(100, 200, 100, 100);
        senha.setVisible(true);
        senha.setForeground(new Color(70, 70, 70));
        add(senha);
    //                        Criação dos campos de digitação 
        JTextField user = new JTextField();
        user.setVisible(true);
        user.setForeground(new Color(70, 70, 70));
        user.setBounds(155, 190, 150, 25);
        user.setBorder(null);
        user.setToolTipText("Digite seu nome de usuário!");
        add(user);

        
        JPasswordField password = new JPasswordField();
        password.setBounds(155, 240, 150, 25);
        password.setVisible(true);
        password.setBorder(null);
        add(password);

        //                      Criação de Botão
        // Obs.: Para melhor configuração dos componentes na tela, defina o Layout no objeto JFrame.
        
        JButton login = new JButton("Login");                     //Cria-se um objeto botão.
        Font fonte = new Font("Arial", Font.PLAIN, 13);    //Cria-se um objeto Fonte.
        login.setFont(fonte);                                        //seta a fonte de acordo os atributos do objeto criado.
        
        /*         Forma alternativa de setar uma Fonte
         * Direto no metodo ->   login.setFont(new Font("Arial", Font.ITALIC, 13));
        */

        login.setBounds(150, 300, 90, 35);        //No geral, posiciona e redimensiona o botão.
        login.setForeground(new Color(70, 70, 70));          //Define cor da letra.
        login.setBackground(new Color(255, 255, 255));      //Define cor do fundo.
        login.setBorder(null);
        add(login);

        login.addActionListener(this); // Ao clicar no botão, ele executa a função ligada ao this
    
    }
    
    //              Função de Eventos


    public void actionPerformed(ActionEvent e) {
        
        this.setVisible(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Logado!");
        JOptionPane.showMessageDialog(null, "Logado com sucesso!", "Login", JOptionPane.DEFAULT_OPTION);
    }
}