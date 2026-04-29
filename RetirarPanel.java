import javax.swing.*;
import java.awt.*;

public class RetirarPanel extends JPanel {

    public JTextField textoValor;
    public JButton botonGuardar;
    public JButton botonVolver;

    public RetirarPanel() {
        setLayout(new GridLayout(2, 2));

        textoValor = new JTextField();
        botonGuardar = new JButton("Retirar");
        botonVolver = new JButton("Volver");

        add(new JLabel("Valor a retirar:"));
        add(textoValor);
        add(botonGuardar);
        add(botonVolver);
    }
}
