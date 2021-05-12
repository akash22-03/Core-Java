/*Ram has passed in certain subjects and failed in a few. Write a program to count the no of subjects he passed in and the
 *  no of subjects he has failed in. Marks scored below 50 is considered as failed. If Ram has passed in all the subjects print
 *   "Ram passed in all subjects" and if failed print "Ram failed in all subjects".
 *  Assume maximum size of array is 20,
 */
import java.util.*;
public class PassAndFailCount 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter the no of subjects:");
 		int size = sc.nextInt();
 		if(!(size>0))
		{
		    System.out.println("Invalid input range");
		}
		else
		{
		    int [] marks = new int[size];
		    for(int i=0; i<size;i++)
		        marks[i] = sc.nextInt();
	        
	        int pass=0,fail=0;
	        for(int i=0;i<size;i++)
	        {
	            if(marks[i]>=50) pass++;
            else fail++;
	        }
	        
	        if(pass==0)
	        {
	            System.out.println("Ram failed in all subjects");
	        }
	        else if(fail==0)
	        {
	            System.out.println("Ram passed in all subjects");
	        }
	        else
	        {
	            System.out.println("Ram passed in "+pass+" subjects and failed in "+fail+" subjects");
	        }
	    		      
	    }
 		
	}

}
