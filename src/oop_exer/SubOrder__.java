package oop_exer;

import oop_code1.Order__;

public class SubOrder__ extends Order__ {
	public void method() {
		orderProtected=1;
		orderPublic =2;
		
		methodProtected();
		methodPublic();
		
		//�ڲ�ͬ���������У����ܵ�����Order__��������Ϊprivate��ȱʡȨ�޵����η�
//		orderPrivate=3;//The field Order__.orderPrivate is not visible
//		orderDefault=4;//The field Order__.orderDefault is not visible
//		methodPrivate();//The method methodPrivate() from the type Order__ is not visible
//		methodDefault();//The method methodDefault() is undefined for the type SubOrder__
	}
}
