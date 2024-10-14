package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class SelecionarEvento extends JFrame {

    private static final long serialVersionUID = 1L;
    private JList<Evento> listaEventos;

    public SelecionarEvento() {
        setTitle("Selecionar Evento");
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setLocationRelativeTo(null);

        Evento[] eventos = {
            new Evento("Show de Rock", "10/10/2024", "20:00", 150.00),
            new Evento("Peça de Teatro", "15/10/2024", "18:00", 80.00),
            new Evento("Filme no Cinema", "20/10/2024", "21:00", 30.00),
            new Evento("Concerto Clássico", "25/10/2024", "19:30", 200.00)
        };

        listaEventos = new JList<>(eventos);
        listaEventos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JScrollPane scrollPane = new JScrollPane(listaEventos);
        add(scrollPane, BorderLayout.CENTER);

        JPanel panelInferior = new JPanel();
        JButton btnSelecionar = new JButton("Selecionar Eventos");
        panelInferior.add(btnSelecionar);
        add(panelInferior, BorderLayout.SOUTH);

        btnSelecionar.addActionListener(this::abrirEscolherIngressos);
    }

    private void abrirEscolherIngressos(ActionEvent e) {
        Evento[] eventosSelecionados = listaEventos.getSelectedValuesList().toArray(new Evento[0]);
        if (eventosSelecionados.length > 0) {
            EscolherIngressos escolherIngressos = new EscolherIngressos(eventosSelecionados);
            escolherIngressos.setVisible(true);
            dispose();
            
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum evento selecionado.");
        }
    }
}
