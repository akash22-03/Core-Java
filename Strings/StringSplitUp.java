import java.util.*;

public class StringSplitUp {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		String token = sc.nextLine();
	    String[] words  = str.split(token);
	    for(String w:words)
	    {
	        System.out.println(w);
	    }
	}

}