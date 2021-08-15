package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.vo.Requerimiento_1;
import util.jdbcUtilities;

public class Requerimiento_dao {
	
	public ArrayList<Requerimiento_1> requerimiento1() throws SQLException{
		
		ArrayList<Requerimiento_1> respuesta = new ArrayList<Requerimiento_1>(); //porque esta notacion al final ()??
		Connection conn = jdbcUtilities.getConnection();
		try {
			
			String consulta = "SELECT c.Fecha, c.ID_Compra, c.Proveedor, c.Pagado "
							+ "FROM compra c ORDER BY c.ID_Compra DESC LIMIT 10";
			PreparedStatement stmt = conn.prepareStatement(consulta);
			ResultSet rs = stmt.executeQuery();
			
			//recorrer los registros en los VO especificos...
			while(rs.next()) {
				
				Requerimiento_1 requerimiento_1 = new Requerimiento_1();
				requerimiento_1.setFechaCompra(rs.getString("Fecha"));
				requerimiento_1.setCodCompra(rs.getInt("ID_Compra"));
				requerimiento_1.setNombreProveedor(rs.getString("Proveedor"));
				requerimiento_1.setPagado(rs.getString("Pagado"));
				respuesta.add(requerimiento_1);
			}
			stmt.close();
			rs.close();
			
			}
		catch (SQLException e){
			System.out.println("Error de consulta Requerimiento_1" + e);
		}
		finally {
			if(conn != null) {
				conn.close();
			}
		}
		return respuesta;
	}

}
