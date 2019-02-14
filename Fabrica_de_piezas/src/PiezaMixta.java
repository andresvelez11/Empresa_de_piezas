
public class PiezaMixta extends Pieza{
	
	
	Pieza piezas[] = new Pieza[0];
	
	public double costo() {
		
		return 2.8 * super.pesoUnitario + 30;
	}
	
}
