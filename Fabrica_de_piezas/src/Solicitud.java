
public class Solicitud {

	private String codigoSolicitud, fecha;
	private Pieza pieza;
	int cantidad;
	int costo;

	public Solicitud(String fecha, int cantidad) {
		this.cantidad= cantidad;
		this.fecha=fecha;
		//costo = "metodo que calcula el costo con la informacion que se manda cuando se hace la solicitud"
		//El costo de las solicitud se calcula cuando se crea el objeto Solicitud en el metodo hacerSolicitud 
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
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

	public Pieza getPieza() {
		return pieza;
	}

	public void setPieza(Pieza pieza) {
		this.pieza = pieza;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}






}
