
package mysql;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		MyDataAcces conexion = new MyDataAcces();
		
		ResultSet resultado;
		
		resultado = conexion.getQuery("select * from alumnos");
		
		
		
		try {
			while(resultado.next()){
				
				System.out.println("nombre: "+ resultado.getObject("Nombre") +  " Edad: "+ resultado.getObject("Edad"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
}
}

