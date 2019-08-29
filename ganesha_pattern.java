package hackerblocks;
import java.util.Scanner;
public class ganesha_swastik {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if((i==n/2+1) ||(j==n/2+1 && i!=n/2+1) || (j>n/2+1 && i==1) ||(j==1 && i<=n/2) || (j==n && i>n/2+1) ||((i==n && j<=n/2)))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
