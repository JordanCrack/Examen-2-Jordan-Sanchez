/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base;

import java.time.LocalDate;

/**
 *
 * @author jorda
 */
public class Empleado {
    private int cedula;
    private String nombre;
    private String apellido;
    private String genero;
    private LocalDate fechaNacimienro;
    private String email;
    private Double salrio;
    private Double porcComision;

    public Empleado(int cedula, String nombre, String apellido, String genero, LocalDate fechaNacimienro, String email, Double salrio, Double porcComision) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaNacimienro = fechaNacimienro;
        this.email = email;
        this.salrio = salrio;
        this.porcComision = porcComision;
        
    }
    
    public Empleado() {
        this.cedula = 0;
        this.nombre = "";
        this.apellido = "";
        this.genero = "";
        this.fechaNacimienro = null;
        this.email = "";
        this.salrio = 0.0;
        this.porcComision = 0.0;
        
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getFechaNacimienro() {
        return fechaNacimienro;
    }

    public void setFechaNacimienro(LocalDate fechaNacimienro) {
        this.fechaNacimienro = fechaNacimienro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalrio() {
        return salrio;
    }

    public void setSalrio(Double salrio) {
        this.salrio = salrio;
    }

    public Double getPorcComision() {
        return porcComision;
    }

    public void setPorcComision(Double porcComision) {
        this.porcComision = porcComision;
    }
    
    public Double calSalarioTotal(Double porc, Double salario){
        Double total = null;
        salario = porc = total;
      return total;  
    }
   
    //voy hacer un acumulador en la tercera tabla
    
}
