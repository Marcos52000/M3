package Clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vehiculo {
	// atributos
	protected String matricula;
	protected String marca;
	protected String color;
	
	// constructores
	public Vehiculo() {
		
	}

	public Vehiculo(String matricula, String marca, String color) {
		
		this.matricula = matricula;
		this.marca = marca;
		this.color = color;
	}
	
	// metodos
	
	public boolean comprobarMatricula(){
		Pattern pat = Pattern.compile("^[0-9]{4}[A-Z]{2,3}$");
		Matcher mat = pat.matcher(this.matricula);
		if (mat.find()) {
			return true;
		} else {
			return false;
		}
	}

	
	//getters y setters
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
