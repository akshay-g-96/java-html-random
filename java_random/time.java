package abc;

class time1 {
    public int hours;
    public int min;
    public int sec;
    public int a;
    public int b;
    public int c;
    public void setdata(int x, int y,int z)
    {
        hours=x;
        min=y;
        sec=z;
    }
    public void display()
    {
        System.out.println("Hours : "+hours+"\nMinutes : "+min+"\nSeconds : "+sec);
        
    }
    public void add(time1 t)
    {
        if(sec+t.sec > 60)
        {
            min=min+1;
            sec= (sec+t.sec-60);
            
        }
        else
        {
            sec= (sec+t.sec);
        }
        if(min+t.min > 60)
        {
            hours=hours+1;
            min= (min+t.min-60);
            
        }
        else
        {
            min= (min+t.min);
        }
            hours=(hours+t.hours);
        
        
    }
}
public class time
{
    public static void main (String[] args){
    time1 t1=new time1();
    time1 t2=new time1();
    t1.setdata(12, 20, 15);
    t2.setdata(1, 15, 10);
    t1.add(t2);
    t1.display();
    }
}