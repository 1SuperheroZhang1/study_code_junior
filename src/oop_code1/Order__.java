package oop_code1;
/* ���4�ֲ�ͬ��Ȩ�����η�
 * 
 * */
public class Order__ {
	private int orderPrivate;
	int orderDefault;
	protected int orderProtected;
	public int orderPublic;
	
	private void methodPrivate() {
		orderPrivate=1;
		orderDefault=2;
		orderProtected=3;
		orderPublic=4;
	}
	void methodDefalut() {
		orderPrivate=1;
		orderDefault=2;
		orderProtected=3;
		orderPublic=4;
	}
	protected void methodProtected() {
		orderPrivate=1;
		orderDefault=2;
		orderProtected=3;
		orderPublic=4;
	}
	public void methodPublic() {
		orderPrivate=1;
		orderDefault=2;
		orderProtected=3;
		orderPublic=4;
	}
}
