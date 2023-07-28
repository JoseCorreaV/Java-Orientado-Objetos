package com.herencias_interfaces.Modelo;

// las interfaces no pueden ser extendidas deben ser implments
// sin embargo una clase puede tener un extends de la clase padre y un implements de interface - Revisar Cliente.java
public class Cliente implements FuncionarioAuth{

	private String nombre;
	private String documento;
	private String telefono;
	
	private AutenticacionUtil util;
	
	private String sexo;
	
	public Cliente() {
		this.util = new AutenticacionUtil();
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDocumento() {
		return documento;
	}
	
	
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	
	public String getTelefono() {
		return telefono;
	}
	
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNombre() {
		return this.nombre;
	}


	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}
	
	@Override
	public void setClave(String clave) {
		this.setClave(clave);
		
	}
	
	
}
