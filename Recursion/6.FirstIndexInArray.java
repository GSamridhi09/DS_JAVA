import java.util.*;
public class Main
{
    public static int sum(int arr[],int x,int i)
    {
       if(x==arr[i])
       {
           return i;
       }
       if(i==arr.length-1)
       {
           return -1;
       }
      return sum(arr,x,i+1);
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		 arr[i]=s.nextInt();
		}
		int x=s.nextInt();
        int ans=sum(arr,x,0);
        System.out.println(ans);
	}
}
