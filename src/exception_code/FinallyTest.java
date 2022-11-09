package exception_code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

/*
 * try-catch-finally����finally��ʹ��:
 * 1. finally�ǿ�ѡ�ġ�
 * 2. finally����������һ���ᱻִ�еĴ��롣��ʹcatch���г����쳣��try����return��䡢
 *    catch����return���������
 * 3. �����ݿ����ӡ������������������Socket����Դ��JVM�ǲ����Զ��Ļ��յģ�������Ҫ�Լ�
 *    �ֶ��Ľ�����Դ���ͷš���ʱ����Դ�ͷž���Ҫд��finally���С�
 * */
public class FinallyTest {
	@Test
	public void test2() {
		FileInputStream fis=null;
		try {
			File file=new File("test.txt");
			fis = new FileInputStream(file);
			
			int data=fis.read();
			while(data!=-1) {
				System.out.print((char)data);
				data=fis.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null)//�������NullPointerException�쳣
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	@Test
	public void methodTest() {
		method();
	}
	public int method() {
		try {
			int arr[]=new int[10];
			System.out.println(arr[10]);
			return 1;
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			return 2;
		}finally {
			System.out.println("��һ���ᱻִ��");
		}
	}
	@Test
	public void test1() {
		int a=10;
		int b=0;
		try {			
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("�Һ�˧ѽ��������������������~~");
		}
	}
}
