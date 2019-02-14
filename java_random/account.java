package abc;
import java.util.Scanner;

class account1 {
	public int balance;
	public static int accno=0;
	public String name;
	public account1( String b, int c)
	{
		accno++;
		 name=b;
		balance=c;
	}
	public void withdraw()
	{
		System.out.println("Enter amount :");
		Scanner x=new Scanner(System.in);
		int m=x.nextInt();
		balance=balance-m;
		System.out.println("New balance :"+balance);
		
	}
	public void deposit()
	{
		System.out.println("Enter amount :");
		Scanner x=new Scanner(System.in);
		int m=x.nextInt();
		balance=balance+m;
		System.out.println("New balance :"+balance);
		
	}
	public void display(){
		System.out.println("Name "+ name +"\n Account number "+ accno +"\n Balance"+balance);
		
	}
}
public class account
{
	public static void main (String[] args)
	{
		char n='y';
		while(n=='y')
		{
			Scanner y=new Scanner(System.in);
			System.out.println("Enter name and balance");
			String b=y.next();
			int c=y.nextInt();
			account1 a=new account1(b,c);
			a.display();
			char o='y';
			while(o=='y')
			{
				System.out.println("Enter operation : \n 1:Withdraw \n 2:Deposit \n 3:Exit");
				int p=y.nextInt();
				if (p==1)
					a.withdraw();
				else if (p==2)
					a.deposit();
				else
					break;
				System.out.println("Do you want to enter another operation? \n");
				o=y.next().charAt(0);
				
				
			}
			System.out.println("Do you want to  create new account?");
			
			n=y.next().charAt(0);
			
		}
	}
}
