 import java.util.*;
     import java.util.regex.*;
     
     public class StringConcat {
     
     	public static void main(String[] args){
     		Scanner sc=new Scanner(System.in);
     		System.out.println("Inmate's name:");
     		String aname = sc.nextLine();
    		System.out.println("Inmate's father's name:");
    		String bname = sc.nextLine();
    		
    		if(aname.matches("^[A-Za-z\\s]+") && bname.matches("^[A-Za-z\\s]+"))
    		{
    		    aname = aname.toUpperCase();
    		    bname = bname.toUpperCase();
    		    System.out.println(aname+" "+bname);
    		}
    		else if(!aname.matches("^[A-Za-z\\s]+")||!bname.matches("^[A-Za-z\\s]+"))
    		{
    		    System.out.println("Invalid name");
    		}
    	}
    
    }
    