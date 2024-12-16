/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author marcos
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

    public static void excel(boolean equipo, String jugador, int tCampoAcertados, int tCampoIntentados,int tLibresIntentados, int triples, int dobles, int libres, int rebotes, int asistencias, int robos, int tapones, int fRecibidas, int pBalon, int fCometidas) {
        String nombreArchivo;
        String nombreHoja = jugador;
        if(equipo) {
            nombreArchivo = "ChicagoBulls.xlsx";
        } else {
            nombreArchivo = "AtlantaHawks.xlsx";
        }

        // Verificar si el archivo ya existe
        boolean archivoExistente = verificarArchivoExistente(nombreArchivo);
        try (Workbook libroTrabajo = archivoExistente ? WorkbookFactory.create(Files.newInputStream(Paths.get(nombreArchivo))) : new XSSFWorkbook()) {
            Sheet hoja = libroTrabajo.getSheet(nombreHoja);

            if (hoja == null) {
                hoja = libroTrabajo.createSheet(nombreHoja);
                Row fila = hoja.createRow(0);
                fila.createCell(0, CellType.STRING).setCellValue("Tiros de campo totales");
                fila.createCell(1, CellType.STRING).setCellValue("Tiros de campo anotados");
                fila.createCell(2, CellType.STRING).setCellValue("Dobles");
                fila.createCell(3, CellType.STRING).setCellValue("Triples");
                fila.createCell(4, CellType.STRING).setCellValue("% de tiros anotados");
                fila.createCell(5, CellType.STRING).setCellValue("% efectivo de tiros anotados");
                fila.createCell(6, CellType.STRING).setCellValue("% efectivo de tiros real");
                fila.createCell(7, CellType.STRING).setCellValue("Asistencias");
                fila.createCell(8, CellType.STRING).setCellValue("Rebotes");
                fila.createCell(9, CellType.STRING).setCellValue("Libres");
                fila.createCell(10, CellType.STRING).setCellValue("Robos");
                fila.createCell(11, CellType.STRING).setCellValue("Puntos");
                fila.createCell(12, CellType.STRING).setCellValue("Valoracion");
            }

//          Valores que no son Excel
            int filaNumero = hoja.getPhysicalNumberOfRows();
            Row fila = hoja.createRow(filaNumero);
            Cell celda = fila.createCell(0, CellType.NUMERIC);
            celda.setCellValue(tCampoIntentados);
            celda = fila.createCell(1, CellType.NUMERIC);
            celda.setCellValue(tCampoAcertados);
            celda = fila.createCell(2, CellType.NUMERIC);
            celda.setCellValue(dobles);
            celda = fila.createCell(3, CellType.NUMERIC);
            celda.setCellValue(triples);
            
//          Valores que son Excel
            CellStyle percentageStyle = libroTrabajo.createCellStyle();
            percentageStyle.setDataFormat(libroTrabajo.getCreationHelper().createDataFormat().getFormat("0.0%"));
            double[] percentages = porcentajesDeTiros(tCampoAcertados, tCampoIntentados, tLibresIntentados, triples, dobles, libres);

            for(int i = 0; i < 3; i++) {
                celda = fila.createCell(i+4, CellType.NUMERIC);
                celda.setCellValue(percentages[i]);
                celda.setCellStyle(percentageStyle);
            }
            
            int puntos = triples * 3 + dobles * 2 + libres;
            int tFallados = tCampoIntentados - tCampoAcertados;
            int valoracion = cValoracion(puntos, rebotes, asistencias, robos, tapones, fRecibidas, tFallados, pBalon, fCometidas);
            celda = fila.createCell(7, CellType.NUMERIC);
            celda.setCellValue(asistencias);
            celda = fila.createCell(8, CellType.NUMERIC);
            celda.setCellValue(rebotes);
            celda = fila.createCell(9, CellType.NUMERIC);
            celda.setCellValue(libres);
            celda = fila.createCell(10, CellType.NUMERIC);
            celda.setCellValue(robos);
            celda = fila.createCell(11, CellType.NUMERIC);
            celda.setCellValue(puntos);
            celda = fila.createCell(12, CellType.NUMERIC);
            celda.setCellValue(valoracion);
            


            try (FileOutputStream archivoSalida = new FileOutputStream(nombreArchivo)) {
                libroTrabajo.write(archivoSalida);
                System.out.println("Datos agregados al archivo de puntaciones Excel correctamente.");
            }
        } catch (IOException e) { e.getMessage();}
        
        valoraciones(equipo, jugador);
        
    }
    
    private static void valoraciones(boolean equipo, String jugador) {
        String nombreArchivo = "valoraciones.xlsx";
        String nombreHoja = "hoja1";

        // Verificar si el archivo ya existe
        boolean archivoExistente = verificarArchivoExistente(nombreArchivo);
        try (Workbook libroTrabajo = archivoExistente ? WorkbookFactory.create(Files.newInputStream(Paths.get(nombreArchivo))) : new XSSFWorkbook()) {
            Sheet hoja = libroTrabajo.getSheet(nombreHoja);

            if (hoja == null) {
                hoja = libroTrabajo.createSheet(nombreHoja);
                Row fila = hoja.createRow(0);
                fila.createCell(0, CellType.STRING).setCellValue("Jugador");
                fila.createCell(1, CellType.STRING).setCellValue("Valoracion");
            }
            
            double media = mediaJugador(equipo, jugador);
            
            int filaNumero = hoja.getPhysicalNumberOfRows();
            for(int i = 0; i< filaNumero; i++) {
                Row filab = hoja.getRow(i);
                if(filab.getCell(0).getStringCellValue().equals(jugador)) {
                    filab.createCell(0, CellType.NUMERIC).setCellValue(jugador);
                    filab.createCell(1, CellType.NUMERIC).setCellValue(media);
                } else if (i == filaNumero-1) {
                    filab = hoja.createRow(i+1);
                    filab.createCell(0, CellType.NUMERIC).setCellValue(jugador);
                    filab.createCell(1, CellType.NUMERIC).setCellValue(media);
                }
            }
 
            try (FileOutputStream archivoSalida = new FileOutputStream(nombreArchivo)) {
                libroTrabajo.write(archivoSalida);
                System.out.println("Datos agregados al archivo Excel valoraciones correctamente.");
            }
        } catch (IOException e) { e.getMessage();}
    }
    
    private static double mediaJugador(boolean equipo, String jugador) {
        double media = 0;
        String nombreArchivo;
        String nombreHoja = jugador;
        int contador = 0;
        if(equipo) {
            nombreArchivo = "ChicagoBulls.xlsx";
        } else {
            nombreArchivo = "AtlantaHawks.xlsx";
        }
        
        boolean archivoExistente = verificarArchivoExistente(nombreArchivo);
        try (Workbook libroTrabajo = archivoExistente ? WorkbookFactory.create(Files.newInputStream(Paths.get(nombreArchivo))) : new XSSFWorkbook()) {
            Sheet hoja = libroTrabajo.getSheet(nombreHoja);
            
            
            int filaNumero = hoja.getPhysicalNumberOfRows();
            for(int i = 1; i< filaNumero; i++) {
                Row fila = hoja.getRow(i);
                contador += Double.parseDouble(fila.getCell(12).toString());
            }
            
            media = (double) contador / (filaNumero-1);
 
        } catch (IOException e) { e.getMessage();}
        
        return media;
    }
        
        

    private static boolean verificarArchivoExistente(String nombreArchivo) {
        return new File(nombreArchivo).exists();
    }

    private static double[] porcentajesDeTiros(int tca, int tci, int tli, int t, int d, int l) {
        double[] porcentajes = new double[3];
//        Porcentaje de tiros de campo anotados
        porcentajes[0] = (double) tca / tci;
//        Porcentaje efectivo de tiros de campos anotados
        porcentajes[1] = (tca + (0.5 * t)) / tci;
//        Porcentaje True Shooting
        porcentajes[2] = (t*3+d*2+l) / (2 * (tci + (0.44 * tli)));

        return porcentajes;
    }
    
    private static int cValoracion(int puntos, int rebotes, int asistencias, int robos, int tapones, int fRecibidas, int tFallados, int pBalon, int fCometidas) {
        return (puntos + rebotes + asistencias + robos + tapones + fRecibidas) - (tFallados + pBalon + fCometidas);
    }
    
}
