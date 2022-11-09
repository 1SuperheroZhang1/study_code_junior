package exception_code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

/*
 * �쳣�Ĵ���
 *  �쳣�������һ:
 *  	> Java�ṩ�����쳣�����ץ��ģ��
 *  	> Java�����ִ�й�������������쳣��������һ���쳣����󣬸��쳣���󽫱��ύ��Java����ʱ
 *  	  ϵͳ��������̳�Ϊ�׳�(throw)�쳣
 *  	> �쳣���������
 *  		>��������Զ����ɣ��������й����У��������⵽�����������⣬����ڵ�ǰ������û���ҵ�
 *  		 ��Ӧ�Ĵ�����򣬾ͻ��ں�̨�Զ�����һ����Ӧ�쳣���ʵ�������׳��������� �Զ��׳���
 *  		> �ɿ�����Ա�ֶ�����: Exception exception=new ClassCastException();
 *  		  �������� �����õ��쳣�����׳��Գ���û���κ�Ӱ�죬�ʹ���һ����ͨ����һ����
 *  
 * һ���쳣�Ĵ���: ץ��ģ��
 * 	  ����һ: "��": ����������ִ�еĹ����У�һ�������쳣���ͻ����쳣���봦������Ӧ���쳣����
 * 					�����˶����׳���
 * 					һ���׳������Ժ����Ĵ��벻��ִ�С�
 * 
 * 				�����쳣����Ĳ���:�� ϵͳ�Զ����ɵ��쳣����
 * 								  �� �ֶ�������һ���쳣���󣬲��׳�(throw)
 * 
 *    ���̶�: "ץ": �������Ϊ�쳣�Ĵ���ģʽ: �� try-catch-finally �� throws
 * ����try-catch-finally�Ĵ���
 * 	try{
 * 		//���ܲ����쳣�Ĵ���
 * }catch(�쳣����1 ������1){
 * 		//�����쳣�ķ�ʽ1
 * }catch(�쳣����2 ������2){
 * 		//�����쳣�ķ�ʽ2
 * }catch(�쳣����3 ������3){
 * 		//�����쳣�ķ�ʽ3
 * }
 * ....
 * finally{
 * 		//һ����ִ�еĴ���
 * }
 * 
 * ˵��:
 *   1. finally�ǿ�ѡ�ġ�
 *   2. ʹ��try�����ܳ����쳣�Ĵ����װ��������ִ�й����У�һ�������쳣���ͻ��Ӧ����һ���쳣�����
 *      ���ݴ˶�������ͣ�ȥcatch�н���ƥ��
 *   3. һ��try�е��쳣����ƥ�䵽ĳһ��catchʱ���ͽ���catch�н����쳣����һ��������ɣ���������ǰ��
 *      try-catch�ṹ(��û��дfinally�������)������ִ�����Ĵ���
 *   4. catch�е��쳣���ͣ����û���Ӹ����ϵ������λ�ò���Ҫ��
 *      catch�е��쳣���ͣ���������Ӹ����ϵ����Ҫ������һ�������ڸ�������档���򣬱���
 *   5. ���õ��쳣������ʽ:
 *   	��String getMessage();
 *   	��printStackTrace();
 *   6. ��try�ṹ�������ı������ڳ���try�ṹ�Ժ󣬾Ͳ����ٱ������ˡ�
 *   7. try-catch-finally�ṹ����Ƕ�ס�
 *   
 *  ���1: ʹ��try-catch-finally�������ʱ�쳣��ʹ�ó����ڱ���ʱ�Ͳ��ٱ���������ʱ�Կ��ܱ���
 *         �൱������ʹ��try-catch-finally��һ������ʱ���ܳ��ֵ��쳣���ӳٵ�����ʱ���֡�
 *  ���2: �����У���������ʱ�쳣�Ƚϳ�������������ͨ���Ͳ��������ʱ�쳣��дtry-catch-finally��
 *         ����ڱ���ʱ�쳣��һ��Ҫ�����쳣�Ĵ���
 * */
public class ExceptionTest1 {
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
	public void test1() {
		String str="123";
		str="abc";
		int num=0;
		try {
			 num=Integer.parseInt(str);
			System.out.println("hello----------1");
		}catch(NullPointerException e) {
			System.out.println("���ֿ�ָ���쳣�ˣ���Ҫ�ż�...");
		}catch(NumberFormatException e) {
//			System.out.println("������ֵת���쳣�ˣ���Ҫ�ż�...");
//			String getMessage();
//			System.out.println(e.getMessage());
			//printStackTrace();
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("�����쳣�ˣ���Ҫ�ż�...");
		}
		System.out.println(num);
		System.out.println("hello----------2");
	}
}
