import java.util.*;
public class Main
{
    public static int sum(int arr[],int i)
    {
       if(i==arr.length)
       {
           return 0;
       }
    int sum=arr[i]+sum(arr,i+1);
    return sum;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		 arr[i]=s.nextInt();
		}
        int ans=sum(arr,0);
        System.out.println(ans);
	}
}
