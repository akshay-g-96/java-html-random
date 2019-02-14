package abc;

 class student1 {
	public static int count=0;
	public  student1()
	{
		
	}
	public  student1 (int x, String y, int z)
	{
		int rollno=x;
		String name=y;
		int percent=z;
		System.out.println("Roll.no "+ rollno +"\n Name "+ name +"\n Percent "+ percent );

		count++;
	}
	public void display()
	{
		
		//System.out.println("Roll.no "+ rollno +"\n Name "+ name +"\n Percent "+ percent );
	}
}
public class student
{
	public static void main (String[] args)
	{
		student1 s;
		student1 s1=new student1(1,"akshay", 99);
		System.out.println("object "+s1.count+" created \n");
		student1 s2=new student1(2,"ganesh", 99);
		System.out.println("object "+s2.count+" created \n");
		s1.display();
		s2.display();
		
	}
	

}
