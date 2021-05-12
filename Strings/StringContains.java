 import java.util.Scanner;
 
 public class StringContains{
 
 	public static void main(String[] args){
 		Scanner sc=new Scanner(System.in);
 		String str = sc.nextLine();
 		String contain = sc.nextLine();
 		
		if(str.contains(contain))
		{
		    System.out.println(contain+ " is contained in a sentence");
	}
	else
	{
	    System.out.println(contain+ " is not contained in a sentence");
    		}
    		
    	}
    
   }