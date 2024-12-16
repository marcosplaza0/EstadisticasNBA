/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author marcos
 */
public class PDF {
    
    public static void pdf(boolean equipo, String jugador) {
        String nombreEquipo;
        if(equipo) {
            nombreEquipo = "Chicago Bulls";
        } else {
            nombreEquipo = "Atlanta Hawks";
        }
        
        Document document = new Document();
        Image image;
        try {
            
            Graficos.graficoPersonalizado(equipo, jugador, "Puntos", 11);
            Graficos.graficoRebotes(equipo, jugador);
            Graficos.graficoPersonalizado(equipo, jugador, "Asistencias", 7);
            double[] triples = Graficos.informacion(equipo, jugador, 3);
            double[] FG = Graficos.informacion(equipo, jugador, 4);
            double[] eFG = Graficos.informacion(equipo, jugador, 5);
            double[] TS = Graficos.informacion(equipo, jugador, 6);
            double mediaTriples = 0, mediaFG = 0, mediaEFG = 0, mediaTS = 0;
            int len = triples.length;
            
            for(int i = 0; i < len; i++) {
                mediaTriples += triples[i];
                mediaFG += FG[i]*100;
                mediaEFG += eFG[i]*100;
                mediaTS += TS[i]*100;
            }
            mediaTriples /= len;
            mediaFG /= len;
            mediaEFG /= len;
            mediaTS /= len;
            
            
            PdfWriter.getInstance(document, new FileOutputStream("PDF" + jugador+ ".pdf"));
            document.open();
            Font font = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
            font.setColor(0, 128, 255);
            Paragraph pa= new Paragraph("Jugador: " + jugador+ "   |   Equipo: " + nombreEquipo, font);
            pa.setAlignment(Element.ALIGN_CENTER);
            document.add(pa);
            
            image = Image.getInstance("Graficas/" + jugador + "/Puntos.jpg");
            image.scaleToFit(220,220);
            image.setAlignment(1);
            document.add(image);
            image = Image.getInstance("Graficas/" + jugador + "/Rebotes.jpg");
            image.scaleToFit(220,220);
            image.setAlignment(1);
            document.add(image);
            image = Image.getInstance("Graficas/" + jugador + "/Asistencias.jpg");
            image.scaleToFit(220,220);
            image.setAlignment(1);
            document.add(image);
            
            pa= new Paragraph("\nOtras Estadisticas", font);
            pa.setAlignment(Element.ALIGN_CENTER);
            document.add(pa);
            pa= new Paragraph("Triples: " +String.format("%-60s", String.format("%.2f", mediaTriples)) + " %FG: " + String.format("%.2f", mediaFG) + "%");
            pa.setAlignment(Element.ALIGN_CENTER);
            document.add(pa);
            pa= new Paragraph("%eFG: " +String.format("%-60s", String.format("%.2f", mediaEFG)) + " %TS: " + String.format("%.2f", mediaTS) + "%");
            pa.setAlignment(Element.ALIGN_CENTER);
            document.add(pa);
            
        } catch (BadElementException ex) {

        } catch (IOException | DocumentException ex) {

        }
        document.close();
        System.out.println("PDF creado exitosamente.");
    }
    
}
