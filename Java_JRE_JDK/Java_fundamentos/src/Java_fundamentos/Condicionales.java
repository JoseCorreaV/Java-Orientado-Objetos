package Java_fundamentos;

public class Condicionales {

	public static void main(String[] args) {
		int edad = 17;
		int cantidad = 2;
		if (edad >= 18) {
			System.out.println("mayor");
		} else {
			if (cantidad >= 2) {
				System.out.println("Menor de edad");
			} else {
				System.out.println("no puede entrar");
			}
		}
	}

}
