import java.awt.*;			//imported awt package because to access the classes,interfaces and methods in the package
import javax.swing.*;		//imported awt package because to access the classes,interfaces and methods in the package
import java.awt.event.*;	//to use event handaling mechanism
import java.sql.*;			//to perform database interactions
import javax.swing.table.DefaultTableModel;		//for display jtable with 0 columns and 0 rows

class LoginFormcopy implements ActionListener		//to perform event(action) handling
{
	//created global objects of components
	
	JFrame frm;		//start login 
	
	JTextField tf1;
	JPasswordField pf2;
	JButton b,r;
	
	JDialog jd;
	JLabel jdl,jd1,jd2;
	JButton okb;
	
	JDialog jdlog;
	JLabel jlbl, jdlogl,jdlogl2;
	JButton okbtn;		//end login
	
	JFrame frm1;		//start home
	JPanel logo1,bar,footer1;
	Icon i1,grwpt,girl;
	JLabel name1,wel,almn,f1;
	JButton home,Register,Update,Delete,Display;		//end home
	
	JFrame frm2;		//start dataManage
	JPanel logo2,bar1,footer2;
	Icon i2;
	JLabel name2,en,almni,dob,ph,eid,adds,bnch,jy,py,pm,plm,cmp,f2;
	JButton home1,Register1,Update1,Delete1,Display1,btn,btn1,btn2,btn3;
	JTextField ent,namet,dobt,pht,eidt,jyt,pyt,pmt;
	JTextArea ta,cmpt;
	JScrollPane jpane,pane;
	//String branch;
	JComboBox jcb;
	ButtonGroup grp;
	JRadioButton jrd1,jrd2;		//end datamanage
	
	String rd=" ";// for radiobutton 
	
