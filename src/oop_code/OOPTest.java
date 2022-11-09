package oop_code;
/* 一、Java面向对象的三条主线:
 * 1.Java类及类的成员:属性、方法、构造器;代码块、内部类
 * 2.面向对象的三大特征:封装性、继承性、多态性(抽象性)
 * 3.其他关键字:this、super、static、final、abstract、interface、package、import等
 * 二、"人把大象装进冰箱"
 * 1.面向过程:强调的是功能行为，以函数为最小单位，考虑怎么做。
 * 
 * ①把冰箱门打开
 * ②抬起大象，塞进冰箱。
 * ③把冰箱门关闭
 * 2.面向对象:强调了具备功能的对象，以类/对象为最小单位，考虑谁来做。
 * 
 * 人{
 * 		打开(冰箱){
 * 			冰箱.开开();
 * 		}
 * 		抬起(大象){
 * 			大象.进入(冰箱);
 * 		}
 * }
 * 冰箱{
 * 		开开(){
 * 			
 * 		}
 * 		闭合(){
 * 
 * 		}
 * }
 * 大象{
 * 		进入(冰箱){
 * 
 * 		}
 * }
 * 三、Java语言的两个基本要素:类和对象
 * 	类:是对一类事物的描述，是抽象的，概念上的定义
 * 对象:是实际存在的该类事物的每个个体，因而也称为实例(instance)
 * >面向对象程序设计的重点就是设计类。
 * >设计类，就是设计类的成员。
 * 四、JVM内存结构 ---<<JVM规范>>
 *  编译完源程序后，生成一个或多个字节码文件。
 *  我们使用JVM中的类的加载器和解释器对生成的字节码文件进行解释运行。
 *  意味着，需要将字节码文件对应的类加载到内存中，涉及到内存解析。
 *  虚拟机栈:即为平时提到的栈。 我们将局部变量存储到栈结构中
 *  堆，我们将new出来的结构(比如:数组、对象)，加载在堆空间中。
 *  补充:对象的属性(非static的)加载在堆空间中。
 *  方法区:类的加载信息、常量池、静态域。
 * */
public class OOPTest {

}
