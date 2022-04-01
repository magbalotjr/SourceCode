import java.util.Arrays; 
import java.util.Scanner;
public class minMax {
 
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
            a[i] = sc.nextInt();
        }
		
		System.out.println("ARRAY Elements:");
		System.out.print("Array[] = [");
		for(int i = 0; i < x; i++){
		
		System.out.print(a[i]+",");
		}
System.out.print("]");
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < x; i++){
			if(a[i] < min)
				min = a[i];
			if(a[i] > max)
				max = a[i];

		}

		System.out.println("");
        System.out.println(" Maximum value for the above array = " + max);
       System.out.println(" Minimum value for the above array = " + min);





}
}