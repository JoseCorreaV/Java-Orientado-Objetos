package Java_fundamentos;

public class Valores_Variables {

	public static void main(String[] args) {
		// punteo = no apunta al valor si no a la dirección en memoria
		// en el caso de java guarda es el valor de la variable

		int num = 5;
		int num2 = 6;
		System.out.println(num2); // output => 6
		num2 = num;
		System.out.println(num2); // output => 5
		num = 88;
		System.out.println(num2); // output => 5

	}

}
