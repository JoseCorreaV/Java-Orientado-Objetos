package com.herencias_interfaces.Modelo;

public class ControlBonificaciones {

	private double suma;

	// uso de poliformismo => el parametro funcionario puede ser reemplazado
	// por aquellas clases hijas (las cuales tienen un extends Funcionario)
	public double registroSalario(Funcionario funcionario) {
		this.suma = funcionario.getBonificacion() + this.suma;
		System.out.println("calculo actual: "+this.suma);
		return this.suma;
	}
	
	

}
