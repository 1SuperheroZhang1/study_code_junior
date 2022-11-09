package oop_exer3;

public class InterfaceExer {

}
interface Filial{
	default void help() { //孝顺的
		System.out.println("老妈，我来救你了");
	}
}
interface Spoony{
	default void help() { //痴情的
		System.out.println("媳妇，别怕，我来了");
	}
}
class Man extends Father implements Filial,Spoony{
	public void help() {
		System.out.println("我该救谁呢？");
		Filial.super.help();
		Spoony.super.help();
	}
}
class Father{
	public void help() {
		System.out.println("儿子，救我媳妇");
	}
}