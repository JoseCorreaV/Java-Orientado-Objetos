package com.herencias_interfaces.Modelo;

/** javadoc con /** + entro
 * 
 * Descripción de la clase
 * 
 * @version 1.0
 * @author JoseCorrea
 *
 */

public class Administrador extends Funcionario implements FuncionarioAuth {
	
	private AutenticacionUtil util;

	public Administrador() {
		this.util = new AutenticacionUtil();
	}
	
	@Override
	public double getBonificacion() {
		return this.getSalario();
	}

	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}

}
