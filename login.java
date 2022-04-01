import javax.swing.*;
import java.awt.*;
public class login {
	public static void main (String [] args) {
		
			JFrame frame = new JFrame("Register");
			frame.setSize(500,300);
			frame.setLayout(null);	

				JLabel user,pass,forgot,reg1,reg,divide;
				JTextField user1;
				JPasswordField pass1;
				JButton login;
				
				
				
				user = new JLabel("Username:");
				frame.add(user);
				user.setBounds(50,10,100,150);
				user.setFont(new Font("Serif",Font.BOLD,20 ));
				
				user1 = new JTextField();
				frame.add(user1);
				user1.setBounds(150,75,250,25);
				user1.setFont(new Font("SansSerif", Font.PLAIN, 15));
				
				
				
				
				
				
				pass = new JLabel("Password :");
				frame.add(pass);
				pass.setBounds(50,10,100,210);
				pass.setFont(new Font("Serif",Font.BOLD, 20));
		
				pass1 = new JPasswordField();
				frame.add(pass1);
				pass1.setBounds(150,105,250,25);
		
		
		
				login = new JButton("LOGIN");
				frame.add(login);
				login.setBounds(200,140,155,40);
				
				
				forgot = new JLabel("Forgot password?  ");
				frame.add(forgot);
				forgot.setBounds(150,10,100,370);
				forgot.setFont(new Font("SansSerif", Font.ITALIC, 10));
				forgot.setForeground(Color.red);
				
				divide = new JLabel(" | ");
				frame.add(divide);
				divide.setBounds(240,10,100,370);
				divide.setFont(new Font("SansSerif", Font.BOLD, 10));

				
				reg = new JLabel(" New to JAVA? ");
				frame.add(reg);
				reg.setBounds(250,10,100,370);
				reg.setFont(new Font("SansSerif", Font.ITALIC, 10));
				
				reg1 = new JLabel("Sign UP");
				frame.add(reg1);
				reg1.setBounds(330,10,100,370);
				reg1.setFont(new Font("MONOSPACED", Font.BOLD, 12));
				reg1.setForeground(Color.blue);
		
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}