import javax.swing.*;

public class Controlador {

    private Ventana ventana;
    private LoginPanel loginPanel;
    private MenuPanel menuPanel;
    private SaldoPanel saldoPanel;
    private RetirarPanel retirarPanel;
    private TransferirPanel transferirPanel;
    private Usuario usuario;
    private Cuenta cuenta;

    public Controlador() {
        usuario = new Usuario("Admin", "admin");
        cuenta = new Cuenta();

        ventana = new Ventana();
        loginPanel = new LoginPanel();
        menuPanel = new MenuPanel();
        saldoPanel = new SaldoPanel();
        retirarPanel = new RetirarPanel();
        transferirPanel = new TransferirPanel();

        ventana.contenedor.add(loginPanel, "login");
        ventana.contenedor.add(menuPanel, "menu");
        ventana.contenedor.add(saldoPanel, "saldo");
        ventana.contenedor.add(retirarPanel, "retirar");
        ventana.contenedor.add(transferirPanel, "transferir");

        ventana.cardLayout.show(ventana.contenedor, "login");

        eventos();
    }

    private void eventos() {

        loginPanel.boton.addActionListener(e -> {
            String user = loginPanel.textoUsuario.getText();
            String pass = String.valueOf(loginPanel.textoContrasena.getPassword());
            if (usuario.validar(user, pass)) {
                ventana.cardLayout.show(ventana.contenedor, "menu");
            } else {
                JOptionPane.showMessageDialog(ventana, "Usuario o contraseña incorrectos");
            }
        });

        menuPanel.botonSaldo.addActionListener(e -> {
            saldoPanel.etiqueta.setText("Saldo: $" + cuenta.getSaldo());
            ventana.cardLayout.show(ventana.contenedor, "saldo");
        });

        menuPanel.botonRetirar.addActionListener(e -> {
            ventana.cardLayout.show(ventana.contenedor, "retirar");
        });

        menuPanel.botonTransferir.addActionListener(e -> {
            ventana.cardLayout.show(ventana.contenedor, "transferir");
        });

        menuPanel.botonSalir.addActionListener(e -> {
            ventana.cardLayout.show(ventana.contenedor, "login");
        });

        retirarPanel.botonGuardar.addActionListener(e -> {
            String valorStr = retirarPanel.textoValor.getText();
            try {
                double valor = Double.parseDouble(valorStr);
                if (valor > cuenta.getSaldo()) {
                    JOptionPane.showMessageDialog(ventana, "Saldo insuficiente");
                    return;
                }
                cuenta.retirar(valor);
                JOptionPane.showMessageDialog(ventana, "Retiro exitoso");
                retirarPanel.textoValor.setText("");
                ventana.cardLayout.show(ventana.contenedor, "menu");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(ventana, "Ingresa un número válido");
            }
        });

        retirarPanel.botonVolver.addActionListener(e -> {
            ventana.cardLayout.show(ventana.contenedor, "menu");
        });

        transferirPanel.botonGuardar.addActionListener(e -> {
            String cuentaDestino = transferirPanel.textoCuenta.getText();
            String valorStr = transferirPanel.textoValor.getText();
            if (cuentaDestino.isEmpty() || valorStr.isEmpty()) {
                JOptionPane.showMessageDialog(ventana, "Llena todos los campos");
                return;
            }
            try {
                double valor = Double.parseDouble(valorStr);
                if (valor > cuenta.getSaldo()) {
                    JOptionPane.showMessageDialog(ventana, "Saldo insuficiente");
                    return;
                }
                cuenta.transferir(valor);
                JOptionPane.showMessageDialog(ventana, "Transferencia exitosa a cuenta: " + cuentaDestino);
                transferirPanel.textoCuenta.setText("");
                transferirPanel.textoValor.setText("");
                ventana.cardLayout.show(ventana.contenedor, "menu");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(ventana, "Ingresa un número válido");
            }
        });

        transferirPanel.botonVolver.addActionListener(e -> {
            ventana.cardLayout.show(ventana.contenedor, "menu");
        });

        saldoPanel.botonVolver.addActionListener(e -> {
            ventana.cardLayout.show(ventana.contenedor, "menu");
        });
    }
}
