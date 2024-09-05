import java.awt.*;
import javax.swing.*;

class LoginForm extends JFrame
{
	LoginForm()
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
		
		
		JLabel j1=new JLabel("Username",JLabel.CENTER);
		j1.setBounds(425,250,250,50);
		j1.setFont(new Font("Times New Roman",Font.BOLD,25));
		JTextField tf1=new JTextField();
		tf1.setBounds(425,300,250,50);
		tf1.setFont(new Font("Times New Roman",Font.BOLD,25));
		add(j1);
		add(tf1);
		
		JLabel j2=new JLabel("Password",JLabel.CENTER);
		j2.setBounds(425,380,250,50);
		j2.setFont(new Font("Times New Roman",Font.BOLD,25));
		JPasswordField pf2=new JPasswordField();
		//pf2.setEchoChar('*');
		pf2.setBounds(425,430,250,50);
		pf2.setFont(new Font("Times New Roman",Font.BOLD,25));
		add(j2);
		add(pf2);
		
		JButton b=new JButton("Login");
		b.setBounds(480,520,140,50);
		b.setFont(new Font("Times New Roman",Font.BOLD,25));
		add(b);
		
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
		setTitle("Login Form");
	}
	public static void main(String args[])
	{
		new LoginForm();
	}
}