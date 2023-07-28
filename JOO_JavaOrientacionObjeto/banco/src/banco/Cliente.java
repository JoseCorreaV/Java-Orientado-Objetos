package banco;

public class Cliente {

	private String nombre;
	private String documento;
	private String telefono;
	private String sexo;
	
	

	
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
	

	
	
}
