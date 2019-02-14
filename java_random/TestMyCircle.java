package abc;
import java.util.*;

import java.lang.*;
public class TestMyCircle
{
    public static void main(String args[])
    {
        myPoint m=new myPoint();
        m.setXY();
                int l[]=new int[2];
        l=m.getXY();
        System.out.println(l[0]+""+l[1]);
        m.distance(1,1);    
        System.out.println(m);
        
        myCircle c=new myCircle(5,6,10);
        System.out.println(c);
    }
}

class myPoint
{
    int x;
    int y;
    
    myPoint()
    {
        System.out.println("default of mypoint class");
        x=0;y=0;
    }

    myPoint(int a,int b)
    {
        x=a;y=b;        
    }

    void setXY()
    {
        System.out.println("enter the values");
        Scanner in=new Scanner(System.in);
        x=in.nextInt();
        y=in.nextInt();
        in.close();
    }

    int[] getXY()
    {
        int a[]=new int[2];
        a[0]=x;
        a[1]=y;
        return a;
    }
    
    public String toString()
    {    
        return String.format( "("+x+","+y+")" );
    }
    
    void distance(int a,int b)
    {
        int d=((this.x-a)*(this.x-a))+((this.y-b)*(this.y-b));
        int c=(int)Math.sqrt(d);
        System.out.println("distance is : "+c);
    }
}

class myCircle extends myPoint
{
    myPoint center=new myPoint();
    int radius;
    myCircle()
    {
        x=0;y=0;
    }
    
    myCircle(int a,int b,int c)
    {
        super(a,b);
        radius=c;
    }
    
    public String toString()
    {    
        return String.format("myCircle[radius="+radius+", center="+super.toString()+"]");
    }
}