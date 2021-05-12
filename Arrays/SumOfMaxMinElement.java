/*
 * Anjali gets n numbers in an array. Write a Java program to print the sum of the maximum and the minimum element in the array.
 * If the size of an array is 0 or less print "Invalid Array Size".
 */
import java.util.*;
public class SumOfMaxMinElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     		System.out.println("Enter the size of an array:");
	     		int size = sc.nextInt();
	     		if(!(size>0))
	    		{
	    		    System.out.println("Invalid Array Size");
	    		}
	    		else
	    		{
	    		    int [] arr = new int[size];
	    		    System.out.println("Enter the elements:");
	    		    for(int i=0;i<size;i++)
	   		            arr[i] = sc.nextInt();
	    	        
	   	        int sum = 0, min=arr[0], max=arr[0];
	   	        
	    	        for(int i=1;i<size;i++)
	    	        {
	    	            max = Math.max(max,arr[i]);
	    	            min = Math.min(min,arr[i]);
	    	        }
	    	        sum = max+min;
	    	        System.out.println(sum);
	    		        
	    		        
	   		            
	  		}
	}
}
