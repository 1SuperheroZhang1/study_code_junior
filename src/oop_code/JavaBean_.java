package oop_code;
/* ��չJavaBean
 * JavaBean��һ��Java����д�Ŀ����������
 * ��νJavaBean���Ƿ������±�׼��Java��:
 * 	>���ǹ�����
 * 	>��һ���޲εĹ����Ĺ�����
 * 	>�����ԣ����ж�Ӧ��set��get����
 * 
 * */
public class JavaBean_ {
	private int id;
	private String name;
	public JavaBean_(){
		
	}
	public void setId(int i) {
		id=i;
	}
	public int getId() {
		return id;
	}
	public void setName(String n) {
		name=n;
	}
	public String getName() {
		return name;
	}
}
