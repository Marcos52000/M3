package Clases;

public class Cotxe extends Vehiculo{

	// atributos 
	
	private int numeroRuedas = 4;
	Rueda ruedasDelanteras;
	Rueda ruedasTraseras;
	
	// constructor
	
	public Cotxe() {
		super();
	}
	
	public Cotxe(String matricula, String marca, String color) {
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
