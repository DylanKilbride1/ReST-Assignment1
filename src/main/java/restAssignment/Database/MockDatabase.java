package restAssignment.Database;

import Entities.Order;
import Entities.User;

import java.util.HashMap;
import java.util.Map;

public class MockDatabase {

	private static Map<Long, Order> orders = new HashMap();
	private static Map<Long, User> users = new HashMap();

	public static Map<Long, Order> getOrders() {
		return orders;
	}

	public static Map<Long, User> getUsers() {
		return users;
	}
}
