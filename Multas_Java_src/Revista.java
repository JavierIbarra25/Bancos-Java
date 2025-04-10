package Multas_Java_src;

public class Revista extends MaterialBibliografico {
    private int numeroEdicion;
    
    public Revista(String id, String titulo, int numeroEdicion) {
        super(id, titulo);
        this.numeroEdicion = numeroEdicion;
    }
    
    // Setter específico
    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }
    
    // Getter específico
    public int getNumeroEdicion() {
        return numeroEdicion;
    }
    
    @Override
    public double calcularMulta(int diasRetraso) {
        if (diasRetraso <= 5) {
            return diasRetraso * 0.20;
        } else {
            return 5 * 0.20 + (diasRetraso - 5) * 0.50;
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + " | Tipo: Revista" + " | Edición: " + numeroEdicion;
    }
}
