package restAssignment.Services;

import Entities.Order;
import Entities.User;
import restAssignment.Database.MockDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserService {

	private Map<Long, User> users = MockDatabase.getUsers();

	public UserService() {
		users.put(1L, new User(1L, "Dylan", 99999997L, "Portmarnock", 21));
		users.put(2L, new User(2L, "John", 99999353L, "Portmarnock", 25));
	}

	public List<User> getAllUsers() {
		return new ArrayList<User>(users.values());
	}

	public User getUser(long id) {
		return users.get(id);
	}

	public User addUser(User user) {
		user.setUserId(users.size() + 1);
		users.put(user.getUserId(), user);
		return user;
	}

	public User updateUser(User user) {
		if (user.getUserId() <= 0) {
			return null;
		} else {
			users.put(user.getUserId(), user);
			return user;
		}
	}

	public User removeUser(long id) {
		return users.remove(id);
	}
}
