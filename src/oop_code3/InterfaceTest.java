package oop_code3;
/*
 * �ӿڵ�ʹ��
 * 1.�ӿ�ʹ��interface�����塣
 * 2.��Java�У���ͽӿ��ǲ��е������ṹ��
 * 3.��ζ���ӿ�: ����ӿ��еĳ�Ա
 * 		3.1 JDK7����ǰ: ֻ�ܶ���ȫ�ֳ����ͳ��󷽷�
 * 			>ȫ�ֳ���: public static final��,������дʱ������ʡ�Բ�д��
 * 			>���󷽷�: public abstract��
 * 		3.2 JDK8 :���˶��徲̬�����ͳ��󷽷�֮�⣬�����Զ��徲̬������Ĭ�Ϸ�����
 * 
 * 
 * 4. �ӿ����ǲ��ܶ��幹�����ģ���ζ�Žӿڲ��ܱ�ʵ����
 * 5. Java�����У��ӿ�ͨ������ȥʵ��(implements)�ķ�ʽ��ʹ��
 * 		���ʵ���า���˽ӿ��е����г��󷽷������ʵ����Ϳ���ʵ������
 * 		���ʵ����û�и��ǽӿ������еĳ��󷽷������ʵ������Ϊһ�������ࡣ
 * 
 * 6. Java�����ʵ�ֶ���ӿ� --->�ֲ���Java���̳��Եľ�����
 * 		��ʽ: class AA extends BB implement CC,DD,EE...
 * 7. �ӿ���ӿ�֮����Լ̳У����ҿ��Զ�̳С�
 ***********************************
 * 8. �ӿڵľ���ʹ��:���ֶ�̬��
 * 9. �ӿڣ�ʵ���Ͽ��Կ���һ�ֹ淶��
 * 
 * �ӿڵ�Ӧ��
 * 1. ����ģʽ
 * 		����ģʽ��Java������ʹ�ý϶��һ��ģʽ��
 * 		������ƾ���Ϊ���������ṩһ�ִ����Կ��ƶ��������ķ��ʡ�
 * 2. ����ģʽ
 * 		ʵ���˴�����������ߵķ��룬������������ľ�����̸����������ﵽ�������Ե�Ŀ�ġ�
 *   ������: ������ͽӿ�����Щ��ͬ��
 *   	��ͬ��:  �ٶ�����ʵ����
 *   			 �ڶ����Ա��̳�
 *   			 �۶����Զ�����󷽷�
 *   	��ͬ��: �ٳ�����: �й�����  �ӿ�: ����������������
 *   		    ����: ���̳��ԣ��ӿ�: ��̳��ԡ�
 *   			������ӿ�: ��ʵ��
 *   
 *  ����ӿڱ��: 
 *  	������Ӧ�ó����У����õĽṹ����JDBC�ж���Ľӿڣ��������ĳһ�����ݿ���峧�̵�API
 * */
public class InterfaceTest{
	public static void main(String[] args) {
		System.out.println(Flyable.MAX_SPEED);
		System.out.println(Flyable.MIN_SPEED);
//		Flyable.MIN_SPEED=2;//The final field Flyable.MIN_SPEED cannot be assigned
		
		Plane plane =new Plane();
		plane.fly();
	}
}
class Plane implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("ͨ���������");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("��ʻԱ����ֹͣ��");
	}
	
}
abstract class Kite implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	
}
interface Flyable{
	//ȫ�ֳ���
	public static final int MAX_SPEED=7900;//��һ�����ٶ�
    int MIN_SPEED=1;//ʡ���� public static final
    
    //���󷽷�
    public abstract void fly();
    void stop();//ʡ���� public abstract
    //Interfaces cannot have constructors
//    public Flyable() {
//    	
//    }
    
}
interface Attackable{
	void attack();
}
class Bullet extends Object implements Flyable,Attackable,CC{

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
	
}
//********************************
interface AA_{
	void method1();
}
interface BB_{
	void method2();
}
interface CC extends AA_,BB_{
	
}