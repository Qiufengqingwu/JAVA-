import java.util.Random;
import java.util.Scanner;


public class 随机数 {
	public static void main(String[] args) {
		Random r= new Random();
		//50代表产生的随机数是50以内的。
		int a= r.nextInt(50);
		System.out.println(a);
	}
}
  
  

