/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologicobeta;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import java.util.HashSet;

/**
 *
 * @author user
 */
public class JFrameVentas extends JFrame implements ActionListener {

    private JLabel labelTipoDoc, labelNumDoc, labelNombrePersona, labelApellidos, labelEsMenor, labelNombrePlan, labelBoletas, labelValorPlan, labelCantidad, labelValorTotalPlanes, labelDescuentos, labelTotalVenta;
    private JTextField fieldTipoDoc, fieldNumDoc, fieldNombrePersona, fieldApellidos, fieldNombrePlan, fieldValorPlan, fieldCantidad, fieldValorTotalPlanes, fieldDescuentos, fieldTotalVenta;
    private JComboBox<String> comboEsMenor, comboTipoDoc, comboNombrePlan;
    private String[] opcionesComboMenor = {"Seleccione: ", "SI", "NO"};
    private String[] opcionesComboDoc = {"Seleccione: ", "Registro Civil", "Tarjeta de identidad", "CC", "Cédula de extranjeria"};
    private JButton buttonCrear, buttonAtrasPlanes, buttonInicio,buttonGuardarVenta;
    private ArrayList<JCheckBox> checkboxesBoleta = new ArrayList<>();
    private JTextArea textArea;
    private JFrame frame = new JFrame("Generar venta");
    private ArrayList<Ventas> listaVentas;
    
