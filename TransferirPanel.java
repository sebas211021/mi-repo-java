import javax.swing.*;
import java.awt.*;

public class TransferirPanel extends JPanel {

    public JTextField textoCuenta;
    public JTextField textoValor;
    public JButton botonGuardar;
    public JButton botonVolver;

    public TransferirPanel() {
        setLayout(new GridLayout(3, 2));

        textoCuenta = new JTextField();
        textoValor = new JTextField();
        botonGuardar = new JButton("Transferir");
        botonVolver = new JButton("Volver");

        add(new JLabel("Cuenta destino:"));
        add(textoCuenta);
        add(new JLabel("Valor:"));
        add(textoValor);
        add(botonGuardar);
        add(botonVolver);
    }
}
