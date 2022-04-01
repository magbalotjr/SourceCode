import javax.swing.*;
import java.awt.*;
public class Register {
	public static void main (String [] args) {
	
	
		JFrame frame = new JFrame("Register");
			frame.setSize(500,700);
			frame.setLayout(null);
			
		JLabel head,name,gender,reli,nat,user,email,pass,conf,tell,first,sur;
		JTextField head1,name1,name2,gender1,reli1,nat1,user1,email1;
		JPasswordField pass1,conf1;
		
			head = new JLabel("Register Form");
			frame.add(head);
			head.setBounds(120,10,900,50);
			head.setFont(new Font("SansSerif", Font.BOLD, 35));
			
				
				name = new JLabel("Name: ");
				frame.add(name);
				name.setBounds(20,10,100,200);
				name.setFont(new Font("Serif", Font.BOLD, 20));
				
				first = new JLabel("FIRST NAME");
				frame.add(first);
				first.setBounds(260,10,100,160);
				first.setFont(new Font("Serif", Font.ITALIC, 10));
				
				sur = new JLabel("SURNAME");
				frame.add(sur);
				sur.setBounds(100,10,100,160);
				sur.setFont(new Font("Serif", Font.ITALIC, 10));
				
				
				name1 = new JTextField();
				frame.add(name1);
				name1.setBounds(100,100,160,25);
				name1.setFont(new Font("SansSerif", Font.PLAIN, 15));
				
				name2 = new JTextField();
				frame.add(name2);
				name2.setBounds(260,100,160,25);
				name2.setFont(new Font("SansSerif", Font.PLAIN, 15));
				
				
				gender = new JLabel("Gender:");
				frame.add(gender);
				gender.setBounds(20,10,100,270);
				gender.setFont(new Font("Serif", Font.BOLD, 20));
				
				gender1 = new JTextField();
				frame.add(gender1);
				gender1.setBounds(100,135,160,25);
				gender1.setFont(new Font("SansSerif", Font.PLAIN, 15));		

	JLabel des1 = new JLabel("________________________________________________________________");
    frame.add(des1);
	des1.setBounds(15,15,900,290);	
			
				
				reli = new JLabel("Religion:");
				frame.add(reli);
				reli.setBounds(20,10,100,340);
				reli.setFont(new Font("Serif", Font.BOLD, 20));
				
				reli1 = new JTextField();
				frame.add(reli1);
				reli1.setBounds(130,170,250,25);
				reli1.setFont(new Font("SansSerif", Font.PLAIN, 15));	
				
				
				nat = new JLabel("Nationality:");
				frame.add(nat);
				nat.setBounds(20,10,100,410);
				nat.setFont(new Font("Serif", Font.BOLD, 20));
				
				nat1 = new JTextField();
				frame.add(nat1);
				nat1.setBounds(130,205,250,25);
				nat1.setFont(new Font("SansSerif", Font.PLAIN, 15));	
				
				
				user = new JLabel("Username:");
				frame.add(user);
				user.setBounds(20,10,100,480);
				user.setFont(new Font("Serif", Font.BOLD, 20));
				
				user1 = new JTextField();
				frame.add(user1);
				user1.setBounds(130,240,250,25);
				user1.setFont(new Font("SansSerif", Font.PLAIN, 15));	
				
				
				email = new JLabel("Email:");
				frame.add(email);
				email.setBounds(20,10,100,550);
				email.setFont(new Font("Serif", Font.BOLD, 20));
				
				email1 = new JTextField();
				frame.add(email1);
				email1.setBounds(130,275,250,25);
				email1.setFont(new Font("SansSerif", Font.PLAIN, 15));	

	JLabel des2 = new JLabel("________________________________________________________________");
    frame.add(des2);
	des2.setBounds(15,15,900,570);				
	
				
			
				pass = new JLabel("Password:");
				frame.add(pass);
				pass.setBounds(20,10,500,620);
				pass.setFont(new Font("Serif", Font.BOLD, 20));
				
				pass1 = new JPasswordField();
				frame.add(pass1);
				pass1.setBounds(190,310,250,25);

				
				
				conf = new JLabel("Confirm Password:");
				frame.add(conf);
				conf.setBounds(20,10,500,690);
				conf.setFont(new Font("Serif", Font.BOLD, 20));
				
				conf1 = new JPasswordField();
				frame.add(conf1);
				conf1.setBounds(190,345,250,25);

				
				
				tell = new JLabel("Tell me something about the subject?");
				frame.add(tell);
				tell.setBounds(20,10,500,760);
				tell.setFont(new Font("Serif", Font.BOLD, 20));
				
				JTextArea tell1 = new JTextArea();
				frame.add(tell1);
				tell1.setColumns(20);
				tell1.setLineWrap(true);
				tell1.setRows(5);
				tell1.setWrapStyleWord(true);
				tell1.setFont(new Font("SansSerif", Font.ITALIC, 15));
				JScrollPane scrollPane = new JScrollPane(tell1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
				frame.add(scrollPane);
				scrollPane.setBounds(30,420,400,150);


				JButton reg = new JButton("REGISTER");
				frame.add(reg);
				reg.setBounds(150,600,150,30);
				reg.setFont(new Font("SansSerif", Font.ITALIC, 15));
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
			
	
	}
	}