	JFrame frm3;		//start displayData
	JPanel logo3,bar2,footer3;
	Icon i3;
	JLabel name3,f3;
	JButton home2,Register2,Update2,Delete2,Display2;
	DefaultTableModel dtm;
	JTable jtbl;	
	JScrollPane jpn;//end displayData

	
	LoginFormcopy()			//constructor of class
	{

		//The GUI required for the login form done using various swing components
		frm=new JFrame();
		
		JPanel logo=new JPanel();
		logo.setLayout(null);		//*
		logo.setBackground(new Color(51,153,255));		//*
		logo.setBounds(0,0,1600,180);
		frm.add(logo);
		
		Icon i=new ImageIcon("C:/Microproject/collage logo.jpeg");		//*
		JLabel image=new JLabel(i);
		image.setBounds(7,10,200,160);
		logo.add(image);
		
		JLabel name=new JLabel("Government Residence Women Polytechnic, Tasgaon");
		name.setFont(new Font("Times New Roman",Font.BOLD,50));
		name.setForeground(Color.white);
		name.setBounds(300,50,1400,60);
		logo.add(name);
		
		Icon user=new ImageIcon("C:/Microproject/login 1.png");
		JLabel auon=new JLabel(user);
		auon.setBounds(600,230,130,110);
		frm.add(auon);
		
		JLabel text=new JLabel("Login");
		text.setFont(new Font("Rockwell",Font.BOLD,50));
		text.setBounds(770,230,200,100);
		frm.add(text);
		
		JLabel j1=new JLabel("Username",JLabel.CENTER);
		j1.setBounds(670,410,250,50);
		j1.setFont(new Font("Times New Roman",Font.BOLD,25));
		frm.add(j1);
		
		tf1=new JTextField();
		tf1.setBounds(670,460,250,50);
		tf1.setFont(new Font("Times New Roman",Font.BOLD,20));
		frm.add(tf1);
		
		JLabel j2=new JLabel("Password",JLabel.CENTER);
		j2.setBounds(670,540,250,50);
		j2.setFont(new Font("Times New Roman",Font.BOLD,25));
		frm.add(j2);
		
		pf2=new JPasswordField();
		pf2.setBounds(670,590,250,50);
		pf2.setFont(new Font("Times New Roman",Font.BOLD,25));
		frm.add(pf2);
		
		b=new JButton("Login");
		b.addActionListener(this);	//added addActionListener to jbutton object
		b.setBounds(680,680,100,50);
		b.setFont(new Font("Times New Roman",Font.BOLD,25));
		frm.add(b);
		
		r=new JButton("Reset");
		r.addActionListener(this);	//added addActionListener to jbutton object
		r.setBounds(810,680,100,50);
		r.setFont(new Font("Times New Roman",Font.BOLD,25));
		frm.add(r);
		
		jd=new JDialog(frm,"User Authentication",true);	     	//for printing message to user
		jd.setLayout(new FlowLayout());
		jd.setBounds(1090,510,350,150);
		jdl=new JLabel("Your Login has been successfully :)");
		jdl.setFont(new Font("Times New Roman",Font.BOLD,20));
		jd.add(jdl);
		//jdl.setBounds(1100,510,200,40);
		jd1=new JLabel("                                                      ");
		jd.add(jd1);		//label added on dialog box
		jd2=new JLabel("                                           ");
		jd.add(jd2);
		okb=new JButton("Ok");
		okb.setFont(new Font("Times New Roman",Font.BOLD,17));
		//okb.setBounds(1100,550,10,10);
		okb.addActionListener(this);
		jd.add(okb);		//button added on dialog box
		
		jdlog=new JDialog(frm,"User Authentication",false);			//for printing message to user
		jdlog.setLayout(new FlowLayout());
		jdlog.setBounds(1090,510,350,150);
		jlbl=new JLabel("Your Login has failed ! Please try again.");
		jlbl.setFont(new Font("Times New Roman",Font.BOLD,20));
		jdlog.add(jlbl);
		//jlbl.setBounds(1100,510,200,40);
		jdlogl2=new JLabel("                                                      ");
		jdlog.add(jdlogl2);
		jdlogl=new JLabel("                                         ");
		jdlog.add(jdlogl);		//label added on dialog box
		okbtn=new JButton("Ok");
		okbtn.setFont(new Font("Times New Roman",Font.BOLD,17));
		//okbtn.setBounds(1100,550,10,10);
		okbtn.addActionListener(this);
		jdlog.add(okbtn);		//button added on dialog box
		
		
		JPanel footer=new JPanel();
		footer.setBackground(new Color(51,153,255));
		footer.setBounds(0,900,1600,30);
		frm.add(footer);
		JLabel f=new JLabel("Alumni Database Management",JLabel.CENTER);
		f.setFont(new Font("Times New Roman",Font.BOLD,15));
		f.setForeground(Color.white);
		f.setBounds(0,785,200,20);
		footer.add(f);
		
		frm.setLayout(null);
		frm.setSize(1600,1000);
		frm.setVisible(true);
		frm.setTitle("Login Form");
	}
	
