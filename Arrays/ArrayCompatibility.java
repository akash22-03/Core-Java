/*
 * Two arrays are said to be compatible if they are of the same size and if the ith element in the first array is greater than or 
 * equal to the ith element in the second array for all i elements.If the array size is zero or lesser then display the message 
 * "Invalid array size".Write a Java program to find whether 2 arrays are compatible or not.
 * If the arrays are compatible display the message as "Arrays are Compatible" ,if not then display the message as "Arrays are Not Compatible".
 */
import java.util.*;
public class ArrayCompatibility {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    		System.out.println("Enter the size for First array:");
	    		int size1 = sc.nextInt();
	    		if(!(size1>0))
	    		{
	    		    System.out.println("Invalid array size");
	    		}
	    		else
	    		{
	    		    int [] arr1 = new int[size1];
	    		    System.out.println("Enter the elements for First array:");
	    		    for(int i=0;i<size1;i++)
	    		        arr1[i]=sc.nextInt();
	    		        
	    	        System.out.println("Enter the size for Second array:");
	    	        int size2 = sc.nextInt();
	    	        if(!(size2>0))
	    	        {
	    	            System.out.println("Invalid array size");
	    	        }
	    	        else
	   	        {
	    	            int arr2[] = new int[size2];
	    	            System.out.println("Enter the elements for Second array:");
	    	            for(int i=0;i<size2;i++)
	    	                arr2[i] = sc.nextInt();
	                    int c=0;
	                    if(size1==size2)
	                    {
	                        for(int i=0;i<size1;i++)
	                        {
	                           if(arr1[i]>=arr2[i])
	                            {
	                                c++;
	                            }
	                        }
	                        if(c==size1)
	                       {
	                            System.out.println("Arrays are Compatible");
	                        }
	                        else 
	                        {
	                            System.out.println("Arrays are Not Compatible");
	                       }
	                    }
	                    else
	                    {
	                        System.out.println("Arrays are Not Compatible");
	                    }
	    	        }
	   		    
	    		}
	}

}
