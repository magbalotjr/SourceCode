import java.util.Arrays; 
import java.util.Scanner;
public class average {
 
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=10;
		double a[] = new double[x];
		double sum=0;
		System.out.println("Enter 10 elements ONLY:");
        for(int i = 0; i < x; i++)
		{
            a[i] = sc.nextDouble();
			sum+=a[i];
        }
		
		System.out.println("ARRAY Elements:");
		System.out.print("Array[] = [");
		for(int i = 0; i < x; i++){
		
		System.out.print(a[i]+",");
		}
		System.out.print("]");
		System.out.println("");
		System.out.println("The Average of Arrays is : " +sum/x);
		
}
}