package abc
import java.io.*;


public class student {
	static int count=0;
	public static student()
	{
		
	}
	public static student (int x, String y, int z)
	{
		int rollno=x;
		String name=y;
		int percent=z;
		
		count++;
	}
	public void display()
	{
		//System.out.println("Roll.no "+rollno+"\n Name "+name+"\n Percent "+percent);
	}
	public static void main (String[] args)
	{
		student s1(1, akshay, 99);
		System.out.println("object "+count+" created \n");
		student s2(2, bhanu, 99);
		System.out.println("object "+count+" created \n");
		s1.display();
		s2.display();
		
	}
	

}
