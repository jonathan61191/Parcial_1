public  class Libro {

    private String titulo;
    private Float precio;
    private String autor;

    public Libro(String titulo, Float precio, String autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    
    
}