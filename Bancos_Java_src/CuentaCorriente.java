public class CuentaCorriente extends CuentaBancaria {

    public CuentaCorriente(String iban, double saldo) {
        super(iban, saldo);
    }

    public void consultarAtributos() {
        System.out.println("Cuenta Corriente IBAN: " + this.getIban() + " Saldo: " + this.getSaldo());
    }

    public void calcularIntereses() {
        double interes = this.getSaldo() * (interesAnualBasico / 100);
        this.ingresar(interes);
    }

    public String toString() {
        return "Cuenta Corriente IBAN: " + this.getIban() + " Saldo: " + this.getSaldo();
    }


    
}