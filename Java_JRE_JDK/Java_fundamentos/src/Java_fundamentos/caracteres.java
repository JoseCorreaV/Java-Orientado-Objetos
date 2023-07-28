package Java_fundamentos;

public class caracteres {

	public static void main(String[] args) {

		// acepta 1 caracter o el codigo assci
		// acepta el codigo asscii
		char chr = 'a';
		char ascii = 64;
		char caracter = 65 + 1;
		char caracter2 = (char) (caracter + 1);

		// String es un objeto de java
		String cadenaText = "One Next Education";

		System.out.println(chr + "\ncodigo ascii: " + ascii + "\ncodigo ascii: " + caracter2 + "\n" + cadenaText);
	}

}
