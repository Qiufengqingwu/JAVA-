
public class 素数 {
 public static void main(String[] args) {
	int i=0,j=0;
	for(i=1;i<=100;i++){
		for(j=2;j<i;j++){
			if(i%j==0){
				break;
			}
		}
		if(j==i){
			System.out.println("找到一个素数"+i);
		}
	}
}
}
