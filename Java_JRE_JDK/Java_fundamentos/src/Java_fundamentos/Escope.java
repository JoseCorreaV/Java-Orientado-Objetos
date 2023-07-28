package Java_fundamentos;

// todo lo que esta limitado por llave es scope

public class Escope {

	public static void main(String[] args) {

		// las variables locales pueden llamarse en funciones cerradas.
		int cantidadPersonas = 2;

		boolean pareja;

		if (cantidadPersonas > 1) {
			pareja = true;
		} else {
			pareja = false;
		}
	}

}
