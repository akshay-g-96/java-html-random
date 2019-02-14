import java.applet.*;
import java.awt.*;
import java.lang.*;
import java.util.Scanner;
import java.awt.event.*;
import java.awt.Graphics2D;
///////////////////////////////////
//class ActionListener{}
//////////////////////////////////


//	class Engine1 extends Applet implements ActionListener 
//{
//	
//	public void init() {
//		Label label1 = new Label("Enter RPM : ");
//
//		textField1 = new TextField();
//
//		Got_It = new Button("Enter");
//		Got_It.addActionListener(this);
//
//		Label label2 = new Label("Enter diesel blend percent :");
//
//		textField2 = new TextField();
//		//textField2.setEditable(false);
//
//		add(label1);
//		add(textField1);
//		add(Got_It);
//		add(label2);
//		add(textField2);
//	}
//
//	public void actionPerformed(ActionEvent e) {
//		//		String temp = textField1.getText();
//		//		textField1.setText(textField2.getText());
//		//		textField2.setText(temp);
//		String str1=textField1.getText();
//		p=Integer.parseInt(str1);
//
//		String str2=textField2.getText();
//		q=Integer.parseInt(str2);
//		//System.out.println(p+q);
//	}
//
//	TextField textField1, textField2;
//	Button Got_It;
//
//}
public class Engine extends Applet implements Runnable 
{ 
	int counter;
	int counter2=180;
	Thread cd;
	double counter1=-3.142/2;
	public static int p,q;
	public static double r;

	public void start() 
	{ // create thread
		System.out.println("Enter RPM ");
		Scanner w=new Scanner(System.in);
		p=w.nextInt();
		System.out.println("\nEnter diesel blend percent");
		q=w.nextInt();
		r=(((Math.pow(0.000039*q+1.7031, 0.000072*q-1.3916))*2*3.142*p/60000));
		counter = 36000;
		cd = new Thread(this);
		cd.start();
	}
	public void stop()
	{ cd = null;}
	public void run() {  // executed by Thread
		while (counter>0 && cd!=null) 
		{
			try{Thread.sleep(50);} 
			catch (InterruptedException e){}
			--counter;
			repaint(); //update screen
		}
	}


	public void paint(Graphics g) 
	{
		//Cylinder

		g.setFont(new Font("TimesRoman", Font.PLAIN, 48)); 		
		g.drawLine(150,25,350,25);
		g.drawLine(150,25,150,475);
		g.drawLine(350,25, 350, 475);

		//Connecting Rod

		int a=(int)(250+150*Math.cos(counter1));
		int b=(int)(750-150*Math.sin(counter1));
		int c=(int)(100+150*(1-Math.cos(counter1-3.142/2)+Math.pow(Math.sin(counter1-3.142/2), 2)/6));

		//Piston

		g.drawRect(153, c-25 , 194, 50);

		//Crank

		g.drawOval(50, 550, 400, 400);

		//Chart

		g.setColor(Color.red);
		g.fillRect(615,25 , 195, 100);
		g.setColor(Color.magenta);
		g.fillRect(600,25 , 15, 100);
		g.fillRect(1295,25 , 25, 100);
		g.setColor(Color.blue);
		g.fillRect(1115,25 , 200, 100);
		g.setColor(Color.yellow);
		g.fillRect(985,25 , 110, 100);
		g.setColor(Color.orange);
		g.fillRect(965,25 , 20, 100);
		g.setColor(Color.green);
		g.fillRect(1095,25 , 20, 100);
		g.setColor(Color.cyan);
		int l=(int)(r*180/3.142);
		g.fillRect(960-l, 25, l+5, 100);

		//Strokes

		g.setColor(Color.black);
		g.drawRect(600, 25, 720, 100);
		g.drawLine(780, 25, 780, 125);
		g.drawLine(960, 25, 960, 125);
		g.drawLine(1140, 25, 1140, 125);

		//Chamber

		if(counter1>-55*3.142/36 && counter1<r-55*3.142/36)
		{
			g.setColor(Color.cyan);
			g.drawString("Fuel Injection", 600,200);
		}
		else if(counter1>-295*3.142/180 && counter1<-275*3.142/180)
		{
			g.setColor(Color.orange);
			g.drawString("Fuel Injection and combustion", 600,200);
		}
		else if(counter1>-405*3.142/180 && counter1<-295*3.142/180)
		{
			g.setColor(Color.yellow);
			g.drawString("Combustion", 600,200);
		}
		else if(counter1>-425*3.142/180 && counter1<-405*3.142/180)
		{
			g.setColor(Color.green);
			g.drawString("Combustion and exhaust open", 600,200);
		}
		else if(counter1>-605*3.142/180 && counter1<-425*3.142/180)
		{
			g.setColor(Color.blue);
			g.drawString("Exhaust open", 600,200);
		}
		else if(counter1>-645*3.142/180 && counter1<-605*3.142/180 )
		{
			g.setColor(Color.magenta);
			g.drawString("Inlet and exhaust open", 600,200);
		}
		else if(counter1>-840*3.142/180 && counter1<-645*3.142/180)
		{
			g.setColor(Color.red);
			g.drawString("Inlet open", 600,200);
		}
		else
		{
			g.drawString("Inlet closed", 600,200);
			g.setColor(Color.white);
		}

		g.fillRect(153, 28, 194, c-56);
		
		//LineThickening

		g.setColor(Color.black);
		super.paint(g);
		Graphics2D g2d = (Graphics2D)g;
		g2d.setStroke(new BasicStroke(10));
		g.drawLine(250,c,a,b);

		//Cursor

		g.drawLine(600+counter2, 0, 600+counter2, 150);
		counter2++;
		if(counter2>720)
		{
			counter2=0;
		}

		//CrankAngle

		counter1=counter1-3.142/180;
		if(counter1<-9*3.142/2)
		{
			counter1=-3.142/2;
		}
	}
}
