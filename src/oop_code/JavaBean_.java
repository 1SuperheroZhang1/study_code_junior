package oop_code;
/* 拓展JavaBean
 * JavaBean是一种Java语言写的可重用组件。
 * 所谓JavaBean，是符合如下标准的Java类:
 * 	>类是公共的
 * 	>有一个无参的公共的构造器
 * 	>有属性，且有对应的set、get方法
 * 
 * */
public class JavaBean_ {
	private int id;
	private String name;
	public JavaBean_(){
		
	}
	public void setId(int i) {
		id=i;
	}
	public int getId() {
		return id;
	}
	public void setName(String n) {
		name=n;
	}
	public String getName() {
		return name;
	}
}
