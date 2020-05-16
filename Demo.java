import javax.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MyPanel extends JPannel implements ActionListener
{
	JTextField t1;
	JTextField t2;
	JTextField t3;
	public MyPanel()
	{
		JLable l1=new JLable("Entre A");
		JLable l2=new JLable("Entre B");
		JLable l3=new JLable("Answer");
		JTextField t1=new JTextField(10);
		JTextField t2=new JTextField(10);
		JTextField t3=new JTextField(10);
		JButton b1=new JButton("Add");
		add(l1);
		add(l2);
		add(l3);
		add(t1);
		add(t2);
		add(t3);	
		b1.addActionListener(this);		
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s1=t1.getText();
		int a=Integer ParseInt(s1);
		String s2=t1.getText();
		int b=Integer ParseInt(s2);
		int c=a+b;
		
	}
}
	class MyFrame extends JFrame
		{
			public MyFrame(String title)
			{
				Super(title);
				set Size(500,500);
				MyPanel b=new MyPanel();
				add(b);
			}

		}
		public class Demo
		{
			public static void main(String a[])
				{
					MyFrame frame=new Myframe("Shapes");
					frame.setVisible(true);
				}
		}
