package oop_exer;
/* 练习8
 * 1.创建程序，在其中定义两个类Person_和Person_Test类。定义如下:
 *   用setAge()设置人的合法年龄(0-130),用getAge()返回人的年龄。
 *   在Person_Test类中实例化Person_类的对象b，调用setAge()和getAge()方法，体会Java的封装性。
 * */
public class Person_Test {
	public static void main(String[] args) {
		Person_ person=new Person_();
		//person.age=1;//编译不通过 --->The field Person_.age is not visible
		person.setAge(10);
		System.out.println("年龄为:"+person.getAge());
	}
}
