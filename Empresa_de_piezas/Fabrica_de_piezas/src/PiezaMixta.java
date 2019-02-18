
public class PiezaMixta extends Pieza{
	private static int cantidad=0;
	
	public PiezaMixta(double peso, String codPieza, int cantidadPieza) {
		super(peso, codPieza);
		cantidad+=cantidadPieza;
	}
	
	public static int getCantidad() {
		return cantidad;
	}

	Pieza piezas[] = new Pieza[0];

	public double costo() {

		double total=0;

		for (int i =0;i<piezas.length;i++) {
			total+=piezas[i].costo();
		}
		return total;
	}
}
