package eStoreProduct.DAO.customer;

import java.util.List;

import eStoreProduct.model.customer.input.Category;

public interface CategoryDAO {

	public List<Category> getAllCategories();
	boolean addNewCategory(Category catg);
}
