/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Carlos
 */
public class AutorModelo {
    private int idAutor;
    private String cedula;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private String fechaNacimiento;

    public AutorModelo() {
    }

    public AutorModelo(int idAutor, String cedula, String nombre, String apellido, String nacionalidad, String fechaNacimiento) {
        this.idAutor = idAutor;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "DATOS AUTOR\n"+
                "Cédula:"+getCedula()+"\n"+
                "Nombre:"+getNombre()+"\n"+
                "Apellido:"+getApellido()+"\n"+
                "Nacionalidad:"+getNacionalidad()+"\n"+
                "Fecha de Nacimiento:"+getFechaNacimiento();
    }
    
    
    
}
