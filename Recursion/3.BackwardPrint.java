import java.util.*;
public class Main
{
    public static void print(int n)
    {
       if(n==0)
       {
           return ;
       }
      System.out.print(n+" ");
      print(n-1);
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		print(n);

	}
}
