import javax.swing.*;
import java.awt.*;
import javax.swing.JOptionPane;
public class calc {
	public static void main (String [] args) {
		int again;

		do{
		
		String num1=JOptionPane.showInputDialog("Enter first number: ");
		String oper=JOptionPane.showInputDialog("What Operation Do You want? \n Type + for addition \n Type * for Multiplication \n Type - for Subtraction \n Type / for Division ");
		String num2=JOptionPane.showInputDialog("Enter second number: ");
		
		float numA,numB;
		numA=Float.parseFloat(num1);
		numB=Float.parseFloat(num2);
		float res=0;
		
						if(oper.equals("+")){
							float add=numA+numB;
							res=add;
							JOptionPane.showMessageDialog(null,"First number: "+ num1+"\nOperation: "+ oper+"\nSecond number: "+ num2+"\nANSWER: "+num1+" "+oper+" "+num2+" = "+res);
						}
						else if(oper.equals("*")){
							float mult=numA*numB;
							res=mult;
							JOptionPane.showMessageDialog(null,"First number: "+ num1+"\nOperation: "+ oper+"\nSecond number: "+ num2+"\nANSWER: "+num1+" "+oper+" "+num2+" = "+res);
						}
						else if(oper.equals("-")){
							float sub=numA-numB;
							res=sub;
							JOptionPane.showMessageDialog(null,"First number: "+ num1+"\nOperation: "+ oper+"\nSecond number: "+ num2+"\nANSWER: "+num1+" "+oper+" "+num2+" = "+res);
						}
					
						else if(oper.equals("/")){
							float div=numA/numB;
							res=div;
							JOptionPane.showMessageDialog(null,"First number: "+ num1+"\nOperation: "+ oper+"\nSecond number: "+ num2+"\nANSWER: "+num1+" "+oper+" "+num2+" = "+res);
						}
						else{
							JOptionPane.showMessageDialog(null,"INVALID OPERATION!!");
						}
			
			
		
		
			
			
		again = JOptionPane.showConfirmDialog(null, "Compute another arithmetic problem??", "Calculate more", JOptionPane.YES_NO_OPTION);
		
		if(again==1){
			
			JOptionPane.showMessageDialog(null, "Thanks for using this program!","\nGoodbye", JOptionPane.INFORMATION_MESSAGE);
		}
		
		}while (again == 0);
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
	}