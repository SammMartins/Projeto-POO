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

public class TelaTable extends Tela implements ActionListener{
    DefaultTableModel model = new DefaultTableModel();
    JTable table = new JTable(model);

    JButton voltar = new JButton();

    public TelaTable() {
        // Configurações do JFrame
        setTitle("Resultado da Busca");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(corFundo1);
        // Configurações do Botão
        voltar.setIcon(iconBack);
        voltar.setBounds(10, 15, 40, 30);
        voltar.addActionListener(this);
        this.add(voltar);



        // Criação do DefaultTableModel
        model = new DefaultTableModel();
        
        // Criação do JTable
        table = new JTable(model);

        // Definição das colunas da tabela
        model.addColumn("Razão Social");
        model.addColumn("CNPJ");
        model.addColumn("Email");
        model.addColumn("Contato");
        model.addColumn("Responsável");

        // Outras configurações e componentes do JFrame

        // Adicionar o JScrollPane com a tabela ao JFrame
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane);

        
        setLocationRelativeTo(null);
    }

    public void preencherTabela() {
        DAOCliPj dao = new DAOCliPj();
        List<ClientePJ> clientes = dao.lista();
    
        for (ClientePJ cliente : clientes) {
            Object[] rowData = new Object[5];
            rowData[0] = cliente.getRazao();
            rowData[1] = cliente.getCnpj();
            rowData[2] = cliente.getEmail();
            rowData[3] = cliente.getContato();
            rowData[4] = cliente.getResponsavel();
    
            model.addRow(rowData);
        }
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == voltar) {
            this.dispose();
            new Manuntencao();
        }
     }
}
