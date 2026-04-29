import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    public JPanel contenedor;
    public CardLayout cardLayout;

    public Ventana() {
        setTitle("Cajero Automático");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardLayout = new CardLayout();
        contenedor = new JPanel(cardLayout);
        add(contenedor);

        setVisible(true);
    }
}
