     import java.util.*;
     
     public class PalindromeString {
     
     	public static void main(String[] args){
     		Scanner sc=new Scanner(System.in);
     		System.out.println("Enter the word:");
     		String str = sc.nextLine();
     		String rev="";
    		String check = str.toLowerCase();
    		if((check!=null)&&(!check.equals(""))&&(check.matches("^[a-z]*$")))
    		{
    		    for(int i=check.length()-1; i>=0 ; i--)
    		    {
    		        rev += check.charAt(i);
   		    }
   		    if(check.equals(rev))
    		    {
    		        System.out.println(str+" is a Palindrome");
    		    }
    		    else
    		    {
    		        System.out.println(str+" is not a Palindrome");
    		    }
    		}
    		else{
    		    System.out.println("Invalid Input");
    		}
   	}
    
    }