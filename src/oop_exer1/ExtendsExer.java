package oop_exer1;
/* ��ϰ1
 * 1.(1)����һ��Mankind�࣬����
 * 	  >��Ա���� int sex��int salary;
 *    >���� void manOrWoman(): ����sex��ֵ��ʾ"man"(sex==1)����"woman"(sex==0)
 *    >���� void exployeed(): ����salary��ֵ��ʾ"no job"(salary==0)����"job"(salary!=0)
 * (2)������Kids��̳�Mankind�࣬����
 *    >��Ա���� int yearsOld;
 *    >���� printAge()��ӡyearsOld��ֵ
 * (3)������ExtendsExer�������main������ʵ����Kids�Ķ���someKid���øö�������丸��ĳ�Ա����������
 * */
/* ��ϰ2
 * �޸���ϰ1(2)�ж������Kids����Kids�����¶���exployeed()������
 * ���Ǹ���Mankind�ж����exployeed()������
 * ���"Kids should study and no jobs."
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
	private int sex;//�Ա�
	private int salary;//����
	
	
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