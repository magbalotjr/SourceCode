import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;

public class microwaveOven extends JFrame{
	
	 private JPanel panel,panel1;
	 private int x = 4;
	 private int y= 3;
   public microwaveOven() {
      setTitle("MICROWAVE OVEN");
      panel = new JPanel();
	  panel1 = new JPanel();
      panel.add(new JLabel("MICROWAVE OVEN",JLabel.CENTER));
      panel.setBackground(Color.black);
	  panel1.setBackground(Color.green);
		panel1.setLayout(new GridLayout(x, y));
		JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bstart,bstop;
		int x = 4;
		int y= 3;
		b1 = new JButton ("1");
		b2 = new JButton ("2");
		b3 = new JButton ("3");
		b4 = new JButton ("4");
		b5 = new JButton ("5");
		b6 = new JButton ("6");
		b7 = new JButton ("7");
		b8 = new JButton ("8");
		b9 = new JButton ("9");
		b0 = new JButton ("0");
		bstart = new JButton ("START");
		bstop = new JButton ("STOP");
	
	  
	  
	  
	  
	  
	  panel1.add(b1);
	  panel1.add(b2);
	  panel1.add(b3);
	  panel1.add(b4);
	  panel1.add(b5);
	  panel1.add(b6);
	  panel1.add(b7);
	  panel1.add(b8);
	  panel1.add(b9);
	  panel1.add(b0);
	  panel1.add(bstart);
	  panel1.add(bstop);
	  
	  
	  
	  
	  
	  
	  
	  panel1.setLayout(new GridLayout(x, y));
	  
	  
	  
	  panel.setPreferredSize(new Dimension(350, 190));
	  add(panel1);
      add(panel, BorderLayout.WEST);
      setSize(590, 300);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
   }
   public static void main(String args[]) {
      new microwaveOven();
   }
}