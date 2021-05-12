 import java.util.Scanner;
 
     public class CountOccuranceOfChar {
     
     	public static void main(String[] args){
     		Scanner sc=new Scanner(System.in);
     		System.out.println("Enter a word:");
     		String word = sc.nextLine();
     		if(!word.matches("^[A-Za-z]+"))
    		{
    		    System.out.println("Not a valid string");
    		}
    		else
    		{
        		System.out.println("Enter the character:");
        		char ch = sc.next().charAt(0);
        		
        		if(!Character.isLetter(ch))
        		{
        		    System.out.println("Given character is not an alphabet");
        		}
        		else
        		{
            		int count=0;
            		for(int i=0; i<word.length();i++)
            		{
            		    if(word.charAt(i)==ch)
            		    {
            		        count++;
            		    }
            		}
            		if(count==0)
            		{
           		    System.out.println("The given character '"+ch+"' not present in the given word.");
            		}
            		else
            		System.out.println("No of '"+ch+"' present in the given word is "+count);
        		}
    		}
    	}
    
    }
    