package extra;
public class pattern {
	public static void main (String args[]) 
    { 
		int n=5;
		int rows=1;
		int nst=1;
		int nst2=n;
		while(rows<=n)
		{
			int cst=1;
			while(cst<=nst)
			{
				System.out.print("*");
				cst++;
			}
			System.out.print(" ");
			cst=1;
			while(cst<=nst2)
			{
				System.out.print("*");
				cst++;
			}
			System.out.print(" ");
			cst=1;
			while(cst<=nst2)
			{
				System.out.
				print("*");
				cst++;
			}
			System.out.print(" ");
			cst=1;
			while(cst<=nst)
			{
				System.out.print("*");
				cst++;
			}
			System.out.print(" ");
			System.out.println();
			nst2--;
			nst++;
			rows++;
		}
    }  
}




"""
* ***** ***** * 
** **** **** ** 
*** *** *** *** 
**** ** ** **** 
***** * * ***** 

"""
