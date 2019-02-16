
public class PiezaMixta extends Pieza{
	
	Pieza piezas[] = new Pieza[0];
	
	public double costo() {
		double total=0;
		//El costo de una mixta el la sumatoria de las piezas que la componen
		for (int i =0;i<piezas.length;i++) {
			total+=piezas[i].costo();
			}
		return total;
	}


	
}
