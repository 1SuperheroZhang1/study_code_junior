package exception_code;

public class StudentTest {
		public static void main(String[] args) {
			Student s=new Student();
			try {
				s.regist(-1001);
				System.out.println(s);
			} catch (Exception e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
}
class Student{
	int id;
	
	public void regist(int id) throws MyException   {
		if(id>2) {
			this.id=id;
		}else {
//			System.out.println("����������ݷǷ���");
			//�ֶ����׳��쳣����
//			throw new RuntimeException("����������ݷǷ���");
//			throw new Exception("����������ݷǷ���");
			throw new MyException("�������븺����");
		}
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
	
}