	public void Homecopy() 			//Home page function/module
	{
		//The GUI required for the home page done using various swing components
		
		frm1=new JFrame();
		
		logo1=new JPanel();
		logo1.setLayout(null);
		logo1.setBackground(new Color(51,153,255));
		logo1.setBounds(0,0,1600,180);
		frm1.add(logo1);
		
		i1=new ImageIcon("C:/Microproject/collage logo.jpeg");
		JLabel image1=new JLabel(i1);
		image1.setBounds(7,10,200,160);
		logo1.add(image1);
		
		name1=new JLabel("Government Residence Women Polytechnic, Tasgaon");
		name1.setFont(new Font("Times New Roman",Font.BOLD,50));
		name1.setForeground(Color.white);
		name1.setBounds(300,50,1400,60);
		logo1.add(name1);
		
		bar=new JPanel();
		bar.setBounds(0,180,1600,50);
		bar.setBackground(new Color(102,178,255));		
		frm1.add(bar);
		
		home=new JButton("Home page");		//*
		home.setFont(new Font("Times New Roman",Font.BOLD,25));
		home.setBackground(Color.white);
		home.setBounds(0,190,100,70);
		home.addActionListener(this);
		bar.add(home);
		
		
		
		Register=new JButton("Registration Form");  		//*
		Register.setFont(new Font("Times New Roman",Font.BOLD,25));
		Register.setBackground(Color.white);
		Register.setBounds(275,185,100,70);
		Register.addActionListener(this);
		bar.add(Register);
		
		Update=new JButton("Update Form");					//*
		Update.setFont(new Font("Times New Roman",Font.BOLD,25));
		Update.setBackground(Color.white);
		Update.setBounds(550,185,100,70);
		Update.addActionListener(this);
		bar.add(Update);
		
		Delete=new JButton("Delete Form");					//*
		Delete.setFont(new Font("Times New Roman",Font.BOLD,25));
		Delete.setBackground(Color.white);
		Delete.setBounds(825,185,100,70);
		Delete.addActionListener(this);
		bar.add(Delete);
		
		Display=new JButton("Display");						//*
		Display.setFont(new Font("Times New Roman",Font.BOLD,25));
		Display.setBackground(Color.white);
		Display.setBounds(825,185,100,70);
		Display.addActionListener(this);
		bar.add(Display);
	
		
		wel=new JLabel("Welcome to");
		wel.setFont(new Font("Rockwell",Font.BOLD,55));
		wel.setForeground(new Color(0,0,153));
		wel.setBounds(635,280,600,70);
		frm1.add(wel);
		
		
		almn=new JLabel("Alumni Database Management");
		almn.setFont(new Font("Rockwell",Font.BOLD,55));
		almn.setForeground(new Color(0,0,153));
		almn.setBounds(355,360,1000,100);
		frm1.add(almn);
		
		grwpt=new ImageIcon("C:/Microproject/Grwptas.png");
		JLabel gl=new JLabel(grwpt);
		gl.setBounds(100,500,650,366);
		frm1.add(gl);
		
		girl=new ImageIcon("C:/Microproject/girl al.jpeg");
		JLabel girlin=new JLabel(girl);
		girlin.setBounds(850,500,650,366);
		frm1.add(girlin);
		
		footer1=new JPanel();
		footer1.setBackground(new Color(51,153,255));
		footer1.setBounds(0,900,1600,30);
		frm1.add(footer1);
		f1=new JLabel("Alumni Database Management",JLabel.CENTER);
		f1.setFont(new Font("Times New Roman",Font.BOLD,15));
		f1.setForeground(Color.white);
		f1.setBounds(0,785,200,20);
		footer1.add(f1);
		
		frm1.setLayout(null);
		frm1.setSize(1600,1000);
		frm1.setVisible(true);
		frm1.setTitle("Home Page");
		
		
	}
	
