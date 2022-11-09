package array_code;

/*数组
 * 1.1数组的概述
 * 数组:是多个相同类型数据按一定顺序排列的集合，并使用一个名字命名。
 *     并通过编号的方式，对这些数据进行统一管理。
 *     
 * 1.2数组相关的概念
 * >数组名
 * >数组元素
 * >数组下标、索引
 * >数组长度 - 数组元素的个数
 * 
 * 1.3数组的特点:
 * 1)数组是有序排列的。
 * 2)数组属于引用数据类型的变量。
 *   数组的元素，既可以是基本数据类型，也可以是引用数据类型。
 * 3)创建数组对象会在内存中开辟一整块连续的空间
 * 4)数组的长度一旦确定，就不能修改。
 * 
 * 1.4数组的分类:
 * 1)按照维数:一维数组、二维数组......
 * 2)按照数组元素的类型:基本数据类型元素的数组、引用数据类型元素的数组
 * 
 * 1.5一维数组的使用
 * 1)一维数组的声明和初始化
 * 2)如何调用数组指定位置的元素
 * 3)如何获取数组的长度
 * 4)如何遍历数组
 * 5)数组元素的默认初始化值
 *  	>数组元素是整形:0 byte/short/int
 *      >数组元素是浮点型:0.0 float/double
 *      >数组元素是char型:0或"\u0000",而非'0'
 *      >数组元素是boolean型:false
 *      
 *      >数组元素是引用数据类型:null
 * 6)数组的内存解析
 * */
public class ArrayTest {
	public static void main(String[] args) {
		//1.一维数组的声明和初始化
		int num;//声明
		num=10; //初始化
		int id=1001;//声明+初始化
		//1.1静态初始化:数组的初始化和数组元素的赋值操作同时进行
		int[] ids;//声明
		ids=new int[] {1001,1002,1003,1004};//初始化
		//1.2动态初始化:数组的初始化和数组元素的赋值操作分开进行
		String[] names= new String[5];
		//总结:数组一旦初始化完成，数组的长度确定
		
		//2.如何调用数组指定位置的元素:通过下标的方式调用
		//Java中数组的索引从0开始，到数组的长度-1结束。
		names[0]= "wangming";
		names[1]="wanghe";
		names[2]="zhangxueliang";
		names[3]="wanghongzhi";
		names[4]="songjulong";
		//names[5]="zhouyang";//err - ArrayIndexOutOfBounds - 数组下标越界异常
		
		//3.如何获取数组的长度。
		//属性:length
		System.out.println(names.length);//5
		System.out.println(ids.length);//4
		
		//4.如何遍历数组
//		System.out.println(names[0]);
//		System.out.println(names[1]);
//		System.out.println(names[2]);
//		System.out.println(names[3]);
//		System.out.println(names[4]);
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]+" ");
		}
		System.out.println();
		//5.数组元素的默认初始化值
		int[] arr=new int[4];
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("---------------------------");
		short[] arr1=new short[4];
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("---------------------------");
		float[] arr2=new float[4];
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("---------------------------");
		char[] arr3=new char[4];
		for(int i=0;i<arr3.length;i++) {
			System.out.println("----"+arr3[i]+"****");
		}
		if(arr3[0]==0) {
			System.out.println("你好");
		}
		System.out.println("---------------------------");
		boolean[] arr4=new boolean[4];
		System.out.println(arr4[0]);
		
		System.out.println("---------------------------");
		String[] arr5=new String[5];
		System.out.println(arr5[0]);
		if(arr5[0]==null) {
			System.out.println("北京天气不错!");
		}
		
		//6.数组的内存解析
		
	}
}
