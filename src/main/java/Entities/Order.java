package Entities;

public class Order {

	private String sandwichType;
	private long orderId;

	public Order(long orderId, String sandwichType) {
		this.orderId = orderId;
		this.sandwichType = sandwichType;
	}

	public Order() {

	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getSandwichType() {
		return sandwichType;
	}

	public void setSandwichType(String sandwichType) {
		this.sandwichType = sandwichType;
	}
}
