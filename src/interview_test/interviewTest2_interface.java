package interview_test;


interface A{
	int x=0;
}
class B{
	int x=1;
}
class interviewTest2_interface extends B implements A{
	public void pX() {
		//���벻ͨ������Ϊx�ǲ���ȷ��
//		System.out.println(x);//The field x is ambiguous
		System.out.println(super.x);//1
		System.out.println(A.x);//0
	}
	public static void main(String[] args) {
		new interviewTest2_interface().pX();
	}
}