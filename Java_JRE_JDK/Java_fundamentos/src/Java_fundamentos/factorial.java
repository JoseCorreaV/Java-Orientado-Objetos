package Java_fundamentos;
/*
 * Ahora crea una nueva clase, escribe un for que comience una variable
 *  n (número actual) como 1 y factorial (resultado total) como 1. 
 *  ¡Haz su ciclo entre 1 y 10 y calcula el resultado!
 * */

// El factorial de 4! = 1 x 2 x 3 x 4 = 24
// El factorial de un número n es n * n-1 * n-2 ... hasta n = 1.
public class factorial {
 
	public static void main(String[] args) {
		
		int factorial = 1;
		
		for (int n = 1; n < 11 ; n++) {
		 factorial *= n;
			/* 
			
			factorial es = al valor anterior * el valor siguiente
			=> factorial =  factorial * n;
			
			*/
		    System.out.println("Factorial de " + n + " = " + factorial);
	        }

		
	}
	
	
}
