import java.util.Scanner;
    
public class InitCap {
    
    	public static void main(String[] args){
    		Scanner sc=new Scanner(System.in);
    		System.out.println("Enter the String:");
    		String str = sc.nextLine();
    		int count =0;
    		char[] ch =str.toCharArray();
   		for(int i=0;i<str.length();i++)
   		{
    		    if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
    		    {
    		     if(ch[i]>='a'&&ch[i]<='z')
    		     {
   		         ch[i] = (char)(ch[i]-'a'+'A');
    		         count++;
    		     }
    		    }
    		    else if(ch[i]>='A'&&ch[i]<='Z')
   		        ch[i] = (char)(ch[i]+'a'-'A');
   		        
   		}
    		if(count==0)
    		    System.out.println("First character of each word is already in uppercase");
   		    
    		else
   		    {
    		        String st = new String(ch);
    		        System.out.println(st);
    		    }
   	
   	
    	}
    	
    
    }
    
