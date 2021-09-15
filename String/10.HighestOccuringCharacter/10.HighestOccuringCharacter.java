import java.util.*;
public class Main
{  
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    int arr[]=new int[26];
    for(int i=0;i<str.length();i++)
    {
     arr[str.charAt(i)-97]++;
    }
   
    int min=0,max=0;
    for(int i=0;i<arr.length;i++)
    {
    if(arr[i]>min){
    min=arr[i];
    max=i;
    }
    }
    char a=(char)(97+max);
    System.out.print(a);
	}
}
