package Multas_Java_src;

public abstract class MaterialBibliografico {
    // Atributos privados
    private String id;
    private String titulo;
    private boolean disponible;
    public static final int DIAS_PRESTAMO = 15;
    
    // Constructor
    public MaterialBibliografico(String id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        this.disponible = true;
    }
    
    // Setters
    public void setId(String id) {
        this.id = id;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    // Getters
    public String getId() {
        return id;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public boolean isDisponible() {
        return disponible;
    }
    
    // Métodos de operación
    public void prestar() {
        if (disponible) {
            setDisponible(false);
        }
    }
    
    public void devolver() {
        setDisponible(true);
    }
    
    // Método abstracto
    public abstract double calcularMulta(int diasRetraso);
    
    @Override
    public String toString() {
        return "ID: " + id + 
               " | Título: " + titulo + 
               " | Disponible: " + (disponible ? "Sí" : "No");
    }
}