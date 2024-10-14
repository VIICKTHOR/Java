package main;

import javax.swing.*;
import java.awt.*;

public class ListarEventos extends JFrame {

    private static final long serialVersionUID = 1L;

    public ListarEventos() {
        setTitle("Eventos Dispon�veis");
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setLocationRelativeTo(null);

        String[] colunas = {"Nome", "Data", "Hora", "Pre�o"};
        Object[][] dados = {
            {"Show de Rock", "10/10/2024", "20:00", "R$ 150,00"},
            {"Pe�a de Teatro", "15/10/2024", "18:00", "R$ 80,00"},
            {"Filme no Cinema", "20/10/2024", "21:00", "R$ 30,00"},
            {"Concerto Cl�ssico", "25/10/2024", "19:30", "R$ 200,00"}
        };

        JTable tabelaEventos = new JTable(dados, colunas);
        JScrollPane scrollPane = new JScrollPane(tabelaEventos);
        add(scrollPane, BorderLayout.CENTER);
    }
}
