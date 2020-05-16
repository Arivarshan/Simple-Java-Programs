import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyPanel extends JPanel implements ActionListener
{
	JTextField a;
	public MyPanel()
	{
	JRadioButton r=new JRadioButton("red");
	JRadioButton g=new JRadioButton("green");
	JRadioButton y=new JRadioButton("yellow");
	GridLayout gl=new GridLayout(3,3);
	setLayout(gl);
	//JTextField t=new JTextField("trafic rules");
	a=new JTextField("");
	ButtonGroup bg=new ButtonGroup();
	bg.add(r);
	bg.add(g);
	bg.add(y);
	//add(t);
	add(r);
	add(g);
	add(y);
	add(a);
	r.addActionListener(this);
	y.addActionListener(this);
	g.addActionListener(this);
	//a.ActionListener(this);
	}


	public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();
		if(s.equals("red"))
		{
			a.setText("stop");
		}
	}	
}

class MyFrame extends JFrame
{
	public MyFrame(String x)
	{
		super(x);
		setSize(200,400);
		MyPanel p=new MyPanel();
			add(p);	
	}

}
public class light
{
	public static void main(String args[])
	{
		MyFrame b=new MyFrame("light");
			b.setVisible(true);
	}
}