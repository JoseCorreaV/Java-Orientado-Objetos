package com.herencias_interfaces.Modelo;

public class CuentaAhorro extends Cuenta {
	
	public CuentaAhorro (int agencia, int numero) {
		super(agencia,numero);
	}

	@Override
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
		
	}
	
	@Override
	public String toString() {
		// retorna del metodo toString de la clase Cuenta
		return super.toString();
	}

}
