package Interfaz;

import Clases.Llicencia;
import Clases.Titular;
import Clases.Moto;
import Clases.Camion;
import Clases.Conductor;
import Clases.Cotxe;
import Clases.Rueda;
import javax.swing.JOptionPane;
import Clases.Vehiculo;

public class PedirDatos {
	// metodo para pedir datos del vehiculo
	public static Vehiculo pedirDatos() {
		Vehiculo v1 = new Vehiculo();
		boolean error = false;
		do {
			if (!error) {
				String matricula = JOptionPane.showInputDialog("Introduce la matricula ");
				v1.setMatricula(matricula);
				error = true;
			} else {
				String matriculaError = JOptionPane
						.showInputDialog("Introduce una matricula correcta (4 numeros y 2 o 3 letras mayusculas)");
				v1.setMatricula(matriculaError);
			}
		} while (!v1.comprobarMatricula());
		String marca = JOptionPane.showInputDialog("Introduce la marca");
		String color = JOptionPane.showInputDialog("Introduce el color");
		v1.setMarca(marca);
		v1.setColor(color);
		return v1;
	}

	// a partir de los input mostrados por pantalla se crea un vehiculo
	public static void crearVehiculo(Vehiculo datos, String tipo) {
		Rueda ruedaTrasera = new Rueda();
		String rtMarca = JOptionPane.showInputDialog("Introduce la marca de las ruedas traseras");
		ruedaTrasera.setMarca(rtMarca);
		boolean error = false; 
		do { // validar que el diametro de la rueda trasera este entre 0.4 y 4
			if (!error) {
				double rtDiametro = Double
						.parseDouble(JOptionPane.showInputDialog("Introduce el diametro de las ruedas traseras"));
				ruedaTrasera.setDiametre(rtDiametro);
				error = true;
			} else {
				double rtDiametroError = Double.parseDouble(JOptionPane
						.showInputDialog("Introduce un diametro correcto para las ruedas traseras (0.4 - 4)"));
				ruedaTrasera.setDiametre(rtDiametroError);
			}
		} while (!ruedaTrasera.comprobarRueda());
		Rueda ruedaDelantera = new Rueda();
		String rdMarca = JOptionPane.showInputDialog("Introduce la marca de las ruedas delanteras");
		ruedaDelantera.setMarca(rdMarca);
		boolean error2 = false;
		do { // validar que el diametro de la rueda delantera este entre 0.4 y 4
			if (!error2) {
				double rdDiametro = Double
						.parseDouble(JOptionPane.showInputDialog("Introduce el diametro de las ruedas delanteras"));
				ruedaDelantera.setDiametre(rdDiametro);
				error2 = true;
			} else {
				double rdDiametroError = Double
						.parseDouble(JOptionPane.showInputDialog("Introduce el diametro de las ruedas delanteras"));
				ruedaDelantera.setDiametre(rdDiametroError);
			}
		} while (!ruedaDelantera.comprobarRueda());
		// dependiendo el tipo de vehiculo creara uno o otro
		if (tipo.equals("cotxe")) {
			Cotxe c1 = new Cotxe(datos.getMatricula(), datos.getMarca(), datos.getColor());
			c1.setRuedasTraseras(ruedaTrasera);
			c1.setRuedasDelanteras(ruedaDelantera);
		}else if(tipo.equals("camion"))	{
			Camion c1 = new Camion(datos.getMatricula(), datos.getMarca(), datos.getColor());
			c1.setRuedasTraseras(ruedaTrasera);
			c1.setRuedasDelanteras(ruedaDelantera);
		} else {
			Moto m1 = new Moto(datos.getMatricula(), datos.getMarca(), datos.getColor());
			m1.setRuedasTraseras(ruedaTrasera);
			m1.setRuedasDelanteras(ruedaDelantera);
		}
	}

	// pedir por pantalla los datos del titular
	public static Titular pedirTitular() {
		boolean tieneAseguradora = false;
		boolean tieneGarage = false;
		String nombre = JOptionPane.showInputDialog("Introduce el nombre del titular: ");
		String apellido = JOptionPane.showInputDialog("Introduce el apellido del titular: ");
		String dataNaixement = JOptionPane.showInputDialog("Introduce la fecha de nacimiento del titular: ");
		String teAsseguransa = JOptionPane.showInputDialog("El titular tiene aseguradora: si/no ");
		if (teAsseguransa.equals("si")) {
			tieneAseguradora = true;
		} else if (teAsseguransa.equals("no")) {
			tieneAseguradora = false;
		}
		String teGaratge = JOptionPane.showInputDialog("El titular tiene garage: si/no ");
		if (teGaratge.equals("si")) {
			tieneGarage = true;
		} else if (teGaratge.equals("no")) {
			tieneGarage = false;
		}
		String permiso = JOptionPane.showInputDialog("Introduce el permiso de conducir del titular: ");
		Llicencia licencia = new Llicencia("1", permiso, nombre, apellido, "21/01/2022");
		Titular titular = new Titular(nombre, apellido, dataNaixement, licencia, tieneAseguradora, tieneGarage);
		return titular;
	}
	// pedir por pantalla los datos del conductor
	public static Conductor pedirConductor() {
		String nombre = JOptionPane.showInputDialog("Introduce el nombre del conductor: ");
		String apellido = JOptionPane.showInputDialog("Introduce el apellido del conductor: ");
		String dataNaixement = JOptionPane.showInputDialog("Introduce la fecha de nacimiento del conductor: ");
		String permiso = JOptionPane.showInputDialog("Introduce el permiso de conducir del conductor: ");
		Llicencia licencia = new Llicencia("1", permiso, nombre, apellido, "21/01/2022");
		Conductor c1 = new Conductor(nombre, apellido, dataNaixement, licencia);
		return c1;
	}
	
	//seleccionar un vehiculo
	public static void seleccionVehiculo(String tipoVehiculo, Titular titular) {
		String licenciaTitular = titular.getTipoLlicencia().getTipusLlicencia();
		{
			switch (tipoVehiculo) {
			case "camion": {
				if (Utils.validarLicencia(licenciaTitular, "C")) {
					crearVehiculo(pedirDatos(), tipoVehiculo);
					break;
				} else {
					System.exit(0);
				}
				break;
			}
			case "moto": {
				if (Utils.validarLicencia(licenciaTitular, "A")) {
					crearVehiculo(pedirDatos(), tipoVehiculo);
					break;
				} else {
					System.exit(0);
				}
				break;
			}
			case "cotxe": {
				if (Utils.validarLicencia(licenciaTitular, "B")) {
					crearVehiculo(pedirDatos(), tipoVehiculo);
					break;
				} else {
					System.exit(0);
				}
				break;
			}
			}

		}

	}
}
