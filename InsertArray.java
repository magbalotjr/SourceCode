import java.util.Arrays; 
import java.util.Scanner;
public class InsertArray {
 
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
   
	int pos,ins;
	int pos1=5;
	System.out.println("_____________________________________________________________________"); 
	System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><<><><><><><><><><>"); 
	System.out.println("Original Array : "+Arrays.toString(ar));     
	
		for(int i=ar.length-1; i > pos1; i--){
		ar[i] = ar[i-1];
   }
		System.out.println("_____________________________________________________________________"); ;
		System.out.println("Enter the position where you want to insert element:");  
		pos=sc.nextInt();
		System.out.println("_____________________________________________________________________"); 
		System.out.println("Enter the element you want to insert:");
		ins=sc.nextInt();
		System.out.println("_____________________________________________________________________");  
		ar[pos] = ins;
		System.out.println("New Array: "+Arrays.toString(ar));
		System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><<><><><><><><><><>"); 
		System.out.println("_____________________________________________________________________"); 
   
   
   
   
   
 }
 }