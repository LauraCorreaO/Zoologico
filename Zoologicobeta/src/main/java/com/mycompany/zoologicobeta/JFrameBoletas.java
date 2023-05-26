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
public class JFrameBoletas extends JFrame implements ActionListener {

    private JLabel labelTipo, labelPrecio;
    private JTextField fieldTipo, fieldPrecio;
    private JButton buttonCrear, buttonPlan,buttonAtrasAnimal, buttonInicio;
    private JTextArea textArea;
    private JFrame frame = new JFrame("Agregar boleta");

    public JFrameBoletas() {
        super("Agregar boleta");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLayout(null);
        Color verdePastelClaro = new Color(214, 255, 214);
        getContentPane().setBackground(verdePastelClaro);

        // Crear componentes
        labelTipo = new JLabel("Tipo:");
        labelTipo.setBounds(10, 10, 100, 20);
        add(labelTipo);

        fieldTipo = new JTextField();
        fieldTipo.setBounds(120, 10, 100, 20);
        add(fieldTipo);

        labelPrecio = new JLabel("Precio:");
        labelPrecio.setBounds(10, 40, 100, 20);
        add(labelPrecio);

        fieldPrecio = new JTextField();
        fieldPrecio.setBounds(120, 40, 100, 20);
        add(fieldPrecio);

        buttonCrear = new JButton("Crear boletas");
        buttonCrear.setBounds(10, 280, 120, 30);
        buttonCrear.addActionListener(this);
        add(buttonCrear);
        
        buttonPlan = new JButton("Crear Planes");
        buttonPlan.setBounds(140, 280, 120, 30);
        buttonPlan.addActionListener(this);
        add(buttonPlan);
        
        buttonAtrasAnimal = new JButton("Atrás");
        buttonAtrasAnimal.setBounds(270, 280, 120, 30);
        buttonAtrasAnimal.addActionListener(this);
        add(buttonAtrasAnimal);
        
        buttonInicio = new JButton("Inicio");
        buttonInicio.setBounds(400, 280, 120, 30);
        buttonInicio.addActionListener(this);
        add(buttonInicio);

        textArea = new JTextArea();
        textArea.setBounds(10, 320, 500, 600);
        add(textArea);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonCrear) {
            String tipo = fieldTipo.getText();
            double precio = Integer.parseInt(fieldPrecio.getText());

            Boleta newBoleta = new Boleta(tipo, precio);
            Boleta.agregarBoleta(newBoleta);
            mostrarListaBoletas();
        }else if (e.getSource() == buttonPlan){
            JFramePlan plan = new JFramePlan();
            plan.setVisible(true);
            this.setVisible(false);
        }else if (e.getSource() == buttonAtrasAnimal){
            JFrameAnimal animales = new JFrameAnimal();
            animales.setVisible(true);
        }else if (e.getSource() == buttonInicio){
            Home home = new Home();
            home.setVisible(true);
        }

    }
     public void mostrarListaBoletas() {
        textArea.setText("");
        for (Boleta boleta : Boleta.getListaBoletas()) {
            textArea.append("Tipo: " + boleta.getTipo() + "\n");
            textArea.append("Precio: " + boleta.getPrecio() + "\n");
            textArea.append("\n");
        }
    }

    public static void main(String[] args) {
        new JFrameBoletas();
    }
}
