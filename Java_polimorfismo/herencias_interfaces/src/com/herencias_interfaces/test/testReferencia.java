package com.herencias_interfaces.test;

import com.herencias_interfaces.Modelo.Funcionario;
import com.herencias_interfaces.Modelo.Gerente;

public class testReferencia {

	public static void main(String[] args) {
		// explicación de conceptos en polimorfismo
		// esto es permitido ya que gerente se extiende de funcionario
		// funcionario es un elemento generico y el gerente es un elemento especifico
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("valoyes");

		Gerente gerente = new Gerente();
		gerente.setNombre("correa");
		
		funcionario.setSalario(5000.0);
		gerente.setSalario(10000.0);
		
		
	}

}
