import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AnAppletWithTextFields extends Applet implements ActionListener {
	int p,q;
	public void init() {
		Label label1 = new Label("Enter RPM : ");

		textField1 = new TextField();

		swapEm = new Button("Swap");
		swapEm.addActionListener(this);

		Label label2 = new Label("Enter diesel blend percent :");

		textField2 = new TextField();
		//textField2.setEditable(false);

		add(label1);
		add(textField1);
		add(swapEm);
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
         System.out.println(p+q);
	}
	
	TextField textField1, textField2;
	Button swapEm;
}