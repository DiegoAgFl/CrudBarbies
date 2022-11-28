

public class Pintora extends Barbie {

	private String firma;
	private String cuadroFamoso;

	public Pintora() {

	}

	public Pintora(String firma, String cuadroFamoso) {
		this.firma = firma;
		this.cuadroFamoso = cuadroFamoso;
	}

	public Pintora(String firma, String cuadroFamoso, String nombre, int edad) {
		super(nombre, edad);
		this.firma = firma;
		this.cuadroFamoso = cuadroFamoso;
	}

	public String getFirma() {
		return firma;
	}

	public void setFirma(String firma) {
		this.firma = firma;
	}

	public String getCuadroFamoso() {
		return cuadroFamoso;
	}

	public void setCuadroFamoso(String cuadroFamoso) {
		this.cuadroFamoso = cuadroFamoso;
	}

	@Override
	String tipobarbie() {
		return ("Pintora");
	}

}
