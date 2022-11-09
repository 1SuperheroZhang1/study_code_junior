package oop_exer2;
/*
 * ��дOrder�࣬��int�͵�orderId��String�͵�orderName����Ӧ��getter()��setter()������
 * ���������Ĺ���������д�����equals()������public boolean equals(Object obj){}
 * ���жϲ������е����������Ƿ���ȡ�
 * */
public class EqualsExer {
	public static void main(String[] args) {
		Order order1=new Order(1001,"AA");
		Order order2=new Order(1001,"BB");
		System.out.println(order1.equals(order2));
		
		Order order3=new Order(1001,"BB");
		System.out.println(order2.equals(order3));
	}
}
class Order{
	private int orderId;
	private String orderName;
	
	public Order() {
		super();
	}

	public Order(int orderId, String orderName) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj instanceof Order) {
			Order order=(Order)obj;
//			if(this.orderId==order.orderId&&this.orderName.equals(order.orderName)) {
//				return true;
//			}else {
//				return false;
//			}
			return this.orderId==order.orderId&&this.orderName.equals(order.orderName);
		}
		return false;
	}
	
}