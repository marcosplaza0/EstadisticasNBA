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

public class porcentajes {

    public static void creararchivo(int tca, int tci,int tli, int t, int d, int l) {
        String nombreArchivo = "datosNBA.xlsx";
        String nombreHoja = "Partidos";

        // Verificar si el archivo ya existe
        boolean archivoExistente = verificarArchivoExistente(nombreArchivo);
        try (Workbook libroTrabajo = archivoExistente ? WorkbookFactory.create(Files.newInputStream(Paths.get(nombreArchivo))) : new XSSFWorkbook()) {
            Sheet hoja = libroTrabajo.getSheet(nombreHoja);

            if (hoja == null) {
                hoja = libroTrabajo.createSheet(nombreHoja);
                Row fila = hoja.createRow(0);
                Cell celda = fila.createCell(0, CellType.STRING);
                celda.setCellValue("Tiros de campo totales");
                celda = fila.createCell(1, CellType.STRING);
                celda.setCellValue("Tiros de campo anotados");
                celda = fila.createCell(2, CellType.STRING);
                celda.setCellValue("Dobles");
                celda = fila.createCell(3, CellType.STRING);
                celda.setCellValue("Triples");
                celda = fila.createCell(4, CellType.STRING);
                celda.setCellValue("% de tiros anotados");
                celda = fila.createCell(5, CellType.STRING);
                celda.setCellValue("% efectivo de tiros anotados");
                celda = fila.createCell(6, CellType.STRING);
                celda.setCellValue("% efectivo de tiros real");
            }

            int filaNumero = hoja.getPhysicalNumberOfRows();
            Row fila = hoja.createRow(filaNumero);
            Cell celda = fila.createCell(0, CellType.NUMERIC);
            celda.setCellValue(tci);
            celda = fila.createCell(1, CellType.NUMERIC);
            celda.setCellValue(tca);
            celda = fila.createCell(2, CellType.NUMERIC);
            celda.setCellValue(d);
            celda = fila.createCell(3, CellType.NUMERIC);
            celda.setCellValue(t);

            double[] porcentajes = porcentajesDeTiros(tca, tci, tli, t, d, l);

            CellStyle percentageStyle = libroTrabajo.createCellStyle();
            percentageStyle.setDataFormat(libroTrabajo.getCreationHelper().createDataFormat().getFormat("0.0%"));

            celda = fila.createCell(4, CellType.NUMERIC);
            celda.setCellValue(porcentajes[0]);
            celda.setCellStyle(percentageStyle);
            celda = fila.createCell(5, CellType.NUMERIC);
            celda.setCellValue(porcentajes[1]);
            celda.setCellStyle(percentageStyle);
            celda = fila.createCell(6, CellType.NUMERIC);
            celda.setCellValue(porcentajes[2]);
            celda.setCellStyle(percentageStyle);

            try (FileOutputStream archivoSalida = new FileOutputStream(nombreArchivo)) {
                libroTrabajo.write(archivoSalida);
                System.out.println("Datos agregados al archivo Excel correctamente.");
            }
        } catch (IOException e) { e.getMessage();}
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

}
