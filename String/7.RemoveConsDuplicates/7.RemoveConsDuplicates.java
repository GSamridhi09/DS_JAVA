import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
    String newStr="";
    int j=0;
   newStr+=str.charAt(0);
    for(int i=1;i<str.length()-1;i++)
    {
        if(str.charAt(i)!=str.charAt(i+1))
        {
            newStr+=str.charAt(i+1);
            
        }
       
       
    }
    System.out.print(newStr);
	}
}
