package exception_exer;
/*
 * 编写应用程序EcmDef.java,接收命令行的两个参数，要求不能输入负数，计算两数相除。
 * 
 * 对数据类型不一致(NumberFormatException)、缺少命令行参数(ArraysOutOfBoundsException)
 * 除0(ArithmeticException)及输入负数(EcDef自定义的异常)进行异常处理。
 * 
 * 提示:
 * 1)在主类(EcmDef)中定义异常方法(ecm)完成两数相除功能。
 * 2)在main()方法中使用异常处理语句进行异常处理。
 * 3)在程序中，自定义对应输入负数的异常(EcDef)
 * 4)运行时接收参数java EcmDef 20 10 //args[0]="20" args[1]="10"
 * 5)Integer类的static方法parseInt(String s)将s转换成对应的int值、
 *		如: int a=Integer.parseInt("314");//a=314; 
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
			throw new EcDef("分子或分母为负数了！");
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