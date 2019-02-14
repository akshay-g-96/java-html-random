/*package abc;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("hugj");
	}

}*/
/*package abc;
import java .util.Scanner;
public class Test {
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
*/
package abc;
import java.util.*;

 class circle{

	public double radius;
public void getdata(double r){
	
	radius=r;

}
public double area()
{
	return (3.14*radius*radius);
}
public double cir()	
{
   return(2*3.14*radius);	
}

}

public class /*MyMain*/ Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      circle c =new circle();
      //
      System.out.println(c.area());
      System.out.println(c.cir());
	}

}

