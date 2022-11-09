package oop_exer;

public class Bank_ {
	private Customer_[] customer;//存放多个客户的数组
	private int numberOfCustomer;//记录客户的个数
	
	public Bank_() {
		customer=new Customer_[10];
	}
	//添加客户
	public void addCustomer(String f,String l) {
		Customer_ cust=new Customer_(f,l);
//		customer[numberOfCustomer]=cust;
//		numberOfCustomer++;
		//或
		customer[numberOfCustomer++]=cust;
	}
	//获取客户的个数
	public int getNumOfCustomers() {
		return numberOfCustomer;
	}
	//获取指定位置的客户
	public Customer_ getCustomers(int index) {
		if(index>=0 &&index<numberOfCustomer) {
			return customer[index];
		}
		
		return null;
	}
}
