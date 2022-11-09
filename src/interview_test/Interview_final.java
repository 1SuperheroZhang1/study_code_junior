package interview_test;

public class Interview_final {
	//1.
//	public int addOne(final int x) {
////		return ++x;//err
//		return x+1;
//	}
	//2.
	public void addOne(final Other o) {
		//o=new Other();//err - The final local variable o cannot be assigned. It must be blank and not using a compound assignment
		o.i++;
	}
//	public static void main(String[] args) {
//		Other o=new Other();
//		new Interview_final().addOne(o);
//	}
		public static void main(String[] args){
		    int[] a={2,4,6,8,3,6,9,12};
		    doSomething(a,0,a.length-1);
		    for(int i=0;i<=a.length-1;i++)
		    System.out.print(a[i]+" ");
		} 
		private static void doSomething(int[] a,int start,int end){
		    if(start<end){
		        int p=core(a,start,end);
		        doSomething(a,start,p-1);
		        doSomething(a,p+1,end);
		    }
		}
		private static int core(int[] a,int start,int end)
		{
		    int x=a[end];
		    int i=start;
		    for(int j=start;j<=end-1;j++){
		        if(a[j]>=x){
		            swap(a,i,j);
		            i++;
		        }
		    }
		    swap(a,i,end);
		    return i;
		} 
		 
		private static void swap(int[] a,int i,int j) 
		{
		    int tmp=a[i];
		    a[i]=a[j];
		    a[j]=tmp;
		}
		 
}
class Other{
	public int i;
}

class Order{
	//1.私有化类的构造器
	private Order(){
		
	}
	//2.内部创建类的对象
	//4.要求此对象也必须声明为static的
	private static Order instance=new Order();
	//3.提供公共的静态方法，返回当前类的对象
	public static Order getInstance() {
		return instance;
	}
}