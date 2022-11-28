

public class Acarreada extends Barbie {

	private String partido;
	private int Nodespensa;

	public Acarreada() {

	}

	public Acarreada(String partido, int Nodespensa) {
		this.partido = partido;
		this.Nodespensa = Nodespensa;
	}

	public Acarreada(String partido, int Nodespensa, String nombre, int edad) {
		super(nombre, edad);
		this.partido = partido;
		this.Nodespensa = Nodespensa;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public int getN_Despensa() {
		return Nodespensa;
	}

	public void setN_Despensa(int Nodespensa) {
		this.Nodespensa = Nodespensa;
	}

	@Override
	String tipobarbie() {
		return ("Acarreada");
	}

}
