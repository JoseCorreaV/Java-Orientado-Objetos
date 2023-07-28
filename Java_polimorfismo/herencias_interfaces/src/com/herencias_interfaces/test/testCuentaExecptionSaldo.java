package com.herencias_interfaces.test;

import com.herencias_interfaces.Modelo.*;

// public =>  accesible desde cualquier parte
// --default == <<package private>>  =>  accesible dentro de clase y en cualquier otro miembro del mismo paquete
// --protected => default + clases hijas
// --- private => solo desde la misma clase

public class testCuentaExecptionSaldo {

	public static void main(String[] args) {
		Cuenta cuenta = new CuentaAhorro(123, 456);
		cuenta.depositar(200);
		try {
			cuenta.retirar(210);
		} catch (SaldoException e) {
			e.printStackTrace();
		}
	}

}
