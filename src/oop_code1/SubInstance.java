package oop_code1;
/* 
 * 子类对象实例化的全过程
 * 
 * 1.从结果上来看: (继承性)
 * 		子类继承了父类以后，子类就获得了父类中声明的属性或方法。
 * 		创建子类的对象后，在堆空间中，就会加载所有父类中声明的属性。
 * 2.从过程来看:
 * 		当我们通过子类的构造器创建子类对象时，我们一定会直接或间接的调用其父类的构造器，
 *      进而调用父类的父类的构造器，直到调用了java.lang.Object类中的空参构造器为止。
 *      正因为在堆空间中加载过所有父类的结构，所以才可以看到内存中有父类的结构，
 *      子类对象才可以考虑调用。
 *      
 * 明确:虽然在创建子类对象时，调用了父类的构造器，但自始至终只创建过一个对象，即为new的子类对象。
 * */
public class SubInstance {

}
