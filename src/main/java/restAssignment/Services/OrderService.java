package restAssignment.Services;

import Entities.Order;
import Entities.User;
import restAssignment.Database.MockDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OrderService {

	private Map<Long, User> users = MockDatabase.getUsers();

	public List<Order> getAllOrders(long userId) {
		Map<Long, Order> orders = users.get(userId).getOrders();
		return new ArrayList<Order>(orders.values());
	}

	public Order getOrder(long userId, long orderId) {
		Map<Long, Order> orders = users.get(userId).getOrders();
		return orders.get(orderId);
	}

	public Order addOrder(long userId, Order order) {
		Map<Long, Order> orders = users.get(userId).getOrders();
		order.setOrderId(orders.size()+1);
		orders.put(order.getOrderId(), order);
		return order;
	}

	public Order updateOrder(long userId, Order order) {
		Map<Long, Order> orders = users.get(userId).getOrders();
		if (order.getOrderId() <= 0) {
			return null;
		} else {
			orders.put(order.getOrderId(), order);
			return order;
		}
	}

	public Order deleteOrder(long userId, long orderId) {
		Map<Long, Order> orders = users.get(userId).getOrders();
		return orders.remove(orderId);
	}
}