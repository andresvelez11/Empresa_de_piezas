
public class PiezaMetalica extends Pieza{
	private int cantidad;
	public PiezaMetalica(double peso, String codPieza, int cantidadPieza) {
		super(peso, codPieza);
		this.cantidad=cantidadPieza;
	}

	public double costo() {
		return (2.8 * super.peso + 56)*cantidad;
	}
	

}
