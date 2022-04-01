
package act2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Act2 {
    
    public Act2() {

                JFrame frame = new JFrame("Actvity 2");
                
		Container con = frame.getContentPane();
		con.setLayout(null);
                
		
                JButton b1, b2, b3;
                JLabel label;   
                Font f1 = new Font(Font.SANS_SERIF, Font.ROMAN_BASELINE,20);
                Font f2 = new Font (Font.DIALOG_INPUT,Font.PLAIN,13);
                Font f3 = new Font (Font.MONOSPACED ,Font.BOLD,20);
                Font f4 = new Font (Font.MONOSPACED ,Font.BOLD,15); 
                Font f5 = new Font (Font.DIALOG_INPUT,Font.BOLD,13); 
		label = new JLabel ("Group 18 Resumes");
                label.setFont(new Font("Lucida Calligraphy Italic", Font.BOLD, 36));
                label.setForeground(Color.BLACK);
		label.setBounds(400,50,500,60);
		frame.add(label);
                frame.getContentPane().setBackground(new Color(111, 135, 5));
                
                
                b1 = new JButton( new AbstractAction("Lecel Echavarre"){
                
                    @Override
                public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Resume 1");
                
                Container con = frame.getContentPane();
                con.setLayout(null);
                frame.getContentPane().setBackground(new Color(111, 135, 5));
                //text
                JLabel g1= new JLabel("Personal Information");
                frame.add(g1);
                g1.setBounds(100,05,320,250);
                g1.setFont(f3); 
  
                JLabel g2= new JLabel ("Name:            Lecel Ann Harvey G. Echavarre"); 
                frame.add(g2);
                g2.setBounds(20,25,800,310);
                g2.setFont(f2);
    
                JLabel g3 = new JLabel("Gender:              Female");
                frame.add(g3);
                g3.setBounds(20,45,800,300);
                g3.setFont(f2);
                
                
                
                JLabel g4= new JLabel("Birthdate:        October 4, 2002");
                frame.add(g4);
                g4.setBounds(20,65,800,290);
                g4.setFont(f2);  
                
                
                JLabel g5= new JLabel("Age:                  19");
                frame.add(g5);
                g5.setBounds(20,85,800,280);
                g5.setFont(f2);
                
                
                
                JLabel g6= new JLabel("Nationality:        Filipino");
                frame.add(g6);
                g6.setBounds(20,105,800,270);
                g6.setFont(f2);
                
                
                JLabel g6a= new JLabel("Religion:        Baptist");
                frame.add(g6a);
                g6a.setBounds(20,125,800,260);
                g6a.setFont(f2);
                
                
                JLabel g6b= new JLabel("Civil Status:       Single");
                frame.add(g6b);
                g6b.setBounds(20,145,800,250);
                g6b.setFont(f2);
                
               
                
                JLabel g7= new JLabel("Educational Background");
                frame.add(g7);
                g7.setBounds(90,220,320,250);
                g7.setFont(f3);


                JLabel g8= new JLabel("Elementary:");
                JLabel g8a = new JLabel("San Andres Elementary School");
                frame.add(g8);
                frame.add(g8a);
                g8.setFont(f4);
                g8.setBounds(10,280,400,240);
                g8a.setFont(f2);
                g8a.setBounds(150,280,800,240);

                

                JLabel g9 = new JLabel("Junior & Senior High school : ");
                JLabel g9a = new JLabel("Rosebelle Academy of Tarlac Inc.");
                frame.add(g9);
                frame.add(g9a);
                g9.setFont(f4);
                g9.setBounds(10,300,800,240);
               g9a.setFont(f2);
                g9a.setBounds(300,300,800,240);

                



               JLabel g10= new JLabel("College:");
                JLabel g10a = new JLabel("Tarlac State University");
                frame.add(g10);
                frame.add(g10a);
                g10.setFont(f4);
                g10.setBounds(10,320,800,240);
                g10a.setFont(f2);
                g10a.setBounds(170,320,800,240);
                
              JLabel skill= new JLabel("Skills");
                frame.add(skill);
                skill.setBounds(90,380,320,250);
                skill.setFont(f3);
                
               JLabel skill1 = new JLabel("Basic Java");
               JLabel skill2 = new JLabel("Basic HTML");
                frame.add(skill1);
                frame.add(skill2);
                skill1.setBounds(10,400,320,250);
                skill1.setFont(f2);
                skill2.setBounds(10,420,320,250);
                skill2.setFont(f2);
                JLabel BM = new JLabel("Favorite Movies/Favorite Books");
                frame.add(BM);
                BM.setBounds(90,460,400,250);
                BM.setFont(f3);
                
                JLabel BM1 = new JLabel("Books:");
                frame.add(BM1);
                BM1.setFont(f4);
                BM1.setBounds(10,480,320,250);
                JLabel BM2 = new JLabel(" Harry Potter");
                frame.add(BM2);
                BM2.setFont(f2);
                BM2.setBounds(120,480,320,250);
                
                    frame.setLocation(1080, 50);
                 frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setVisible(true);
                frame.setSize(590,720);  
                
            }
        });
		b1.setBounds(50,130,250,60);
                b1.setFont(f3);
                b1.setBackground(Color.YELLOW);
                b1.setForeground(Color.BLACK);
                frame.add(b1);
                              
		
               
               b2 = new JButton( new AbstractAction("Andrei Ramirez"){
                
                    @Override
                public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Resume 2");
                
                Container con = frame.getContentPane();
                con.setLayout(null);
                frame.getContentPane().setBackground(new Color(111, 135, 5));
               
                JLabel g1= new JLabel("Personal Information");
                frame.add(g1);
                g1.setBounds(100,05,320,250);
                g1.setFont(f3); 
  
                JLabel g2= new JLabel ("Name:            Andrei James M. Ramirez"); 
                frame.add(g2);
                g2.setBounds(20,25,800,310);
                g2.setFont(f2);
    
                JLabel g3 = new JLabel("Gender:             Male");
                frame.add(g3);
                g3.setBounds(20,45,800,300);
                g3.setFont(f2);
                
                
                
                JLabel g4= new JLabel("Birthdate:        September 2, 2002");
                frame.add(g4);
                g4.setBounds(20,65,800,290);
                g4.setFont(f2);  
                
                
                JLabel g5= new JLabel("Age:                  19");
                frame.add(g5);
                g5.setBounds(20,85,800,280);
                g5.setFont(f2);
                
                
                
                JLabel g6= new JLabel("Nationality:        Filipino");
                frame.add(g6);
                g6.setBounds(20,105,800,270);
                g6.setFont(f2);
                
                
                JLabel g6a= new JLabel("Religion:        Roman Catholic");
                frame.add(g6a);
                g6a.setBounds(20,125,800,260);
                g6a.setFont(f2);
                
                
                JLabel g6b= new JLabel("Civil Status:       Single");
                frame.add(g6b);
                g6b.setBounds(20,145,800,250);
                g6b.setFont(f2);
                
                frame.setLocation(1080, 50);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setVisible(true);
                frame.setSize(590,720);
                
                JLabel g7= new JLabel("Educational Background");
                frame.add(g7);
                g7.setBounds(90,220,320,250);
                g7.setFont(f3);


                JLabel g8= new JLabel("Elementary:");
                JLabel g8a = new JLabel("P.O. Domingo Montessori Inc.");
                frame.add(g8);
                frame.add(g8a);
                g8.setFont(f4);
                g8.setBounds(10,280,400,240);
                g8a.setFont(f2);
                g8a.setBounds(150,280,800,240);

                

                JLabel g9 = new JLabel("Junior & Senior High school : ");
              JLabel g9a = new JLabel("STI Colleges Tarlac");
                frame.add(g9);
                frame.add(g9a);
                g9.setFont(f4);
                g9.setBounds(10,300,800,240);
               g9a.setFont(f2);
                g9a.setBounds(300,300,800,240);

               


               JLabel g10= new JLabel("College:");
                JLabel g10a = new JLabel("Tarlac State University");
                frame.add(g10);
                frame.add(g10a);
                g10.setFont(f4);
                g10.setBounds(10,320,800,240);
                g10a.setFont(f2);
                g10a.setBounds(170,320,800,240);
               
               JLabel skill= new JLabel("Skills");
                frame.add(skill);
                skill.setBounds(90,380,320,250);
                skill.setFont(f3);
                
               JLabel skill1 = new JLabel("Basic Java");
               JLabel skill2 = new JLabel("Basic HTML");
                frame.add(skill1);
                frame.add(skill2);
                skill1.setBounds(10,400,320,250);
                skill1.setFont(f2);
                skill2.setBounds(10,420,320,250);
                skill2.setFont(f2);
                
                JLabel BM = new JLabel("Favorite Movies");
                frame.add(BM);
                BM.setBounds(90,460,320,250);
                BM.setFont(f3);
                
                JLabel BM1 = new JLabel("Karate Kid");
                frame.add(BM1);
                BM1.setFont(f2);
                BM1.setBounds(10,480,320,250);
                JLabel BM2 = new JLabel("End Game");
                frame.add(BM2);
                BM2.setFont(f2);
                BM2.setBounds(10,500,320,250);
                JLabel BM3 = new JLabel("No Way Home");
                frame.add(BM3);
                BM3.setFont(f2);
                BM3.setBounds(10,520,320,250);
                
            }
        });
		b2.setBounds(400,130,250,60);
                b2.setFont(f3);
                b2.setBackground(Color.YELLOW);
                b2.setForeground(Color.BLACK);
                frame.add(b2);
                
                

		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(1200, 500);
                
                b3 = new JButton( new AbstractAction("Joeneri Cristobal"){
                
                    @Override
                public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Resume 3");
                Container cPane = frame.getContentPane();
                cPane.setLayout(null);
                frame.getContentPane().setBackground(new Color(111, 135, 5));
             
                JLabel g1= new JLabel("Personal Information");
                frame.add(g1);
                g1.setBounds(100,05,320,250);
                g1.setFont(f3); 
  
                JLabel g2= new JLabel ("Name:            Joeneri T. Cristobal"); 
                frame.add(g2);
                g2.setBounds(20,25,800,310);
                g2.setFont(f2);
    
                JLabel g3 = new JLabel("Gender:             Male");
                frame.add(g3);
                g3.setBounds(20,45,800,300);
                g3.setFont(f2);
                
                
                
                JLabel g4= new JLabel("Birthdate:        September 2, 2002");
                frame.add(g4);
                g4.setBounds(20,65,800,290);
                g4.setFont(f2);  
                
                
                JLabel g5= new JLabel("Age:                  20");
                frame.add(g5);
                g5.setBounds(20,85,800,280);
                g5.setFont(f2);
                
                
                
                JLabel g6= new JLabel("Nationality:        Filipino");
                frame.add(g6);
                g6.setBounds(20,105,800,270);
                g6.setFont(f2);
                
                
                JLabel g6a= new JLabel("Religion:        Roman Catholic");
                frame.add(g6a);
                g6a.setBounds(20,125,800,260);
                g6a.setFont(f2);
                
                
                JLabel g6b= new JLabel("Civil Status:       Single");
                frame.add(g6b);
                g6b.setBounds(20,145,800,250);
                g6b.setFont(f2);
                
                frame.setLocation(1080, 50);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setVisible(true);
                frame.setSize(590,720);
                
                JLabel g7= new JLabel("Educational Background");
                frame.add(g7);
                g7.setBounds(90,220,320,250);
                g7.setFont(f3);


                JLabel g8= new JLabel("Elementary:");
                JLabel g8a = new JLabel("Matatalaib Bato Elementary School");
                frame.add(g8);
                frame.add(g8a);
                g8.setFont(f4);
                g8.setBounds(10,280,400,240);
                g8a.setFont(f2);
                g8a.setBounds(150,280,800,240);

                

                JLabel g9 = new JLabel("Junior & Senior High school : ");
              JLabel g9a = new JLabel("Tarlac National High School");
                frame.add(g9);
                frame.add(g9a);
                g9.setFont(f4);
                g9.setBounds(10,300,800,240);
               g9a.setFont(f2);
                g9a.setBounds(300,300,900,240);

               


               JLabel g10= new JLabel("College:");
                JLabel g10a = new JLabel("Tarlac State University");
                frame.add(g10);
                frame.add(g10a);
                g10.setFont(f4);
                g10.setBounds(10,320,800,240);
                g10a.setFont(f2);
                g10a.setBounds(170,320,800,240);
               
               JLabel skill= new JLabel("Skills");
                frame.add(skill);
                skill.setBounds(90,380,320,250);
                skill.setFont(f3);
                
               JLabel skill1 = new JLabel("Basic Java");
               JLabel skill2 = new JLabel("Basic HTML");
                frame.add(skill1);
                frame.add(skill2);
                skill1.setBounds(10,400,320,250);
                skill1.setFont(f2);
                skill2.setBounds(10,420,320,250);
                skill2.setFont(f2);
                
                JLabel BM = new JLabel("Favorite Movies/Favorite Books");
                frame.add(BM);
                BM.setBounds(90,460,400,250);
                BM.setFont(f3);
                
                JLabel BM1 = new JLabel("Movie:");
                frame.add(BM1);
                BM1.setFont(f4);
                BM1.setBounds(10,480,320,250);
                JLabel BM2 = new JLabel(" Hacksaw Ridge");
                frame.add(BM2);
                BM2.setFont(f2);
                BM2.setBounds(120,480,320,250);
                JLabel BM3 = new JLabel("Book:");
                frame.add(BM3);
                BM3.setFont(f4);
                BM3.setBounds(10,500,320,250);
                JLabel BM4 = new JLabel("Shingeki no Kyojin");
                frame.add(BM4);
                BM4.setFont(f2);
                BM4.setBounds(120,500,320,250);
                
            }
        });
		b3.setBounds(750,130,250,60);
                
                b3.setFont(f3);
                b3.setBackground(Color.YELLOW);
                b3.setForeground(Color.BLACK);
                frame.add(b3);
                
                     
                
                
                
}
                
    
    
    
    
    public static void main(String[] args) {
       
        new Act2();
        
    }

}
    
   
    

