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
public class Planes {

    private String nombre;
    private String descripcion;
    private ArrayList<Boleta> listaBoletasSelected;
    private String listaAnimalesAsociados; //nota: pendiente para calcular valor total
    private static ArrayList<Planes> listaPlanes = new ArrayList<>();

    public Planes(String nombre, String descripcion, ArrayList<Boleta> listaBoletas, String listaAnimales) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.listaBoletasSelected = listaBoletas;
        this.listaAnimalesAsociados = listaAnimales;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Boleta> getListaBoletas() {
        return listaBoletasSelected;
    }

    public void setListaBoletasSelected(ArrayList<Boleta> listaBoletas) {
        this.listaBoletasSelected = listaBoletas;
    }

    public String getListaAnimalesAsociados() {
        return listaAnimalesAsociados;
    }

    public void setListaAnimalesAsociados(String listaAnimalesAsociados) {
        this.listaAnimalesAsociados = listaAnimalesAsociados;
    }

    public static ArrayList<Planes> getListaPlanes() {
        return listaPlanes;
    }

    public static void setListaPlanes(ArrayList<Planes> listaPlanes) {
        Planes.listaPlanes = listaPlanes;
    }
    public static void agregarPlanes(Planes plan){
        listaPlanes.add(plan);
    }
    @Override
    public String toString() {
        return "Plan: " + nombre + "\n"
                + "Descripción: " + descripcion + "\n"
                + "Boletas: " + listaBoletasSelected.toString() + "\n"
                + "Animales asociados: " + listaAnimalesAsociados.toString();
    }

}
