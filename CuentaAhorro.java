public class CuentaAhorro extends CuentaBancaria {

    final double saldoMinimo = 2000;

    // constructor
    public CuentaAhorro(String iban, double saldo) {
        super(iban, saldo);
    }

    public void consultarAtributos() {
        System.out.println("Cuenta Corriente IBAN: " + getIban() + " Saldo: " + getSaldo());
    }

    public void calcularIntereses() {
        double interes;
        if (this.getSaldo() < saldoMinimo) {
            interes = this.getSaldo() * ((interesAnualBasico / 2.0) / 100.0);
        } else {
            interes = this.getSaldo() * ((interesAnualBasico * 2.0) / 100.0);
        }
        this.ingresar(interes);
    }

    public String toString() {
        return "Cuenta Corriente IBAN: " + this.getIban() + " Saldo: " + this.getSaldo();
    }
}