package restAssignment.Resources;

import Entities.Order;
import Entities.User;
import restAssignment.Services.UserService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/users")
public class UserResource {

	UserService userService = new UserService();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@GET
	@Path("/{userId}")
	@Produces(MediaType.APPLICATION_XML)
	public User getUser(@PathParam("userId") long userId) {
		return userService.getUser(userId);
	}

	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public User addUser(User user) {
		return userService.addUser(user);
	}

	@PUT
	@Path("/{userId}")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public User updateUser(@PathParam("userId") long userId, User user) {
		user.setUserId(userId);
		return userService.updateUser(user);
	}

	@DELETE
	@Path("/{userId}")
	@Produces(MediaType.APPLICATION_XML)
	public void deleteUser(@PathParam("userId") long id) {
		userService.removeUser(id);
	}

	@Path("/{userId}/orders")
	public OrderResource getOrderResource() {
		return new OrderResource();
	}
}