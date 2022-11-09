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
//			System.out.println("您输入的数据非法！");
			//手动的抛出异常对象
//			throw new RuntimeException("您输入的数据非法！");
//			throw new Exception("您输入的数据非法！");
			throw new MyException("不能输入负数！");
		}
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
	
}