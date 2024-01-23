package model.dao;

import java.util.List;

import model.entities.Departament;
import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj);
	void update(Seller obj);
	void deleById(Integer id);
	//responsável por verificar se existe aquele ID no BD
	Seller findById(Integer id);
	List<Seller> findAll();
	List<Seller> findByDepartament(Departament departament);
}
