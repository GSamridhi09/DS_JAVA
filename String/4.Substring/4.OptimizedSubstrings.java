import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	for(int i=0;i<str.length();i++)
	{
	 for(int j=i;j<str.length();j++)
	 {
	  System.out.println(str.substring(i,j+1));   
	 }
	 }
	}
}
