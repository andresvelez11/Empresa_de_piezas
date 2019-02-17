
public class Pieza {

	private String codPieza;
	private double peso;
	
	public String getCodPieza() {
		return codPieza;
	}

	public void setCodPieza(String codPieza) {
		this.codPieza = codPieza;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Pieza(double peso, String codPieza) {
		this.codPieza=codPieza;
		this.peso=peso;
	}
	
	public double costo() {
		return 0;
	}
}