package oop_exer;

public class Bank_ {
	private Customer_[] customer;//��Ŷ���ͻ�������
	private int numberOfCustomer;//��¼�ͻ��ĸ���
	
	public Bank_() {
		customer=new Customer_[10];
	}
	//��ӿͻ�
	public void addCustomer(String f,String l) {
		Customer_ cust=new Customer_(f,l);
//		customer[numberOfCustomer]=cust;
//		numberOfCustomer++;
		//��
		customer[numberOfCustomer++]=cust;
	}
	//��ȡ�ͻ��ĸ���
	public int getNumOfCustomers() {
		return numberOfCustomer;
	}
	//��ȡָ��λ�õĿͻ�
	public Customer_ getCustomers(int index) {
		if(index>=0 &&index<numberOfCustomer) {
			return customer[index];
		}
		
		return null;
	}
}
