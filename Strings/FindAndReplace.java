    import java.util.*;
    
    public class FindAndReplace {
    
    	public static void main(String[] args){
    		Scanner sc=new Scanner(System.in);
    		System.out.println("Enter the string:");
    		String str = sc.nextLine();
   	System.out.println("Enter the word to be searched:");
    		String in = sc.nextLine();
    		System.out.println("Enter the word to be replaced:");
    		String out = sc.nextLine();
    		
    		if(str.contains(in))
    		{
    		String res = str.replace(in,out); 
    		System.out.println(res);
    		}
    		else
    		{
    		    System.out.println("The word "+in+" not found");
    		}
    	}
    	
   
    }