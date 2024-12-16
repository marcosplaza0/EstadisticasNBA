/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author marcos
 */
public class Graficos {
    
    public static void grafico(boolean equipo, String jugador) {
        int[] arrayPuntos = puntuajes(equipo, jugador);

        // Crear el conjunto de datos (dataset)
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(int i = 0; i<arrayPuntos.length; i++) {
            dataset.addValue(arrayPuntos[i], "Puntos", "Partido " + i);
        }

        // Crear el gráfico
        JFreeChart grafico = ChartFactory.createBarChart(
            "jugador", // Título
            "Partidos",           // Etiqueta del eje X
            "Puntos",              // Etiqueta del eje Y
            dataset                 // Conjunto de datos
        );

        CategoryPlot plot = grafico.getCategoryPlot();
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setSeriesPaint(0, Color.GREEN);
        
        // Guardar el gráfico como archivo JPG
        try {
            File archivo = new File(jugador + ".jpg");
            ChartUtils.saveChartAsJPEG(archivo, grafico, 800, 600);
            System.out.println("Gráfico guardado en: " + archivo.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error al guardar el gráfico: " + e.getMessage());
        }
    }
    
    private static int[] puntuajes(boolean equipo, String jugador) {
        int[] puntos = null;
        String nombreArchivo;
        String nombreHoja = jugador;
        if(equipo) {
            nombreArchivo = "ChicagoBulls.xlsx";
        } else {
            nombreArchivo = "AtlantaHawks.xlsx";
        }
        
        boolean archivoExistente = verificarArchivoExistente(nombreArchivo);
        try (Workbook libroTrabajo = archivoExistente ? WorkbookFactory.create(Files.newInputStream(Paths.get(nombreArchivo))) : new XSSFWorkbook()) {
            Sheet hoja = libroTrabajo.getSheet(nombreHoja);
            
            if(hoja == null) return new int[] {};
            
            int filaNumero = hoja.getPhysicalNumberOfRows();
            puntos = new int[filaNumero-1];
            
            for(int i = 1; i< filaNumero; i++) {
                Row fila = hoja.getRow(i);
                puntos[i-1] = (int) Double.parseDouble(fila.getCell(11).toString());
            }
 
        } catch (IOException e) { e.getMessage();}
        
        return puntos;
    }
    
    private static boolean verificarArchivoExistente(String nombreArchivo) {
        return new File(nombreArchivo).exists();
    }
    
}
