/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_josevargass;

import java.util.ArrayList;

/**
 *
 * @author josevargas
 */
public class Escuadron {
    private String nombre;
    private String base;
    private String lider;
    private String tipo;
    private ArrayList miembros;

    public Escuadron() {
    }

    public Escuadron(String nombre, String base, String tipo) {
        this.nombre = nombre;
        this.base = base;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList miembros) {
        this.miembros = miembros;
    }

    @Override
    public String toString() {
        return "Nombre = " + nombre + ", Base = " + base;
    }
    
    
}
