import java.util.Random;
import java.util.Scanner;


public class 猜数字 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你想的数字");
		int a= sc.nextInt();
		System.out.println("你输入的数字为："+a);
		
		int b=1;
		//while(条件)
		while(true){
			Random r =new Random();
			//这 个随机数在50以内
		int x=	r.nextInt(50);
		System.out.println("第"+b+"次，系统产生的随机数为："+x);
		if(a==x){
			System.out.println("恭喜你猜对了，一共猜了"+b+"次");
		break;
		}
		b++;
	}

	}}
