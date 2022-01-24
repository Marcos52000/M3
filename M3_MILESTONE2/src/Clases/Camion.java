package Clases;

public class Camion extends Vehiculo {
	// atributos
	private int numeroRuedas;
	Rueda ruedasDelanteras;
	Rueda ruedasTraseras;

	// constructor
	public Camion() {
		this.numeroRuedas = 4;
	}

	public Camion(String matricula, String marca, String color) {
		super(matricula, marca, color);
		this.numeroRuedas = 4;
	}

	// getters y setters
	public Rueda getRuedasDelanteras() {
		return this.ruedasDelanteras;
	}

	public void setRuedasDelanteras(Rueda ruedasDelanteras) {
		this.ruedasDelanteras = ruedasDelanteras;
	}

	public Rueda getRuedasTraseras() {
		return this.ruedasTraseras;
	}

	public void setRuedasTraseras(Rueda ruedasTraseras) {
		this.ruedasTraseras = ruedasTraseras;
	}
}