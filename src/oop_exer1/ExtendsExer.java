package oop_exer1;
/* 练习1
 * 1.(1)定义一个Mankind类，包括
 * 	  >成员变量 int sex和int salary;
 *    >方法 void manOrWoman(): 根据sex的值显示"man"(sex==1)或者"woman"(sex==0)
 *    >方法 void exployeed(): 根据salary的值显示"no job"(salary==0)或者"job"(salary!=0)
 * (2)定义类Kids类继承Mankind类，包括
 *    >成员变量 int yearsOld;
 *    >方法 printAge()打印yearsOld的值
 * (3)定义类ExtendsExer，在类的main方法中实例化Kids的对象someKid，用该对象访问其父类的成员变量及方法
 * */
/* 练习2
 * 修改练习1(2)中定义的类Kids，在Kids中重新定义exployeed()方法，
 * 覆盖父类Mankind中定义的exployeed()方法。
 * 输出"Kids should study and no jobs."
 * 
 * */
public class ExtendsExer {
	public static void main(String[] args) {
		Kids someKid=new Kids(12);
		someKid.printAge();
		someKid.setSalary(0);
		someKid.setSex(1);
		
		someKid.employeed();
		someKid.manOrWoman();

	}
}
class Mankind{
	private int sex;//性别
	private int salary;//工资
	
	
	public Mankind() {
		//super();
	}
	public Mankind(int sex, int salary) {
		//super();
		this.sex = sex;
		this.salary = salary;
	}

	public void manOrWoman() {
		if(sex==1) {
			System.out.println("man");
		}else if(sex==0) {
			System.out.println("woman");
		}
	}
	public void employeed() {
//		if(salary==0) {
//			System.out.println("no job");
//		}else {
//			System.out.println("job");
//		}
		//
		String jobInfo=(salary==0)?"no job":"job";
		System.out.println(jobInfo);
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
class Kids extends Mankind{
	private int yearsOld;
	
	
	public Kids() {
		//super();
	}

	public Kids(int yearsOld) {
		//super();
		this.yearsOld = yearsOld;
	}

	public void printAge() {
		System.out.println("I am "+yearsOld+" years old.");
	}
	public int getYearsOld() {
		return yearsOld;
	}
	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}
	public void employeed() {
		System.out.println("Kids should study and no jobs.");
	}
}