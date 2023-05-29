package Program.Telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

import javax.swing.*;
import javax.swing.JFrame;

import Program.Classes.ClientePF;
import Program.ConexãoBD.DAOCliPf;

public class TelaAvisoPF extends JFrame implements ActionListener {
    static DAOCliPf dpf = new DAOCliPf(); // Instância do objeto DAOCliPf

    // Cores utilizadas
    public Color corFundo1 = new Color(27, 38, 44);
    public Color corFundo2 = new Color(37, 48, 54);
    public Color corLabel1 = new Color(187, 225, 250);
    public Color corLabel2 = new Color(200, 200, 200);
    public Color branco = new Color(255,255,255);

    // Botões
    JButton cancel = new JButton();
    JButton confirm = new JButton();

    // Ícones e cores
    public ImageIcon icone = new ImageIcon("Images/iconePrincipal.png");
    public ImageIcon iconCancel = new ImageIcon("Images/cancel2.png");
    public ImageIcon iconEnviar = new ImageIcon("Images/enviar-bd.png");

    public TelaAvisoPF(ClientePF pf) {
        // Configurações do JFrame
        setTitle("Confirmação");
        setIconImage(icone.getImage());
        setVisible(true);
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(corFundo1);

        // Label de desenvolvedores
        JLabel devs = new JLabel("Desenvolvido por: Bruno Cardoso Monteiro, Caio Chaves Lima, José Carlos Neto Soares Dantas, ");
        devs.setForeground(corLabel2);
        devs.setFont(new Font("Arial", Font.ITALIC, 9 ));
        devs.setBounds(40, 286, 1000, 100);
        devs.setVisible(true);
        this.add(devs);

        // Label de desenvolvedores (continuação)
        JLabel devs2 = new JLabel("Rafael Rodrigues Souza, Sammuel Gusmão Martins - UniFTC");
        devs2.setForeground(corLabel2);
        devs2.setFont(new Font("Arial", Font.ITALIC, 9 ));
        devs2.setBounds(120, 295, 1000, 100);
        devs2.setVisible(true);
        this.add(devs2);

        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(31, 42, 51));
        panel2.setVisible(true);
        panel2.setBounds(0, 320, 1000, 40);
        this.add(panel2);

        // Label de aviso
        JLabel labelAviso = new JLabel();
        labelAviso.setText("Salvar novo registro?");
        labelAviso.setForeground(branco);
        labelAviso.setBounds(70, -50, 200, 200);
        labelAviso.setFont(new Font("Arial", Font.PLAIN, 15));
        this.add(labelAviso);

        // Botão cancelar
        cancel.setBounds(80, 80, 35, 35);
        cancel.setHorizontalAlignment(SwingConstants.CENTER);
        cancel.setBackground(branco);
        cancel.setIcon(iconCancel);
        cancel.addActionListener(this);
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cancel.setEnabled(false);
                TelaAvisoPF.this.dispose();
                new NovoRegistroPF();
            }
        });
        this.add(cancel);

        // Botão confirmar
        confirm.setBounds(150, 80, 35, 35);
        confirm.setHorizontalAlignment(SwingConstants.CENTER);
        confirm.setBackground(new Color(6,185,57));
        confirm.setIcon(iconEnviar);
        confirm.addActionListener(this);
        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                confirm.setEnabled(false);
                dpf.insert(pf);
                TelaAvisoPF.this.dispose();
                new NovoRegistroPF();
            }
        });
        this.add(confirm);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
