package oop_code2;

import org.junit.jupiter.api.Test;

/*
 * Java�е�JUnit��Ԫ����:
 * ���裺
 * 1.ѡ�е�ǰ���� - �Ҽ�ѡ�� - build path - addLibraries -JUnit 4 - ��һ��
 * 2.����Java�࣬���е�Ԫ���ԡ�
 *   ��ʱ��Java��Ҫ��: 
 *       �ٴ����ǹ����ġ�
 *       �ڸ���Ҫ�ṩһ���������޲εĹ�������
 *3.�ڴ�����������Ԫ���Է�����
 *	 ��ʱ�ĵ�Ԫ���Է���: ������Ȩ����public,û�з���ֵ,û���β� 
 *   һ�㷽����Ϊ testXXX()
 *4.�˵�Ԫ���Է����ϣ���Ҫ����һ��ע��: @Test,���ڵ�Ԫ�������е���:
 *5.�����õ�Ԫ���Է����Ժ󣬾Ϳ����ڷ������ڲ�����ش��롣
 *6.д������Ժ����˫�������� - �Ҽ�RunAs - JUnit Test
 *
 *˵��:
 *	1.���ִ�н��û���쳣:������
 *  2.���ִ�н�������쳣:���ֺ�����
 * */
public class JUnitTest {
	@Test
	public void testEquals() {
		String s1="MM";
		String s2="MM";
		System.out.println(s1.equals(s2));
		show();
	}
	public void show() {
		System.out.println("show()...");
	}
}
