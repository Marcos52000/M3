package Clases;

public class Rueda {
	
	// atributos
	private String marca;
	private double diametre;
	 
	// constructor
	
	public Rueda() {
		super();
	}
	
	public Rueda(String marca, double diametre) {
		super();
		this.marca = marca;
		this.diametre = diametre;
	}
	
	
	// metodos 
	public boolean comprobarRueda() {
		if (this.diametre >=0.4 && this.diametre <= 4) {
			return true;
		} else {
			return false;
		}
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getDiametre() {
		return diametre;
	}

	public void setDiametre(double diametre) {
		this.diametre = diametre;
	}
	
	// getters y setters
	
	 
}
