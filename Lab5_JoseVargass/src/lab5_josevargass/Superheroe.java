/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_josevargass;

/**
 *
 * @author josevargas
 */
public class Superheroe {
    private String nombre;
    private String poder;
    private String debilidad;
    private Escuadron escuadron;
    private int fuerza;
    private int a_fisica;
    private int a_mental;

    public Superheroe() {
    }

    public Superheroe(String nombre, String poder, String debilidad, Escuadron escuadron, int fuerza, int a_fisica, int a_mental) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.escuadron = escuadron;
        this.fuerza = fuerza;
        this.a_fisica = a_fisica;
        this.a_mental = a_mental;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public Escuadron getEscuadron() {
        return escuadron;
    }

    public void setEscuadron(Escuadron escuadron) {
        this.escuadron = escuadron;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getA_fisica() {
        return a_fisica;
    }

    public void setA_fisica(int a_fisica) {
        this.a_fisica = a_fisica;
    }

    public int getA_mental() {
        return a_mental;
    }

    public void setA_mental(int a_mental) {
        this.a_mental = a_mental;
    }

    @Override
    public String toString() {
        return "Superheroe{" + "nombre=" + nombre + ", poder=" + poder + '}';
    }
    
    
}
