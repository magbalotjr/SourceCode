import javax.swing.*;
public class ComProgDOC {
	public static void main (String [] args) {
		
		JFrame frame = new JFrame("HelloWorldSwing");
		final JLabel label = new JLabel("Hello World", JLabel.CENTER);
		frame.setSize(500,500);
		frame.getContentPane().add(label);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
}
		