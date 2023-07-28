package banco;

// representar una entidad, clase o conjunto
/**
 * @author JoseCorrea
 *
 */
public class Cuenta {

	private double saldo;
	private int agencia;
	private int numero;
	// adquirir desde x entidad los datos del cliente
	private Cliente titular = new Cliente();
	
	// static no hace parte de la instancia
	// static => la variable o metodo no sera alterado por la instancia
  private static int total = 0;

	public Cuenta(int agencia) {
	
		if(agencia <= 0) {
			System.out.println("no permite 0");
			this.agencia = 1;
		}else {
			this.agencia = agencia;
		}
		total++;
		System.out.println("Creacion de cuenta N: "+total);
		
	}

	// la palabra reservada void => ejecuta el motodo
	public void depositar(double saldo) {
		// this. parabra reservada de java para hacer referencia al atributo de la clase
		// suma el this.saldo + saldo del parametro del metodo
		this.saldo += saldo; // es lo mismo que => this.saldo = thi.ssaldo + valor;
	}

	public boolean retirar(double valor) {

		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;

	}

	// podemos ponerle a la clase como parametro la cuenta
	public boolean transferir(double valor, Cuenta NameCuenta) {

		// comprobar si tengo saldo suficiente para debitar
		if (this.saldo >= valor) {
			// Le quito a mi saldo el valor que voy a trasferir
			this.saldo -= valor;
			// esta operación ya existe por ende es mejor llamar el metodo que utiliza esta
			// operación
			// NameCuenta.saldo += valor;

			// deposito el valor a la nueva cuenta
			NameCuenta.depositar(valor);
			// interrumpe la ejecución y sale del metodo
			return true;
		}

		return false;

	}

	// setter

	/*   este es mejor el metodoto depositar
	public void setSaldo(double saldo) {
		if (agencia > 0) {
			this.saldo = saldo;
		}	
	}
*/
	

	public void setNumero(int numero) {
		if (agencia > 0) {
			this.numero = numero;
		}

	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	

	// getter
	
	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public int getNumero() {
		return this.numero;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal() {
		return total;
	}
	

}
