package lab1;
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

public class MyMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      circle c =new circle();
      c.getdata(2);
      System.out.println(c.area());
      System.out.println(c.cir());
	}

}
