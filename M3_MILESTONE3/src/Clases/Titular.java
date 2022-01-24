package Clases;

public class Titular extends Persona {

	// atributos
	protected boolean teAsseguransa;
	protected boolean teGaratgePropi;

	// constructor
	public Titular(String nombre, String apellido, String dataNaixement, Llicencia tipoLlicencia, boolean teAsseguransa,
			boolean teGaratgePropi) {
		super(nombre, apellido, dataNaixement, tipoLlicencia);
		this.teAsseguransa = teAsseguransa;
		this.teGaratgePropi = teGaratgePropi;
	}
}