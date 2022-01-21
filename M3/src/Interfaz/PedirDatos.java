package Interfaz;

import javax.swing.JOptionPane;

import Clases.Cotxe;
import Clases.Rueda;
import Clases.Vehiculo;
import Clases.Moto;

public class PedirDatos {

	// metodo para pedir al usuario la matricula, marca y color de un vehiculo
	public static Vehiculo pedirDatos() {
		Vehiculo v1 = new Vehiculo();
		boolean error = false;
		do {
			if(error == false) {
				String matricula = JOptionPane.showInputDialog("Introduce la matricula ");
				v1.setMatricula(matricula);
				error = true;
			}else {
				String matriculaError = JOptionPane.showInputDialog("Introduce una matricula correcta (4 numeros y 2 o 3 letras mayusculas)");
				v1.setMatricula(matriculaError);
			}
		} while (!v1.comprobarMatricula());
		String marca = JOptionPane.showInputDialog("Introduce la marca");
		String color = JOptionPane.showInputDialog("Introduce el color");
		v1.setMarca(marca);
		v1.setColor(color);
		return v1;
	}

	//metodo para crear un objeto vehiculo a partir de los datos del metodo anterior + pedir las ruedas
	public static void crearVehiculo(Vehiculo datos, String tipo) {
		// creacion rueda trasera
		Rueda ruedaTrasera = new Rueda();
		String rtMarca = JOptionPane.showInputDialog("Introduce la marca de las ruedas traseras");
		ruedaTrasera.setMarca(rtMarca);
		boolean error = false;
		// validacion rueda trasera
		do {
			if(error == false) {
				double rtDiametro = Double.parseDouble(JOptionPane.showInputDialog("Introduce el diametro de las ruedas traseras"));
				ruedaTrasera.setDiametre(rtDiametro);
				error = true;
			}else {
				double rtDiametroError = Double.parseDouble(JOptionPane.showInputDialog("Introduce un diametro correcto para las ruedas traseras (0.4 - 4)"));
				ruedaTrasera.setDiametre(rtDiametroError);
			}
		} while (!ruedaTrasera.comprobarRueda());
 
		// creacion rueda delantera
		Rueda ruedaDelantera = new Rueda();
		String rdMarca = JOptionPane.showInputDialog("Introduce la marca de las ruedas delanteras");
		ruedaDelantera.setMarca(rdMarca);
		boolean error2 = false;
		
		// validacion rueda delantera
		do {
			if(error2 == false) {
				double rdDiametro = Double.parseDouble(JOptionPane.showInputDialog("Introduce el diametro de las ruedas delanteras"));
				ruedaDelantera.setDiametre(rdDiametro);
				error2 = true;
			}else {
				double rdDiametroError = Double.parseDouble(JOptionPane.showInputDialog("Introduce el diametro de las ruedas delanteras"));
				ruedaDelantera.setDiametre(rdDiametroError);
			}
			
		} while (!ruedaDelantera.comprobarRueda());
		
		if (tipo.equals("cotxe")) {
			Cotxe c1 = new Cotxe(datos.getMatricula(), datos.getMarca(), datos.getColor());
			c1.setRuedasTraseras(ruedaTrasera);
			c1.setRuedasDelanteras(ruedaDelantera);
		} else {
			Moto m1 = new Moto(datos.getMatricula(), datos.getMarca(), datos.getColor());
			m1.setRuedasTraseras(ruedaTrasera);
			m1.setRuedasDelanteras(ruedaDelantera);
		}

	}

}
