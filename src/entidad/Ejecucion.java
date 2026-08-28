package entidad;

public class Ejecucion {

	//metodo donde inicia la ejecucion
	public static void main(String[] args) {
		
		//Vamos a crear objeto cliente
		
	Cliente objCliente1 = new Cliente("1", "Jhanmer Meza", "60549429");
	Cliente objCliente2 = new Cliente("2", "Ana Quispe", "563454");
	Cliente objCliente3 = new Cliente("3", "Luisa Quispe", "563564");
	Cliente objCliente4 = new Cliente();
	objCliente4.setId("4");
	objCliente4.setNombre("Elba Flores");
	objCliente4.setDni("34234");
	
	//Imprimir el objero
	System.out.println("Cliente 1");
	System.out.println("ID: "+objCliente1.getId());
	System.out.println("Nombre: "+objCliente1.getNombre());
	System.out.println("DNI: "+objCliente1.getDni());
	
}
}