public abstract class CuentaBancaria {

    private final String iban;
    private double saldo;
    public static final double interesAnualBasico = 2.5;

    public CuentaBancaria(String iban, double saldo) {
        this.iban = iban;
        this.saldo = saldo;
    }

    public abstract void calcularIntereses();
    public abstract void consultarAtributos();
    
    public String getIban() {
        return iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void añadir (double saldo){
      this.saldo += saldo;
    }

    public void ingresar(double saldo) {
        añadir(saldo);
    }

    public void retirar(double saldo) {
        retirar(-saldo);
    }

    public void traspaso(double cantidad, CuentaBancaria cc) {
        cc.ingresar(cantidad);
        cc.retirar(cantidad);
    }
}