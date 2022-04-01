import java.util.Arrays; 
import java.util.Scanner;
public class input {
 
public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x;
		
		//System.out.print("Enter no. of elements you want in array:");
        //x = sc.nextInt();
		 x = 10;
        int a[] = new int[x];
		
		System.out.println("Enter 10 elements ONLY:");
        for(int i = 0; i < x; i++)
		{
			System.out.print("Array ["+i+"] = ");
            a[i] = sc.nextInt();
        }
		System.out.println("ARRAY Elements:");
		System.out.print("Array[] = [");
		for(int i = 0; i < x; i++){
		
		System.out.print(a[i]+",");
		}
		System.out.print("]");
		System.out.println("");
		
}
}