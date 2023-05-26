/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologicobeta;

/**
 *
 * @author user
 */
public class AnimalesSalvajes extends Animales{
    protected String gradoAgresividad;
    protected String tipoCaza;
    
    public AnimalesSalvajes(String nombre, String especie,  int edad, String tipoHabitat, String gradoAgresividad, String tipoCaza,String tipoAlimentacion){
        super(nombre, especie, edad, tipoHabitat,tipoAlimentacion);
        this.gradoAgresividad = gradoAgresividad;
        this.tipoCaza = tipoCaza;
    }

    public String getGradoAgresividad() {
        return gradoAgresividad;
    }

    public void setGradoAgresividad(String gradoAgresividad) {
        this.gradoAgresividad = gradoAgresividad;
    }

    public String getTipoCaza() {
        return tipoCaza;
    }

    public void setTipoCaza(String tipoCaza) {
        this.tipoCaza = tipoCaza;
    }
    
    public double calcularCosto(Animales animal) {
        switch (tipoAlimentacion) {
            case "Herbívoro":
                return 100.0;
            case "Carnívoro":
                return 200.0;
            default:
                return 150.0;
        }
    }
    @Override
    public String toString() {
        return "AnimalesSalvajes{" + "gradoAgresividad=" + gradoAgresividad + ", tipoCaza=" + tipoCaza + ", tipoAlimentacion=" + tipoAlimentacion + '}';
    }
    
    
}
