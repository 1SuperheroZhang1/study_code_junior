package oop_code2;

import java.util.Objects;

public class Person {
	String name;
	int age;
//	int id=1001;
	
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Person() {
	super();
}

	public void eat() {
		System.out.println("人:吃饭");
	}
	public void walk() {
		System.out.println("人:走路");
	}

	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Person other = (Person) obj;
//		return age == other.age && Objects.equals(name, other.name);
//	}
	
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj instanceof Person) {
			Person p=(Person)obj;
			return this.age==p.age&&this.name.equals(p.name);
		}
		return false;
	}
	
}
