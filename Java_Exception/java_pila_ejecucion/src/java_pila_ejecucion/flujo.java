package java_pila_ejecucion;

public class flujo {

	public static void main(String[] args) {

		System.out.println("Ini do main");
		try {
				metodo1();
				// Myexception | ArithmeticException
				// o solo => Exception
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		System.out.println("Fim do main");
	}

	public static void metodo1() throws Myexception {
		System.out.println("Ini do metodo1");

		/*
		 * En caso de que Myexception se extienda de => exception si o si es necesario
		 * que el metodo donde esta el error tennga un lanzador de error adicionalmente
		 * el codigo donde se llama el metodo que tiene el error debe utilizar un Try -
		 * catch, para capturar por obligacion el error. => public static void metodo2()
		 * throws Myexception {
		 * 
		 * resumen: si extendemos al RuntimeExceptio (UNCHECKED), le estaremos diciendo
		 * que puede o no haber un error y para eso es necesario hacer el try - catch.
		 * En caso de ser extendido como Exception, si o si habra un error y para
		 * capturarlo debemos hacer el try - catch + en el metodo del error extender a
		 * la exception (CHECKED)
		 */

			metodo2();
	
		System.out.println("Fi d metodo1");
	}

	public static void metodo2() throws Myexception {
		System.out.println("Ini do metodo2");
		// int a = 50/0; // Ocariona un ArithmeticException
		// lanzar una exepción
		// throw = lazar solo exepción
		throw new Myexception("Creando mi exception");

		/*
		 * for (int i = 1; i <= 5; i++) { System.out.println(i);
		 * 
		 * // SI SABEMos que puede imprimir error utilizar el try try { int num = 0; int
		 * resultado = i/num; System.out.println(resultado) ;
		 * 
		 * } catch (ArithmeticException | NullPointerException e) { // imprimir la causa
		 * del error o mensaje e.printStackTrace(); System.out.println("");
		 * System.err.println(e.getMessage()); }// aqui puedo capturar otro tipo de
		 * error o poner en el catch | + el tipo de error + variable }
		 */

	}
}
