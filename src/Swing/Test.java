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
//	static String name="����ѧԺ";
//}

//class College{
//	String name="����ѧԺ";
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
//	String name="����ѧԺ";
//	void set(String name) {
//		name=name;
//		System.out.println(name);
//	}
//}
//public class Test {
//	public static void main(String[] args) {		
//		College A=new College();
//		A.set("����");//����
//	}
//}

class Xcl implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName()+"ִ��");
		try {
			Thread.sleep(2);
		}catch(Exception e) {
			
		};
	}
}

public class Test{
	public static void main(String[] args) {
		Xcl xc1=new Xcl();
		Thread shaoshuihu=new Thread(xc1,"��ˮ��");
		shaoshuihu.start();
		Xcl xc2=new Xcl();
		Thread diannao=new Thread(xc2);
		diannao.start();
		System.out.println(Thread.currentThread().getName()+"ִ��");
	}
}


//interface shengwu{
//	String name="����";//�ӿ��ж�������г�Ա����(����)���ᱻ����Ϊpublic static final
//	void cry();//�ӿ��е����з�������Ȩ�޾�������Ϊpublic
//	void eat();
//}
//
//class Dog implements shengwu{
//	 void cry() {//Ĭ��Ϊdefault������ʾ����Ϊpublic��ʵ�ֽӿ��ж���ĳ��󷽷�
//		System.out.println("wangwang");
//	}
//	 name="shengwu";//�ӿ��еı����ǳ��������ɸı�
//}