package controladores;

import modelo.dao.Conexion;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;

import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

public class ControladorInformeCargos {

    public static void mostrarInforme() {
        Connection conn = null;

        try {
            conn = Conexion.conectar();

            if (conn == null) {
                javax.swing.JOptionPane.showMessageDialog(null,
                        "No se pudo conectar a la base de datos.",
                        "Error de conexión", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Carga el .jrxml desde la carpeta reportes
            InputStream reportStream = ControladorInformeCargos.class
                    .getResourceAsStream("/reportes/report1.jrxml");

            if (reportStream == null) {
                javax.swing.JOptionPane.showMessageDialog(null,
                        "No se encontró el archivo del reporte.",
                        "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Compila el informe
            JasperReport jasperReport = JasperCompileManager.compileReport(reportStream);

            // El informe toma todo desde la query SQL
            Map<String, Object> parametros = new HashMap<>();

            // Llena el informe
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametros, conn);

            // Muestra el visor
            JasperViewer.viewReport(jasperPrint, false);

        } catch (JRException e) {
            System.out.println("Error al generar el reporte: " + e);
            javax.swing.JOptionPane.showMessageDialog(null,
                    "Error al generar el reporte: " + e.getMessage(),
                    "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (conn != null) conn.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar conexión: " + e);
            }
        }
    }
}