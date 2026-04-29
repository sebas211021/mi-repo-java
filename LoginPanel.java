import javax.swing.*;
import java.awt.*;

public class LoginPanel extends JPanel {

    public JTextField textoUsuario;
    public JPasswordField textoContrasena;
    public JButton boton;

    public LoginPanel() {
        setLayout(new GridLayout(3, 2));

        textoUsuario = new JTextField();
        textoContrasena = new JPasswordField();
        boton = new JButton("Ingresar");

        add(new JLabel("Usuario:"));
        add(textoUsuario);
        add(new JLabel("Contraseña:"));
        add(textoContrasena);
        add(boton);
    }
}
