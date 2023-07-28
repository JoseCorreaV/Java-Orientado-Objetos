package com.herencias_interfaces.Modelo;

/*  para no repetir los mismos datos en otras entidades se realiza la herencia
 *  en java se usa la plabra reservada extends para HEREDAR 
 * */



public class Gerente extends Funcionario implements FuncionarioAuth {

	
	// esto se hace con el proposito de hacer el codigo con buenas practicas
	// y reducir el uso de if
	public double getBonificacion() {
		System.out.println("gerente");
		// Super da acceso a los metodos del padre desde la clase hija
		return 200;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}

}
