/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologicobeta;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Animales {
    protected String nombre;
    protected String especie;
    protected int edad;
    protected String tipoHabitat;
    protected String tipoAlimentacion;
    private static ArrayList<Animales> listaAnimales = new ArrayList<>();
    
    public Animales(String nombre, String especie,int edad, String tipoHabitat,String tipoAlimentacion) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.tipoHabitat = tipoHabitat;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }
    
    public static void agregarAnimal(Animales animal) {
        listaAnimales.add(animal);
    }

    public static ArrayList<Animales> getListaAnimales() {
        return listaAnimales;
    }

    @Override
    public String toString() {
        return "Animales{" + "nombre=" + nombre + ", especie=" + especie + ", edad=" + edad + ", tipoHabitat=" + tipoHabitat + '}';
    }
    
    
}
