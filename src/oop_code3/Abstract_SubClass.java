package oop_code3;
/*
 * ���������������
 * 
 * */
public class Abstract_SubClass {
	public static void main(String[] args) {
		method(new Student());//��������
		Worker worker = new Worker();//�������Ķ������������
		method1(worker);
		
		method1(new Worker());//���������������Ķ���
		
		//����һ����������Ķ���
		_Person_ p=new _Person_() {

			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("�Զ���");
			}

			@Override
			public void breath() {
				// TODO Auto-generated method stub
				System.out.println("�úú���");
			}
			
		};
		System.out.println("******************************");
		method1(p);
		System.out.println("******************************");
		method1(new _Person_() {

			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("�ԺóԵĶ���");
			}

			@Override
			public void breath() {
				// TODO Auto-generated method stub
				System.out.println("�úú������ʿ���");
			}
			
		});
	}
	public static void method1(_Person_ p) {
		p.eat();
		p.breath();
	}
	public static void method(Student p) {
		
	}
}
class Worker extends _Person_{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		
	}
	
}
