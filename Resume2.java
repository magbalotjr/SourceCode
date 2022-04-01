import javax.swing.*;
import java.awt.*;
public class Resume2 {
	public static void main (String [] args) {
		
		JFrame frame = new JFrame("Personal Information");
		frame.setSize(1000,860);
		frame.setLayout(null);
			JLabel name,age,bday,sex,addr,elem,high,coll,skill1,skill2,skill3,skill4;
			JLabel elem1,high1,coll1,yr1,yr2,yr3,age1,bday1,sex1,addr1,bm1,bm2,bm3;
			name = new JLabel("HAZZEL A. PILARIZA");
			frame.add(name);
			name.setBounds(30,10,900,50);
			name.setFont(new Font("Serif", Font.BOLD, 40));
			
	JLabel des = new JLabel("________________________________________________________________________________________________________________________________");
    frame.add(des);
	des.setBounds(10,30,900,55);
			
			age =new JLabel("Age:");
			age1 = new JLabel("22");
			frame.add(age);
			frame.add(age1);
			age.setBounds(100,30, 500,120);
			age1.setBounds(300,30, 500,120);
			age.setFont(new Font("Monospaced",Font.PLAIN, 20));
			age1.setFont(new Font("Monospaced",Font.PLAIN, 20));
			
			
			
			
			bday = new JLabel("Birth date:");
			bday1 = new JLabel("DECEMBER 29,1999");
			frame.add(bday);
			frame.add(bday1);
			bday.setBounds(100,30,500,150);
			bday1.setBounds(300,30, 500,150);
			bday.setFont(new Font("Monospaced",Font.PLAIN, 20));
			bday1.setFont(new Font("Monospaced",Font.PLAIN, 20));
			
			
			
			
			sex = new JLabel("Sex:");
			sex1 = new JLabel("FEMALE");
			frame.add(sex);
			frame.add(sex1);
			sex.setBounds(100,30,500,190);
			sex1.setBounds(300,30,500,190);
			sex.setFont(new Font("Monospaced",Font.PLAIN, 20));
			sex1.setFont(new Font("Monospaced",Font.PLAIN, 20));
			
			addr = new JLabel("Address:");
			addr1 = new JLabel("VILLA AGLIPAY SAN JOSE,TARLAC");
			frame.add(addr);
			frame.add(addr1);
			addr.setBounds(100,30,500,230);
			addr1.setBounds(300,30,500,230);
			addr.setFont(new Font("Monospaced",Font.PLAIN, 20));
			addr1.setFont(new Font("Monospaced",Font.PLAIN, 20));
			
			
			
			
		
			
	JLabel educ = new JLabel("EDUCATIONAL BACKGROUND");
	frame.add(educ);
	educ.setBounds(30,10,600,340);
	educ.setFont(new Font("Dialog", Font.BOLD, 30));
	
	JLabel des1 = new JLabel("________________________________________________________________________________________________________________________________");
    frame.add(des1);
	des1.setBounds(10,15,900,345);	

			elem = new JLabel("Elementary:");
			elem1 = new JLabel("VILLA AGLIPAY CENTRAL ELEMTARY SCHOOL");
			yr1 = new JLabel("| S.Y. 2010-2011");
			frame.add(elem);
			frame.add(elem1);
			frame.add(yr1);
			elem.setBounds(100,30,600,370);
			elem1.setBounds(250,30,600,370);
			yr1.setBounds(705,30,600,370);
			elem.setFont(new Font("Monospaced",Font.PLAIN, 20));
			elem1.setFont(new Font("Monospaced",Font.ITALIC, 20));
			yr1.setFont(new Font("Monospaced",Font.PLAIN, 20));
			
			
			
			high = new JLabel("High School:");
			high1 = new JLabel("VILLA AGLIPAY NATIONAL HIGH SCHOOL");
			yr2 = new JLabel("| S.Y. 2017-2018");
			frame.add(high);
			frame.add(high1);
			frame.add(yr2);
			high.setBounds(100,30,600,405);
			high1.setBounds(250,30,600,405);
			yr2.setBounds(705,30,600,405);
			high.setFont(new Font("Monospaced",Font.PLAIN, 20));
			high1.setFont(new Font("Monospaced",Font.ITALIC, 20));
			yr2.setFont(new Font("Monospaced",Font.PLAIN, 20));
			
			
			
			
			
			coll = new JLabel("College:");
			coll1 = new JLabel("TARLAC STATE UNIVERSITY");
			yr3 = new JLabel("| S.Y. 2020-2022");
			frame.add(coll);
			frame.add(coll1);
			frame.add(yr3);
			coll.setBounds(100,30,600,440);
			coll1.setBounds(250,30,600,440);
			yr3.setBounds(705,30,600,440);
			coll.setFont(new Font("Monospaced",Font.PLAIN, 20));
			coll1.setFont(new Font("Monospaced",Font.ITALIC, 20));
			yr3.setFont(new Font("Monospaced",Font.PLAIN, 20));	
			
			
			
			
			
	JLabel skills = new JLabel("SKILLS (ICT/Computer-related)");
	frame.add(skills);
	skills.setBounds(30,10,600,550);
	skills.setFont(new Font("Dialog", Font.BOLD, 30));
	
	JLabel des2 = new JLabel("________________________________________________________________________________________________________________________________");
    frame.add(des2);
	des2.setBounds(10,15,900,570);	
	
	
			skill1 = new JLabel("> INSTALL WINDOWS XP");
			skill2 = new JLabel("> GRAPHICS DESIGN");
			skill3 = new JLabel("> MICROSOFT OFFICE");
			frame.add(skill1);
			frame.add(skill2);
			frame.add(skill3);
			skill1.setBounds(100,15,900,620);
			skill2.setBounds(100,15,900,655);
			skill3.setBounds(100,15,900,690);
			skill1.setFont(new Font("Monospaced",Font.PLAIN, 20));
			skill2.setFont(new Font("Monospaced",Font.PLAIN, 20));
			skill3.setFont(new Font("Monospaced",Font.PLAIN, 20));
	
	
	
	
	JLabel books_movies = new JLabel("FAVORITES BOOKS/ MOVIES");
	frame.add(books_movies);
	books_movies.setBounds(30,10,600,800);
	books_movies.setFont(new Font("Dialog", Font.BOLD, 30));
	
	JLabel des3 = new JLabel("________________________________________________________________________________________________________________________________");
    frame.add(des3);
	des3.setBounds(10,15,900,805);	
			
			
			
			bm1 = new JLabel("* UNFORGETABLE");
			bm2 = new JLabel("* JURRASIC WORLD");
			bm3 = new JLabel("* THE INVISIBLE MAN");
			frame.add(bm1);
			frame.add(bm2);
			frame.add(bm3);
			bm1.setBounds(100,15,900,855);
			bm2.setBounds(100,15,900,895);
			bm3.setBounds(100,15,900,930);
			bm1.setFont(new Font("Monospaced",Font.ITALIC, 20));
			bm2.setFont(new Font("Monospaced",Font.ITALIC, 20));
			bm3.setFont(new Font("Monospaced",Font.ITALIC, 20));


	
		JLabel cert,cert1,printname,line,sign;
			cert = new JLabel("I HEREBY CERTIFY that the information provided in this form is complete, true");
			cert1 = new JLabel("and correct to the best of my knowledge.");
			frame.add(cert);
			frame.add(cert1);
			cert.setBounds(200,15,900,1200);
			cert1.setBounds(100,15,900,1250);
			cert.setFont(new Font("SansSerif",Font.ITALIC, 17));
			cert1.setFont(new Font("SansSerif",Font.ITALIC, 17));


			printname = new JLabel ("HAZZEL A. PILARIZA");
			line = new JLabel ("_____________________________");
			sign = new JLabel ("Signature Over Printed Name");
			frame.add(printname);
			frame.add(line);
			frame.add(sign);
			printname.setBounds(645,15,900,1340);
			line.setBounds(600,15,900,1350);
			sign.setBounds(620,15,900,1390);
		
		
		
		
		
		
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
}
		