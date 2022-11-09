package oop_code4;
/*
 * 开发中局部内部类的使用
 * */
public class InnerClassTest1 {
	
	
	//开发中很少见
	public void method1() {
		//方法内内部类
		class AA{
			
		}
	}
	//返回了实现Comparable接口的类的对象
	public Comparable getComparable() {
		//创建一个实现了Comparable接口的类
		//方式一: 创建一个实现了Comparable接口的非匿名实现类的匿名对象
//		class MyComparable implements Comparable{
//
//			@Override
//			public int compareTo(Object o) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			
//		}
//		return new MyComparable();
		//方式二: 创建一个实现了Comparable接口的匿名类的匿名对象
		return new Comparable() {

			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
	}
	
}

