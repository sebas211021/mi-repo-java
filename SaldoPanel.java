import javax.swing.*;
import java.awt.*; 

public class SaldoPanel extends JPanel {

    public JLabel etiqueta;
    public JButton botonVolver;

    public SaldoPanel() {
        setLayout(new GridLayout(2, 1));

        etiqueta = new JLabel("", SwingConstants.CENTER);
        botonVolver = new JButton("Volver");

        add(etiqueta);
        add(botonVolver);
    }
}
