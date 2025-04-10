package Multas_Java_src;

public class Libro extends MaterialBibliografico {
    private int numPaginas;
    
    public Libro(String id, String titulo, int numPaginas) {
        super(id, titulo);
        this.numPaginas = numPaginas;
    }
    
    // Setter específico
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    // Getter específico
    public int getNumPaginas() {
        return numPaginas;
    }
    
    @Override
    public double calcularMulta(int diasRetraso) {
        return diasRetraso * 0.50;
    }
    
    @Override
    public String toString() {
        return super.toString() + " | Tipo: Libro" + " | Páginas: " + numPaginas;
    }
}