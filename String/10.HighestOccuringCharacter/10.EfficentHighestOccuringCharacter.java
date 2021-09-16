import java.util.*;
public class Main
{  
	public static void main(String[] args) {
 	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	char a='a';
	int maxcount=0;
   char arr[]=str.toCharArray();
    for(int i=0;i<arr.length;i++)
    {
     int count=0;
     for(int j=i+1;j<arr.length;j++) 
     {
      if(arr[i]==arr[j])
      {
          count++;
      }
      if(count>maxcount)
      {
          maxcount=count;
          a=arr[i];
      }
     }
    }
    System.out.print(a);
	}
}