	public void dataManage()		//function for managing alumni data
	{
		//The GUI required for the dataManage page done using various swing components
		
		frm2=new JFrame();
		
		logo2=new JPanel();
		logo2.setLayout(null);
		logo2.setBackground(new Color(51,153,255));
		logo2.setBounds(0,0,1600,180);
		frm2.add(logo2);
		
		i2=new ImageIcon("C:/Microproject/collage logo.jpeg");
		JLabel image2=new JLabel(i2);
		image2.setBounds(7,10,200,160);
		logo2.add(image2);
		
		
		name2=new JLabel("Government Residence Women Polytechnic, Tasgaon");
		name2.setFont(new Font("Times New Roman",Font.BOLD,50));
		name2.setForeground(Color.white);
		name2.setBounds(300,50,1400,60);
		logo2.add(name2);
		
		bar1=new JPanel();
		bar1.setBounds(0,180,1600,50);
		bar1.setBackground(new Color(102,178,255));
		frm2.add(bar1);
		
		home1=new JButton("Home page");
		home1.setFont(new Font("Times New Roman",Font.BOLD,25));
		home1.setBackground(Color.white);
		//home1.setBounds(0,190,100,70);
		home1.addActionListener(this);
		bar1.add(home1);
		
		
		Register1=new JButton("Registration Form");
		Register1.setFont(new Font("Times New Roman",Font.BOLD,25));
		Register1.setBackground(Color.white);
		//Register1.setBounds(275,185,100,70);
		Register1.addActionListener(this);
		bar1.add(Register1);
		
		Update1=new JButton("Update Form");
		Update1.setFont(new Font("Times New Roman",Font.BOLD,25));
		Update1.setBackground(Color.white);
		//Update1.setBounds(550,185,100,70);
		Update1.addActionListener(this);
		bar1.add(Update1);
		
		Delete1=new JButton("Delete Form");
		Delete1.setFont(new Font("Times New Roman",Font.BOLD,25));
		Delete1.setBackground(Color.white);
		//Delete1.setBounds(825,185,100,70);
		Delete1.addActionListener(this);
		bar1.add(Delete1);
		
		Display1=new JButton("Display");
		Display1.setFont(new Font("Times New Roman",Font.BOLD,25));
		Display1.setBackground(Color.white);
		//Display1.setBounds(825,185,100,70);
		Display1.addActionListener(this);
		bar1.add(Display1);
		
		//from here onwards to get data input in various fields from user as well as to perform update , delete operations
		
		en=new JLabel("Alumni ID :");
		en.setFont(new Font("Times New Roman",Font.BOLD,22));
		en.setBounds(100,280,200,40);
		frm2.add(en);
		
		ent=new JTextField();
		ent.setFont(new Font("Times New Roman",Font.BOLD,18));
		ent.setBounds(350,280,300,40);
		frm2.add(ent);
		
		almni=new JLabel("Name:");
		almni.setFont(new Font("Times New Roman",Font.BOLD,22));
		almni.setBounds(100,350,200,40);
		frm2.add(almni);
		
		namet=new JTextField();
		namet.setFont(new Font("Times New Roman",Font.BOLD,18));
		namet.setBounds(350,350,300,40);
		frm2.add(namet);
		
		dob=new JLabel("Date of Birth:");
		dob.setBounds(100,420,200,40);
		dob.setFont(new Font("Times New Roman",Font.BOLD,22));
		frm2.add(dob);
		
		dobt=new JTextField();
		dobt.setFont(new Font("Times New Roman",Font.BOLD,18));
		dobt.setBounds(350,420,300,40);
		frm2.add(dobt);
		
		ph=new JLabel("Phone No. :");
		ph.setFont(new Font("Times New Roman",Font.BOLD,22));
		ph.setBounds(100,490,200,40);
		frm2.add(ph);
		
		pht=new JTextField();
		pht.setFont(new Font("Times New Roman",Font.BOLD,18));
		pht.setBounds(350,490,300,40);
		frm2.add(pht);
		
		eid=new JLabel("Email ID:");
		eid.setFont(new Font("Times New Roman",Font.BOLD,22));
		eid.setBounds(100,560,200,40);
		frm2.add(eid);
		
		eidt=new JTextField();
		eidt.setFont(new Font("Times New Roman",Font.BOLD,18));
		eidt.setBounds(350,560,300,40);
		frm2.add(eidt);
		
		adds=new JLabel("Address:");
		adds.setFont(new Font("Times New Roman",Font.BOLD,22));
		adds.setBounds(100,630,200,40);
		frm2.add(adds);
		
		ta=new JTextArea();
		ta.setFont(new Font("Times New Roman",Font.BOLD,18));
		jpane=new JScrollPane(ta);
		jpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		jpane.setBounds(350,630,300,150);
		frm2.add(jpane);
		
		bnch=new JLabel("Select branch:");
		bnch.setFont(new Font("Times New Roman",Font.BOLD,22));
		bnch.setBounds(950,280,200,40);
		frm2.add(bnch);
		
		String branch[]={"Civil Engineering","Mechanical Engineering","Electrical Engineering","Computer Engineering","Information Technology","Electronics and Telecommunication","Dress Designing"};
		jcb=new JComboBox(branch);
		jcb.setFont(new Font("Times New Roman",Font.BOLD,18));
		jcb.setBounds(1200,280,300,40);
		frm2.add(jcb);
		
		jy=new JLabel("Joining Year:");
		jy.setFont(new Font("Times New Roman",Font.BOLD,22));
		jy.setBounds(950,350,200,40);
		frm2.add(jy);
		
		jyt=new JTextField();
		jyt.setFont(new Font("Times New Roman",Font.BOLD,18));
		jyt.setBounds(1200,350,300,40);
		frm2.add(jyt);
		
		py=new JLabel("Pass out Year:");
		py.setFont(new Font("Times New Roman",Font.BOLD,22));
		py.setBounds(950,420,200,40);
		frm2.add(py);
		
		pyt=new JTextField();
		pyt.setFont(new Font("Times New Roman",Font.BOLD,18));
		pyt.setBounds(1200,420,300,40);
		frm2.add(pyt);
		
		pm=new JLabel("Pass out Marks: ");
		pm.setFont(new Font("Times New Roman",Font.BOLD,22));
		pm.setBounds(950,490,200,40);
		frm2.add(pm);
		
		pmt=new JTextField();
		pmt.setFont(new Font("Times New Roman",Font.BOLD,18));
		pmt.setBounds(1200,490,300,40);
		frm2.add(pmt);
		
		plm=new JLabel("Placement Yes/No:");
		plm.setFont(new Font("Times New Roman",Font.BOLD,22));
		plm.setBounds(950,560,200,40);
		frm2.add(plm);
		
		grp=new ButtonGroup();
		//Dimension dmn=new Dimension(80,80);
		jrd1=new JRadioButton("Yes");
		jrd1.setFont(new Font("Times New Roman",Font.BOLD,20));
		jrd1.setBounds(1200,560,80,40);
		//jrd1.setSize(dmn);
		jrd2=new JRadioButton("No");
		jrd2.setFont(new Font("Times New Roman",Font.BOLD,20));
		jrd2.setBounds(1350,560,80,40);
		//jrd2.setSize(dmn);
		grp.add(jrd1);
		grp.add(jrd2);
		frm2.add(jrd1);
		frm2.add(jrd2);
		
		cmp=new JLabel("Placement details:");
		cmp.setFont(new Font("Times New Roman",Font.BOLD,22));
		cmp.setBounds(950,630,200,40);
		frm2.add(cmp);
		
		cmpt=new JTextArea();
		cmpt.setFont(new Font("Times New Roman",Font.BOLD,18));
		pane=new JScrollPane(cmpt);
		pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		pane.setBounds(1200,630,300,150);
		frm2.add(pane);
		
		btn=new JButton("Register");
		btn.setBounds(400,820,150,50);
		btn.setFont(new Font("Times New Roman",Font.BOLD,22));
		btn.setBackground(new Color(204,204,204));
		btn.addActionListener(this);
		frm2.add(btn);
		
		btn1=new JButton("Update");
		btn1.setBounds(600,820,150,50);
		btn1.setFont(new Font("Times New Roman",Font.BOLD,22));
		btn1.setBackground(new Color(204,204,204));
		btn1.addActionListener(this);
		frm2.add(btn1);
		
		btn2=new JButton("Delete");
		btn2.setBounds(800,820,150,50);
		btn2.setFont(new Font("Times New Roman",Font.BOLD,22));
		btn2.setBackground(new Color(204,204,204));
		btn2.addActionListener(this);
		frm2.add(btn2);
		
		btn3=new JButton("Reset");
		btn3.setBounds(1000,820,150,50);
		btn3.setFont(new Font("Times New Roman",Font.BOLD,22));
		btn3.setBackground(new Color(204,204,204));
		btn3.addActionListener(this);
		frm2.add(btn3);
		
		footer2=new JPanel();
		footer2.setBackground(new Color(51,153,255));
		footer2.setBounds(0,900,1600,30);
		frm2.add(footer2);
		f2=new JLabel("Alumni Database Management",JLabel.CENTER);
		f2.setFont(new Font("Times New Roman",Font.BOLD,15));
		f2.setForeground(Color.white);
		f2.setBounds(0,785,200,20);
		footer2.add(f2);
		
		frm2.setLayout(null);
		frm2.setSize(1600,1000);
		frm2.setVisible(true);
		frm2.setTitle("Alumni data register,update,delete and display form");
	}

	
	public void insertData() //this function is created to perform the insertion operation on the database
	{
		try
		{
			
			//loads/register the driver in program
			Class.forName("com.mysql.cj.jdbc.Driver");	//1
			
			//establish connection with the database
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/alumnidatamanage","root","");
			
			// (query for insertion operation)
			String insertQuery="insert into Alumni(Alumni_ID, Name, Date_of_Birth, Phone_No, Email_ID, Address, Branch, Joining_Year, Pass_out_Year, Pass_out_Marks, Placement_Yes_No, Internship_Details)values(?,?,?,?,?,?,?,?,?,?,?,?)";
			
			//create statement using PreparedStatement
			PreparedStatement pstmt=con.prepareStatement(insertQuery);	//3
			
			//passes parameters at run time
			pstmt.setInt(1,Integer.parseInt(ent.getText()));
			pstmt.setString(2,namet.getText());
			pstmt.setString(3,dobt.getText());
			pstmt.setString(4,pht.getText());
			pstmt.setString(5,eidt.getText());
			pstmt.setString(6,ta.getText());
			String cb=jcb.getSelectedItem().toString();
			pstmt.setString(7,cb);
			pstmt.setString(8,jyt.getText());
			pstmt.setString(9,pyt.getText());
			pstmt.setInt(10,Integer.parseInt(pmt.getText()));
			
			if(jrd1.isSelected())
			{
				rd="Yes";
			}
			if(jrd2.isSelected())
			{
				rd="No";
			}
			pstmt.setString(11,rd);
			pstmt.setString(12,cmpt.getText());
			
			int status=pstmt.executeUpdate();	//executer query using executeUpdate() method
			
			if(status==1)
			{
				JOptionPane.showMessageDialog(null,"Data Inserted Successfully");	//displays message to user
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Data has not been Inserted Successfully");
			}
			
			con.close();	//closed connection
				
		}
		catch(Exception exp) 
		{
			System.out.println(exp);
		}
	}
	
