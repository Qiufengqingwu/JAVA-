import java.util.Date;



public class ��ȡ��ǰʱ�� {
public static void main(String[] args) {
	Date date = new Date();
	String s= String.format("%te", date);//��ȡ���µ�����
	String a= String.format("%tb", date);//��ȡ��ǰ�·�
	String b= String.format("%tH", date);//��ȡСʱ
	String c= String.format("%tM", date);//��ȡ��
	
	String d= String.format("%tF", date);//��ȡ������
	String e = String.format("%tT", date);//��ȡʱ��
	System.out.print("����ʱ���ǣ�     ");
	System.out.println(a+s+" "+b+":"+c);
	System.out.println(d+"  "+e);
	 
	
	
	
}
}
