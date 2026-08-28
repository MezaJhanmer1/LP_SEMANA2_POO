package entidad;

public class Proveedor extends Persona {
 
	private String ruc;

	public Proveedor() {}
	
	public Proveedor(String id, String nombre, String ruc) {
		super(id, nombre);
		this.ruc = ruc;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	
}
