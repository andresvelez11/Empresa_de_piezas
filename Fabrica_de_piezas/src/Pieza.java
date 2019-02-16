
public abstract class Pieza {

	protected String codigo, descripcion;
	protected double peso;
	
	

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Pieza() {

	}

	abstract public double costo();

}
