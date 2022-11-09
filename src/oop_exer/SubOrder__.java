package oop_exer;

import oop_code1.Order__;

public class SubOrder__ extends Order__ {
	public void method() {
		orderProtected=1;
		orderPublic =2;
		
		methodProtected();
		methodPublic();
		
		//在不同包的子类中，不能调用在Order__类中声明为private和缺省权限的修饰符
//		orderPrivate=3;//The field Order__.orderPrivate is not visible
//		orderDefault=4;//The field Order__.orderDefault is not visible
//		methodPrivate();//The method methodPrivate() from the type Order__ is not visible
//		methodDefault();//The method methodDefault() is undefined for the type SubOrder__
	}
}
