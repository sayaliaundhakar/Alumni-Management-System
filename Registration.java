import java.awt.*;
import javax.swing.*;

class Registration extends JFrame
{
	Registration()
	{
		JPanel logo2=new JPanel();
		logo2.setLayout(null);
		logo2.setBackground(new Color(51,153,255));
		logo2.setBounds(0,0,1600,180);
		add(logo2);
		
		Icon i2=new ImageIcon("C:/Microproject/collage logo.jpeg");
		JLabel image2=new JLabel(i2);
		image2.setBounds(7,10,200,160);
		logo2.add(image2);
		
		
		JLabel name2=new JLabel("Government Residence Women Polytechnic, Tasgaon");
		name2.setFont(new Font("Times New Roman",Font.BOLD,50));
		name2.setForeground(Color.white);
		name2.setBounds(300,50,1400,60);
		logo2.add(name2);
		
		JPanel bar1=new JPanel();
		bar1.setBounds(0,180,1600,50);
		bar1.setBackground(new Color(102,178,255));
		add(bar1);
		
		JButton home1=new JButton("Home");
		home1.setFont(new Font("Times New Roman",Font.BOLD,25));
		home1.setBackground(Color.white);
		//home1.setBounds(0,190,100,70);
		bar1.add(home1);
		
		
		JButton Register1=new JButton("Register");
		Register1.setFont(new Font("Times New Roman",Font.BOLD,25));
		Register1.setBackground(Color.white);
		//Register1.setBounds(275,185,100,70);
		bar1.add(Register1);
		
		JButton Update1=new JButton("Update");
		Update1.setFont(new Font("Times New Roman",Font.BOLD,25));
		Update1.setBackground(Color.white);
		//Update1.setBounds(550,185,100,70);
		bar1.add(Update1);
		
		JButton Delete1=new JButton("Delete");
		Delete1.setFont(new Font("Times New Roman",Font.BOLD,25));
		Delete1.setBackground(Color.white);
		//Delete1.setBounds(825,185,100,70);
		bar1.add(Delete1);
		
		/*JLabel rgr=new JLabel("Registration");
		rgr.setFont(new Font("Times New Roman",Font.BOLD,30));
		rgr.setBounds(800,250,300,40);
		add(rgr);*/
		
		JLabel en=new JLabel("Enrollment No. :");
		en.setFont(new Font("Times New Roman",Font.BOLD,22));
		en.setBounds(100,280,200,40);
		add(en);
		
		JTextField ent=new JTextField();
		ent.setFont(new Font("Times New Roman",Font.BOLD,18));
		ent.setBounds(350,280,300,40);
		add(ent);
		
		JLabel almni=new JLabel("Name:");
		almni.setFont(new Font("Times New Roman",Font.BOLD,22));
		almni.setBounds(100,350,200,40);
		add(almni);
		
		JTextField namet=new JTextField();
		namet.setFont(new Font("Times New Roman",Font.BOLD,18));
		namet.setBounds(350,350,300,40);
		add(namet);
		
		JLabel dob=new JLabel("Date of Birth:");
		dob.setBounds(100,420,200,40);
		dob.setFont(new Font("Times New Roman",Font.BOLD,22));
		add(dob);
		
		JTextField dobt=new JTextField();
		dobt.setFont(new Font("Times New Roman",Font.BOLD,18));
		dobt.setBounds(350,420,300,40);
		add(dobt);
		
		JLabel ph=new JLabel("Phone No. :");
		ph.setFont(new Font("Times New Roman",Font.BOLD,22));
		ph.setBounds(100,490,200,40);
		add(ph);
		
		JTextField pht=new JTextField();
		pht.setFont(new Font("Times New Roman",Font.BOLD,18));
		pht.setBounds(350,490,300,40);
		add(pht);
		
		JLabel eid=new JLabel("Email ID:");
		eid.setFont(new Font("Times New Roman",Font.BOLD,22));
		eid.setBounds(100,560,200,40);
		add(eid);
		
		JTextField eidt=new JTextField();
		eidt.setFont(new Font("Times New Roman",Font.BOLD,18));
		eidt.setBounds(350,560,300,40);
		add(eidt);
		
		JLabel adds=new JLabel("Address:");
		adds.setFont(new Font("Times New Roman",Font.BOLD,22));
		adds.setBounds(100,630,200,40);
		add(adds);
		
		JTextArea ta=new JTextArea();
		ta.setFont(new Font("Times New Roman",Font.BOLD,18));
		JScrollPane jpane=new JScrollPane(ta);
		jpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		jpane.setBounds(350,630,300,150);
		add(jpane);
		
		JLabel bnch=new JLabel("Select branch:");
		bnch.setFont(new Font("Times New Roman",Font.BOLD,22));
		bnch.setBounds(950,280,200,40);
		add(bnch);
		
		String branch[]={"Civil Engineering","Mechanical Engineering","Electrical Engineering","Computer Engineering","Information Technology","Electronics and Telecommunication","Dress Designing"};
		JComboBox jcb=new JComboBox(branch);
		jcb.setFont(new Font("Times New Roman",Font.BOLD,18));
		jcb.setBounds(1200,280,300,40);
		add(jcb);
		
		JLabel jy=new JLabel("Joining Year:");
		jy.setFont(new Font("Times New Roman",Font.BOLD,22));
		jy.setBounds(950,350,200,40);
		add(jy);
		
		JTextField jyt=new JTextField();
		jyt.setFont(new Font("Times New Roman",Font.BOLD,18));
		jyt.setBounds(1200,350,300,40);
		add(jyt);
		
		JLabel py=new JLabel("Pass out Year:");
		py.setFont(new Font("Times New Roman",Font.BOLD,22));
		py.setBounds(950,420,200,40);
		add(py);
		
		JTextField pyt=new JTextField();
		pyt.setFont(new Font("Times New Roman",Font.BOLD,18));
		pyt.setBounds(1200,420,300,40);
		add(pyt);
		
		JLabel pm=new JLabel("Pass out Marks: ");
		pm.setFont(new Font("Times New Roman",Font.BOLD,22));
		pm.setBounds(950,490,200,40);
		add(pm);
		
		JTextField pmt=new JTextField();
		pmt.setFont(new Font("Times New Roman",Font.BOLD,18));
		pmt.setBounds(1200,490,300,40);
		add(pmt);
		
		JLabel plm=new JLabel("Placement Yes/No:");
		plm.setFont(new Font("Times New Roman",Font.BOLD,22));
		plm.setBounds(950,560,200,40);
		add(plm);
		
		ButtonGroup grp=new ButtonGroup();
		//Dimension dmn=new Dimension(80,80);
		JRadioButton jrd1=new JRadioButton("Yes");
		jrd1.setFont(new Font("Times New Roman",Font.BOLD,20));
		jrd1.setBounds(1200,560,80,40);
		//jrd1.setSize(dmn);
		JRadioButton jrd2=new JRadioButton("No");
		jrd2.setFont(new Font("Times New Roman",Font.BOLD,20));
		jrd2.setBounds(1350,560,80,40);
		//jrd2.setSize(dmn);
		grp.add(jrd1);
		grp.add(jrd2);
		add(jrd1);
		add(jrd2);
		
		JLabel cmp=new JLabel("Placement details:");
		cmp.setFont(new Font("Times New Roman",Font.BOLD,22));
		cmp.setBounds(950,630,200,40);
		add(cmp);
		
		JTextArea cmpt=new JTextArea();
		cmpt.setFont(new Font("Times New Roman",Font.BOLD,18));
		JScrollPane pane=new JScrollPane(cmpt);
		pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		pane.setBounds(1200,630,300,150);
		add(pane);
		
		JButton btn=new JButton("Register");
		btn.setBounds(730,820,150,50);
		btn.setFont(new Font("Times New Roman",Font.BOLD,22));
		btn.setBackground(new Color(204,204,204));
		//btn.setForeground(Color.white);
		add(btn);
		
		JPanel footer2=new JPanel();
		footer2.setBackground(new Color(51,153,255));
		footer2.setBounds(0,900,1600,30);
		add(footer2);
		JLabel f2=new JLabel("Alumni Database Management",JLabel.CENTER);
		f2.setFont(new Font("Times New Roman",Font.BOLD,15));
		f2.setForeground(Color.white);
		f2.setBounds(0,785,200,20);
		footer2.add(f2);
		
		setLayout(null);
		setSize(1600,1000);
		setVisible(true);
		setTitle("Login Form");
	}
	public static void main(String args[])
	{
		new Registration();
	}
}