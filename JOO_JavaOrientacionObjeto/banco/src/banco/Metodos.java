package banco;

public class Metodos {
	
	public static void main(String[] args) {
		// creamos un objeto llamado Micuenta
		Cuenta Micuenta = new Cuenta(1);
		Micuenta.depositar(200);;
		
		//llamar un metodo
		Micuenta.depositar(2000);
		System.out.println("Mi saldo despues de depositar: "+Micuenta.getSaldo());
		
		Micuenta.retirar(400);
		System.out.println("Mi saldo despues de retirar: "+Micuenta.getSaldo());
		
		
		
		Cuenta CuentaGian = new Cuenta(1);
		CuentaGian.depositar(5000);
		boolean exito = CuentaGian.transferir(1000,Micuenta);
		
		if(exito)
		{
			System.out.println(" \n \n Trasferencia de gian exitosa");
		}		
		
		System.out.println("\n Mi nuevo saldo: "+Micuenta.getSaldo());
	System.out.println("\n El Saldo Gimena luego de trasferirme: "+CuentaGian.getSaldo());
		
	}

}
