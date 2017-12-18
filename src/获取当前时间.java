import java.util.Date;



public class 获取当前时间 {
public static void main(String[] args) {
	Date date = new Date();
	String s= String.format("%te", date);//获取当月的天数
	String a= String.format("%tb", date);//获取当前月份
	String b= String.format("%tH", date);//获取小时
	String c= String.format("%tM", date);//获取秒
	
	String d= String.format("%tF", date);//获取年月日
	String e = String.format("%tT", date);//获取时分
	System.out.print("现在时间是：     ");
	System.out.println(a+s+" "+b+":"+c);
	System.out.println(d+"  "+e);
	 
	
	
	
}
}
