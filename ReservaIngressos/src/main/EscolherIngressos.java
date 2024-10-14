package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class EscolherIngressos extends JFrame {

    private static final long serialVersionUID = 1L;
    private final Evento[] eventosSelecionados;
    private final int[] quantidades;

    public EscolherIngressos(Evento[] eventosSelecionados) {
        this.eventosSelecionados = eventosSelecionados;
        this.quantidades = new int[eventosSelecionados.length];

        setTitle("Escolher Quantidade de Ingressos");
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setLayout(new GridLayout(eventosSelecionados.length + 1, 2, 10, 10));
        setLocationRelativeTo(null);

        for (int i = 0; i < eventosSelecionados.length; i++) {
            JLabel lblEvento = new JLabel(eventosSelecionados[i].toString());
            add(lblEvento);

            JSpinner spinner = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
            int finalI = i;
            spinner.addChangeListener(e -> quantidades[finalI] = (int) spinner.getValue());
            add(spinner);
        }

        JButton btnConfirmar = new JButton("Confirmar Quantidades");
        btnConfirmar.addActionListener(this::confirmarIngressos);
        add(btnConfirmar);
    }

    private void confirmarIngressos(ActionEvent e) {
        InserirDadosPessoais janelaDados = new InserirDadosPessoais(eventosSelecionados, quantidades);
        janelaDados.setVisible(true);
        dispose();
    }
}
