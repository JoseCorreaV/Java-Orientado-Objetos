package com.herencias_interfaces.Modelo;
/*Podemos extender solo una clase abstracta, pero podemos implementar varias interfaces.
 * 
 * Todos los métodos de una interfaz son abstractos, los de una clase abstracta pueden no serlo.
 * 
 * */


//interface no puede haber metodos con contenidos
// interface permite el poliformismo sin herencia
public interface FuncionarioAuth  {

	
	public void setClave (String clave);/* {
		this.clave = clave;
	}*/
	
	public boolean iniciarSesion(String clave); /* {
		return clave == "java";
	}*/

}
