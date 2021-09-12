import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String str=s.nextLine();
	    for(int i=0;i<str.length();i++)
	    {
	        if(str.charAt(i)!=str.charAt(str.length()-i-1))
	        {
	        System.out.print("String is not palindrome");
	        return ;
	         }
	    }
	System.out.print("String is palindrome");
	}
}
