import java.awt.*;

class MyDreamC extends Frame
{
	MyDreamC()
	{
		JLabel l=new JLabel("I Will get 70/70 Marks in Advanced JAVA Subject :) ");
		add(l);
		
		
		setLayout(new FlowLayout());
		setTitle("I will definetly achieve my dreams");
		setVisible(true);
		setSize(500,500);
	}
	Public static void main(String args[])
	{
		new MyDreamC();
	}
}