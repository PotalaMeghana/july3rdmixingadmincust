package eStoreProduct.DAO.customer;

import java.sql.Timestamp;
import java.util.List;

import eStoreProduct.model.customer.input.orderModel;
import eStoreProduct.utility.ProductStockPriceForCust;

public interface OrderDAO {
	void insertOrder(orderModel order);

	List<orderModel> getAllOrders();

	List<orderModel> loadOrdersByDate(Timestamp startDate, Timestamp endDate);

	void updateOrderProcessedBy(Long orderId, Integer processedBy);

	void updateOrderShipmentStatus(int orderId, String status);

	void insertIntoOrders(orderModel or, List<ProductStockPriceForCust> al);

}