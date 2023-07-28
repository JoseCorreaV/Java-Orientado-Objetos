package Java_fundamentos;
// el ciclo while solo funciona cuando la operación sea verdadera
// el for solo es utilizado cuando necesitamos la variable contador

public class ciclos {

	public static void main(String[] args) {
		/*                      ciclo  while            */
		
		int contador = 0;
		// imprimir el numero del 1 al 10
		while (contador < 10 ) {
			
			//si la variable contador esta de primero en la ejecución
			// el resultado empezara con el valor = 1
			contador ++; 
			System.out.print(" "+contador);
		
			/*            opciones 
			 *         
			 *        contador += 1; 
			 *        contador ++;   
			 *        => suma de 1 en 1 
			 *        
			 *        contador += 3; s
			 *        => suma de 3 en 3
			 * 
			 * 
			 * */
		}
		
		System.out.println("\n\nSuma de numeros del 1 al 10\n");
		
		int contador2 = 0;
		int total = 0;
		
		// ponemos 9 debido a que el contador el la primera ejecución
		while (contador2 <= 9 ) {
			
			// en total suma el valor anterior del contador(total) y el valor actual del contador(contador2
			contador2 ++;
			total = total + contador2;
			System.out.print(" "+total);
			
			
		}
		
		/*                      ciclo  for            */
		
		System.out.println("\n\nciclo for \n");
		
		/* 1. en la PRIMERA ITERACIÓN utiliza el primer parametro (int contador = 1;) 
		 * 2. luego valida el segundo parametro
		 * 3. si la validación del 2 parametro es true, ejecuta el codigo dentro del for
		 * 4. al finalizar la ejecución dentro del for, salta  al 3 ITERACIÓN y hace la operación
		 * 
		 * 5. ignora la PRIMERA ITERACIÓN  
		 *  
		 *  IMPORTANTE: el primer parametro solo se ejecuta 1 sola vez  
		 *  los demas pasos se repiten N cantidad de veces.
		 *  
		 * 
		 */
		 
		for(int cantidad = 1; cantidad <= 10; cantidad++) {
			System.out.print(" "+cantidad);
		}
		
		
		

	}

}
