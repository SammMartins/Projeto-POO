package Program.Telas;

import Program.Classes.ClientePJ;
import Program.ConexãoBD.DAOCliPj;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

public class TelaTable extends Tela implements ActionListener {

    JButton voltar = new JButton();

    public TelaTable() {
        // Criação do JTable
        JTable table = new JTable();

        // Configurações do JFrame
        setTitle("Resultado da Busca");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(corFundo1);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(45, 70, 400, 400);
        add(scrollPane);
        // Configurações do Botão
        voltar.setIcon(iconBack);
        voltar.setBounds(10, 15, 40, 30);
        voltar.addActionListener(this);
        this.add(voltar);

        // Criação do DefaultTableModel
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();

        // Definição das colunas da tabela
        DAOCliPj daoCPJ = new DAOCliPj();
        for (ClientePJ pj : daoCPJ.lista()) {

            modelo.addRow(new Object[] {
                    pj.getRazao(),
                    pj.getCnpj(),
                    pj.getEmail(),
                    pj.getContato(),
                    pj.getResponsavel()
            });
            System.out.println(pj.getCnpj()+pj.getRazao());

        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == voltar) {
            this.dispose();
            new Manuntencao();
        }
    }
}
