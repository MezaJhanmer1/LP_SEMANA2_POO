package entidad;

public class Cliente extends Persona{

	private String dni;

	 public Cliente() {}
	public Cliente(String id, String nombre, String dni) {
		super(id, nombre);
		this.dni = dni;
	}


	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
}
