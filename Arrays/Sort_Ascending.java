import java.util.Scanner;
     
public class Sort_Ascending
     {
         public static void main(String args[])
         {
             
             Scanner sc=new Scanner(System.in);
            System.out.println("Enter the array size");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.println("Enter the values");
            for(int i=0;i<size;i++)
           {
                arr[i] = sc.nextInt();
           }
            
            for(int i=0;i<size;i++)
            {
                for(int j=i+1; j<size;j++)
                {
                    int temp=0;
                    if(arr[i]>arr[j])
                   {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                   }
               }
                System.out.println(arr[i]);
            }
            
           
     }
  }