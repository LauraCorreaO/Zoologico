/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.zoologicobeta;

import java.util.ArrayList;

public class Zoologicobeta {

    public static void main(String[] args) {
       ArrayList<Boleta> listaBoletas = new ArrayList<>();
       //Boleta boletaEstandar = new Boleta("Estandar", 100.0, true, 0.1, 0);
       //Boleta boletaPlatino = new Boleta("Platino", 500.0, true, 0.2, 0);
       //listaBoletas.add(boletaEstandar);
       //listaBoletas.add(boletaPlatino);
       
       ArrayList<Animales> listaAnimales = new ArrayList<>();
       Animales leon = new AnimalesSalvajes("juan", "felino", 5, "sabana", "alto","salvaje","carnivora");
       Animales cebra = new AnimalesSalvajes("marta", "equido", 5, "sabana", "alto","manada","herbivora");
       Animales jirafa = new AnimalesSalvajes("sofia", "mamífero artiodáctilo", 5, "sabana", "alto","salvaje","herbivora");
       Animales rino = new AnimalesSalvajes("pedro", " perisodáctilo", 20, "sabana", "alto","salvaje","herbivora");
       
       listaAnimales.add(leon);
       listaAnimales.add(cebra);
       listaAnimales.add(jirafa);
       listaAnimales.add(rino);
       
      // Planes plan1 = new Planes("Plan básico", "Descripción del plan básico",listaBoletas,listaAnimales);
       
        //System.out.println(boletaEstandar);
        //System.out.print( plan1);
        
        //Ventas venta1 = new Ventas(plan1, 2); 
        //venta1.calcularTotalVenta();
        //System.out.println("Esta es la venta:"+venta1);
    }
}
