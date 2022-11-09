package oop_code;
/* ������������֮һ:��װ�� - ��װ������
 * һ�����������
 *  �����Ǵ���һ����Ķ�������ǿ���ͨ��"����.����"�ķ�ʽ���Զ�������Խ��и�ֵ��
 *  �����ֵ����Ҫ�ܵ����Ե����ݽṹ�ʹ洢��Χ����Լ������֮�⣬û��������Լ������
 *  ���ǣ���ʵ�������У�����������Ҫ�����Ը�ֵ��������������������
 *  ��������Ͳ�������������ʱ���֣�����ֻ��ͨ����������������������ӡ�(����: set/get����)
 *  ͬʱ��������Ҫ�����û���ʹ�� "����.����"�ķ�ʽ�����Խ��и�ֵ������Ҫ����������Ϊ˽�е�(private)
 *  ---> ��ʱ����������ԣ�����������ķ�װ��
 * ������װ�Ե�����
 *  1.���ǽ��������˽�л�(private),ͬʱ���ṩ����(public)�ķ�����ȡ(getXxx)������(setXxx)�����Ե�ֵ
 *  2.�����Ⱪ¶˽�еķ���
 *  3.����ģʽ...(��������˽�л�)
 * ������װ�Ե����֣���ҪȨ�����η�����ϡ�
 * 	1.Java�涨��4��Ȩ�����η�(��С����): private��default(ȱʡ)��protected��public
 *     ���η�	���ڲ�		ͬһ����			��ͬ��������			ͬһ������
 *     private   Yes
 *     ȱʡ		 Yes         Yes
 *     protected Yes         Yes                Yes         
 *     public    Yes         Yes                Yes               Yes
 *  2. 4��Ȩ�����η��������������༰����ڲ��ṹ: ���ԡ����������������ڲ���
 *  3. �����: 4��Ȩ�޶�����������������ڲ��ṹ: ���ԡ����������������ڲ���
 *             ������Ļ���ֻ����ȱʡ��public 
 *   �ܽ��װ��:Java�ṩ��4��Ȩ�����η��������༰����ڲ��ṹ�������༰����ڲ��ṹ�ڱ����õ�ʱ�Ŀɼ��ԵĴ�С��
 * */
public class EncapsulationTest {
	public static void main(String[] args) {
		Animal a=new Animal();
		a.name="���";
		//a.age=1;
		//a.legs=4;//The field Animal.legs is not visible
		
		a.show();
		a.setLegs(6);
		a.show();
	}
}
class Animal{
	String name;
	private int age;
	private int legs;//�ȵĸ���
	//�����Ե�����
	public void setLegs(int l) {
		if(l>=0&&l%2==0) {
			legs=l;
		}else {
			legs=l;
		}
	}
	//�����ԵĻ�ȡ
	public int getLegs() {
		return legs;
	}
	public void eat() {
		System.out.println("�����ʳ��");
	}
	public void show() {
		System.out.println("name="+name+",age="+age+",legs="+legs);
	}
	//�ṩ����age��set��get����
	public void setAge(int a) {
		age=a;
	}
	public int getAge() {
		return age;
	}
}
