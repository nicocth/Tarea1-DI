/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 * Clase que almacenara los datos de la reserva
 * @author nico_
 */
public class Reserva {
    private String nombre;
    private String apellidos;
    private String telefono;
    private String fecha;
    private int numeroAsistentes;
    private int numeroJornadas;
    private String tipoEvento;
    private String tipoCocina;
    private boolean habitaciones; 

    /**
     * Constructor para la clase Reserva
     * @param nombre
     * @param apellidos
     * @param telefono
     * @param fecha
     * @param numeroAsistentes
     * @param tipoEvento
     * @param tipoCocina 
     */
    public Reserva(String nombre, String apellidos, String telefono, String fecha, int numeroAsistentes, String tipoEvento, String tipoCocina) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.fecha = fecha;
        this.numeroAsistentes = numeroAsistentes;
        this.tipoEvento = tipoEvento;
        this.tipoCocina = tipoCocina;
        numeroJornadas = 0;
        habitaciones = false;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getFecha() {
        return fecha;
    }

    public int getNumeroAsistentes() {
        return numeroAsistentes;
    }

    public int getNumeroJornadas() {
        return numeroJornadas;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public String getTipoCocina() {
        return tipoCocina;
    }

    public boolean isHabitaciones() {
        return habitaciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setNumeroAsistentes(int numeroAsistentes) {
        this.numeroAsistentes = numeroAsistentes;
    }

    public void setNumeroJornadas(int numeroJornadas) {
        this.numeroJornadas = numeroJornadas;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public void setTipoCocina(String tipoCocina) {
        this.tipoCocina = tipoCocina;
    }

    public void setHabitaciones(boolean habitaciones) {
        this.habitaciones = habitaciones;
    }
    
    
    
}
