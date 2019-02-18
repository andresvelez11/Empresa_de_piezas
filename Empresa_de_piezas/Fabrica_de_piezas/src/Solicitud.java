
public class Solicitud {

	private String codigoSolicitud, fecha;
	int cantidad;
	double costo;
	
	public Solicitud(String fecha, int cantidad, double peso, String codPieza) {
		this.cantidad= cantidad;
		this.fecha=fecha;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public String getCodigoSolicitud() {
		return codigoSolicitud;
	}
	
	public void setCodigoSolicitud(String codigoSolicitud) {
		this.codigoSolicitud = codigoSolicitud;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}






}
