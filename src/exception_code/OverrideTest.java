package exception_code;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * ������д�Ĺ���֮һ:
 *   ������д�ķ����׳����쳣���Ͳ����ڸ��౻��д�ķ����׳����쳣����
 * 
 * */
public class OverrideTest {
	public static void main(String[] main) throws IOException {
		OverrideTest test=new OverrideTest();
		test.display(new SubClass());
	}
	public void display(SuperClass s) throws IOException {
		try {
			s.method();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class SuperClass{
	
	public void method()throws IOException {
		
	}
}
class SubClass extends SuperClass{
	public void method() throws FileNotFoundException{
		
	}
}