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
    // Intancia de um objeto DAO do Cliente PJ
    static DAOCliPf dpf = new DAOCliPf();

    public Color corFundo1 = new Color(27, 38, 44); // definindo a cor de fundo
    public Color corFundo2 = new Color(37, 48, 54);
    public Color corLabel1 = new Color(187, 225, 250); // definindo a cor da label
    public Color corLabel2 = new Color(200, 200, 200);
    public Color branco = new Color(255,255,255);

    JButton cancel = new JButton();
    JButton confirm = new JButton();

    public ImageIcon icone = new ImageIcon("Images/iconePrincipal.png");
    public ImageIcon iconCancel = new ImageIcon("Images/cancel2.png");
    public ImageIcon iconEnviar = new ImageIcon("Images/enviar-bd.png");

    public TelaAvisoPF(ClientePF pf) {
        setTitle("Confirmação");
        setIconImage(icone.getImage());
        setVisible(true); 
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false); 
        setLocationRelativeTo(null); 
        setLayout(null);
        getContentPane().setBackground(corFundo1);

        JLabel labelAviso = new JLabel();
        labelAviso.setText("Salvar novo registro?");
        labelAviso.setForeground(branco);
        labelAviso.setBounds(70, -50, 200, 200);
        labelAviso.setFont(new Font("Arial", Font.PLAIN, 15));
        this.add(labelAviso);

        cancel.setBounds(80, 80, 35, 35);
        cancel.setHorizontalAlignment(SwingConstants.CENTER);
        cancel.setBackground(branco);
        cancel.setIcon(iconCancel);
        cancel.addActionListener(this);
        cancel.addActionListener(new ActionListener() { // MÉTODO DE CRIAÇÃO DE EVENTO DO BOTÃO SALVAR
            @Override
            public void actionPerformed(ActionEvent e) {
                cancel.setEnabled(false);
                TelaAvisoPF.this.dispose();
                new NovoRegistroPF();

            }
        });
        this.add(cancel);

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