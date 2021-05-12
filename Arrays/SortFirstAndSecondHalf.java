/*
 * Anjali likes to play mathematical tricky games .She gets n numbers for an array. Help Anjali to write a Java program to sort the 
 * first half of the array in ascending order and the second half of the array in descending order.
 *  If the size of the array is 0 or lesser then display the message as "Array size should be greater than 0".
 */
import java.util.*;
public class SortFirstAndSecondHalf 
{
	public static void main(String[] args){
	    		Scanner sc=new Scanner(System.in);
	    		System.out.println("Enter the size of an array:");
	    		int size =sc.nextInt();
	    		if(!(size>0))
	    		{
	    		    System.out.println("Array size should be greater than 0");
	    		}
	    		else
	    		{
	    		    System.out.println("Enter the elements:");
	    		    int[] arr= new int[size];
	    		    for(int i=0;i<size;i++)
	    		        arr[i] = sc.nextInt();
	    	        int half=0;
	    	        if(size%2==0){
	    	        	half=size/2;}
	    	        else {
	    	            half=(size+1)/2;}
	    	        
	   	        for(int i=0;i<half;i++)
	    	        {
	    	            for(int j=i+1;j<half;j++)
	    	            {
	    	                int temp=0;
	    	                if(arr[i]>arr[j])
	    	                {
	    	                    temp=arr[i];
	    	                    arr[i]=arr[j];
	    	                    arr[j]=temp;
	    	                }
	    	            }
	    	        }
    	        for(int i=half;i<size;i++)
    	        {
    	            for(int j=i+1;j<size;j++)
    	            {
    	            	int temp=0;
    	                if(arr[i]<arr[j])
    	                {
    	                    temp=arr[i];
    	                    arr[i]=arr[j];
    	                    arr[j]=temp;
    	                }
    	            }
    	        }
	   	        
	   	        for(int i=0;i<size;i++)
	   	        {
	   	            System.out.println(arr[i]);
	   	        }
	   	           
 		}
 	}
}