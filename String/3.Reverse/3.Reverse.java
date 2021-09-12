import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	char arr[]=str.toCharArray();
	char temp='a';
	int j=0;
	for(int i=0;i<arr.length;i++)
	{
	   j=arr.length-i-1;
	   if(j>=i)
	   {
	   temp=arr[i];
	   arr[i]=arr[j];
	   arr[j]=temp;
	   }
    }
	System.out.print(String.valueOf(arr));
	}
}
