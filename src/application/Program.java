package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Departament;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== Test 1: Seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== Test 2: Seller findById ===");
		Departament departament = new Departament(2, null);
		List<Seller> list = sellerDao.findByDepartament(departament);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Test 3: Seller findAll ===");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		/*System.out.println("\n=== Test 4: Seller Insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, departament);
		sellerDao.insert(newSeller);
		System.out.println("Inserte! New id = " + newSeller.getId());
		*/
	
		System.out.println("\n=== Test 5: Seller Insert ===");
		//Procurando vendedor de Id = 1
		seller = sellerDao.findById(2);
		//Dando novo nome para o vendedor
		seller.setName("Marta");
		sellerDao.update(seller);
		System.out.println("Atualização feita!");
	
		System.out.println("\n==== Teste 6: Seller Delete ===");
		sellerDao.deleById(5);
		System.out.println("Usuário Excluido com sucesso!");
	}
	
}