    public JFrameVentas() {
        super("Generar Ventas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLayout(null);
        Color verdePastelClaro = new Color(214, 255, 214);
        getContentPane().setBackground(verdePastelClaro);

        ArrayList<Planes> listaPlanes = Planes.getListaPlanes();
        listaVentas = new ArrayList<>();
        // Crear componentes
        labelTipoDoc = new JLabel("Tipo de documento:");
        labelTipoDoc.setBounds(10, 20, 130, 20);
        add(labelTipoDoc);

        comboTipoDoc = new JComboBox<>(opcionesComboDoc);
        comboTipoDoc.setBounds(150, 20, 100, 23);
        comboTipoDoc.addActionListener(this);

        labelNumDoc = new JLabel("Número de documento:");
        labelNumDoc.setBounds(10, 50, 140, 20);
        add(labelNumDoc);

        fieldNumDoc = new JTextField();
        fieldNumDoc.setBounds(150, 50, 100, 23);
        add(fieldNumDoc);

        labelNombrePersona = new JLabel("Nombre:");
        labelNombrePersona.setBounds(10, 80, 100, 20);
        add(labelNombrePersona);

        fieldNombrePersona = new JTextField();
        fieldNombrePersona.setBounds(150, 80, 100, 20);
        add(fieldNombrePersona);

        labelApellidos = new JLabel("Apellidos:");
        labelApellidos.setBounds(10, 110, 100, 20);
        add(labelApellidos);

        fieldApellidos = new JTextField();
        fieldApellidos.setBounds(150, 110, 100, 20);
        add(fieldApellidos);

        labelEsMenor = new JLabel("Es menor:");
        labelEsMenor.setBounds(10, 140, 100, 20);
        add(labelEsMenor);

        comboEsMenor = new JComboBox<>(opcionesComboMenor);
        comboEsMenor.setBounds(150, 140, 100, 20);
        comboEsMenor.addActionListener(this);

        labelNombrePlan = new JLabel("Nombre del plan:");
        labelNombrePlan.setBounds(10, 170, 100, 20);
        add(labelNombrePlan);

        comboNombrePlan = new JComboBox<>();
        comboNombrePlan.setBounds(150, 170, 100, 20);
        comboNombrePlan.addActionListener(this);

        labelCantidad = new JLabel("Cantidad:");
        labelCantidad.setBounds(10, 200, 100, 20);
        add(labelCantidad);

        fieldCantidad = new JTextField();
        fieldCantidad.setBounds(150, 200, 100, 20);
        add(fieldCantidad);
        
        labelDescuentos = new JLabel("Descuento abono:");
        labelDescuentos.setBounds(10, 230, 120, 20);
        add(labelDescuentos);

        fieldDescuentos = new JTextField();
        fieldDescuentos.setBounds(150, 230, 100, 20);
        add(fieldDescuentos);

        labelBoletas = new JLabel("Boletas: ");
        labelBoletas.setBounds(10, 260, 100, 20);
        add(labelBoletas);

        //opciones de boletas
        buttonCrear = new JButton("Generar venta");
        buttonCrear.setBounds(10, 480, 120, 30);
        buttonCrear.addActionListener(this);
        add(buttonCrear);

        buttonAtrasPlanes = new JButton("Atrás");
        buttonAtrasPlanes.setBounds(140, 480, 120, 30);
        buttonAtrasPlanes.addActionListener(this);
        add(buttonAtrasPlanes);
        add(comboEsMenor);
        add(comboTipoDoc);
        add(comboNombrePlan);
        
        buttonGuardarVenta = new JButton("Guardar venta");
        buttonGuardarVenta.setBounds(270, 480, 120, 30);
        buttonGuardarVenta.addActionListener(this);
        add(buttonGuardarVenta);
        
        buttonInicio = new JButton("Inicio");
        buttonInicio.setBounds(400, 480, 120, 30);
        buttonInicio.addActionListener(this);
        add(buttonInicio);
        
        textArea = new JTextArea();
        textArea.setBounds(10, 520, 500, 600);
        add(textArea);

        llenarComboBoxPlanes(listaPlanes);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ArrayList<Planes> listaPlanes = Planes.getListaPlanes();
        if (e.getSource() == buttonAtrasPlanes) {
            JFramePlan boleta = new JFramePlan();
            boleta.setVisible(true);
            this.setVisible(false);
        }else if(e.getSource() == buttonInicio) {
            Home home = new Home();
            home.setVisible(true);
            this.setVisible(false); 
        }else if(e.getSource() == buttonGuardarVenta) {
              Reporte reporte = new Reporte();
              reporte.generarPdf(listaVentas);   
             
        }else if (e.getSource() == comboNombrePlan) {
            mostrarBoletas(listaPlanes);

        } else if (e.getSource() == buttonCrear) {
            String tipoDoc = (String)comboTipoDoc.getSelectedItem();
            String numeroDoc = fieldNumDoc.getText();
            String nombrePersona = fieldNombrePersona.getText();
            String ApellidosUser = fieldApellidos.getText();
            String menor = (String)comboEsMenor.getSelectedItem();
            boolean esMenor;
            if(menor == "SI"){
                esMenor = true;
            }else{
                esMenor = false;
            }
            String nombrePlan = (String)comboNombrePlan.getSelectedItem();
            double valorPlan = valorPlan() ;
            double cantidad = Double.parseDouble(fieldCantidad.getText());
            double descuentoAbono = Double.parseDouble(fieldDescuentos.getText());
            double totalVenta = 0;
            
            Ventas venta = new Ventas(tipoDoc,numeroDoc,nombrePersona,ApellidosUser,esMenor,nombrePlan,valorPlan,cantidad,descuentoAbono,totalVenta);
            System.out.println(venta);
            listaVentas.add(venta);
        }
        // Crear una variable StringBuilder para construir el contenido del JTextArea
            StringBuilder sb = new StringBuilder();

            // Recorrer el ArrayList listaVentas y agregar cada venta al StringBuilder
            for (Ventas venta : listaVentas) {
                sb.append(venta.toString());
                sb.append("\n"); // Agregar un salto de línea después de cada venta
            }

            // Establecer el texto del JTextArea con el contenido del StringBuilder
            textArea.setText(sb.toString());
    }

public void mostrarBoletas(ArrayList<Planes> listaPlanes) {
    String nombrePlanSeleccionado = (String) comboNombrePlan.getSelectedItem();
    HashSet<Boleta> boletasSelectedPlan = new HashSet<>(); // Cambio de ArrayList a HashSet
    
    for (Planes plan : listaPlanes) {
        if (plan.getNombre().equals(nombrePlanSeleccionado)) {
            ArrayList<Boleta> boletasPlan = plan.getListaBoletas();
            
            System.out.println("Plan seleccionado: " + nombrePlanSeleccionado);
            System.out.println("Boletas del plan: " + boletasPlan);
            
            boletasSelectedPlan.addAll(boletasPlan);
            break; // No es necesario seguir iterando después de encontrar el plan seleccionado
        }
    }
    
    System.out.println("HashSet de las boletas del plan: " + boletasSelectedPlan);
    
    // Eliminar checkboxes existentes
    for (JCheckBox checkbox : checkboxesBoleta) {
        remove(checkbox);
    }
    checkboxesBoleta.clear();
    
    int y = 290;
    
    // Crear y agregar nuevos checkboxes
    for (Boleta boleta : boletasSelectedPlan) {
        JCheckBox checkbox = new JCheckBox(boleta.getTipo());
        checkbox.setBounds(10, y, 100, 20);
        add(checkbox);
        checkboxesBoleta.add(checkbox);
        y += 30;
    }
    
    revalidate();
    repaint();
}

    public void llenarComboBoxPlanes(ArrayList<Planes> listaPlanes) {
        comboNombrePlan.removeAllItems();
        comboNombrePlan.addItem("Selecciona");
        for (Planes plan : listaPlanes) {
            String listaPlan = plan.getNombre();

            comboNombrePlan.addItem(listaPlan);
        }
    }

   public double valorPlan() {
    double precio = 0;
    ArrayList<String> boletasChecked = new ArrayList<>();
    ArrayList<Boleta> boletas = Boleta.getListaBoletas();
    
    for (JCheckBox checkbox : checkboxesBoleta) {
        if (checkbox.isSelected()) {
            boletasChecked.add(checkbox.getText());
        }
    }
    
    System.out.println(boletasChecked);
    
    for (String boletaChecked : boletasChecked) {
        for (Boleta boleta : boletas) {
            if (boleta.getTipo().equals(boletaChecked)) { // Corrección aquí
                precio += boleta.getPrecio();
            }
        }
    }
    System.out.println("Precio total del plan: " + precio);
    return precio;
}

    public static void main(String[] args) {
        new JFrameVentas();
    }
}
