package com.herencias_interfaces.Modelo;

/**
 * @author JoseCorrea
 *
 */
/**
 * @author JoseCorrea
 *
 */
// abstract => no puede ser instanciada.
public abstract class Funcionario {
	private String nombre;
	private String documento;
	private double salario;
    private int tipo;
	
	
	public Funcionario() {
		
	}

	public Funcionario(String nombre, String documento, double salario) {
		this.nombre = nombre;
		this.documento = documento;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	// solo se utilizan en las casas hija
	// no debe tener implementación o (cuerpo)
	// esto para obligar a las hijas a sobre escribir el metodo
	public abstract double getBonificacion();
	

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	

}
