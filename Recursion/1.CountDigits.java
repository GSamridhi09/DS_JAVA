import java.util.*;
public class Main
{
    public static int recursion(int n,int count)
    {
       if(n>=0&&n<10)
       {
           return 1;
       }
       else{
           count=1+recursion(n/10,count);
           return count;
       }
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ans=recursion(n,0);
		System.out.println(ans);
	}
}
