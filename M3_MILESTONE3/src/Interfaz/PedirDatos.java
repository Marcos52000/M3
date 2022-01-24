package Interfaz;

import Clases.Llicencia;
import Clases.Titular;
import Clases.Moto;
import Clases.Persona;
import Clases.Camion;
import Clases.Conductor;
import Clases.Cotxe;
import Clases.Rueda;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import Clases.Vehiculo;

public class PedirDatos {
	public static ArrayList<Persona> arrayPersona = new ArrayList<Persona>();
	public static  ArrayList<Vehiculo> arrayVehiculos = new ArrayList<Vehiculo>();

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
		Titular titular = pedirTitular();
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
			if (Utils.validarLicencia(titular.getTipoLlicencia().getTipusLlicencia(), "B")) {
				ArrayList<Persona> conductores = new ArrayList<Persona>();
				conductores.add(titular);
				String masConductores = JOptionPane.showInputDialog("tiene mas conductores el vehiculo? si/no");
				if (masConductores.equals("si")) {
					Conductor co1 = pedirConductor();
					if (Utils.validarLicencia(co1.getTipoLlicencia().getTipusLlicencia(), "B")) {
						conductores.add(co1);

					}
				}
				Cotxe c1 = new Cotxe(datos.getMatricula(), datos.getMarca(), datos.getColor(), titular, conductores);
				c1.setRuedasTraseras(ruedaTrasera);
				c1.setRuedasDelanteras(ruedaDelantera);
				arrayVehiculos.add(c1);

			}
		} else if (tipo.equals("camion")) {
			if (Utils.validarLicencia(titular.getTipoLlicencia().getTipusLlicencia(), "C")) {
				ArrayList<Persona> conductores = new ArrayList<Persona>();
				conductores.add(titular);
				String masConductores = JOptionPane.showInputDialog("tiene mas conductores el vehiculo? si/no");
				if (masConductores.equals("si")) {
					Conductor co1 = pedirConductor();
					if (Utils.validarLicencia(co1.getTipoLlicencia().getTipusLlicencia(), "C")) {
						conductores.add(co1);
					}
					Camion c1 = new Camion(datos.getMatricula(), datos.getMarca(), datos.getColor(), titular);
					c1.setRuedasTraseras(ruedaTrasera);
					c1.setRuedasDelanteras(ruedaDelantera);
					arrayVehiculos.add(c1);
				}
			}
		} else if (tipo.equals("moto")) {
			if (Utils.validarLicencia(titular.getTipoLlicencia().getTipusLlicencia(), "A")) {
				ArrayList<Persona> conductores = new ArrayList<Persona>();
				conductores.add(titular);
				String masConductores = JOptionPane.showInputDialog("tiene mas conductores el vehiculo? si/no");
				if (masConductores.equals("si")) {
					Conductor co1 = pedirConductor();
					if (Utils.validarLicencia(co1.getTipoLlicencia().getTipusLlicencia(), "A")) {
						conductores.add(co1);
					}
				}
				Moto m1 = new Moto(datos.getMatricula(), datos.getMarca(), datos.getColor(), titular);
				m1.setRuedasTraseras(ruedaTrasera);
				m1.setRuedasDelanteras(ruedaDelantera);
				arrayVehiculos.add(m1);
			}
		} else {
			JOptionPane.showMessageDialog(null, "No has introducido un vehiculo correcto");
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
		arrayPersona.add(titular);
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
		arrayPersona.add(c1);
		return c1;
	}

	// seleccionar un vehiculo
	public static void seleccionVehiculo() {
		String tipo = JOptionPane.showInputDialog("Crear: cotxe, camion o moto");
		if (tipo.equals("cotxe") || tipo.equals("moto") || tipo.equals("camion")) {
			crearVehiculo(pedirDatos(), tipo);
			menu();
		} else {
			JOptionPane.showMessageDialog(null, "tipo incorrecto");
			menu();
		}

	}

	public static void seleccionPersona() {
		String tipo = JOptionPane.showInputDialog("Crear: titular o conductor");
		if (tipo.equals("titular")) {
			pedirTitular();
			menu();
		} else if (tipo.equals("conductor")) {
			pedirConductor();
			menu();
		} else {
			JOptionPane.showMessageDialog(null, "No has introducido un caso correcto");
			menu();
		}
	}

	public static void menu() {
		String accion = JOptionPane.showInputDialog("MENU: \n  1-Crear Persona \n 2-Crear Vehiculo  \n 3-Salir");
		switch (accion) {
		case "1":
			seleccionPersona();
			break;
		case "2":
			seleccionVehiculo();
			break;
		case "3":
			System.out.println("Personas;");
			for (int i = 0; i < arrayPersona.size(); i++) {
				System.out.println(arrayPersona.get(i));
			}
			System.out.println("Vehiculos;");
			for (int i = 0; i < arrayVehiculos.size(); i++) {
				System.out.println(arrayVehiculos.get(i));
			}
			System.exit(0);
			break;
		}
	}
}
