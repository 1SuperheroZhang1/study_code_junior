package exception_code;
/*
 * �Զ����쳣��
 * 		����Զ����쳣�ࣿ
 * 			1.�̳������е��쳣�ṹ:RuntimeException,Exception
 * 			2.�ṩȫ�ֳ���:serialVersionUID(���к�)
 * 			3.�ṩ���صĹ�����
 * */
public class MyException extends Exception {
	static final long serialVersionUID = -7034897190745766939L;
	
	public MyException() {
		
	}
	
	public MyException(String msg) {
			super(msg);
	}
}
