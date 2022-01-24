package Clases;

public class Llicencia {
	//atributos 
	private String id;
	private String tipusLlicencia;
	private String nom;
	private String cognom;
	private String dataCaducitat;

	// constructor
	public Llicencia(String id, String tipusLlicencia, String nom, String cognom, String dataCaducitat) {
		this.id = id;
		this.tipusLlicencia = tipusLlicencia;
		this.nom = nom;
		this.cognom = cognom;
		this.dataCaducitat = dataCaducitat;
	}

	//getters y setters
	public String getTipusLlicencia() {
		return this.tipusLlicencia;
	}

	public void setTipusLlicencia(String tipusLlicencia) {
		this.tipusLlicencia = tipusLlicencia;
	}
}
