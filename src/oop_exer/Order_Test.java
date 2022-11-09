package oop_exer;

import oop_code.Order_;

public class Order_Test {
	public static void main(String[] args) {
		Order_ order=new Order_();
		order.orderPublic=3;
		//出了order类所属的包之后，私有的属性、缺省的属性不可调用
		//order.orderDefault=2;//The field Order_.orderDefault is not visible
		//order.orderPrivate=1;//The field Order_.orderPrivate is not visible
		
		order.methodPublic();
		//出了order类所属的包之后，私有的方法、缺省的方法不可调用
		//order.methodDefault();//The method methodDefault() from the type Order_ is not visible
		//order.methodPrivate();//The method methodPrivate() from the type Order_ is not visible
	}
}
