package oop_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import static java.lang.System.*;
import static java.lang.Math.*;
/*
 * 一、package关键字的使用
 * package:包
 * 1.为了更好地实现项目当中类的管理，提出了包的概念。
 * 2.使用package来声明类或接口所属的包，声明在源文件的首行。
 * 3.包属于标识符，遵循标识符的命名规则和规范(xxxyyyzzz)，“见名知意”。
 * 4.每"."一次，就代表一层文件目录。
 * 
 * 补充:同一个包下，不可以命名同名的接口、类。
 *      不同的包下，可以命名同名的接口、类。
 * 拓展:MVC设计模式(model,view,controller)
 * 		MVC,常用的设计模式之一，将整个程序分为3个层次:视图模型层、控制层、数据模型层。
 *      这种将程序输入、输出、数据处理以及数据的显示，分离开来的设计模式，
 *      使程序结构变得灵活而且清晰 ，同时也描述了程序各个对象间的通信方式，降低了程序的耦合性。
 * 二、import关键字的使用
 * import:导入  
 * 1. 在源文件中显示的使用import关键字导入指定包下的类、接口
 * 2. 声明在包的声明和类的声明之间
 * 3. 如果需要导入多个结构，则并列写出即可。
 * 4. 可以使用"xxx.*"的方式，表示可以导入xxx包下的所有结构
 * 5. 如果使用的类、接口，是java.lang包下定义的，则可以省略import结构。
 * 6. 如果使用的类、接口，是本包下定义的，则可以省略import结构。
 * 7. 如果在源文件中，使用了不同包下的同名的类，则必须至少有一个类需要以全类名的方式显式。
 * 8. 使用"xxx.*"的方式，表明可以调用xxx包下的所有结构。但是如果要使用xxx子包下结构，则仍需要显式导入。
 * 9. import static: 导入指定类或接口中的静态结构:属性或方法。
 * */
public class PackageImportTest {
	public static void main(String[] args) {
		String info=Arrays.toString(new int[] {1,2,3});
		//System.out.println(info);
		ArrayList a=new ArrayList();
		HashMap hash=new HashMap();
		out.println("hello");
		long round=round(123.123);
	}
}
