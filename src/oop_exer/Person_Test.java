package oop_exer;
/* ��ϰ8
 * 1.�������������ж���������Person_��Person_Test�ࡣ��������:
 *   ��setAge()�����˵ĺϷ�����(0-130),��getAge()�����˵����䡣
 *   ��Person_Test����ʵ����Person_��Ķ���b������setAge()��getAge()���������Java�ķ�װ�ԡ�
 * */
public class Person_Test {
	public static void main(String[] args) {
		Person_ person=new Person_();
		//person.age=1;//���벻ͨ�� --->The field Person_.age is not visible
		person.setAge(10);
		System.out.println("����Ϊ:"+person.getAge());
	}
}
