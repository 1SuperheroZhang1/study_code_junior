package oop_code;

public class Order_Test {
	public static void main(String[] args) {
		Order_ order=new Order_();
		order.orderDefault=2;
		order.orderPublic=3;
		//出了order类之后，私有的属性不可调用
		//order.orderPrivate=1;//The field Order_.orderPrivate is not visible
		
		order.methodDefault();
		order.methodPublic();
		//出了order类之后，私有的方法不可调用
		//order.methodPrivate();//The method methodPrivate() from the type Order_ is not visible
	}
}
