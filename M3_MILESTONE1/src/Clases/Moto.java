package Clases;

public class Moto extends Vehiculo{

	// atributos 
	
	private int numeroRuedas = 2;
	Rueda ruedasDelanteras;
	Rueda ruedasTraseras;
	
	// constructor
	
	public Moto() {
		super();
	}
	
	public Moto(String matricula, String marca, String color) {
		super(matricula, marca, color);
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
