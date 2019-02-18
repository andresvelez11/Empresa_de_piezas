import java.util.*;
public class Empresa {

	private String nombre;
	private String direcccion;
	private Cliente clientes[] = new Cliente[1];
	private Pieza piezas[];

	public void crearCliente(String nombre , String direccion, String correo, String formaDePago) {
		Cliente cliente = new Cliente(nombre , direccion, correo, formaDePago);

		if (clientes[0] == null) {
			clientes[0] = cliente;
		} else {
			Cliente[] newClientes = new Cliente[clientes.length + 1];
			System.arraycopy(clientes, 0, newClientes, 0, clientes.length);
			newClientes[newClientes.length - 1] = cliente;
			this.clientes = newClientes;
		}
	}

	public void quitarCliente(String nombre) {
		int flag = 0;
		Cliente[] newClientes = new Cliente[clientes.length-1];
		int p = buscarCliente(nombre);
		if (flag !=-1) {
			for(int i=p ; i<clientes.length-1;i++) {
				newClientes[i]=clientes[i+1];
			} 
			this.clientes=newClientes;
		}
	}

	public int buscarCliente(String nom) {
		int i = -1;
		while(++i<clientes.length && clientes[i].getNombre().compareTo(nom)!=0);
		return (i<clientes.length)?i:-1;

	}

	public void vip() {
		double aux1=0;
		if(clientes != null) {   
			for(int i=0;i<clientes.length;i++) {
				if(clientes[i].totalSolicitudes()>aux1) {
					aux1=clientes[i].totalSolicitudes();

				}
			}

		}
		for (int i = 0; i < clientes.length; i++) {
			if(aux1==clientes[i].totalSolicitudes()) {
				clientes[i].setVip(true);
			}
		}
	}
	
	public void hacerSolicitud(String nombre, String fecha, int cantidad, double peso, String codPieza) {
		int x=buscarCliente(nombre);
		Solicitud solicitud = new Solicitud(fecha, cantidad, peso, codPieza);
		solicitud.setCodigoSolicitud(clientes[x].generarCodigo(nombre));
		
		if (clientes[x].getSolicitudes()[0] == null) {
			clientes[x].getSolicitudes()[0] = solicitud; 
		} else {
			Solicitud[] newSolicitud = new Solicitud[clientes[x].getSolicitudes().length + 1];
			System.arraycopy(clientes[x].getSolicitudes(), 0, newSolicitud, 0, clientes[x].getSolicitudes().length);
			newSolicitud[newSolicitud.length - 1] = solicitud;
			clientes[x].setSolicitudes(newSolicitud);
		}
	}
	
	public static void main(String[] args) {

		Empresa e = new Empresa();
		e.crearCliente("Andres", "Av los santos", "gmail", "CC");
		e.hacerSolicitud("Andres","Febrero", 50, 80, "Metalica");
		e.hacerSolicitud("Andres","Febrero", 50, 80, "Plastica");
		e.hacerSolicitud("Andres","Febrero", 50, 80, "Mixta");
		System.out.println(e.clientes[0].getNombre());
		System.out.println(e.clientes[0].getSolicitudes()[0].getCodigoSolicitud());
		System.out.println(e.clientes[0].getSolicitudes()[1].getCodigoSolicitud());
		System.out.println(e.clientes[0].getSolicitudes()[2].getCodigoSolicitud());
		e.crearCliente("Catalina", "Av las vegas", "gmail", "TB");
		e.hacerSolicitud("Catalina","Febrero", 50, 8000, "Mixta");
		System.out.println(e.clientes[1].getNombre());
		System.out.println(e.clientes[0].totalSolicitudes());
		System.out.println(e.clientes[1].totalSolicitudes());
		e.vip();
		System.out.println(e.clientes[0].isVip());
		System.out.println(e.clientes[1].isVip());
		System.out.println(e.costoTotalEmpresa());
	}
	
	public double costoTotalEmpresa() {
		double suma=0;
		for (int i = 0; i < clientes.length; i++) {
			suma+=clientes[i].totalSolicitudes();
		}
		return suma;
	}
}
