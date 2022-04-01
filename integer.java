import java.util.Arrays; 
import java.util.Scanner;
import java.io.*;
public class integer {
 
public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x;

		
		//System.out.print("Enter no. of elements you want in array:");
        //x = sc.nextInt();
		 x = 20;
		 								int neg,pos,zer,odd,eve;
		neg=0;
		pos=0;
		zer=0;
		odd=0;
		eve=0;
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
		for(int i = 0; i < x; i++){
				if(a[i]<0){
					neg++;
				}
				if(a[i]==0){
					zer++;
				}
				if(a[i]>0){
					pos++;
				}
			
				
				
		}
			for(int i = 0; i < x; i++){
				if(a[i] % 2==0){
					eve++;
				}
			}
			for(int i = 0; i < x; i++){
				if(a[i] % 2!=0){
					odd++;
				}
			}
		System.out.print("]");
		System.out.println("]");
		System.out.println("number of negative : "+neg);
		System.out.println("number of zeroes : "+zer);
		System.out.println("number of positive : "+pos);
		System.out.println("number of even : "+eve);
		System.out.println("number of odd numbers : "+odd);
}
}