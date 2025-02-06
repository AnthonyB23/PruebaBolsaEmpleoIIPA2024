/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Carlos
 */
public class LibroModelo {
    private int idLibro;
    private String titulo;
    private String genero;
    private String fechaPublicacion;
    private AutorModelo idAutor; 

    public LibroModelo() {
    }

    public LibroModelo(int idLibro, String titulo, String genero, String fechaPublicacion, AutorModelo idAutor) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.genero = genero;
        this.fechaPublicacion = fechaPublicacion;
        this.idAutor = idAutor;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public AutorModelo getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(AutorModelo idAutor) {
        this.idAutor = idAutor;
    }

    

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
