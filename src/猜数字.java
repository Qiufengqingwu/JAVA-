import java.util.Random;
import java.util.Scanner;


public class ������ {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���������������");
		int a= sc.nextInt();
		System.out.println("�����������Ϊ��"+a);
		
		int b=1;
		//while(����)
		while(true){
			Random r =new Random();
			//�� ���������50����
		int x=	r.nextInt(50);
		System.out.println("��"+b+"�Σ�ϵͳ�����������Ϊ��"+x);
		if(a==x){
			System.out.println("��ϲ��¶��ˣ�һ������"+b+"��");
		break;
		}
		b++;
	}

	}}
