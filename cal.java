import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class MyPanel extends JPanel implements ActionListener
{
	int op1,op2;
	String operation;
	JTextField t1;
	public MyPanel()
	{
		t1=new JTextField(22);
		JButton n1=new JButton("1");		
		JButton n2=new JButton("2");
		JButton n3=new JButton("3");
		JButton n4=new JButton("4");
		JButton n5=new JButton("5");
		JButton n6=new JButton("6");
		JButton n7=new JButton("7");
		JButton n8=new JButton("8");
		JButton n9=new JButton("9");
		JButton n10=new JButton("0");
		JButton o1=new JButton("+");
		JButton o2=new JButton("-");
		JButton o3=new JButton("*");
		JButton o4=new JButton("/");
		JButton o5=new JButton("%");
		JButton o6=new JButton("=");
		JButton sin=new JButton("sin");
		JButton cos=new JButton("cos");
		JButton tan=new JButton("tan");
		JButton exit=new JButton("exit");
		GridLayout gl=new GridLayout(3,3);
		setLayout(gl);
		add(t1);
		add(n1);
		add(n2);
		add(n3);
		add(n4);
		add(n5);
		add(n6);
		add(n7);
		add(n8);
		add(n9);
		add(n10);
		add(sin);
		add(cos);
		add(tan);
		add(o1);
		add(o2);
		add(o3);
		add(o5);
		add(o6);
		add(exit);
		n1.addActionListener(this);
		n2.addActionListener(this);
		n3.addActionListener(this);
		n4.addActionListener(this);
		n5.addActionListener(this);
		n6.addActionListener(this);
		n7.addActionListener(this);
		n8.addActionListener(this);
		n9.addActionListener(this);
		n10.addActionListener(this);
		o1.addActionListener(this);
		o2.addActionListener(this);
		o3.addActionListener(this);
		o4.addActionListener(this);
		o5.addActionListener(this);
		o6.addActionListener(this);
		sin.addActionListener(this);
		cos.addActionListener(this);
		tan.addActionListener(this);
		exit.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		int k;
		try{
			k=Integer.parseInt(str);
			}catch(Exception e){k=-1;}
		if(k!=-1)
		{
			String s=t1.getText();
			s=s+k;
			t1.setText(s);
		}
		if(str.equals("+")||str.equals("-")||str.equals("/")||str.equals("*"))
		{
			op1=Integer.parseInt(t1.getText());
			operation=str;
			t1.setText(str);
		}	
		if(str.equals("exit"))	
		{
			t1.setText("");
		}	
		if(str.equals("="))
		{
			op2=Integer.parseInt(t1.getText());
			if(operation.equals("+"))
			{
				t1.setText((op1+op2)+"");
			}
			if(operation.equals("-"))
			{
				t1.setText((op1-op2)+"");
			}
			if(operation.equals("/"))
			{
				t1.setText((op1/op2)+"");
			}
			if(operation.equals("*"))
			{
				t1.setText((op1*op2)+"");
			}

		}
		if(str.equals("sin"))
		{
			op1=Integer.parseInt(t1.getText());
			double rad=op1*Math.PI/180;
			t1.setText((Math.sin(rad)+""));
		}
		if(str.equals("cos"))
		{
			op1=Integer.parseInt(t1.getText());
			double rad=(op1*Math.PI)/180;
			t1.setText((Math.cos(rad)+""));
		}
		if(str.equals("tan"))
		{
			op1=Integer.parseInt(t1.getText());
			double rad=op1*Math.PI/180;
			t1.setText((Math.tan(rad)+""));
		}
	}
}
	class MyFrame extends JFrame
		{
			public MyFrame(String title)
			{
				super(title);
				setSize(400,200);
				MyPanel b=new MyPanel();
				add(b);
			}

		}
		public class cal
		{
			public static void main(String a[])
				{
					MyFrame frame=new MyFrame("Calculator");
					frame.setVisible(true);
				}
		}
