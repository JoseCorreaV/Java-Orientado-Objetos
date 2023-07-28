package banco;

public class pruebaAcceso {

	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta(1);
		cuenta.setNumero(200);
		cuenta.depositar(1000);
		cuenta.retirar(300);
	
		
		System.out.println("My saldo: "+cuenta.getSaldo());
	}

}
