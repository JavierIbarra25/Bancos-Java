public class GestionBanco {

    public static void main(String arg[]) {

        CuentaCorriente cc = new CuentaCorriente("ES6256465847", 1000);
        CuentaAhorro ca = new CuentaAhorro("ES9956415656", 3000);

        // Mostramos datos de las cuentas
        System.out.println(cc);
        System.out.println(ca);

        System.out.println(cc.toString());
        System.out.println(ca.toString());


        // Ingresamos, retiramos y mostramos
        cc.ingresar(1000);
        ca.retirar(500);
        System.out.println(cc.toString());
        System.out.println(ca.toString());

         // Traspasamos 1000 de cc a ca y mostramos
        cc.traspaso(1000, ca);
        System.out.println(cc.toString());
        System.out.println(ca.toString());

        // Calculamos intereses y mostramos
        cc.calcularIntereses();
        ca.calcularIntereses();
        System.out.println(cc.toString());
        System.out.println(ca.toString());
    }
}
