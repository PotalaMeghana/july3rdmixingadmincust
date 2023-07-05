package eStoreProduct.DAO.customer;

import java.util.List;

import eStoreProduct.model.customer.input.stockSummaryModel;



public interface stockSummaryDAO {
	/* public List<Object[]> fetchStockSummary(); */

	public List<stockSummaryModel> getStocks();

	public void updateStocks(int prodid, String imageurl, int gstcid, int reorderlevel, int updatedstock, double mrp);
}