package exception_code;
/*
 * >Error: Java������޷�������������⡣ ��:JVMϵͳ�ڲ�������Դ�ľ������ش���
 * 			����: StackOverflowError��OOM��
 * һ�㲻��д����ԵĴ�����д���
 * */
public class ErrorTest {
	public static void main(String[] args) {
		//1.ջ���: java.lang.StackOverflowError
//		main(args);
		//2.�����: java.lang.OutOfMemoryError: Java heap space
		Integer[] arr=new Integer[1024*1024*1024];
	}
}
