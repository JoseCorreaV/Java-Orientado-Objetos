package banco;

public class pruebaEncapsulamiento {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(1);
		Cliente cliente = new Cliente();
		
		cliente.setNombre("jose");
		cliente.setDocumento("45as56a4sd");
		
		cuenta.setTitular(cliente);
		
		//Cliente cliente2 = cuenta.getTitular();
		
		System.out.println("Nombre cliente: "+cliente.getNombre() );
		System.out.println("Nombre cliente: "+cuenta.getTitular().getNombre() );

	}

}
