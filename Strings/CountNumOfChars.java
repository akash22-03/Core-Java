import java.util.*;
 
public class CountNumOfChars 
{
 	public static void main(String[] args)
 	{
 		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter your name:");
 		String name = sc.nextLine();
 		String str = name.toLowerCase();
		if(!str.matches("[a-z\\s]+"))
		{
		    System.out.println("Invalid Input");
		}
		else
		{
		System.out.println(name+" has "+name.length()+" characters");
    	}
    		
    }
    
}