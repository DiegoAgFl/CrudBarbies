

public class Astronauta extends Barbie {

	private String cohete;
	private String Tripulacion;

	public Astronauta() {

	}

	public Astronauta(String cohete, String Tripulacion) {
		this.cohete = cohete;
		this.Tripulacion = Tripulacion;
	}

	public Astronauta(String cohete, String Tripulacion, String nombre, int edad) {
		super(nombre, edad);
		this.cohete = cohete;
		this.Tripulacion = Tripulacion;
	}

	public String getCohete() {
		return cohete;
	}

	public void setCohete(String cohete) {
		this.cohete = cohete;
	}

	public String getTripulacion() {
		return Tripulacion;
	}

	public void setTripulacion(String Tripulacion) {
		this.Tripulacion = Tripulacion;
	}

	@Override
	String tipobarbie() {
		return ("Astronauta");
	}

}
