/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologicobeta;

/**
 *
 * @author user
 */
public class AnimalesDomesticos extends Animales{
    protected String nivelDomesticacion;
    protected String raza;

    public AnimalesDomesticos(String nombre, String especie, int edad, String tipoHabitat, String tipoAlimentacion, String nivelDomesticacion, String raza) {
        super(nombre, especie, edad, tipoHabitat, tipoAlimentacion);
        this.nivelDomesticacion = nivelDomesticacion;
        this.raza = raza;
    }

    public String getNivelDomesticacion() {
        return nivelDomesticacion;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public String toString() {
        return "AnimalesDomesticos{" + "nivelDomesticacion=" + nivelDomesticacion + ", raza=" + raza + '}';
    }
    
}
