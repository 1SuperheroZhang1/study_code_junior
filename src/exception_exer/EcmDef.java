package exception_exer;
/*
 * ��дӦ�ó���EcmDef.java,���������е�����������Ҫ�������븺�����������������
 * 
 * ���������Ͳ�һ��(NumberFormatException)��ȱ�������в���(ArraysOutOfBoundsException)
 * ��0(ArithmeticException)�����븺��(EcDef�Զ�����쳣)�����쳣����
 * 
 * ��ʾ:
 * 1)������(EcmDef)�ж����쳣����(ecm)�������������ܡ�
 * 2)��main()������ʹ���쳣�����������쳣����
 * 3)�ڳ����У��Զ����Ӧ���븺�����쳣(EcDef)
 * 4)����ʱ���ղ���java EcmDef 20 10 //args[0]="20" args[1]="10"
 * 5)Integer���static����parseInt(String s)��sת���ɶ�Ӧ��intֵ��
 *		��: int a=Integer.parseInt("314");//a=314; 
 * */
public class EcmDef {
	public static void main(String[] args) {
		 try {
			int a = Integer.parseInt(args[0]);
			 int b = Integer.parseInt(args[1]);
			
			 int result=ecm(a,b);
			 System.out.println(result);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch (EcDef e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static int ecm(int a,int b) throws EcDef {
		if(a<0||b<0) {
			throw new EcDef("���ӻ��ĸΪ�����ˣ�");
		}
		return a/b;
	}
}
class EcDef extends Exception{
	static final long serialVersionUID = -3387516993124229948L;
	
	public EcDef() {
		
	}
	public EcDef(String msg) {
		super(msg);
	}
}