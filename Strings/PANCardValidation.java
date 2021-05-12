import java.util.*;
public class PANCardValidation {
     
public static void main(String[] args){
     		Scanner sc=new Scanner(System.in);
     		System.out.println("Enter the PAN no:");
     		String pan = sc.nextLine();
     		if(!pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}"))
   		{
    		    System.out.println("Invalid PAN no");
    		}
    		else
    		{
    		    System.out.println("Valid PAN no");
    		}
    	}
    
    }