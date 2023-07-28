package com.herencias_interfaces.test;

import com.herencias_interfaces.Modelo.*;

public class testGuardaCuenta {
	
	public static void main(String[] args) {
	
	guardaCuenta guardarCuent = new guardaCuenta();
	Cuenta cc = new CuentaCorriente(11,50);
	guardarCuent.adicionar(cc);
	Cuenta cc2 = new CuentaCorriente(22,44);
	guardarCuent.adicionar(cc2);
	
	
	System.out.println(guardarCuent.obtener(0));
	System.out.println(guardarCuent.obtener(1));
	

	
	
	
	
	}
}