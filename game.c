import java.awt.*;
import java.swing.*;
import java.awt.event.*;
class MyPanel extends JPanel implements ActionListner
{
	public MyPanel()
	{
		JButton n1=new JButton("");		
		JButton n2=new JButton("");
		JButton n3=new JButton("");
		JButton n4=new JButton("");
		JButton n5=new JButton("");
		JButton n6=new JButton("");
		JButton n7=new JButton("");
		JButton n8=new JButton("");
		JButton n9=new JButton("");
		GrudLayout g=new GridLayout(3,3);
		setLayout(g);
		add(n1);
		add(n2);
		add(n3);
		add(n4);
		add(n5);
		add(n6);
		add(n7);
		add(n8);
		add(n9);
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
		public class game
		{	
			public static void main(String a[])
				{
					MyFrame frame=new MyFrame("Tic_Tac_Toe");
					frame.setVisible(true);
				}
		}
