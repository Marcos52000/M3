package Clases;

import java.util.ArrayList;

public class Moto extends Vehiculo {

	// atributos
	private int numeroRuedas = 2;
	Rueda ruedasDelanteras;
	Rueda ruedasTraseras;

	// constructor

	public Moto() {
		super();
	}

	public Moto(String matricula, String marca, String color, Titular titular) {
		super(matricula, marca, color, titular);
	}

	public Moto(String matricula, String marca, String color, Titular titular, ArrayList<Persona> personas) {
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
