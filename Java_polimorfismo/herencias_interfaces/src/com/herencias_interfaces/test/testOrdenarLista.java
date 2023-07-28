package com.herencias_interfaces.test;

import com.herencias_interfaces.Modelo.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.herencias_interfaces.Modelo.Cuenta;
import com.herencias_interfaces.Modelo.CuentaAhorro;
import com.herencias_interfaces.Modelo.CuentaCorriente;


public class testOrdenarLista {

	public static void main(String[] args) {
		
		Cuenta cc1 = new CuentaCorriente(62, 33);
		Cliente clienteCc1 = new Cliente();
		clienteCc1.setNombre("Diego");
		cc1.setTitular(clienteCc1);
		cc1.depositar(333.0);
		
		Cuenta cc2 = new CuentaAhorro(32, 44);
		Cliente clienteCc2 = new Cliente();
		clienteCc2.setNombre("Rene");
		cc2.setTitular(clienteCc2);
		cc2.depositar(444.0);
		
		Cuenta cc3 = new CuentaCorriente(72, 11);
		Cliente clienteCc3 = new Cliente();
		clienteCc3.setNombre("juan");
		cc3.setTitular(clienteCc3);
		cc3.depositar(111.0);
		
		Cuenta cc4 = new CuentaAhorro(12, 22);
		Cliente clienteCc4 = new Cliente();
		clienteCc4.setNombre("juan");
		cc4.setTitular(clienteCc4);
		cc4.depositar(222.0);
		
		List<Cuenta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		// por cada cuenta en la lista
		System.out.println("\n antes de ordenar");
		for(Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		// ordenar cuentas
		// short => comparar.
		//Comparator <' extend Cuenta> => Cualquier clase hija de cuenta
		
		// Comparator <Cuenta> comparator = new OrdenadorPorNumeroCuenta();
		// lista.sort(comparator);
		lista.sort(new Comparator<Cuenta>() {
		//	ordenados loe elementos ascedentes o descendente por numero de cuenta
			@Override
			public int compare(Cuenta o1, Cuenta o2) {
				return Integer.compare(o1.getNumero(), o2.getNumero());
			}
			
		});
		
		System.out.println("\n despues de ordenar ");
		for(Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		System.out.println("\n ");
		//                                        comparar string
		
		//Comparator <Cuenta> comparatorTitular = new OrdenadorPorNombreTitular();
		// lista.sort(new OrdenadorPorNombreTitular());
		
		// forma antigua
		//Collections.sort(lista, new OrdenadorPorNombreTitular());
		
		// Clase anonima || Function Object
		Collections.sort(lista, new Comparator<Cuenta>() {
		//	ordenados loe elementos ascedentes o descendente por numero de cuenta
			@Override
			public int compare(Cuenta o1, Cuenta o2) {
				return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
			}
			
		});
		
		System.out.println("\n despues de ordenar por titular ");
		for(Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		// ordenar de forma natural "por agencia" => el metodo esta sobre escribido en cuenta
		Collections.sort(lista);
		
		System.out.println("\n despues de ordenar por orden natural ");
		for(Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
	}
}

/* solo necesario para la forma antigua

class OrdenadorPorNumeroCuenta implements Comparator<Cuenta>{

	// ordenados loe elementos ascedentes o descendente por numero de cuenta
	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		// forma basica
		if(o1.getNumero() == o2.getNumero()) {
			return 0;
		}else if (o1.getNumero() > o2.getNumero()) {
			return 1;
		}else {
			return -1;
		}
		
		// forma intermedia
		//return o1.getNumero() - o2.getNumero();
		
		//Forma wapper
	return Integer.compare(o1.getNumero(), o2.getNumero());

	
	}
	
}

class OrdenadorPorNombreTitular implements Comparator<Cuenta>{

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
	return o1.getTitular().getNombre()
	// compareTo para ordenar alfabeticamente
	.compareTo(o2.getTitular().getNombre());
		
	}
	
	
}

*/
