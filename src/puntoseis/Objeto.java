package src.puntoseis;

public class Objeto {
    
    private String nombre;
    private float precio;
    private boolean disponibilidad;

    public Objeto(boolean disponibilidad, String nombre, float precio) {
        this.disponibilidad = disponibilidad;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

        

    
}
