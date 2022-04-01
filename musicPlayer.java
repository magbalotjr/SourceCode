import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class musicPlayer{
	
	
	
	public static void main (String [] args) {
	
	
	
	
			JFrame front = new JFrame("Login");
			front.setSize(350,380);
			front.setResizable(false);
			front.setLayout(null);
			JLabel user,pass,logpage,logpage1,logpage2,img,img1;
			JTextField user1;
			JPasswordField pass1;
			JMenu playList;
			JMenuItem	m1,m2,m3,m4;
			
			
	
			img = new JLabel("");
			img.setIcon(new ImageIcon("C:\\Users\\user\\OneDrive - Tarlac State University\\Desktop\\CaseStudy\\IMAGE\\darkBack.jpg"));
			img.setBounds(0,0,350,350);
			img.setOpaque(true);
		
		
		
		
		
	
				logpage = new JLabel("ULTIMATE");
				front.add(logpage);
				logpage.setBounds(85,10,250,50);
				logpage.setFont(new Font("SansSerif", Font.BOLD, 25));
				logpage.setForeground(new Color(171, 168, 167));
				
				
				logpage1 = new JLabel("MUSIC");
				front.add(logpage1);
				logpage1.setBounds(85,50,350,50);
				logpage1.setFont(new Font("SansSerif", Font.BOLD, 24));
				logpage1.setForeground(new Color(171, 168, 167));
				
				
				logpage2 = new JLabel("PLAYER");
				front.add(logpage2);
				logpage2.setBounds(85,80,150,50);
				logpage2.setFont(new Font("SansSerif", Font.BOLD, 24));
				logpage2.setForeground(new Color(171, 168, 167));
		
		
		
		
		/*
		
							user = new JLabel("USERNAME: ");
							front.add(user);
							user.setBounds(20,150,150,50);
							user.setFont(new Font("SansSerif", Font.BOLD, 18));
							user.setForeground(new Color(11, 156, 143));
							
							pass = new JLabel("PASSWORD: ");
							front.add(pass);
							pass.setBounds(20,190,150,50);
							pass.setFont(new Font("SansSerif", Font.BOLD, 18));
							pass.setForeground(new Color(11, 156, 143));
					
						user1 = new JTextField();
							front.add(user1);
							user1.setBounds(135,160,150,30);
							user1.setFont(new Font("SansSerif", Font.ITALIC, 17));
							
					
					
							pass1 = new JPasswordField();
							front.add(pass1);
							pass1.setBounds(135,200,150,30);
							pass1.setFont(new Font("SansSerif", Font.ITALIC, 17));
							
			*/		
			
		JButton login,play,stop,next,back;
		
		String  p="PLAY";
		String  s="STOP";
		
		

		
		play = new JButton(p);
		play.setOpaque(false);
		play.setContentAreaFilled(false);
		play.setFont(new Font("Serif", Font.BOLD, 15));
		front.add(play);
		play.setBounds(135,260,80,25);
		play.setForeground(new Color(171, 168, 167));
		
		stop = new JButton(s);
		stop.setOpaque(false);
		stop.setContentAreaFilled(false);
		stop.setFont(new Font("Serif", Font.BOLD, 15));

		stop.setBounds(127,260,80,25);
		stop.setForeground(new Color(171, 168, 167));
		
		next = new JButton("|>");
		next.setOpaque(false);
		next.setContentAreaFilled(false);
		next.setFont(new Font("Serif", Font.BOLD, 20));
		front.add(next);
		next.setBounds(220,260,80,25);
		next.setForeground(new Color(171, 168, 167));
		
		back = new JButton("<|");
		back.setOpaque(false);
		back.setContentAreaFilled(false);
		back.setFont(new Font("Serif", Font.BOLD, 20));
		front.add(back);
		back.setBounds(50,260,80,25);
		back.setForeground(new Color(171, 168, 167));
		front.add(img);
		

		
			front.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			front.setLocationRelativeTo(null);
			front.setVisible(true);
					
	
	
	}
	}