	public void updateData()	//this function is created to perform the updatation operation on the database
	{
		try
		{
			//loads/register the driver in program
			Class.forName("com.mysql.cj.jdbc.Driver");	//1
			
			//establish connection with the database
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/alumnidatamanage","root","");
			
			// (query for updation operation)
			String updateQuery="update Alumni set Alumni_ID=?, Name=?, Date_of_Birth=?, Phone_No=?, Email_ID=?, Address=?, Branch=?, Joining_Year=?, Pass_out_Year=?, Pass_out_Marks=?, Placement_Yes_No=?, Internship_Details=? where Alumni_ID="+Integer.parseInt(ent.getText());
			
			//create statement using PreparedStatement
			PreparedStatement pstmt=con.prepareStatement(updateQuery);	//3
			
			//passes parameters at run time
			pstmt.setInt(1,Integer.parseInt(ent.getText()));
			pstmt.setString(2,namet.getText());
			pstmt.setString(3,dobt.getText());
			pstmt.setString(4,pht.getText());
			pstmt.setString(5,eidt.getText());
			pstmt.setString(6,ta.getText());
			String cb=jcb.getSelectedItem().toString();
			pstmt.setString(7,cb);
			pstmt.setString(8,jyt.getText());
			pstmt.setString(9,pyt.getText());
			pstmt.setInt(10,Integer.parseInt(pmt.getText()));
			
			if(jrd1.isSelected())
			{
				rd="Yes";
			}
			if(jrd2.isSelected())
			{
				rd="No";
			}
			pstmt.setString(11,rd);
			pstmt.setString(12,cmpt.getText());
			
			int status=pstmt.executeUpdate();	//execute query
			
			if(status==1)
			{
				JOptionPane.showMessageDialog(null,"Data Updated Successfully");
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Data has not been successfully updated because no such Alumni id is available !!");
			}
			
			con.close();	//5 closed connection
				
		}
		catch(Exception exp)
		{
			System.out.println(exp);
		}
	}
	
