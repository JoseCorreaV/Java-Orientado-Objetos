package com.herencias_interfaces.Modelo;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(int agencia, int numero) {
		// llama al constructor padre que tiene dos parametros
		// esto para mantener la regla de negocio
		super(agencia, numero);
	}
	
	// @Override para poder sobreescribir - si se elimina se crea nuevo
	@Override
	public void retirar(double valor)throws SaldoException {
		// cobrar comission
		double comision = 0.2;
		try {
			super.retirar(valor + comision);
		} catch (SaldoException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
		
	}
	
}
