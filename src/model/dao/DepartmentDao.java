package model.dao;

import java.util.List;

import model.entities.Departament;

public interface DepartmentDao {

	void insert(Departament obj);
	void update(Departament obj);
	void deleByIde(Integer id);
	//responsável por verificar se existe aquele ID no BD
	Departament findById(Integer id);
	List<Departament> findAll();
}
