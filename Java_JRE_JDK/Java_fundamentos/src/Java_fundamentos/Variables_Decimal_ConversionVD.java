package Java_fundamentos;

public class Variables_Decimal_ConversionVD {

	public static void main(String[] args) {

		// variables

		/*
		 * 
		 * El simbolo L o l hace referencia a que el numero de tipo long que soporta
		 * 2a63 sera muy largo long NumLarge = 1234567890123456789L; 
		 * 
		 * soporta numeros
		 * de 2a16 short NumSmall = 12345; 
		 * 
		 * soporta numeros 8 byte // para
		 * procesamiento de archivos byte NumVerySmall = 123; 
		 * 
		 * Numeros decimales mas
		 * pequeño => referenciar con F para determinar que es float float
		 * NumSoMuchSmall = 9.9F; 
		 * 
		 */

		int edad = 8;
		double salario = 1250.52;
		System.out.println("Hi " + edad + " " + salario + "\n");
		// Reasignar variables
		// edad = 8+1;
		// 5.5 + 4 = 22.0 => debido a que en la operación hay un double

		// cast => convertir de double a entero

		double variableDouble = 230.56;
		// cast
		int variableInt = (int) variableDouble;
		System.out.println("Convirtiendo el double: " + variableDouble + "  en int: " + variableInt + "\n");

		// operación con double con int

		double resultado = variableDouble + variableInt;

		System.out.println("Operacion con int y double: " + resultado + "\n");
	}
}
