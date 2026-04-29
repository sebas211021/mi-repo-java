import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {

    public JButton botonSaldo;
    public JButton botonRetirar;
    public JButton botonTransferir;
    public JButton botonSalir;

    public MenuPanel() {
        setLayout(new GridLayout(5, 1));

        botonSaldo = new JButton("Consultar Saldo");
        botonRetirar = new JButton("Retirar");
        botonTransferir = new JButton("Transferir");
        botonSalir = new JButton("Salir");

        add(new JLabel("Menú Principal", SwingConstants.CENTER));
        add(botonSaldo);
        add(botonRetirar);
        add(botonTransferir);
        add(botonSalir);
    }
}
