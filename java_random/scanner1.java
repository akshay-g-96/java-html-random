package abc;

import java.util.Scanner;

class scanner2 {
	public float x;
	public int d;
	public float e;
	public void values()
	{
		System.out.println("Enter a character, string, integer, float and a long value \n");
		Scanner a=new Scanner(System.in);
		if(a.hasNext())
		{char b=a.next().charAt(0);
		System.out.println(b);
		}
		if(a.hasNext())
		{String c=a.next();
		System.out.println(c);
		}
		if(a.hasNextInt())
		{d=a.nextInt();
		System.out.println(d);
		}
		if(a.hasNextFloat())
		{ e=a.nextFloat();
		System.out.println(e);
		}
		if(a.hasNextLong())
		{long f=a.nextLong();
		System.out.println(f);
		}
		x=((float)d+e);
	}
	

}

public class scanner1
{
	public static void main (String[] args)
	{
		scanner2 z=new scanner2();
		z.values();
		System.out.println("Sum of int and float is \t"+ z.x);
	}
}