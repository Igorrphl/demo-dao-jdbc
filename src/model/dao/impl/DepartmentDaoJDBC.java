package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.DepartmentDao;
import model.entities.Departament;

public class DepartmentDaoJDBC implements DepartmentDao {
	
	private Connection conn;	
	
	public DepartmentDaoJDBC (Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Departament obj) {
		
		PreparedStatement st = null;
		
		try {
			st = conn.prepareStatement(
					"INSERT INTO Department "
					+ "(Name) "
					+ "VALUES "
					+ "(?)"
					, Statement.RETURN_GENERATED_KEYS);
			
			st.setString(1, obj.getName());
			
			int linhasAfetada = st.executeUpdate();
			
			if (linhasAfetada > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					obj.setId(id);
				}
				DB.closeResultSet(rs);
			} else {
				throw new DbException("Erro inesperado, nenhuma linha foi afetada!");
			}
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
		}

	}
	@Override
	public void update(Departament obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Departament findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Departament> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
