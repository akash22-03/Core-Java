import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
public class PrintUniqueChar {
        
   public static void main(String [] args){
       Scanner in=new Scanner(System.in);
       
       System.out.println("Enter the sentence:");
       String input=in.nextLine();
       Map<Character,Integer>harshMap=new LinkedHashMap<>();
       for(int i=0;i<input.length();i++)
        {
            if(Character.isAlphabetic(input.charAt(i))||input.charAt(i)==' ')
            {
                if(harshMap.containsKey(input.charAt(i)))
                {
                  harshMap.put(input.charAt(i),harshMap.get(input.charAt(i))+1);        
                }
               else{
                  harshMap.put(input.charAt(i),1);
               }
           }
            else{
                System.out.println("Invalid Sentence");
               return;
            }
        }
        int flag=0;
        ArrayList<Character>arrls=new ArrayList<>();
        for(Map.Entry entry:harshMap.entrySet())
        {
            if((int)entry.getValue()==1)
            {
             arrls.add((char)entry.getKey());
             flag+=1;
           }    
       }
        if(flag>0)
        {
            System.out.println("Unique characters:");
            for(int i=0;i<arrls.size();i++)
            {
            System.out.println(arrls.get(i));
            }
            
        }
       else if(flag==0)
        {
        System.out.println("No unique characters");
        }
      }
    }
    