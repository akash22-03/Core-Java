    import java.util.Scanner;
    
    public class CompareTwoStrings {
    
    	public static void main(String[] args){
    		Scanner sc=new Scanner(System.in);
    		String str1 = sc.nextLine();
    		String str2 = sc.nextLine();
    		
    		if(str1.equals(str2))
    		{
    		    System.out.println("Case sensitive");
    		    
    		}
   		else
    		{
    		    if(str1.equalsIgnoreCase(str2))
    		    {
   		        System.out.println("Case insensitive");
   		    }
    		    else
    		    {
    		        System.out.println("Not equal");    
    		    }
    		}
    		
    	}
    
    }
    