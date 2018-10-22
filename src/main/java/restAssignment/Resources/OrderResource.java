package restAssignment.Resources;

import Entities.Order;
import restAssignment.Services.OrderService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)

public class OrderResource {

	private OrderService orderService = new OrderService();

	@GET
	public List<Order> getAllOrders(@PathParam("userId") long userId) {
		return orderService.getAllOrders(userId);
	}

	@GET
	@Path("/{orderId}")
	public Order getOrder(@PathParam("userId") long userId, @PathParam("orderId") long orderId) {
		return orderService.getOrder(userId, orderId);
	}

	@POST
	public Order addOrder(@PathParam("userId") long userId, Order order) {
		return orderService.addOrder(userId, order);
	}

	@PUT
	@Path("/{orderId}")
	public Order updateOrder(@PathParam("userId") long userId, @PathParam("orderId") long orderId, Order order) {
		order.setOrderId(orderId);
		return orderService.updateOrder(userId, order);
	}

	@DELETE
	@Path("/{orderId}")
	public void deleteComment(@PathParam("userId") long userId, @PathParam("orderId") long orderId) {
		orderService.deleteOrder(userId, orderId);
	}
}
