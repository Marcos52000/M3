package Clases;

public class Persona {
	// atributos
	protected String nombre;
	protected String apellido;
	protected String dataNaixement;
	protected Llicencia tipoLlicencia;

	//constructor
	public Persona(String nombre, String apellido, String dataNaixement, Llicencia tipoLlicencia) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dataNaixement = dataNaixement;
		this.tipoLlicencia = tipoLlicencia;
	}

	//getters y setters
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDataNaixement() {
		return this.dataNaixement;
	}

	public void setDataNaixement(String dataNaixement) {
		this.dataNaixement = dataNaixement;
	}

	public Llicencia getTipoLlicencia() {
		return this.tipoLlicencia;
	}

	public void setTipoLlicencia(Llicencia tipoLlicencia) {
		this.tipoLlicencia = tipoLlicencia;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dataNaixement=" + dataNaixement
				+ ", tipoLlicencia=" + tipoLlicencia + "]";
	}
	
	
}
