package oop_code1;
/*
 * 方法的重写(override/overwrite)
 * 1.重写: 子类继承了父类以后，可以对父类中同名同参数的方法，进行覆盖操作。
 * 
 * 2.应用: 重写以后，当创建子类对象以后，
 *         通过子类调用子父类中同名同参数的方法时，实际执行的是子类中的重写方法。
 * 3.重写的规定:
 * 			方法的声明: 权限修饰符 返回值类型 方法名(参数列表) throws 异常类型{       
 * 							//方法体;
 * 						}
 * 			约定俗成:子类中的方法是重写方法，父类中的方法是被重写方法。
 *       ①子类重写的方法的方法名和参数列表与父类中被重写的方法的方法名和参数列表相同。
 *       ②子类重写的方法的权限修饰符不小于父类被重写的方法的权限修饰符。
 *       	>特殊情况: 子类不能重写父类中声明为private权限的方法
 *       ③ 返回值类型:
 *       	>如果父类被重写的方法的返回值类型是void，则子类重写的方法的返回值类型只能是void
 *       	>如果父类被重写的方法的返回值类型是A类型，则子类重写的方法的返回值类型可以是A类或A类的子类
 *       	>如果父类被重写的方法的返回值类型是基本数据类型(比如: double)，则子类重写的方法的返回值必须是相同的基本数据类型(必须也是double)
 *       ④ 异常类型:
 *           子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型。
 *    *************************************************************************
 *    子类和父类中的同名同参数的方法，要么都声明为非static的(考虑重写)，要么都声明为static的(不是重写)。       
 * 面试题: 区分方法的重载与重写
 * */
public class OverrideTest {
	public static void main(String[] args) {
		Student_ student=new Student_("计算机科学与技术");
		student.eat();
		student.walk(10);
		
		student.study();
	}
}
class Person____{
	String name;
	int age;
	
	public Person____() {
		
	}
	public Person____(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void eat() {
		System.out.println("吃饭");
	}
	public void walk(int distance) {
		System.out.println("走路，走了"+distance+"公里");
	}
	private void show() {
		System.out.println("我是一个人");
	}
	public Object info() {
		return null;
	}
}
class Student_ extends Person____{
	String major;
	
	public Student_(){
		
	}
	public Student_(String major) {
		this.major=major;
	}
	
	public void study() {
		System.out.println("学习的专业是"+major);
	}
	//对父类中的eat()方法进行了重写
	public void eat() {
		System.out.println("学生应该多吃有营养的食物");
	}
	public void show() {
		System.out.println("我是一个学生");
	}
	public String info() {
		return null;
	}
}
