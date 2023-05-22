package Program.Interface_graf;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TelaTable extends Tela implements ActionListener{
    private JTable table;
    private DefaultTableModel tableModel;
    JButton voltar = new JButton();

    public void telaTable() {
        setTitle("Resultado da Busca");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(corFundo1);
        

        voltar.setIcon(iconBack);
        voltar.setBounds(10, 15, 40, 30);
        voltar.addActionListener(this);
        this.add(voltar);

        // Cria o modelo de dados da tabela
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new String[] { "Coluna 1", "Coluna 2", "Coluna 3", "Coluna 4", "Coluna 5" });

        // Cria a tabela com o modelo de dados
        table = new JTable(tableModel);

        // Cria um JScrollPane para permitir a rolagem dos dados
        JScrollPane scrollPane = new JScrollPane(table);

        // Adiciona o JScrollPane ao JFrame
        getContentPane().add(scrollPane);

        pack();
        setLocationRelativeTo(null);
    }
    public void openTelaTable(){
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
             
     }
}
