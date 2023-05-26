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
public class Boleta {

    private String tipo;
    private double precio;
//    private boolean esMenor;
//    private double descuentoAbono;
//    private double precioFinal;
    protected static ArrayList <Boleta> listaBoletas = new ArrayList<>();

    public Boleta(String tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

   
//    public void setPrecioFinal(double precioFinal) {
//        this.precioFinal = precioFinal;
//    }
    
    public static void agregarBoleta(Boleta boleta) {
        listaBoletas.add(boleta);
    }
    
    public static ArrayList<Boleta> getListaBoletas() {
        return listaBoletas;
    }

//    public double calcularPrecioFinal(){
//        precioFinal = this.precio - (this.precio * (this.descuentoAbono/100));
//    
//    if (this.esMenor) {
//        precioFinal = precioFinal * 0.9;
//    }
//    return precioFinal;
//}

    @Override
    public String toString() {
        return "Boleta{" + "tipo=" + tipo + ", precio=" + precio + '}';
    }

    
}
