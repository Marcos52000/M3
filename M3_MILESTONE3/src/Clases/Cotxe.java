package Clases;

import java.util.ArrayList;

public class Cotxe extends Vehiculo {

	// atributos

	private int numeroRuedas = 4;
	Rueda ruedasDelanteras;
	Rueda ruedasTraseras;

	// constructor

	public Cotxe() {
		super();
	}

	public Cotxe(String matricula, String marca, String color, Titular titular) {
		super(matricula, marca, color, titular);
	}

	public Cotxe(String matricula, String marca, String color, Titular titular, ArrayList<Persona> personas) {
		super(matricula, marca, color, titular, personas);
	}

	// getters y setters
	public Rueda getRuedasDelanteras() {
		return ruedasDelanteras;
	}

	public void setRuedasDelanteras(Rueda ruedasDelanteras) {
		this.ruedasDelanteras = ruedasDelanteras;
	}

	public Rueda getRuedasTraseras() {
		return ruedasTraseras;
	}

	public void setRuedasTraseras(Rueda ruedasTraseras) {
		this.ruedasTraseras = ruedasTraseras;
	}
	

}
