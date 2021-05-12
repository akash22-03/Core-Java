//Sum of factorial of positive and single digit numbers in an array
/*
 * Write a java program to find the sum of factorial of the numbers in an array.  
 * Consider the number for finding the factorial only if it is positive and single digit.  
 * If not print "No positive and single digit numbers found in an array".
 * Example if the array is {2,-7,14,-24,41,5} the output should be 122
 */

import java.util.Scanner;
import java.util.ArrayList;
     public class Factorial {
     
 	public static void main(String[] args){
 		Scanner sc=new Scanner(System.in);
 		
 		System.out.println("Enter the size of an array:");
 		int n=sc.nextInt();
		System.out.println("Enter the elements:");
		ArrayList<Integer> factorial = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			int result=1;
		    int input=sc.nextInt();
		    if(input>1 && input<=9)
		    {
		        for(int j=1;j<=input;j++)
		        {
		            result=result*j;
		        }
		        factorial.add(result);
		    }
		}
		int arraysize=factorial.size();
		if(arraysize>0)
		{
		    int sum=0;
		    for(int i=0;i<arraysize;i++)
		    {
		        sum=sum+factorial.get(i);
		    }
		    System.out.println(sum);
		}
		else
		{
		    System.out.println("No positive and single digit numbers found in an array");
		}
	}

}
   
