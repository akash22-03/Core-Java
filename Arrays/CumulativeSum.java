/*
 * Raghavi wants to write Java program to find the cumulative sum of the array with a given set of values.Input consist of integers.
 * If the size of an array is zero or lesser then display the message as "Invalid Range". 
 * Print the output in the format which is provided in sample output .
 */
import java.util.*;
public class CumulativeSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter the number of elements");
 		int size = sc.nextInt();
 		if(!(size>0))
		{
		    System.out.println("Invalid Range");
		}
		else
		{
		    int [] arr =  new int[size];
		    System.out.println("Enter the elements");
		    for(int i=0;i<size;i++)
		        arr[i] = sc.nextInt();
	        
	        int sum=0;
	        for(int i=0;i<size;i++)
	        {
	            sum+=arr[i];
	            System.out.print(sum+" ");
        }
	    		}
	}

}
