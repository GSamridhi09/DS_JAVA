import java.util.*;
public class Main
{  
	public static void main(String[] args) {
 	Scanner s=new Scanner(System.in);
 	int flag=0;
 	int n=s.nextInt();
 	int sum=0;
 	int maxsum=0,col=0;
    int arr[][]=new int[n][n];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            arr[i][j]=s.nextInt();
        }
    }
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
          if(i==0)
              sum+=arr[i][j];
          if(i==n-1)
              sum+=arr[i][j];
          if(j==n-1 && i!=0 && i!=n-1)
              sum+=arr[i][j];  
          if(j==0 && i!=0 && i!=n-1)
              sum+=arr[i][j];
           if(i==j && i!=0 && i!=n-1)
              sum+=arr[i][j];
            if(i+j==n-1 && i!=0 && i!=n-1)
              sum+=arr[i][j];   
          
        }
    }
    System.out.print(sum);
	}
}
