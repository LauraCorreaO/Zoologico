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
public class Ventas {
    private String tipoDoc;
    private String numDoc;
    private String nombrePersona;
    private String apellidoPersona;
    private boolean esMenor;
    private ArrayList<Planes> listaPlanes;
    private String nombrePlan;
    private double valorPlan; 
    private double cantidad;
    //private double valorTotalPlanes; //esto fuera creo
    private double descuentoAbono;
    private double totalVenta;

    public Ventas(String tipoDoc, String numDoc, String nombrePersona, String apellidoPersona, boolean esMenor, String nombrePlan, double valorPlan, double cantidad, double descuentoAbono, double totalVenta) {
        this.tipoDoc = tipoDoc;
        this.numDoc = numDoc;
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.esMenor = esMenor;
        this.nombrePlan = nombrePlan;
        this.valorPlan = valorPlan;//valor boleta
        this.cantidad = cantidad;
        //this.valorTotalPlanes = valorTotalPlanes;
        this.descuentoAbono = descuentoAbono;
        this.totalVenta = calcularPrecioFinal();
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public boolean isEsMenor() {
        return esMenor;
    }

    public void setEsMenor(boolean esMenor) {
        this.esMenor = esMenor;
    }

    public ArrayList<Planes> getListaPlanes() {
        return listaPlanes;
    }

    public void setListaPlanes(ArrayList<Planes> listaPlanes) {
        this.listaPlanes = listaPlanes;
    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public double getValorPlan() {
        return valorPlan;
    }

    public void setValorPlan(double valorPlan) {
        this.valorPlan = valorPlan;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }


    public double getDescuentoAbono() {
        return descuentoAbono;
    }

    public void setDescuentoAbono(double descuentoAbono) {
        this.descuentoAbono = descuentoAbono;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }
    
    public double calcularPrecioFinal(){
        totalVenta = this.valorPlan - (this.valorPlan * (this.descuentoAbono/100));
    
    if (this.esMenor) {
        totalVenta = totalVenta * 0.9;
    }
    totalVenta *= this.cantidad;
    return totalVenta;
}

    @Override
    public String toString() {
        return "Ventas{" + "tipoDoc=" + tipoDoc + ", numDoc=" + numDoc + ", nombrePersona=" + nombrePersona + ", apellidoPersona=" + apellidoPersona + ", esMenor=" + esMenor + ", listaPlanes=" + listaPlanes + ", nombrePlan=" + nombrePlan + ", valorPlan=" + valorPlan + ", cantidad=" + cantidad + ", descuentoAbono=" + descuentoAbono + ", totalVenta=" + totalVenta + '}';
    }

    Object getValorVenta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getDescuentos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getTotal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
