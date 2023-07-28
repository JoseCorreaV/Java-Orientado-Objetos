package com.herencias_interfaces.test;

import com.herencias_interfaces.Modelo.*;


public class test_entidades {

	public static void main(String[] args) {
/*                  test para funcionarios              */
		
		// para que compile de forma abstracta se debe crear un objeto que se posicione en una representación fisica
		// debido a que la clase Contador se extiende de Funcionario
		Funcionario Jose = new Contador();
		Jose.setDocumento("Jose");
		Jose.setDocumento("44563454");
		Jose.setSalario(0);
		Jose.setSalario(100.0);
		
		System.out.println("Salario: "+Jose.getSalario());
		System.out.println("Bonificacion: "+Jose.getBonificacion());

		
/*                  test para gerente             */
		System.out.println("\n\n");
		
		
		Gerente gerente = new Gerente();
		gerente.setSalario(5800.0);
		gerente.setClave("java");
		gerente.setTipo(1);
		
		System.out.println("Salario gerente: "+gerente.getSalario());
		System.out.println("Bonificacion gerente: "+gerente.getBonificacion());
		System.out.println("Inicio sesion: "+gerente.iniciarSesion("java"));
		
		
		
/*                  test para bonificaciones            */
		System.out.println("\n\n");
		
		
		Funcionario Diego = new Contador();
		Diego.setSalario(2000.0);
		
		Gerente ximena = new Gerente();
		ximena.setSalario(10000);
		
		Contador alex = new Contador();
		alex.setSalario(5000);
	
		// ejemplo de la acción del poliformismo
		// el metodo registroSalario funciona para gerente y Contador debido a que estas clases
		// poseen en sus clases un extends Funcionario
		ControlBonificaciones cb = new ControlBonificaciones();
		cb.registroSalario(Diego);
		cb.registroSalario(ximena);
		cb.registroSalario(alex);
		
		
		
		/*                  test para cuentas             */
	
		System.out.println("\n\n");
		
		
		CuentaAhorro CA = new CuentaAhorro(2,3);
		CuentaCorriente CC = new CuentaCorriente(1,1);
		// comición de 20 pesos al trasferir de corriente a ahorros
		CC.depositar(2000);
		CC.transferir(1000, CA);
		
		System.out.println("Corriente: "+CC.getSaldo());
		System.out.println("Ahorro: "+CA.getSaldo());
		
		/*                  test para cuentas             */
		
		System.out.println("\n\n");
		
		
		SistemaInterno sistema = new SistemaInterno();
		Gerente gerent = new Gerente();
		Administrador admin = new Administrador();
		
		sistema.autentica(gerent);
		sistema.autentica(admin);
		

	
	}

}
