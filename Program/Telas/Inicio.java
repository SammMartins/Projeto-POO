package Program.Telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.*;

public class Inicio extends JFrame implements ActionListener {

    // Icons para os botões
    public ImageIcon iconInsert = new ImageIcon("Images/insert.png");
    public ImageIcon iconConfig = new ImageIcon("Images/config.png");
    public ImageIcon iconCancel = new ImageIcon("Images/cancel.png");
    public ImageIcon iconSave = new ImageIcon("Images/save.png");
    public ImageIcon iconPF = new ImageIcon("Images/PF.png");
    public ImageIcon iconPJ = new ImageIcon("Images/PJ.png");
    public ImageIcon iconBack = new ImageIcon("Images/voltar.png");
    public ImageIcon iconLupa = new ImageIcon("Images/Lupa.png");
    public ImageIcon icone = new ImageIcon("Images/iconePrincipal.png");

    // Cores utilizadas
    public Color corFundo1 = new Color(27, 38, 44);
    public Color corPanel = new Color(15, 76, 117);
    public Color corLabel1 = new Color(187, 225, 250);
    public Color corLabel2 = new Color(200, 200, 200);

    JButton novoRegistro = new JButton();
    JButton manuntencaoRegistro = new JButton();
    
    public Inicio() {
        
        setTitle("");
        setVisible(true); // configura visibilidade da tela.
        setIconImage(icone.getImage());
        setSize(500, 400); // configurando tamanho da tela.
        setDefaultCloseOperation(EXIT_ON_CLOSE); // definindo operação de fechamento de tela.
        setResizable(false); // impossibilita o redimensionamento da tela.
        setLocationRelativeTo(null); // configura a localização de nascimento da tela
        setLayout(null); // "reseta" o layout da tela.
        getContentPane().setBackground(corFundo1); // Define cor de fundo da tela.

        // Painel de controle 1
        JPanel panel = new JPanel();
        panel.setBackground(corPanel);
        panel.setVisible(true);
        panel.setBounds(0, 0, 1000, 60);
        this.add(panel);

        // Título e subtitulo do Novo Registro
        setTitle("Gerenciar Clientes");
        JLabel labelRegistro = new JLabel();
        labelRegistro.setText("Novo Registro");
        labelRegistro.setForeground(corLabel1);
        labelRegistro.setBounds(180, 40, 100, 100);
        labelRegistro.setFont(new Font("Arial Black", Font.PLAIN, 12));
        this.add(labelRegistro);

        JLabel sublabelRegistro = new JLabel();
        sublabelRegistro.setText("Inserir um novo resgistro ao cadastro.");
        sublabelRegistro.setForeground(corLabel2);
        sublabelRegistro.setBounds(180, 60, 300, 100);
        sublabelRegistro.setFont(new Font("Arial", Font.PLAIN, 11));
        this.add(sublabelRegistro);

        // Título e subtitulo da Manutenção de Registro
        JLabel labelManu = new JLabel();
        labelManu.setText("Matutenção de Registro");
        labelManu.setForeground(corLabel1);
        labelManu.setBounds(180, 160, 250, 100);
        labelManu.setFont(new Font("Arial Black", Font.PLAIN, 12));
        this.add(labelManu);

        JLabel sublabelManu = new JLabel();
        sublabelManu.setText("Pesquisar, alterar ou deletar um registro.");
        sublabelManu.setForeground(corLabel2);
        sublabelManu.setBounds(180, 180, 300, 100);
        sublabelManu.setFont(new Font("Arial", Font.PLAIN, 11));
        this.add(sublabelManu);

        // Botão Novo Registro
        novoRegistro.setBounds(70, 70, 75, 75);
        novoRegistro.setIcon(iconInsert);
        novoRegistro.addActionListener(this);
        this.add(novoRegistro);

        // Botão Manutenção de Registro
        manuntencaoRegistro.setIcon(iconConfig);
        manuntencaoRegistro.setBounds(70, 190, 75, 75);
        manuntencaoRegistro.addActionListener(this);
        this.add(manuntencaoRegistro);

         // Texto dos desenvolvedores
         JLabel devs = new JLabel("Desenvolvido por: Bruno Cardoso Monteiro, Caio Chaves Lima, José Carlos Neto Soares Dantas, ");
         devs.setForeground(corLabel2);
         devs.setFont(new Font("Arial", Font.ITALIC, 9 ));
         devs.setBounds(40, 286, 1000, 100);
         devs.setVisible(true);
         this.add(devs);
 
         JLabel devs2 = new JLabel("Rafael Rodrigues Souza, Sammuel Gusmão Martins - UniFTC");
         devs2.setForeground(corLabel2);
         devs2.setFont(new Font("Arial", Font.ITALIC, 9 ));
         devs2.setBounds(120, 295, 1000, 100);
         devs2.setVisible(true);
         this.add(devs2);
 
         // Painel de controle 2
         JPanel panel2 = new JPanel();
         panel2.setBackground(new Color(31, 42, 51));
         panel2.setVisible(true);
         panel2.setBounds(0, 320, 1000, 40);
         this.add(panel2);

    }
    
    // Método de ação dos botões
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == novoRegistro) {
            this.dispose();
            new NovoRegistro();
        }
        if (e.getSource() == manuntencaoRegistro) {
            this.dispose();
            new Manuntencao();
        }
    }
}
