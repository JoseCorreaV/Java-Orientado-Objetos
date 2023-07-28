package banco;

public class testReferencia {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("testReferencia #1");

		Cuenta Cuenta1 = new Cuenta(1);
		Cuenta1.depositar(100);

		// cuenta2 apunta a cuenta1
		Cuenta Cuenta2 = Cuenta1;
		Cuenta2.depositar(50);

		// cuenta2 apunta a 50 y cuenta1 apunta a 50 tambien.
		// debido a que se altero la instancia principal (Cuenta1)
		System.out.println(Cuenta1.getSaldo() + "   " + Cuenta2.getSaldo());

		// evidenciamos que la cuenta 1 y 2 estan en la misma ubicación en memoria
		// System.out.println(Cuenta1 +" " + Cuenta2);

		// condicionales que evalua la ubicación en memoria que tienen los objetos
		if (Cuenta1 == Cuenta2) {
			System.out.println("Tienen la msima ubicacion en memoria");
		} else {
			System.out.println("ubicaciones diferentes");
		}
		
		
		
		
		
		
		
		
		

		/* CLIENTE poliformismo */

		System.out.println("\n\ntestReferencia #2");

		Cuenta cuent = new Cuenta(5);
		Cliente client = new Cliente();
		client.setDocumento("4597562348");
		cuent.setTitular(client);

		

		// cuentaJose.titular.documento => imprime el documento
		String document = cuent.getTitular().getDocumento();

		System.out.println("Documento del cliente: " + document); // imprime el documento

		// cuentaJose.name && jose => apunta a la dirección en memoria
		
		
		
		
		
		
		
		
		
		
		

		/* Pruebas de referencia 3 */

		System.out.println("\n\ntestReferencia #3");

		//cliente 
		Cliente jose2 = new Cliente();
		Cuenta cuentaJose2 = new Cuenta(5);
		jose2.setNombre("jose");
		cuentaJose2.setTitular(jose2);
		
		
		/* 
		// adquirir desde el la Cuenta los datos del cliente
		// CuentaJose2.titular = new Cliente(); // el atributo titular de la cuenta apunta a la entidad cliente 
	*/
		
		// el atributo titular de la entidad cuenta accede al nombre de la entidad cliente la cual tiene un valor de "jose"
		System.out.println(cuentaJose2.getTitular().getNombre());
		

	}

}
