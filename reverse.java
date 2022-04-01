import java.util.Arrays; 
import java.util.Scanner;
public class reverse {
 
public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.print("Enter no. of elements you want in array:");
        x = sc.nextInt();
	
        int a[] = new int[x+1];
		
		System.out.println("Enter 10 elements ONLY:");
        for(int i = 0; i < x; i++)
		{
            a[i] = sc.nextInt();
        }
		
		System.out.println("ARRAY Elements:");
		System.out.print("Array[] = [");
		for(int i = 0; i < x; i++){
		
		System.out.print(a[i]+",");
		}
System.out.print("]");
		System.out.println("");
		System.out.println("");
		System.out.println("Reversed ARRAY Elements:");
		System.out.print("Array[] = [");
		for(int i = x-1; i >= 0; i--){
			System.out.print(a[i]+",");
		}
		System.out.print("]");
}
}