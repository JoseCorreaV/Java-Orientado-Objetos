package Java_fundamentos;

public class tablaMultiplicar {

	public static void main(String[] args) {
	
		// tabla multiplicar usando for
		
		int total = 0;
	
		// imprime 10 veces el valor mismo valor (debido a que tiene un for anidado)
		// imprime del 1  al 10 (cada ves que finaliza el for anidado)
		for(int a = 1; a <= 10; a++) {
			
			System.out.println("\n"+ a +"\n");	
			
			
			// imprime numeros del 1 al 10
			// y por cada iteración imprime la operación (total)
			for(int b = 1; b <= 10; b++) {
				// operación para la multiplicación
				total = a*b;
				
				// imprime 10 veces el valor actual de a
				// imprime del 1 al 10 la variable b
				// imprime la operación del valor actual de a y de b  10 veces
			System.out.println(a +" x "+b+" = "+total);
			                             }  
			}
	
	     
		// tabla de multiplicar usando while
		
	
	}

}
