package oop_code;
/*
 * 总结:属性赋值的先后顺序
 * 
 * ①默认初始化
 * ②显式初始化
 * ③构造器赋值
 * ④通过"对象.属性"或"对象.方法"的方式，赋值
 * 
 * 以上操作的先后顺序:①-②-③-④
 * */
public class FieldSummary {
	public static void main(String[] args) {
		Field f=new Field(2);
		f.setAge(3);
		System.out.println(f.age);
	}
}
class Field{
	String name;
	int age=1;
	
	public Field(int a) {
		age=a;
	}
	public void setAge(int a) {
		age=a;
	}
}
