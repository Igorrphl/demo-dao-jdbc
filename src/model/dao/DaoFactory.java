package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	//AQUI ESTÃO TODOS AS OPERAÇÕES ESTÁTICAS PARA OPERAR OS "DAOS"
	
	//Método retorna um tipo da interface, mas internamente ela vai retornar uma implementação
	public static SellerDao createSellerDao() {
				return new SellerDaoJDBC(DB.getConnection());
	}

}
