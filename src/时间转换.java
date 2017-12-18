import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.plaf.InputMapUIResource;


public class Ê±¼ä×ª»» {
public static void main(String[] args) throws NumberFormatException, IOException{
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	 String st = bf.readLine();
     String str[]  = st.split(" ");
     long x = Integer.parseInt(str[0]);
     int h = (int)x/3600;
     int m = (int)x%3600/60;
     int s = (int)x%60;
     System.out.println(h+":"+m+":"+s);
}
}
