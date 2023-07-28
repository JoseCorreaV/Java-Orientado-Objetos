package banco;

public class CrearCuenta {
	public static void main(String[] args) {
		//       Java no almacena valores a la variable, lo que hace es guardar la referenia del lugar a la memoria
		
		// instancia #1
		Cuenta FirstCuenta = new Cuenta(1);
		FirstCuenta.depositar(200);
		System.out.println(FirstCuenta.getSaldo());

		// instancia #2
		Cuenta SecondtCuenta = new Cuenta(1);// New => crea en tu memoria una nueva instancia
		SecondtCuenta.depositar(200);
		System.out.println(SecondtCuenta.getSaldo());
		
		// Imprime cero devino a que es el valor por defecto del entero al crear un objeto sin asignarle el valor
		// System.out.println(FirstCuenta.agencia);
		
		
		
		if(FirstCuenta.getSaldo() == SecondtCuenta.getSaldo()) {
			// entra en la condición si le agregamos el .saldo => el cual tiene los mismos valores
			System.out.println("Tienen el mismo valor, pero con ubicaciones en memoria diferentes");
		}else {
			// pueden que tengan los mismos valores, pero la ubicación en memoria es diferente
			System.out.println("ubicaciones diferentes");
		}

		/*                                        ejemplo                                                            */
		
		Cuenta miCuenta = new Cuenta(1);
        miCuenta.depositar(500);
        Cuenta otraCuenta = miCuenta;
        otraCuenta.depositar(1000);

        
        System.out.println(miCuenta.getSaldo()); //1500 debido a que otracuenta agrega += 1000 a 500 = 1500
	}
}
