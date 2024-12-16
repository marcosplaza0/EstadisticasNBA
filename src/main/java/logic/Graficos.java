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
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.DatasetRenderingOrder;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author marcos
 */
public class Graficos {
    
    public static void graficoPuntos(boolean equipo, String jugador) {
        int[] arrayPuntos = informacion(equipo, jugador,11);
        double media = 0;
        for(int i = 0; i< arrayPuntos.length; i++) {
            media += arrayPuntos[i];
        }
        media /= arrayPuntos.length;

        DefaultCategoryDataset barDataset = new DefaultCategoryDataset();
        DefaultCategoryDataset lineDataset = new DefaultCategoryDataset();
        for(int i = 0; i<arrayPuntos.length; i++) {
            String partido = "Partido" + (i+1);
            barDataset.addValue(arrayPuntos[i], "Puntos", partido);
            lineDataset.addValue(media, "Media", partido);
        }

        CategoryAxis categoryAxis = new CategoryAxis("Partidos");
        NumberAxis numberAxis = new NumberAxis("Puntos");
        BarRenderer barRenderer = new BarRenderer();
        LineAndShapeRenderer lineRenderer = new LineAndShapeRenderer();
        
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainAxis(categoryAxis);
        plot.setRangeAxis(numberAxis);
        plot.setDataset(0, barDataset);
        plot.setRenderer(0, barRenderer);
        plot.setDataset(1, lineDataset);
        plot.setRenderer(1, lineRenderer);
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
    
        JFreeChart grafico = new JFreeChart("Puntos " + jugador, JFreeChart.DEFAULT_TITLE_FONT, plot, true);

        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setSeriesPaint(0, Color.GREEN);
        categoryAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
        
        try {
            File archivo = new File("Graficas/" + jugador);
            if (!archivo.exists()) {
                if (archivo.mkdirs()) {
                    System.out.println("Carpeta creada");
                } else {
                    System.err.println("No se pudo crear la carpeta.");
                    return;
                }
            }
            archivo = new File("Graficas/" + jugador , "Puntuacion.jpg");
            ChartUtils.saveChartAsJPEG(archivo, grafico, 800, 600);
            System.out.println("Gráfico guardado en: " + archivo.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error al guardar el gráfico: " + e.getMessage());
        }
    }
    
    public static void graficoRebotes(boolean equipo, String jugador) {
        int[] arrayPuntos = informacion(equipo, jugador,8);

        DefaultCategoryDataset lineDataset = new DefaultCategoryDataset();
        for(int i = 0; i<arrayPuntos.length; i++) {
            String partido = "Partido" + (i+1);
            lineDataset.addValue(arrayPuntos[i], "Rebotes", partido);
        }

        JFreeChart grafico = ChartFactory.createLineChart(
            "Rebotes" + jugador,    // Título
            "Partidos",             // Etiqueta del eje X
            "Rebotes",              // Etiqueta del eje Y
            lineDataset             // Conjunto de datos
        );
        
        try {
            File archivo = new File("Graficas/" + jugador);
            if (!archivo.exists()) {
                if (archivo.mkdirs()) {
                    System.out.println("Carpeta creada");
                } else {
                    System.err.println("No se pudo crear la carpeta.");
                    return;
                }
            }
            archivo = new File("Graficas/" + jugador, "Rebotes.jpg");
            ChartUtils.saveChartAsJPEG(archivo, grafico, 800, 600);
            System.out.println("Gráfico guardado en: " + archivo.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error al guardar el gráfico: " + e.getMessage());
        }
    }
    
    
    private static int[] informacion(boolean equipo, String jugador, int columna) {
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
                puntos[i-1] = (int) Double.parseDouble(fila.getCell(columna).toString());
            }
 
        } catch (IOException e) { e.getMessage();}
        
        return puntos;
    }
    
    private static boolean verificarArchivoExistente(String nombreArchivo) {
        return new File(nombreArchivo).exists();
    }
    
}
