package oop_exer;

public class Person_{
	private int age;
	public void setAge(int a) {
		if(a<0||a>130) {
			throw new RuntimeException("传入的数据非法！");
		}else {
			age=a;
		}
	}
	public int getAge() {
		return age;
	}
}
