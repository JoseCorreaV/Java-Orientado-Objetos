package banco;

public class puebaConstructor {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(555);
		Cuenta cuenta2 = new Cuenta(222);
		Cuenta cuenta3 = new Cuenta(444);
		
		System.out.println(Cuenta.getTotal());
		
	}
	
}
