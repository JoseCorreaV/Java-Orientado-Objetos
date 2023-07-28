package java_pila_ejecucion;

public class testConexion {

	public static void main(String[] args) throws Exception {
		
		// ejemplo try con recursos
		try(Conexion con = new Conexion()){
			con.leerDatos();
		}catch (IllegalStateException e) {
			System.out.println("Ejecucion catch");
			e.printStackTrace();
		}
		
		/*Conexion con = null;
		// el try puede tener un catch, un finally o puede tener ambas(catch and
		// finally)
		try {
			con = new Conexion();
			con.leerDatos();
		} catch (IllegalStateException e) {
			System.out.println("Recibiendo la exepcion");
			e.printStackTrace();
		} // forzar una ejecución haya o no un try - catch
		finally {
			System.out.println("Ejecucion forzosa con finally");
			// en caso de qu la conexión arroje null
			if (con != null) {
				con.cerrar();
			}
		}*/

	}

}
