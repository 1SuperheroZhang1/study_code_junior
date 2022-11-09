package exception_code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * �쳣������ƶ�: throws + �쳣����
 * 
 * 1. "throws+�쳣����"д�ڷ�������������ָ��ִ�д˷���ʱ�����ܻ��׳����쳣���͡�
 * 	   һ����������ִ��ʱ�����쳣���Ի����쳣���봦������Ӧ���쳣���󣬴˶�������throws����
 *     �������쳣����ʱ���ͻᱻ�׳����쳣��������Ĵ��룬�Ͳ���ִ�У�
 *     
 * 2. ���: try-catch-finally: �������쳣������ˡ�
 *          throws+�쳣����: ֻ�ǽ��쳣�׸��˷����ĵ����ߡ���û�������Ľ��쳣�������
 * 
 * 3. ���������ѡ��ʹ��try-catch-finally ����ʹ��throws��
 * 		3.1 ��������б���д�ķ���û��throws��ʽ�׳��쳣����������д�ķ���Ҳ����ʹ��throws��
 *          ��ζ�ţ����������д�ķ�����������쳣�������ʹ��try-catch-finally��ʽ����
 *      3.2 ���ִ�еķ����У��Ⱥ��ֵ���������ļ����������⼸�������ǵݽ���ϵִ�еġ�
 *          �����⼸������ʹ��throws�ķ�ʽ���д�����ִ�еķ������Կ���ʹ��try-catch-finally
 *          ��ʽ���д���
 * */
public class ExceptionTest2 {
	public static void main(String[] args) {
		try {
			method2();			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void method2() throws FileNotFoundException, IOException {
		method1();
	}
	public static void method1() throws FileNotFoundException,IOException{
		File file=new File("test.txt");
		FileInputStream fis=new FileInputStream(file);
		
		int data=fis.read();
		while(data!=-1) {
			System.out.print((char)data);
			data=fis.read();
		}
		fis.close();
	}
}
