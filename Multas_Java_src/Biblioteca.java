package Multas_Java_src;

public class Biblioteca {
    public static void main(String[] args) {
        // Creación de materiales
        Libro libro1 = new Libro("L-001", "Cien años de soledad", 432);
        Revista revista1 = new Revista("R-001", "National Geographic", 245);
        
        // Uso de setters
        libro1.setTitulo("Cien años de soledad (Edición especial)");
        revista1.setNumeroEdicion(246);
        
        System.out.println("=== Estado inicial ===");
        System.out.println(libro1);
        System.out.println(revista1);
        
        // Operaciones
        libro1.prestar();
        revista1.prestar();
        
        System.out.println("\n=== Después de prestar ===");
        System.out.println(libro1);
        System.out.println(revista1);
        
        // Cálculo de multas
        System.out.println("\n=== Multas ===");
        System.out.println("Multa libro (10 días retraso): " + libro1.calcularMulta(10) + "€");
        System.out.println("Multa revista (7 días retraso): " + revista1.calcularMulta(7) + "€");
        
        // Devolución
        libro1.devolver();
        System.out.println("\n=== Devolución libro ===");
        System.out.println(libro1);
    }
}