package oop_code3;
/*
 * 抽象类的匿名子类
 * 
 * */
public class Abstract_SubClass {
	public static void main(String[] args) {
		method(new Student());//匿名对象
		Worker worker = new Worker();//非匿名的对象非匿名的类
		method1(worker);
		
		method1(new Worker());//非匿名的类匿名的对象
		
		//创建一个匿名子类的对象
		_Person_ p=new _Person_() {

			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("吃东西");
			}

			@Override
			public void breath() {
				// TODO Auto-generated method stub
				System.out.println("好好呼吸");
			}
			
		};
		System.out.println("******************************");
		method1(p);
		System.out.println("******************************");
		method1(new _Person_() {

			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("吃好吃的东西");
			}

			@Override
			public void breath() {
				// TODO Auto-generated method stub
				System.out.println("好好呼吸新鲜空气");
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
