package Main;

import javax.swing.JOptionPane;

import Clases.Cotxe;
import Clases.Rueda;
import Interfaz.*;

public class VehiculoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vehiculo = JOptionPane.showInputDialog("Que quieres crear cotxe o moto");
		PedirDatos.crearVehiculo(PedirDatos.pedirDatos(), vehiculo);
		
	}

}
