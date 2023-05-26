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
public class ListaAnimales {
    private String nombreLista;
    private static ArrayList<String> nombreAnimales;
    private static ArrayList<ListaAnimales> listaNombres = new ArrayList<>(); 

    public ListaAnimales(String nombreLista, ArrayList<String> nombreAnimales) {
        this.nombreLista = nombreLista;
        this.nombreAnimales = nombreAnimales;
    }
    
    public String getNombreLista() {
        return nombreLista;
    }

    public static ArrayList<String> getNombreAnimales() {
        return nombreAnimales;
    }

    public static ArrayList<ListaAnimales> getListaNombres() {
        return listaNombres;
    }
    
    
    public static void agregarListaNombres(ListaAnimales lista) {
        listaNombres.add(lista);
    }
    
    
}
