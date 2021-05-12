     import java.util.Scanner;
     
     public class ValidStringLength {
     
     	public static void main(String[] args){
     		Scanner sc=new Scanner(System.in);
     		String in = sc.nextLine();
     		
     		if(in.matches("^[a-zA-Z_ ]*$"))
    		{
    		    System.out.println("No of characters is:"+in.length());
    		}
    		else
    		{
    		    System.out.println("Invalid String");    
    		}
    	}
    
    }