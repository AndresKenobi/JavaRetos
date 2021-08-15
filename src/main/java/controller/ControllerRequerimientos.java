package controller;

import java.sql.SQLException;
import java.util.ArrayList;

import model.dao.Requerimiento_dao;
import model.dao.Requerimiento_dao2;
import model.dao.Requerimiento_dao3;
import model.vo.Requerimiento_1;
import model.vo.Requerimiento_2;
import model.vo.Requerimiento_3;

public class ControllerRequerimientos {

	private final Requerimiento_dao requerimientodao_1 = new Requerimiento_dao();
	private final Requerimiento_dao2 requerimientodao_2 = new Requerimiento_dao2();
	private final Requerimiento_dao3 requerimientodao_3 = new Requerimiento_dao3();

	
	public ArrayList<Requerimiento_1> consultaRequerimiento_1() throws SQLException{
		return this.requerimientodao_1.requerimiento1();
		
	}
	
	public ArrayList<Requerimiento_2> consultaRequerimiento_2() throws SQLException{
		return this.requerimientodao_2.requerimiento2();
		
	}
	
	public ArrayList<Requerimiento_2> consultaRequerimiento_2(String fIni, String fFin, String nCiu) throws SQLException {
        return this.requerimientodao_2.requerimiento2(fIni,fFin,nCiu);
    }
	
	public ArrayList<Requerimiento_3> consultaRequerimiento_3() throws SQLException{
		return this.requerimientodao_3.requerimiento3();
		
	}

	
	
}
