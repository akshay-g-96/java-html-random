package lab1;
import java .util.Scanner;
public class scanner {
 public static void main(String [] args)
 {
	 
	 System.out.println("enter an integer");
	 Scanner m=new Scanner(System.in);
	 int a=0;
	if(m.hasNextInt())
	 {
		 a=m.nextInt();
		 System.out.print(a);
	 }
	 
	 
	 m.close();
	 
 }
	
}
