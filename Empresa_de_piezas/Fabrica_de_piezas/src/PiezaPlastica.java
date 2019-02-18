
public class PiezaPlastica extends Pieza {
	private static int cantidad=0;

	public PiezaPlastica(double peso, String codPieza, int cantidadPieza) {
		super(peso, codPieza);
		cantidad+=cantidadPieza;
	}
	
	public static int getCantidad() {
		return cantidad;
	}

	public double costo() {
		return (1.3 * super.peso + 30)*cantidad;
	}
	
}
