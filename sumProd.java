import java.util.Arrays; 
import java.util.Scanner;
public class sumProd {
 
public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.print("Enter no. of elements you want in array:");
		x = sc.nextInt();
		 //x = 10;
		 double sum=0;
		 double prod=1;
        double a[] = new double[x];
        for(int i = 0; i < x; i++)
		{
            a[i] = sc.nextDouble();
			sum+=a[i];
			prod*=a[i];
        }
		
		System.out.println("ARRAY Elements:");
		System.out.print("Array[] = [");
		for(int i = 0; i < x; i++){
		
		System.out.print(a[i]+",");
		}
		System.out.print("]");
		System.out.println("");
		System.out.println("The SUM of Arrays is : " +sum);
		System.out.println("The SUM of Arrays is : " +prod);
		
}
}
		
		