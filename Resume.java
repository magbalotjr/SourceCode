import javax.swing.*;
import java.awt.*;
import javax.swing.JScrollPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Resume {
	public static void main (String [] args) {
		
		JFrame frame = new JFrame("Personal Information");
		frame.setSize(1000,860);
		frame.setLayout(null);
		
		
		
		
			JLabel name,age,bday,sex,addr,elem,high,coll,skill1,skill2,skill3,skill4;
			JLabel elem1,high1,coll1,yr1,yr2,yr3,age1,bday1,sex1,addr1,bm1,bm2,bm3;
			
			name = new JLabel("Ruben R. Magbalot Jr");
			frame.add(name);
			name.setBounds(30,10,500,50);
			name.setFont(new Font("Serif", Font.BOLD, 40));
			
			JLabel des = new JLabel("________________________________________________________________________________________________________________________________");
			frame.add(des);
			des.setBounds(10,30,900,55);
			
			age =new JLabel("Age:");
			frame.add(age);
			age.setBounds(100,30, 500,120);
			age.setFont(new Font("Monospaced",Font.PLAIN, 20));
			
			
			
			
			bday = new JLabel("Birth date:");
			frame.add(bday);
			bday.setBounds(100,30,500,150);
			bday.setFont(new Font("Monospaced",Font.PLAIN, 20));
			
			
			
			
			sex = new JLabel("Sex:");
			frame.add(sex);
			sex.setBounds(100,30,500,190);
			sex.setFont(new Font("Monospaced",Font.PLAIN, 20));
			
			addr = new JLabel("Address:");
			frame.add(addr);
			addr.setBounds(100,30,500,230);
			addr.setFont(new Font("Monospaced",Font.PLAIN, 20));
			
			
			
			
		
			


			elem = new JLabel("Elementary:");
			frame.add(elem);
			elem.setBounds(100,30,600,370);
			elem.setFont(new Font("Monospaced",Font.PLAIN, 20));
			
			
			
			high = new JLabel("High School:");
			frame.add(high);
			high.setBounds(100,30,600,405);
			high.setFont(new Font("Monospaced",Font.PLAIN, 20));
			
			
			
			
			
			coll = new JLabel("College:");
			frame.add(coll);
			coll.setBounds(100,30,600,440);
			coll.setFont(new Font("Monospaced",Font.PLAIN, 20));

			
			
			
			
	
	
			skill1 = new JLabel("> Programming (Java, C++)");
			skill2 = new JLabel("> MS Office (Word, Excel and Powerpoint)");
			skill3 = new JLabel("> Graphics (Photoshop)");
			frame.add(skill1);
			frame.add(skill2);
			frame.add(skill3);
			skill1.setBounds(100,15,900,620);
			skill2.setBounds(100,15,900,655);
			skill3.setBounds(100,15,900,690);
			skill1.setFont(new Font("Monospaced",Font.PLAIN, 20));
			skill2.setFont(new Font("Monospaced",Font.PLAIN, 20));
			skill3.setFont(new Font("Monospaced",Font.PLAIN, 20));
	
	
	
			
			
			
			bm1 = new JLabel("* Sorcerer's Apprentice");
			bm2 = new JLabel("* Crazy Beautiful You");
			bm3 = new JLabel("* Blood");
			frame.add(bm1);
			frame.add(bm2);
			frame.add(bm3);
			bm1.setBounds(100,15,900,855);
			bm2.setBounds(100,15,900,895);
			bm3.setBounds(100,15,900,930);
			bm1.setFont(new Font("Monospaced",Font.ITALIC, 20));
			bm2.setFont(new Font("Monospaced",Font.ITALIC, 20));
			bm3.setFont(new Font("Monospaced",Font.ITALIC, 20));
		
		
		
		
		
		
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
}
		