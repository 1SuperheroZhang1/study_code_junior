package oop_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import static java.lang.System.*;
import static java.lang.Math.*;
/*
 * һ��package�ؼ��ֵ�ʹ��
 * package:��
 * 1.Ϊ�˸��õ�ʵ����Ŀ������Ĺ�������˰��ĸ��
 * 2.ʹ��package���������ӿ������İ���������Դ�ļ������С�
 * 3.�����ڱ�ʶ������ѭ��ʶ������������͹淶(xxxyyyzzz)��������֪�⡱��
 * 4.ÿ"."һ�Σ��ʹ���һ���ļ�Ŀ¼��
 * 
 * ����:ͬһ�����£�����������ͬ���Ľӿڡ��ࡣ
 *      ��ͬ�İ��£���������ͬ���Ľӿڡ��ࡣ
 * ��չ:MVC���ģʽ(model,view,controller)
 * 		MVC,���õ����ģʽ֮һ�������������Ϊ3�����:��ͼģ�Ͳ㡢���Ʋ㡢����ģ�Ͳ㡣
 *      ���ֽ��������롢��������ݴ����Լ����ݵ���ʾ�����뿪�������ģʽ��
 *      ʹ����ṹ������������� ��ͬʱҲ�����˳������������ͨ�ŷ�ʽ�������˳��������ԡ�
 * ����import�ؼ��ֵ�ʹ��
 * import:����  
 * 1. ��Դ�ļ�����ʾ��ʹ��import�ؼ��ֵ���ָ�����µ��ࡢ�ӿ�
 * 2. �����ڰ����������������֮��
 * 3. �����Ҫ�������ṹ������д�����ɡ�
 * 4. ����ʹ��"xxx.*"�ķ�ʽ����ʾ���Ե���xxx���µ����нṹ
 * 5. ���ʹ�õ��ࡢ�ӿڣ���java.lang���¶���ģ������ʡ��import�ṹ��
 * 6. ���ʹ�õ��ࡢ�ӿڣ��Ǳ����¶���ģ������ʡ��import�ṹ��
 * 7. �����Դ�ļ��У�ʹ���˲�ͬ���µ�ͬ�����࣬�����������һ������Ҫ��ȫ�����ķ�ʽ��ʽ��
 * 8. ʹ��"xxx.*"�ķ�ʽ���������Ե���xxx���µ����нṹ���������Ҫʹ��xxx�Ӱ��½ṹ��������Ҫ��ʽ���롣
 * 9. import static: ����ָ�����ӿ��еľ�̬�ṹ:���Ի򷽷���
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
