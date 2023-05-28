package Program.Telas;

import Program.Classes.ClientePJ;
import Program.ConexãoBD.DAOCliPj;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TelaTable extends Tela implements ActionListener {

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

        // Criação do DefaultTableModel com as colunas desejadas
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Razão Social");
        model.addColumn("CNPJ");
        model.addColumn("Email");
        model.addColumn("Contato");
        model.addColumn("Responsável");

        // Criação do JTable com o DefaultTableModel
        JTable table = new JTable(model);

        // Criação do JScrollPane com o JTable
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(25, 65, 420, 400);
        add(scrollPane);

        // Preenchimento do DefaultTableModel com os dados do banco de dados
        DAOCliPj daoCPJ = new DAOCliPj();
        List<ClientePJ> clientes = daoCPJ.lista();
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
