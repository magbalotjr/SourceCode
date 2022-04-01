import javax.swing.*;
import java.awt.*;
import javax.swing.JScrollPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Questions {
	public static void main (String [] args) {
				JPanel panel=new JPanel();
				panel.setSize( 900, 2000 );
				//panel.setLayout(null);
				panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
				panel.setBackground(Color.WHITE);
				JScrollPane scrollBar=new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
				
		JFrame frame = new JFrame("QUIZ!!");
		//frame.setSize(400,400);
			frame.setSize(1200,550);
			//frame.setLayout(null);
		

			
			JLabel quiz,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,p1,p2,ans1,ans2,ans3,ans4;
			JRadioButton q1a,q1b,q1c,q2a,q2b,q2c,q3a,q3b,q3c,q4a,q4b,q4c;
			ButtonGroup bq1,bq2,bq3,bq4;
			JTextField qt1,qt2,qt3,qt4;
			JCheckBox c1a,c1b,c1c,c2a,c2b,c2c,c3a,c3b,c3c,c4a,c4b,c4c;
			
			
			
			
			
			quiz = new JLabel("QUIZ # 1");
			panel.add(quiz);
			//quiz.setBounds(30,10,500,50);
			quiz.setFont(new Font("Serif", Font.BOLD, 40));
			
			JLabel des = new JLabel("INSTRUCTIONS: Read the question carefully and choose the correct answer");
			panel.add(des);
			//des.setBounds(50,30,900,80);
			des.setFont(new Font("Serif",Font.BOLD, 24));
			
			q1 =new JLabel("1.Filaria is caused by?");
			panel.add(q1);
			q1a=new JRadioButton("A.Virus");    
			panel.add(q1a);
			q1b=new JRadioButton("B.Mosquito");    
			panel.add(q1b);
			q1c=new JRadioButton("C.Ant");    
			panel.add(q1c);
			bq1 = new ButtonGroup();
			bq1.add(q1a);
			bq1.add(q1b);
			bq1.add(q1c);
			q1.setFont(new Font("Monospaced",Font.PLAIN, 18));
			
			
			
			
			q2 = new JLabel("2.What do you use during Online class");
			panel.add(q2);
			q2a=new JRadioButton("A.Laptop");    
			panel.add(q2a);
			q2b=new JRadioButton("B.Mobile Phone");    
			panel.add(q2b);
			q2c=new JRadioButton("C.Television");    
			panel.add(q2c);
			bq2 = new ButtonGroup();
			bq2.add(q2a);
			bq2.add(q2b);
			bq2.add(q2c);
			q2.setFont(new Font("Monospaced",Font.PLAIN, 18));
			
			
			
			
			q3= new JLabel("3.During the Solar Eclipse, what comes in front of the sun and blocks it's Light?");
			panel.add(q3);
			q3a=new JRadioButton("A.Laptop");    
			panel.add(q3a);
			q3b=new JRadioButton("B.Mobile Phone");    
			panel.add(q3b);
			q3c=new JRadioButton("C.Television");    
			panel.add(q3c);
			bq3 = new ButtonGroup();
			bq3.add(q3a);
			bq3.add(q3b);
			bq3.add(q3c);
			q3.setFont(new Font("Monospaced",Font.PLAIN, 18));
			
			q4 = new JLabel("4.Microsoft has developed its latest version of the Windows operation. Which is the Latest Version?");
			panel.add(q4);
			q4a=new JRadioButton("A. Windows 11");    
			panel.add(q4a);
			q4b=new JRadioButton("B.Windows XPro");    
			panel.add(q4b);
			q4c=new JRadioButton("C.Windows 9");    
			panel.add(q4c);
			bq4 = new ButtonGroup();
			bq4.add(q4a);
			bq4.add(q4b);
			bq4.add(q4c);
			q4.setFont(new Font("Monospaced",Font.PLAIN, 18));
			
			
			
			
		
			


			q5 = new JLabel("5. Which Vaccine received ergency Use validation from WHO?");
			panel.add(q5);
			ans1 = new JLabel("ANSWER:");
			panel.add(ans1);
			qt1 = new JTextField();
			panel.add(qt1);
			
			q5.setFont(new Font("Monospaced",Font.PLAIN, 18));
			
			
			
			q6 = new JLabel("6.Which course will be discontinued as per National Education Policy (NEP) 2020?");
			panel.add(q6);
			ans2 = new JLabel("ANSWER:");
			panel.add(ans2);
			qt2 = new JTextField();
			panel.add(qt2);
			q6.setFont(new Font("Monospaced",Font.PLAIN, 18));
			
			
			
			
			
			q7 = new JLabel("7.World's oldest known cave painting was found recently in which country?(");
			panel.add(q7);
			ans3 = new JLabel("ANSWER:");
			panel.add(ans3);
			qt3 = new JTextField();
			panel.add(qt3);
			q7.setFont(new Font("Monospaced",Font.PLAIN, 18));

			
			
			
			
	
	
			q8 = new JLabel("8.One kilobyte is equal to how many byte?(SELECT 2)");
			panel.add(q8);
			c1a = new JCheckBox("A.1000 byte");
			panel.add(c1a);
			c1b = new JCheckBox("B.100 byte");
			panel.add(c1b);
			c1c = new JCheckBox("C.1024 byte");
			panel.add(c1c);
			q8.setFont(new Font("Monospaced",Font.PLAIN, 18));
			
			
			
			
			
			q9 = new JLabel("9.The term PC means? (SELECT 2)");
			panel.add(q9);
			c2a = new JCheckBox("A.Personal Computer");
			panel.add(c2a);
			c2b = new JCheckBox("B.People Computer");
			panel.add(c2b);
			c2c = new JCheckBox("C.Private Computer");
			panel.add(c2c);
			q9.setFont(new Font("Monospaced",Font.PLAIN, 18));
			
			
			
			
			
			
			q10= new JLabel("10.When we opens an intermet site we see www. What site is the full form of www?(SELECT 2)");
			panel.add(q10);
			c3a = new JCheckBox("A.World Wide Wed");
			panel.add(c3a);
			c3b = new JCheckBox("B.World Wide Web");
			panel.add(c3b);
			c3c = new JCheckBox("C.Word Winding Works");
			panel.add(c3c);
			q10.setFont(new Font("Monospaced",Font.PLAIN, 18));
	
	
	
			
			
			
			q11 = new JLabel("11.Magnetic disk a medium known as?  (SELECT 2)");
			panel.add(q11);		
			c4a = new JCheckBox("A.Serial Access");
			panel.add(c4a);
			c4b = new JCheckBox("B.Direct Access");
			panel.add(c4b);
			c4c = new JCheckBox("C.Sequential Access");
			panel.add(c4c);
			q11.setFont(new Font("Monospaced",Font.ITALIC, 18));
		

frame.add(scrollBar);    
		
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
			

	}
}
