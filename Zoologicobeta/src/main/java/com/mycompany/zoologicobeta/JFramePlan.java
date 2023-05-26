package com.mycompany.zoologicobeta;

import static com.mycompany.zoologicobeta.Boleta.listaBoletas;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import java.util.ArrayList;

public class JFramePlan extends javax.swing.JFrame implements ActionListener {

    private JLabel labelInstruccion, labelNombrePlan, labelDescripcion, labelTipoBoleta, labelAnimales;
    private JTextField fieldNombrePlan, fieldDescripcion;
    private JComboBox<String> comboTipoBoleta, comboAnimales;
    private JButton buttonCrearPlan, buttonVenta, buttonAtrasBoletas,buttonInicio;
    private ArrayList<JCheckBox> checkboxesBoleta = new ArrayList<>();

    private JTextArea textArea;

    public JFramePlan() {
        ArrayList<ListaAnimales> listaAnimales = ListaAnimales.getListaNombres();
        ArrayList<Boleta> listaBoletas = Boleta.getListaBoletas();
        Color verdePastelClaro = new Color(214, 255, 214);
        getContentPane().setBackground(verdePastelClaro);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLayout(null);

        // Crear componentes
        labelInstruccion = new JLabel("Ingrese los siguientes datos para crear un plan: ");
        labelInstruccion.setBounds(10, 10, 300, 20);
        add(labelInstruccion);

        labelNombrePlan = new JLabel("Nombre del Plan: ");
        labelNombrePlan.setBounds(10, 40, 100, 20);
        add(labelNombrePlan);

        fieldNombrePlan = new JTextField();
        fieldNombrePlan.setBounds(120, 40, 200, 23);
        add(fieldNombrePlan);

        labelDescripcion = new JLabel("Descripción: ");
        labelDescripcion.setBounds(10, 70, 200, 20);
        add(labelDescripcion);

        fieldDescripcion = new JTextField();
        fieldDescripcion.setBounds(120, 70, 200, 23);
        add(fieldDescripcion);

        labelAnimales = new JLabel("Lista de animales:  ");
        labelAnimales.setBounds(10, 100, 300, 20);
        add(labelAnimales);

        comboAnimales = new JComboBox<>();
        comboAnimales.setBounds(120, 100, 120, 23);
        comboAnimales.addActionListener(this);

        labelTipoBoleta = new JLabel("Tipo de Boleta: ");
        labelTipoBoleta.setBounds(10, 130, 150, 20);
        add(labelTipoBoleta);

        buttonCrearPlan = new JButton("Crear planes");
        buttonCrearPlan.setBounds(10, 270, 120, 30);
        buttonCrearPlan.addActionListener(this);
        add(buttonCrearPlan);

        buttonVenta = new JButton("Registrar Venta");
        buttonVenta.setBounds(140, 270, 130, 30);
        buttonVenta.addActionListener(this);
        add(buttonVenta);

        buttonAtrasBoletas = new JButton("Atrás");
        buttonAtrasBoletas.setBounds(280, 270, 120, 30);
        buttonAtrasBoletas.addActionListener(this);
        add(buttonAtrasBoletas);
        
        buttonInicio = new JButton("Inicio");
        buttonInicio.setBounds(410, 270, 120, 30);
        buttonInicio.addActionListener(this);
        add(buttonInicio);

        textArea = new JTextArea();
        textArea.setBounds(10, 320, 500, 600);
        add(textArea);

        add(comboAnimales);

        int yBoletas = 160;
        for (Boleta boleta : listaBoletas) {
            JCheckBox checkBox = new JCheckBox(boleta.getTipo());
            checkBox.setBounds(10, yBoletas, 200, 20);
            checkboxesBoleta.add(checkBox);
            add(checkBox);
            yBoletas += 30;
        }

        llenarComboBoxAnimales(listaAnimales);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboTipoBoleta) {
        } else if (e.getSource() == buttonCrearPlan) {
            String nombre = fieldNombrePlan.getText();
            String descripcion = fieldDescripcion.getText();
            String animales = (String) comboAnimales.getSelectedItem();

            ArrayList<Boleta> listaBoletasSelected = new ArrayList<>();
            String nombreBoleta = null;
            for (JCheckBox checkbox : checkboxesBoleta) {
                if (checkbox.isSelected()) {
                    nombreBoleta = checkbox.getText();
                }
                for (Boleta boleta : listaBoletas) {
                    if (boleta.getTipo().equals(nombreBoleta)) {
                        listaBoletasSelected.add(boleta);
                    }
                }
            }
            
            Planes newPlan = new Planes(nombre,descripcion,listaBoletasSelected,animales);
            Planes.agregarPlanes(newPlan);
            mostrarListaPlanes();
        }
        if (e.getSource() == buttonVenta) {
            JFrameVentas ventas = new JFrameVentas();
            ventas.setVisible(true);
            this.setVisible(false);
        } else if (e.getSource() == buttonAtrasBoletas) {
            JFrameBoletas boleta = new JFrameBoletas();
            boleta.setVisible(true);
            this.setVisible(false);
        }else if (e.getSource() == buttonInicio){
            Home home = new Home();
            home.setVisible(true);
        }
    }

    public void llenarComboBoxAnimales(ArrayList<ListaAnimales> listaNombres) {
        comboAnimales.removeAllItems();

        for (ListaAnimales lista : listaNombres) {
            String listaNombAnimal = lista.getNombreLista();

            comboAnimales.addItem(listaNombAnimal);
        }
    }

    public void mostrarListaPlanes() {
        textArea.setText("");
        for (Planes plan : Planes.getListaPlanes()) {
            textArea.append("Nombre: " + plan.getNombre() + "\n");
            textArea.append("Descripción: " + plan.getDescripcion() + "\n");
            textArea.append("Boletas: "+plan.getListaBoletas() +"\n" );
        }

        textArea.append("\n");
    }

    public static void main(String[] args) {
        JFramePlan framePlan = new JFramePlan();
    }
}
