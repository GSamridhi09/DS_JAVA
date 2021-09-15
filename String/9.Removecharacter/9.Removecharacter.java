import java.util.*;
public class Main
{  
	public static void main(String[] args) {
 	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	String newStr="";
	char c=s.next().charAt(0);
    for(int i=0;i<str.length();i++)
    {
     if(str.charAt(i)!=c)
     {
        newStr+=str.charAt(i); 
     }
    }
    System.out.println(newStr);
	}
}
