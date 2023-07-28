package com.herencias_interfaces.Modelo;

public class SistemaInterno {
	
	private String clave = "java";
	
	// para no repetir el metodo para cada funcionario.
	public boolean autentica(FuncionarioAuth gerente) 
	{
		boolean InicioSesion = gerente.iniciarSesion(clave);
		if(InicioSesion) {
			System.out.println("Exitoso login");
			return true;
		}else {
			System.out.println("No exitoso.");
			return false;
		}
	}
	
	

}
