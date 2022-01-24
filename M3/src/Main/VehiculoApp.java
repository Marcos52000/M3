package Main;

import Clases.*;
import javax.swing.JOptionPane;
import Interfaz.PedirDatos;

public class VehiculoApp
{
    public static void main(final String[] args) {
        final Titular t1 = PedirDatos.pedirTitular();
        final String vehiculo = JOptionPane.showInputDialog("Que quieres crear cotxe / moto / camion");
        PedirDatos.seleccionVehiculo(vehiculo, t1);
        String conduce = JOptionPane.showInputDialog("EL titular es el conductor del vehiculo? si/no");
        if(conduce.equals("no")) {
        	Conductor c1 = PedirDatos.pedirConductor();
        	PedirDatos.seleccionVehiculo(vehiculo, t1);
        }
    }
}
