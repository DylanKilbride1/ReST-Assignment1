package Entities;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Entity
@XmlRootElement
public class User {

	//@Id
	//@GeneratedValue(strategy = AUTO)
	private long userId;
	private String userName;
	private long mobileNumber;
	private String addressLine1;
	private int age;
	private Map<Long, Order> orders = new HashMap<Long, Order>();

	public User(long userId, String userName, long mobileNumber, String addressLine1, int age) { /*Do I need to initalize list here?*/
		this.userId = userId;
		this.userName = userName;
		this.mobileNumber = mobileNumber;
		this.addressLine1 = addressLine1;
		this.age = age;
	}

	public User() {
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@XmlTransient
	public Map<Long, Order>getOrders(){
		return orders;
	}

	public void setOrders(Map<Long, Order> orders){
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "User{" +
						"userId=" + userId +
						", userName='" + userName + '\'' +
						", mobileNumber=" + mobileNumber +
						", addressLine1='" + addressLine1 + '\'' +
						", age=" + age +
						'}';
	}
}
