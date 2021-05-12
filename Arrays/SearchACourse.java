/*
 * IIHT institution is offering a variety of courses to students. Students have a facility to check whether a particular course is 
 * available in the institution. 
 * Write a program to help the institution accomplish this task. If the number is less than or equal to zero display "Invalid Range".
 */
import java.util.*;
public class SearchACourse {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	     		System.out.println("Enter no of course:");
	     		int size = sc.nextInt();
	     		String[] courses = new String[size];
	     		
	    		if(!(size>0))   System.out.println("Invalid Range");
	            else
	            {		
	        		System.out.println("Enter course names:");
	        		sc.nextLine();
	        		for(int i=0; i<size;i++)
	        		    courses[i] = sc.nextLine();
	        		  
	        	    System.out.println("Enter the course to be searched:");
	        	    String find = sc.nextLine();
	        	    
	        	    boolean bool = false;
	        	    
	        	    for(int i=0;i<size;i++)
	        	    {
	        	        if(find.equals(courses[i]))
	        	        {
	        	            bool = true;
	        	            break;
	        	        }
	        	    }
	        	    
	        	    if(bool==true)
	        	    {
	        	        System.out.println(find+" course is available");
	        	    }
	        	    else
	        	    {
	        	        System.out.println(find+" course is not available");
	        	    }
	            }	
	}
}
