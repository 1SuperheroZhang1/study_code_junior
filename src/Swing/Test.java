package Swing;

//class College{
//	String name1;
//	void pp() {
//		String name2;
//		System.out.println(name1);//null
////		System.out.println(name2);
//	}
//}

//class College{
//	static String name="商洛学院";
//}

//class College{
//	String name="商洛学院";
//	static void pp() {
//		int a;
//		for(a=1;a<10;a++) {
//			if(a%2!=0)
//				System.out.println(a);
//			else
//				return;
//		}
//	}
//}

//class College{
//	String name="商洛学院";
//	void set(String name) {
//		name=name;
//		System.out.println(name);
//	}
//}
//public class Test {
//	public static void main(String[] args) {		
//		College A=new College();
//		A.set("商洛");//商洛
//	}
//}

class Xcl implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName()+"执行");
		try {
			Thread.sleep(2);
		}catch(Exception e) {
			
		};
	}
}

public class Test{
	public static void main(String[] args) {
		Xcl xc1=new Xcl();
		Thread shaoshuihu=new Thread(xc1,"烧水壶");
		shaoshuihu.start();
		Xcl xc2=new Xcl();
		Thread diannao=new Thread(xc2);
		diannao.start();
		System.out.println(Thread.currentThread().getName()+"执行");
	}
}


//interface shengwu{
//	String name="生物";//接口中定义的所有成员变量(常量)，会被声明为public static final
//	void cry();//接口中的所有方法访问权限均被声明为public
//	void eat();
//}
//
//class Dog implements shengwu{
//	 void cry() {//默认为default，需显示声明为public，实现接口中定义的抽象方法
//		System.out.println("wangwang");
//	}
//	 name="shengwu";//接口中的变量是常量，不可改变
//}