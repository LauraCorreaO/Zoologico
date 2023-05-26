package com.mycompany.zoologicobeta;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Reporte {
       public void generarPdf(ArrayList<Ventas> listaVentas) {
         Document document = new Document(PageSize.A4);
        
        try {
            PdfWriter.getInstance(document, new FileOutputStream("C:/Users/Mariana/OneDrive/Documentos/reporte.pdf"));
            document.open();
            Font font1 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 16, Font.BOLD);
            Font font2 = FontFactory.getFont(FontFactory.COURIER, 12, Font.NORMAL);
            // Añadir imagen
            String imagePath = "src/main/java/images/Imagen.jpg";
            Image image = Image.getInstance(imagePath);
            // Establecer dimensiones máximas para la imagen
            float maxWidth = 210f; 
            float maxHeight = 210f; 
            // Escalar la imagen para ajustarla dentro de las dimensiones máximas
            image.scaleToFit(maxWidth, maxHeight);

            // Establecer posición absoluta de la imagen en la esquina superior izquierda
            image.setAbsolutePosition(0, PageSize.A4.getHeight() - image.getScaledHeight());
            document.add(image);
            
            //agregar encabezado
            Paragraph title = new Paragraph("PARQUE CENTRAL DE LA AVENTURA",font1);
            title.setAlignment(Element.ALIGN_RIGHT);
            document.add(title);
            
            document.add(new Paragraph("\n"));
            Paragraph title1 = new Paragraph("Cra 79BB #45B-71",font2);
            title1.setAlignment(Element.ALIGN_RIGHT);
            document.add(title1);
            
            document.add(new Paragraph("\n"));
            Paragraph title2 = new Paragraph("314 830 89 44 - 312 55 46", font2);
            title2.setAlignment(Element.ALIGN_RIGHT);
            document.add(title2);
           
            // Agregar titulo
            document.add(new Paragraph("\n\n\n\n"));
            Paragraph title3 = new Paragraph("Informe de ventas");
            title3.setAlignment(Element.ALIGN_CENTER);
            document.add(title3);
            
            document.add(new Paragraph("\n\n"));
            //tabla
            PdfPTable tabla = new PdfPTable(10);// Crea una tabla con 3 columnas
            tabla.setWidthPercentage(100); // La tabla ocupa el ancho completo de la página
            tabla.setSpacingBefore(10f); // Espacio antes de la tabla
            tabla.setSpacingAfter(10f); // Espacio después de la tabla
           
            // Agregar encabezado
            Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD,8);
            PdfPCell cell1 = new PdfPCell(new Paragraph("Tipo Documento", font));
            PdfPCell cell2 = new PdfPCell(new Paragraph("Numero de Documento", font));
            PdfPCell cell3 = new PdfPCell(new Paragraph("Nombre", font));
            PdfPCell cell4 = new PdfPCell(new Paragraph("Apellido", font));
            PdfPCell cell5 = new PdfPCell(new Paragraph("Es menor", font));
            PdfPCell cell6 = new PdfPCell(new Paragraph("Plan", font));
            PdfPCell cell7 = new PdfPCell(new Paragraph("Cantidad", font));
            PdfPCell cell8 = new PdfPCell(new Paragraph("valor Plan", font));
            PdfPCell cell9 = new PdfPCell(new Paragraph("Descuento", font));
            PdfPCell cell10 = new PdfPCell(new Paragraph("Valor Total", font));
           

            // Agrega filas a la tabla
            tabla.addCell(cell1);
            tabla.addCell(cell2);
            tabla.addCell(cell3);
            tabla.addCell(cell4);
            tabla.addCell(cell5);
            tabla.addCell(cell6);
            tabla.addCell(cell7);
            tabla.addCell(cell8);
            tabla.addCell(cell9);
            tabla.addCell(cell10);

            // Agregar datos a las celdas
            for (Ventas venta : listaVentas) {
                tabla.addCell(String.valueOf(venta.getTipoDoc()));
                tabla.addCell(String.valueOf(venta.getNumDoc()));
                tabla.addCell(String.valueOf(venta.getNombrePersona()));
                tabla.addCell(String.valueOf(venta.getApellidoPersona()));
                tabla.addCell(String.valueOf(venta.isEsMenor()));
                tabla.addCell(String.valueOf(venta.getNombrePlan()));
                tabla.addCell(String.valueOf(venta.getCantidad()));
                tabla.addCell(String.valueOf(venta.getValorPlan()));
                tabla.addCell(String.valueOf(venta.getDescuentoAbono()+"%"));    
                tabla.addCell(String.valueOf(venta.calcularPrecioFinal()));
            }
            //document.add(table);
            document.add(tabla);

            document.close();
        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
       
        public static void main(String[] args) {
        Reporte reporte = new Reporte();
        ArrayList<Ventas> listaVentas = new ArrayList<>();
        reporte.generarPdf(listaVentas);
 }
}
