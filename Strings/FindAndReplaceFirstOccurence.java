import java.util.*;

public class FindAndReplaceFirstOccurence 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		System.out.println("Enter the character to be searched:");
		String ch1 = sc.nextLine();
		System.out.println("Enter the character to replace:");
	    String ch2 = sc.nextLine();
	    
	    if(!str.contains(ch1))
	    {
	    	System.out.println("Charcter not found");
	    }
	    else
	    {
	    
    	int length = ch1.length();
    	int inlength = str.length();
    	int req = str.indexOf(ch1);
   		String res = str.substring(0, req) + ch2 + str.substring(req+length , inlength);
    	System.out.println(res);
	    }
   	}
} 
  /*
   * Write a Java program to find a character from a sentence and replace it with another character.
   * If the character is not found in the string print "character not found".
   * Note: Replace only the first occurrence.
   * */ 
   
    