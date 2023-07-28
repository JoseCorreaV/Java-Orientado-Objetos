package Java_fundamentos;

public class Descuento {
	public static void main(String[] args) {

		double valorCompra = 250.0;
		double descuento = 0.0;

		if (valorCompra >= 100.0 && valorCompra < 200.0) {
			descuento = 10.0;
		} else if (valorCompra >= 200.0 && valorCompra < 300.0) {
			descuento = 15.0;
		} else if (valorCompra >= 300.0) {
			descuento = 20.0;
		}

		// 250 - (250 * (15/100) )
		double valorFinal = valorCompra - (valorCompra * (descuento / 100));

		System.out.println("Valor de la compra: $" + valorCompra);
		System.out.println("Descuento: " + descuento + "%");
		System.out.println("Valor final: $" + valorFinal);

	}
}
