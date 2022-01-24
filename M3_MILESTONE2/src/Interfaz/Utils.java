package Interfaz;

import java.awt.Component;
import javax.swing.JOptionPane;

public class Utils
{
    public static boolean validarLicencia(final String licencia, final String tipoLicencia) {
        try {
            if (licencia.equals(tipoLicencia)) {
                JOptionPane.showMessageDialog(null, "Tienes la licencia adecuada");
                return true;
            }
            throw new Exception();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de licencia");
            return false;
        }
    }
}