	public void deleteData()	//this function is created to perform the deletion operation on the database
	{
		try
		{
			
			//loads/register the driver in program
			Class.forName("com.mysql.cj.jdbc.Driver");	//1
			
			//establish connection with the database
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/alumnidatamanage","root","");
			
			// (query for deletion operation)
			String deleteQuery="delete from Alumni where Alumni_id="+Integer.parseInt(ent.getText());
			
			//create statement using PreparedStatement
			PreparedStatement pstmt=con.prepareStatement(deleteQuery);	//3
			
			int status=pstmt.executeUpdate();	//4 execute query
			
			if(status==1)
			{
				JOptionPane.showMessageDialog(null,"Data Deleted Successfully");
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Data has not been successfully deleted because no such Alumni id is available !!");
			}
			
			con.close();	//5
			
		}
		catch(Exception exp)
		{
			System.out.println(exp);
		}
			
	}
	
	public void displayData()
	{
		//The GUI required for the dataManage page done using various swing components
		
		frm3=new JFrame();
		
		logo3=new JPanel();
		logo3.setLayout(null);
		logo3.setBackground(new Color(51,153,255));
		logo3.setBounds(0,0,1600,180);
		frm3.add(logo3);
		
		i3=new ImageIcon("C:/Microproject/collage logo.jpeg");
		JLabel image3=new JLabel(i3);
		image3.setBounds(7,10,200,160);
		logo3.add(image3);
		
		
		name3=new JLabel("Government Residence Women Polytechnic, Tasgaon");
		name3.setFont(new Font("Times New Roman",Font.BOLD,50));
		name3.setForeground(Color.white);
		name3.setBounds(300,50,1400,60);
		logo3.add(name3);
		
		bar2=new JPanel();
		bar2.setBounds(0,180,1600,50);
		bar2.setBackground(new Color(102,178,255));
		frm3.add(bar2);
		
		home2=new JButton("Home page");
		home2.setFont(new Font("Times New Roman",Font.BOLD,25));
		home2.setBackground(Color.white);
		//home2.setBounds(0,190,100,70);
		home2.addActionListener(this);
		bar2.add(home2);
		
		
		Register2=new JButton("Registration Form");
		Register2.setFont(new Font("Times New Roman",Font.BOLD,25));
		Register2.setBackground(Color.white);
		//Register2.setBounds(275,185,100,70);
		Register2.addActionListener(this);
		bar2.add(Register2);
		
		Update2=new JButton("Update Form");
		Update2.setFont(new Font("Times New Roman",Font.BOLD,25));
		Update2.setBackground(Color.white);
		//Update2.setBounds(550,185,100,70);
		Update2.addActionListener(this);
		bar2.add(Update2);
		
		Delete2=new JButton("Delete Form");
		Delete2.setFont(new Font("Times New Roman",Font.BOLD,25));
		Delete2.setBackground(Color.white);
		//Delete2.setBounds(825,185,100,70);
		Delete2.addActionListener(this);
		bar2.add(Delete2);
		
		Display2=new JButton("Display");
		Display2.setFont(new Font("Times New Roman",Font.BOLD,25));
		Display2.setBackground(Color.white);
		//Display2.setBounds(825,185,100,70);
		Display2.addActionListener(this);
		bar2.add(Display2);
		
		dtm=new DefaultTableModel(); 
		
		jtbl=new JTable(dtm);
		jtbl.setBounds(100,270,1400,600);
		jtbl.setPreferredScrollableViewportSize(new Dimension(1400,600));
		jtbl.setFillsViewportHeight(true);
		jtbl.setBackground(new Color(204,204,204));
		jpn=new JScrollPane(jtbl);
		jpn.setBounds(100,270,1400,600);
		frm3.add(jpn);

		//frm3.add(new JScrollPane(jtbl));
	
		//added column to table
		dtm.addColumn("Alumni_ID");
		dtm.addColumn("Name");
		dtm.addColumn("Date_of_Birth");
		dtm.addColumn("Phone_No");
		dtm.addColumn("Email_ID");
		dtm.addColumn("Address");
		dtm.addColumn("Branch");
		dtm.addColumn("Joining_Year");
		dtm.addColumn("Pass_out_Year");
		dtm.addColumn("Pass_out_Marks");
		dtm.addColumn("Placement_Yes_No");
		dtm.addColumn("Internship_Details");
		
		try
		{
			//loads/register the driver in program
			Class.forName("com.mysql.cj.jdbc.Driver");	//1
			
			//establish connection with the database
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/alumnidatamanage","root","");
			
			//query for display data from database
			String displayQuery="select * from Alumni";
			
			Statement stmt=con.createStatement(); 		//create query
			
			ResultSet rs=stmt.executeQuery(displayQuery);	//execute query
			
			//fetching data from database
			while(rs.next())
			{
				int alid=rs.getInt("Alumni_ID");
				String namestr=rs.getString("Name");
				String dobstr=rs.getString("Date_of_Birth");
				String phonestr=rs.getString("Phone_No");
				String emailstr=rs.getString("Email_ID");
				String addstr=rs.getString("Address");
				String bstr=rs.getString("Branch");
				String jystr=rs.getString("Joining_Year");
				String pystr=rs.getString("Pass_out_Year");
				String pmstr=rs.getString("Pass_out_Marks");
				String pynstr=rs.getString("Placement_Yes_No");
				String idstr=rs.getString("Internship_Details");
				
				//adding row in table
				dtm.addRow(new Object[]{alid, namestr, dobstr, phonestr, emailstr, addstr, bstr, jystr, pystr, pmstr, pynstr, idstr});
			}
		}
		catch(Exception exp)
		{
			System.out.println(exp);
		}
		
		
		footer3=new JPanel();
		footer3.setBackground(new Color(51,153,255));
		footer3.setBounds(0,900,1600,30);
		frm3.add(footer3);
		f3=new JLabel("Alumni Database Management",JLabel.CENTER);
		f3.setFont(new Font("Times New Roman",Font.BOLD,15));
		f3.setForeground(Color.white);
		f3.setBounds(0,785,200,20);
		footer3.add(f3);
		
		frm3.setLayout(null);
		frm3.setSize(1600,1000);
		frm3.setVisible(true);
		frm3.setTitle("Alumni data register,update,delete and display form");
		
	}
	
