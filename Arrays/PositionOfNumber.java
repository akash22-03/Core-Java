    import java.util.Scanner;
    
   public class PositionOfNumber
   {
        public static void main(String args[])
        {
            
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the array size");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.println("Enter the values");
            for(int i=0; i<size;i++)
            {
                arr[i]= sc.nextInt();
            }
            System.out.println("Enter the number to find");
            int reqnum = sc.nextInt();
            
            for(int i=0;i<size;i++)
            {
               if(arr[i]==reqnum)
                {
                    System.out.println(i+1);
                    break;
                }
            }
            System.out.println("0");
            
        }
    }
  /*Write a java program to find the given number from the array of elements and display its position.
   If the number is not present in an array then display it as 0.*/