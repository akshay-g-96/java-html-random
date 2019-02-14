import java.applet.*;
import java.awt.*;
import java.lang.*;
import java.awt.event.*;
///////////////////////////////////
//class ActionListener{}
//////////////////////////////////
public class haha extends Applet{
	public static int p,q;
	class Engine1 extends Applet implements ActionListener 
{
	
	public void init() {
		Label label1 = new Label("Enter RPM : ");

		textField1 = new TextField();

		Got_It = new Button("Enter");
		Got_It.addActionListener(this);

		Label label2 = new Label("Enter diesel blend percent :");

		textField2 = new TextField();
		//textField2.setEditable(false);

		add(label1);
		add(textField1);
		add(Got_It);
		add(label2);
		add(textField2);
	}

	public void actionPerformed(ActionEvent e) {
		//		String temp = textField1.getText();
		//		textField1.setText(textField2.getText());
		//		textField2.setText(temp);
		String str1=textField1.getText();
		p=Integer.parseInt(str1);

		String str2=textField2.getText();
		q=Integer.parseInt(str2);
		//System.out.println(p+q);
	}

	TextField textField1, textField2;
	Button Got_It;

}
	class Engine2 extends Applet implements Runnable 
{ 
	//Engine z=new Engine();
	//Engine1 y=new Engine1();
	//y=z;
	int counter;
	Thread cd;
	double counter1=0;
	//int p,q;
	/////////////////////////////////////////////////////////////////
	
	/////////////////////////////////////////////////////////////////
	public void start() 
	{ // create thread

		counter = 3600;
		cd = new Thread(this);
		cd.start();

	}

	public void stop()
	{ cd = null;}
	public void run() {  // executed by Thread

		while (counter>0 && cd!=null) 
		{

			try{Thread.sleep(20);} 
			catch (InterruptedException e){}

			--counter;
			repaint(); //update screen

		}
	}


	public void paint(Graphics g) 
	{
		//Cylinder

		g.drawLine(150,25,350,25);
		g.drawLine(150,25,150,475);
		g.drawLine(350,25, 350, 475);
		//g.drawOval(0,350 , 150, 150);
		g.drawOval(50, 550, 400, 400);
		//g.drawOval(600,0,800,800);

		//Connecting Rod

		int a=(int)(250+150*Math.cos(counter1));
		int b=(int)(750-150*Math.sin(counter1));
		//g.drawOval(a, b, 4, 4);
		int c=(int)(100+150*(1-Math.cos(counter1-3.141/2)+Math.pow(Math.sin(counter1-3.141/2), 2)/6));
		g.drawLine(250,c,a,b);
		g.drawRect(153, c-25 , 194, 50);
		///////////////////////////////////////////////////////////////////////
		//int p,q;

		/////////////////////////////////////////////////////////////////////////
		counter1=counter1-3.141/180;

	}
}}