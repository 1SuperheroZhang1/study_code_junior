package oop_exer3;

public class InterfaceExer {

}
interface Filial{
	default void help() { //Т˳��
		System.out.println("���裬����������");
	}
}
interface Spoony{
	default void help() { //�����
		System.out.println("ϱ�������£�������");
	}
}
class Man extends Father implements Filial,Spoony{
	public void help() {
		System.out.println("�Ҹþ�˭�أ�");
		Filial.super.help();
		Spoony.super.help();
	}
}
class Father{
	public void help() {
		System.out.println("���ӣ�����ϱ��");
	}
}