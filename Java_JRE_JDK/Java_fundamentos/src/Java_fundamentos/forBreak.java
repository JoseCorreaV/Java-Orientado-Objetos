package Java_fundamentos;
/*
 * ¡Así pudimos obtener la respuesta correcta! Ten en cuenta que debemos agregar 
 * 1 al valor de la columna porque for está inicializando esta variable con un valor de 0.
 * */
public class forBreak {

	public static void main(String[] args) {

        for(int fila = 0; fila < 5; fila++) {
        	 
        	// ESTE ciclo se ejecuta 5 veces por cada iteración de la fila        
            for (int columna = 0; columna < 5; columna++) {
   
                if ( columna > fila  ) {
                	// cada vez que la columna sea mayor que la fila  sale del for y va al salto de linea
                	break;
                }
                // solo imprime el valor de la columna
                System.out.print( columna + 1 );
            }
            // SALTO DE LINEA CADA VES QUE FINALIZA EL FOR
            System.out.println();
        }

	}

}
