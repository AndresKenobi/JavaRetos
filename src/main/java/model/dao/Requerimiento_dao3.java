package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.vo.Requerimiento_3;
import util.jdbcUtilities;

public class Requerimiento_dao3 {
	
	public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {

        ArrayList<Requerimiento_3> respuesta = new ArrayList<Requerimiento_3>();
        Connection conn = jdbcUtilities.getConnection();

        try {
            String consulta = "SELECT SUBSTR(l.Nombre,1,3) || SUBSTR(l.Primer_Apellido,1,3) "
                    + "|| SUBSTR(l.Segundo_Apellido,1,3) AS 'Abrev.' "
                    + "FROM Lider l";

            PreparedStatement statement = conn.prepareStatement(consulta);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Requerimiento_3 requerimiento_3 = new Requerimiento_3(rs.getString("Abrev."));
                respuesta.add(requerimiento_3);
            }

            rs.close();
            statement.close();

        } catch (SQLException e) {
            System.err.println("Error en la consulta SQL Requerimiento_3 -> " + e);
        } finally {
            if (conn != null) {
            	conn.close();
            }
        }

        return respuesta;

    }

		
}
