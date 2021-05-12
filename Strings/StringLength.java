 import java.util.Scanner;
 
 public class StringLength {
 
 	public static void main(String[] args){
 		Scanner sc=new Scanner(System.in);
 		String str = sc.nextLine();
 		int length = str.length();
 		
		if(length%2==0)
		{
		    System.out.println(length+" Even");
		}
		else
		{
	    System.out.println(length+" Odd");    
	}
	}

}