	public void actionPerformed(ActionEvent aevnt)		//when action event occurs then this method will call
	{
		if(aevnt.getSource()==b)	//login 
		{																
			String str1=tf1.getText();
			String str2=pf2.getText();
			
			if((str1.equals("GRWPT@Girls")) && (str2.equals("Admin@1228")))
			{
				jd.setVisible(true);
			}
			else
			{
				jdlog.setVisible(true);
			}
		}
		else if(aevnt.getSource()==okb)
		{
			frm.setVisible(false);
			Homecopy();
		}
		else if(aevnt.getSource()==okbtn)
		{
			jdlog.setVisible(false);
			
		}
		else if(aevnt.getSource()==r)		//reset
		{
			tf1.setText("");
			pf2.setText("");
		}
		else if(aevnt.getSource()==home) 	// pages
		{
			frm1.setVisible(false);
			Homecopy();			
		}
		else if(aevnt.getSource()==Register)
		{
			frm1.setVisible(false);
			dataManage();
		}
		else if(aevnt.getSource()==Update)
		{
			frm1.setVisible(false);
			dataManage();
		}
		else if(aevnt.getSource()==Delete)
		{
			frm1.setVisible(false);
			dataManage();
		}
		else if(aevnt.getSource()==Display)
		{
			frm1.setVisible(false);
			displayData();
		}
		else if(aevnt.getSource()==home1)
		{
			frm2.setVisible(false);
			Homecopy();			
		}
		else if(aevnt.getSource()==Register1)
		{
			frm2.setVisible(false);
			dataManage();
		}
		else if(aevnt.getSource()==Update1)
		{
			frm2.setVisible(false);
			dataManage();
		}
		else if(aevnt.getSource()==Delete1)
		{
			frm2.setVisible(false);
			dataManage();
		}
		else if(aevnt.getSource()==Display1)
		{
			frm2.setVisible(false);
			displayData();
		}
		else if(aevnt.getSource()==btn) //register
		{
			insertData();
		}
		else if(aevnt.getSource()==btn1)		//update
		{
			updateData();
		}
		else if(aevnt.getSource()==btn2)		//delete
		{
			deleteData();
		}
		else if(aevnt.getSource()==btn3)		//reset
		{
			ent.setText("");
			namet.setText("");
			dobt.setText("");
			pht.setText("");
			eidt.setText("");
			ta.setText("");
			jcb.setSelectedIndex(0);
			jyt.setText("");
			pyt.setText("");
			pmt.setText("");
			grp.clearSelection();
			cmpt.setText("");
		}
		else if(aevnt.getSource()==home2)	//pages
		{
			frm3.setVisible(false);
			Homecopy();			
		}
		else if(aevnt.getSource()==Register2)
		{
			frm3.setVisible(false);
			dataManage();
		}
		else if(aevnt.getSource()==Update2)
		{
			frm3.setVisible(false);
			dataManage();
		}
		else if(aevnt.getSource()==Delete2)
		{
			frm3.setVisible(false);
			dataManage();
		}
		else if(aevnt.getSource()==Display2)
		{
			frm3.setVisible(false);
			displayData();
		}
			
			
	}
	
	public static void main(String args[]) //main function
	{
		new LoginFormcopy(); 
		
	}
}