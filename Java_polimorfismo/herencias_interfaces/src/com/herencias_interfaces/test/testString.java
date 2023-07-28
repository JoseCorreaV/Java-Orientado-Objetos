package com.herencias_interfaces.test;

import com.herencias_interfaces.Modelo.CuentaAhorro;

public class testString {

	public static void main(String[] args) {
		
	   String  nombre  = "Alura latam";
	  
	  // String  nombre2  = new String("Alura latam 2"); // No se utiliza
	   
	   System.out.println("Antes del replace:  " + nombre);
	   nombre = nombre.replace("A", "a");
	   System.out.println("Despues del replace:  " + nombre);
	   //Todas las letras en Mayuscula
	   nombre = nombre.toUpperCase();
	 //Todas las letras en minuscula
	   nombre = nombre.toLowerCase();
	 //Imprime el caracter en x posicióm
	   char letra = nombre.charAt(3);
	   //Imprime el la posición de la letra indicada
	   int indice = nombre.indexOf("e");
	   
	   Object cuenta = new CuentaAhorro(344, 544);
	   
	  printLine("Despues del metodo: " + nombre);
	  printLine("Caracter encontrado: " + letra);
	  printLine("Indice encontrado: " + indice);
	  printLine(new CuentaAhorro(200, 300));
	   
	   
	

	}
   // Object => es una super clase y cualquier objeto puede ser referenciado por el tipo de Object, ya que es el principal.
	   public static void printLine(Object val) {
		   // toString => ubicación en memoria
		  System.out.println(val.toString());
	   }
}
