import java.awt.*;
import javax.swing.*;

class Homecopy extends JFrame
{
	Homecopy()
	{
		/*Icon bg=new ImageIcon("C:/Microproject/b1.jpg");
		JLabel bgimage=new JLabel(bg);
		bgimage.setBounds(0,230,1600,670);
		add(bgimage);*/
		
		JPanel logo1=new JPanel();
		logo1.setLayout(null);
		logo1.setBackground(new Color(51,153,255));
		logo1.setBounds(0,0,1600,180);
		add(logo1);
		
		Icon i1=new ImageIcon("C:/Microproject/collage logo.jpeg");
		JLabel image1=new JLabel(i1);
		image1.setBounds(7,10,200,160);
		logo1.add(image1);
		
		JLabel name1=new JLabel("Government Residence Women Polytechnic, Tasgaon");
		name1.setFont(new Font("Times New Roman",Font.BOLD,50));
		name1.setForeground(Color.white);
		name1.setBounds(300,50,1400,60);
		logo1.add(name1);
		
		JPanel bar=new JPanel();
		bar.setBounds(0,180,1600,50);
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
	
		
		JLabel wel=new JLabel("Welcome to");
		wel.setFont(new Font("Rockwell",Font.BOLD,55));
		wel.setForeground(new Color(0,0,153));
		wel.setBounds(635,280,600,70);
		add(wel);
		
		
		JLabel almn=new JLabel("Alumni Database Management");
		almn.setFont(new Font("Rockwell",Font.BOLD,55));
		almn.setForeground(new Color(0,0,153));
		almn.setBounds(355,360,1000,100);
		add(almn);
		
		Icon grwpt=new ImageIcon("C:/Microproject/Grwptas.png");
		JLabel gl=new JLabel(grwpt);
		gl.setBounds(100,500,650,366);
		add(gl);
		
		Icon girl=new ImageIcon("C:/Microproject/girl al.jpeg");
		JLabel girlin=new JLabel(girl);
		girlin.setBounds(850,500,650,366);
		add(girlin);
		
		JPanel footer1=new JPanel();
		footer1.setBackground(new Color(51,153,255));
		footer1.setBounds(0,900,1600,30);
		add(footer1);
		JLabel f1=new JLabel("Alumni Database Management",JLabel.CENTER);
		f1.setFont(new Font("Times New Roman",Font.BOLD,15));
		f1.setForeground(Color.white);
		f1.setBounds(0,785,200,20);
		footer1.add(f1);
		
		setLayout(null);
		setSize(1600,1000);
		setVisible(true);
		setTitle("Home Page");
		
		
	}
	public static void main(String args[])
	{
		new Homecopy();
	}
}