public class Cuenta {

    private double saldo;

    public Cuenta() {
        saldo = 0;
    }

    public void retirar(double valor) {
        saldo -= valor;
    }

    public void transferir(double valor) {
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
