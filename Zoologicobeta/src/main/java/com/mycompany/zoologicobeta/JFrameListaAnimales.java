/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologicobeta;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.util.ArrayList;

public class JFrameListaAnimales extends JFrame implements ActionListener {

    private JLabel labelTitulo,labelTitulo2,labelNombreLista, labelSalvajes, labelDomesticos;
    private JTextField fieldNombreLista;
    private JButton buttonCrearLista, buttonBoleta, buttonAtras, buttonInicio;
    private ArrayList<String> nombreAnimalesSalvajes = new ArrayList<>();
    private ArrayList<String> nombreAnimalesDomesticos = new ArrayList<>();
    private ArrayList<JCheckBox> checkboxes = new ArrayList<>();
    private JTextArea textArea;

    public JFrameListaAnimales() {
        super("Lista de Animales");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLayout(null);
        setVisible(true);
        Color verdePastelClaro = new Color(214, 255, 214);
        getContentPane().setBackground(verdePastelClaro);

        //Componentes
        labelTitulo = new JLabel("Crear lista de Animales");
        labelTitulo.setBounds(10, 20, 200, 20);
        add(labelTitulo);

        labelNombreLista = new JLabel("Nombre de la lista");
        labelNombreLista.setBounds(10, 50, 150, 20);
        add(labelNombreLista);

        fieldNombreLista = new JTextField();
        fieldNombreLista.setBounds(120, 50, 100, 20);
        add(fieldNombreLista);

        labelTitulo = new JLabel("Animales salvajes");
        labelTitulo.setBounds(10, 80, 200, 20);
        add(labelTitulo);
        

        labelTitulo2 = new JLabel("Animales domesticos");
        labelTitulo2.setBounds(220, 80, 200, 20);
        add(labelTitulo2);

        buttonCrearLista = new JButton("Crear lista");
        buttonCrearLista.setBounds(10, 310, 120, 30);
        buttonCrearLista.addActionListener(this);
        add(buttonCrearLista);

        buttonBoleta = new JButton("Crear boletas");
        buttonBoleta.setBounds(140, 310, 120, 30);
        buttonBoleta.addActionListener(this);
        add(buttonBoleta);
        
        buttonAtras= new JButton("Atras");
        buttonAtras.setBounds(270, 310, 120, 30);
        buttonAtras.addActionListener(this);
        add(buttonAtras);
        
        buttonInicio = new JButton("Inicio");
        buttonInicio.setBounds(400, 310, 120, 30);
        buttonInicio.addActionListener(this);
        add(buttonInicio);

        textArea = new JTextArea();
        textArea.setBounds(10, 350, 500, 600);
        add(textArea);

        ArrayList<Animales> listaAnimales = Animales.getListaAnimales();
        for (Animales animal : listaAnimales) {
            String nombreAnimal = animal.getNombre();
            if (animal instanceof AnimalesSalvajes) {
                nombreAnimalesSalvajes.add(nombreAnimal);
            } else {
                nombreAnimalesDomesticos.add(nombreAnimal);
            }
        }

        int ySalvajes = 110;
        for (String nombreSalvajes : nombreAnimalesSalvajes) {
            JCheckBox checkBox = new JCheckBox(nombreSalvajes);
            checkBox.setBounds(10, ySalvajes, 200, 20);
            checkboxes.add(checkBox);
            add(checkBox);
            ySalvajes += 30;
        }
        int yDomesticos = 110;
        for (String nombreDomesticos : nombreAnimalesDomesticos) {
            JCheckBox checkBox = new JCheckBox(nombreDomesticos);
            checkBox.setBounds(220, yDomesticos, 200, 20);
            checkboxes.add(checkBox);
            add(checkBox);
            yDomesticos += 30;
        }

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonCrearLista) {
            String nombreLista = fieldNombreLista.getText();
            ArrayList<String> nombreAnimales = new ArrayList<>();
            for (JCheckBox checkbox : checkboxes) {
                if (checkbox.isSelected()) {
                    nombreAnimales.add(checkbox.getText());
                }
            }
            ListaAnimales newLista = new ListaAnimales(nombreLista, nombreAnimales);
            ListaAnimales.agregarListaNombres(newLista);
            mostrarListaNombres();
        } else if (e.getSource() == buttonBoleta) {
            JFrameBoletas boletas = new JFrameBoletas();
            boletas.setVisible(true);
            this.setVisible(false);
        }else if (e.getSource() == buttonAtras) {
            JFrameAnimal animal = new JFrameAnimal();
            animal.setVisible(true);
            this.setVisible(false);
        }else if (e.getSource() == buttonInicio) {
            Home home = new Home();
            home.setVisible(true);
            this.setVisible(false);
        }

    }

    public void mostrarListaNombres() {
        textArea.setText("");
        for (ListaAnimales lista : ListaAnimales.getListaNombres()) {
            textArea.append("Nombre lista: " + lista.getNombreLista() + "\n");
            textArea.append("Animales: " + lista.getNombreAnimales() + "\n");
        }
    }

    public static void main(String[] args) {
        JFrameListaAnimales frame = new JFrameListaAnimales();
    }
}
