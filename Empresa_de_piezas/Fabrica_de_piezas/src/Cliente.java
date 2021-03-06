
public class Cliente {
	
	private String nombre , direccion, correo;
	private String formaDePago; //CO CE CC TB
	private Solicitud solicitudes[] = new Solicitud[1];
	boolean vip;
	int contadorSolicitudes = 0;

	public Cliente(String nombre , String direccion, String correo, String formaDePago) {
		this.nombre=nombre;
		this.correo=correo;
		this.direccion=direccion;
		this.formaDePago=formaDePago;
		vip=false;
	}

	public Solicitud[] getSolicitudes() {
		return solicitudes;
	}

	public void setSolicitudes(Solicitud[] solicitudes) {
		this.solicitudes = solicitudes;
	}

	public String generarCodigo(String nom) {
		String cod = nom.substring(0, 3) + Integer.toString(contadorSolicitudes);
		setContadorSolicitudes(contadorSolicitudes + 1);
		return cod;
	}

	public int getContadorSolicitudes() {
		return contadorSolicitudes;
	}

	public void setContadorSolicitudes(int contadorSolicitudes) {
		this.contadorSolicitudes = contadorSolicitudes;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}
	
	public boolean isVip() {
		return vip;
	}

	public void quitarSolicitud(String codigoSolicitud) {
		int flag = 0;
		Solicitud[] newSolicitud = new Solicitud[solicitudes.length-1];
		int p = buscarSolicitud(codigoSolicitud);
		if (flag !=-1) {
			for(int i=p ; i<solicitudes.length-1;i++) {
				newSolicitud[i]=solicitudes[i+1];
			} 
			this.solicitudes=newSolicitud;
		}
	}

	public int buscarSolicitud(String code) {
		int i = -1;
		while(++i<solicitudes.length && solicitudes[i].getCodigoSolicitud().compareTo(code)!=0);
		return (i<solicitudes.length)?i:-1;

	}

	public double totalSolicitudes() {

		double total=0;
		for (int i = 0; i < solicitudes.length; i++) {
			total += solicitudes[i].getCosto();
		}
		return total;
	}




}
