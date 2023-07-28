package Java_fundamentos;
// rsolver malas practicas de condicionales 1
/*
 * 1. mejorar los nombres de las variables
 * 2. uttilizar simbolos en condicionales
 * */
public class Condicionales2 {

	public static void main(String[] args) {
		int edad = 18;
		int cantidadPersonas = 2;

		// retorna true o false dependiendo del resultado => cantidadPersonas > 1
		boolean pareja = cantidadPersonas > 1;
		boolean puedeEntrar = edad >= 18 && pareja;

		if (puedeEntrar) {
			System.out.println("Puede entrar");
		} else {
			System.out.println("no puede entrar");
		}

	}

}
