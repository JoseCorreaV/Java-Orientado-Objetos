package com.herencias_interfaces.test;

import java.util.ArrayList;
import java.util.List;

public class testRepasoArray {
	/**
	 * Repaso de arrays
	 * 
	 */
	public static void main(String[] args) {
		
		int[] numero = new int[10];
		// int => primitivo
		int numberPrimitivo = 40;
		
		// wrapper => acción de  trasforma el valor primitivo int a integer
		// Integer => objeto
		// Decprecado => cuando algo esta tañado es que en algun momento lo van a quitar
		Integer numberObject = Integer.valueOf(40); // forma de crear un integer
		
		// recomendación declarar el tipo de variable de tipo objeto
		List<Integer> lista = new ArrayList<>();
		lista.add(numberPrimitivo);// autoBoxing => convierte automaticamente el int primitivo a un objeto de tipo integer
		lista.add(numberObject);
		
		
		//unboxing => valor primitivo
		//int valuePrimitivo = numberObject;
		int valuePrimitivo = numberObject.intValue();
		// conversiones
		numberObject.byteValue();
		numberObject.doubleValue();
		numberObject.floatValue();
		
		// saber el tamaño de un tipo de dato.
		System.out.println(Integer.MAX_VALUE);
	}

}
