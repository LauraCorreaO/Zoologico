/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologicobeta;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author user
 */
public class JFrameAnimal extends JFrame implements ActionListener {

    private JLabel labelNombre, labelEspecie, labelEdad, labelTipoHabitat, labelTipoAlimento, labelTipoAnimal, labelAgresividad, labelTipoCaza, labelDomesticacion, labelRaza;
    private JTextField fieldNombre, fieldEdad, fieldEspecie, fieldTipoHabitat, fieldAgresividad, fieldTipoAlimento, fieldTipoCaza, fieldDomesticacion, fieldRaza;
    private JComboBox<String> comboTipoAnimales;
    private String[] opcionesCombo = {"Seleccione un tipo: ", "Animales salvajes", "Animales domésticos"};
    private JButton buttonCrear,buttonLista,buttonBoleta, buttonAtras;
    private JTextArea textArea;
    private JFrame frame = new JFrame("Agregar animal");

    public JFrameAnimal() {
        super("Agregar animal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLayout(null);
        Color verdePastelClaro = new Color(214, 255, 214);
        getContentPane().setBackground(verdePastelClaro);

        // Crear componentes
        labelNombre = new JLabel("Nombre:");
        labelNombre.setBounds(10, 10, 100, 20);
        add(labelNombre);

        fieldNombre = new JTextField();
        fieldNombre.setBounds(120, 10, 100, 20);
        add(fieldNombre);

        labelEdad = new JLabel("Edad:");
        labelEdad.setBounds(10, 40, 100, 20);
        add(labelEdad);

        fieldEdad = new JTextField();
        fieldEdad.setBounds(120, 40, 100, 20);
        add(fieldEdad);

        labelEspecie = new JLabel("Especie:");
        labelEspecie.setBounds(10, 70, 100, 20);
        add(labelEspecie);

        fieldEspecie = new JTextField();
        fieldEspecie.setBounds(120, 70, 100, 20);
        add(fieldEspecie);

        labelTipoHabitat = new JLabel("Tipo de hábitat:");
        labelTipoHabitat.setBounds(10, 100, 100, 20);
        add(labelTipoHabitat);

        fieldTipoHabitat = new JTextField();
        fieldTipoHabitat.setBounds(120, 100, 100, 20);
        add(fieldTipoHabitat);

        labelTipoAlimento = new JLabel("Tipo de alimento:");
        labelTipoAlimento.setBounds(10, 130, 100, 20);
        add(labelTipoAlimento);

        fieldTipoAlimento = new JTextField();
        fieldTipoAlimento.setBounds(120, 130, 100, 20);
        add(fieldTipoAlimento);

        labelTipoAnimal = new JLabel("Tipo de animal:");
        labelTipoAnimal.setBounds(10, 160, 100, 20);
        add(labelTipoAnimal);
        
        comboTipoAnimales = new JComboBox<>(opcionesCombo);
        comboTipoAnimales.setBounds(120, 160, 150, 20);
        comboTipoAnimales.addActionListener(this);

        labelAgresividad = new JLabel("Nivel de agresividad:");
        labelAgresividad.setBounds(10, 190, 120, 20);
        labelAgresividad.setVisible(false);
        add(labelAgresividad);

        fieldAgresividad = new JTextField();
        fieldAgresividad.setBounds(150, 190, 70, 20);
        fieldAgresividad.setVisible(false);
        add(fieldAgresividad);

        labelTipoCaza = new JLabel("Tipo de caza:");
        labelTipoCaza.setBounds(10, 220, 100, 20);
        labelTipoCaza.setVisible(false);
        add(labelTipoCaza);

        fieldTipoCaza = new JTextField();
        fieldTipoCaza.setBounds(120, 220, 100, 20);
        fieldTipoCaza.setVisible(false);
        add(fieldTipoCaza);

        labelDomesticacion = new JLabel("Nivel de domesticación:");
        labelDomesticacion.setBounds(10, 250, 140, 20);
        labelDomesticacion.setVisible(false);
        add(labelDomesticacion);

        fieldDomesticacion = new JTextField();
        fieldDomesticacion.setBounds(150, 250, 70, 20);
        fieldDomesticacion.setVisible(false);
        add(fieldDomesticacion);

        labelRaza = new JLabel("Raza:");
        labelRaza.setBounds(10, 280, 100, 20);
        labelRaza.setVisible(false);
        add(labelRaza);

        fieldRaza = new JTextField();
        fieldRaza.setBounds(120, 280, 100, 20);
        fieldRaza.setVisible(false);
        add(fieldRaza);

        buttonCrear = new JButton("Crear animales");
        buttonCrear.setBounds(10, 310, 120, 30);
        buttonCrear.addActionListener(this);
        add(buttonCrear);
         
        buttonLista = new JButton("Crear lista");
        buttonLista.setBounds(140, 310, 120, 30);
        buttonLista.addActionListener(this);
        add(buttonLista);
        
        buttonBoleta = new JButton("Crear Boleta");
        buttonBoleta.setBounds(270, 310, 120, 30);
        buttonBoleta.addActionListener(this);
        add(buttonBoleta);
        
        buttonAtras = new JButton("Inicio");
        buttonAtras.setBounds(400, 310, 120, 30);
        buttonAtras.addActionListener(this);
        add(buttonAtras);

        add(comboTipoAnimales);
        textArea = new JTextArea();
        textArea.setBounds(10, 350, 500, 600);
        add(textArea);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboTipoAnimales) {
            if (comboTipoAnimales.getSelectedItem().equals("Animales salvajes")) {
                labelAgresividad.setVisible(true);
                fieldAgresividad.setVisible(true);
                labelTipoCaza.setVisible(true);
                fieldTipoCaza.setVisible(true);

                labelDomesticacion.setVisible(false);
                fieldDomesticacion.setVisible(false);
                labelRaza.setVisible(false);
                fieldRaza.setVisible(false);
            } else if (comboTipoAnimales.getSelectedItem().equals("Animales domésticos")) {
                labelDomesticacion.setVisible(true);
                fieldDomesticacion.setVisible(true);
                labelRaza.setVisible(true);
                fieldRaza.setVisible(true);

                labelAgresividad.setVisible(false);
                fieldAgresividad.setVisible(false);
                labelTipoCaza.setVisible(false);
                fieldTipoCaza.setVisible(false);
            }
        } else if (e.getSource() == buttonCrear) {
            String nombre = fieldNombre.getText();
            int edad = Integer.parseInt(fieldEdad.getText());
            String especie = fieldEspecie.getText();
            String tipoHabitat = fieldTipoHabitat.getText();
            String tipoAlimentacion = fieldTipoAlimento.getText();
            String nivelAgresividad = fieldAgresividad.getText();
            String tipoCaza = fieldTipoCaza.getText();
            String nivelDomesticacion = fieldDomesticacion.getText();
            String raza = fieldRaza.getText();

            String tipo = (String) comboTipoAnimales.getSelectedItem();

            if (tipo.equals("Animales salvajes")) {
                AnimalesSalvajes newAnimal = new AnimalesSalvajes(nombre, especie, edad, tipoHabitat, nivelAgresividad, tipoCaza, tipoAlimentacion);
                AnimalesSalvajes.agregarAnimal(newAnimal);
            } else {
                AnimalesDomesticos newAnimal = new AnimalesDomesticos(nombre, especie, edad, tipoHabitat, tipoAlimentacion, nivelDomesticacion, raza);
                AnimalesDomesticos.agregarAnimal(newAnimal);
            }
            mostrarListaAnimales();
        }else if (e.getSource() == buttonLista){
            JFrameListaAnimales listaAnimal = new JFrameListaAnimales();
            listaAnimal.setVisible(true);
            this.setVisible(false);
        }else if (e.getSource() == buttonBoleta){
            JFrameBoletas boleta = new JFrameBoletas();
            boleta.setVisible(true);
            this.setVisible(false);
        }else if (e.getSource() == buttonAtras){
            Home home = new Home();
            home.setVisible(true);
            this.setVisible(false);
    }
    }
    public void mostrarListaAnimales() {
        textArea.setText("");
        for (Animales animal : Animales.getListaAnimales()) {
            textArea.append("Nombre: " + animal.getNombre() + "\n");
            textArea.append("Edad: " + animal.getEdad() + "\n");
            textArea.append("Especie: " + animal.getEspecie() + "\n");
            textArea.append("Tipo de hábitat: " + animal.getTipoHabitat() + "\n");
            textArea.append("Tipo de alimentación: " + animal.getTipoAlimentacion() + "\n");

            if (animal instanceof AnimalesSalvajes) {
                textArea.append("Nivel de agresividad: " + ((AnimalesSalvajes) animal).getGradoAgresividad() + "\n");
                textArea.append("Tipo de caza: " + ((AnimalesSalvajes) animal).getTipoCaza() + "\n");
            } else if (animal instanceof AnimalesDomesticos) {
                textArea.append("Nivel de domesticación: " + ((AnimalesDomesticos) animal).getNivelDomesticacion() + "\n");
                textArea.append("Raza: " + ((AnimalesDomesticos) animal).getRaza() + "\n");
            }

            textArea.append("\n");
        }
    }
    
    
    public static void main(String[] args) {
        new JFrameAnimal();
    }
}
