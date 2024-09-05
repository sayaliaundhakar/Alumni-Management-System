import java.awt.*;
import javax.swing.*;

class Home extends JFrame
{
	Home()
	{
		JPanel logo=new JPanel();
		logo.setBackground(new Color(51,153,255));
		logo.setBounds(0,0,1100,180);
		add(logo);
		
		Icon i=new ImageIcon("C:/Microproject/logo.jpeg");
		JLabel image=new JLabel(i);
		image.setBounds(50,50,50,50);
		logo.add(image);
		
		JLabel name=new JLabel("Government Residence Women Polytechnic, Tasgaon");
		name.setFont(new Font("Times New Roman",Font.BOLD,37));
		name.setForeground(Color.white);
		name.setBounds(200,50,500,50);
		logo.add(name);
		
		JPanel bar=new JPanel();
		bar.setBounds(0,180,1100,50);
		bar.setBackground(new Color(102,178,255));		
		add(bar);
		
		JButton home=new JButton("Home");
		home.setFont(new Font("Times New Roman",Font.BOLD,25));
		home.setBackground(Color.white);
		home.setBounds(0,190,100,70);
		bar.add(home);
		
		
		JButton Register=new JButton("Register");
		Register.setFont(new Font("Times New Roman",Font.BOLD,25));
		Register.setBackground(Color.white);
		Register.setBounds(275,185,100,70);
		bar.add(Register);
		
		JButton Update=new JButton("Update");
		Update.setFont(new Font("Times New Roman",Font.BOLD,25));
		Update.setBackground(Color.white);
		Update.setBounds(550,185,100,70);
		bar.add(Update);
		
		JButton Delete=new JButton("Delete");
		Delete.setFont(new Font("Times New Roman",Font.BOLD,25));
		Delete.setBackground(Color.white);
		Delete.setBounds(825,185,100,70);
		bar.add(Delete);
		
		
		JPanel footer=new JPanel();
		footer.setBackground(new Color(51,153,255));
		footer.setBounds(0,700,1100,30);
		add(footer);
		JLabel f=new JLabel("Alumni Database Management",JLabel.CENTER);
		f.setFont(new Font("Times New Roman",Font.BOLD,15));
		f.setForeground(Color.white);
		f.setBounds(0,785,200,20);
		footer.add(f);
		
		setLayout(null);
		setSize(1100,800);
		setVisible(true);
		setTitle("Home Page");
		
		
	}
	public static void main(String args[])
	{
		new Home();
	}
}