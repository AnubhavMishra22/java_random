package hackerblocks;
import java.util.*;
public class median_of_sorted_arrays {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr= new int[n];
		int[] arr1= new int[n];
		int[] arr2=new int[arr.length+arr1.length];
		int i;
		for(i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		for(i=0;i<arr1.length;i++)
		{
			arr1[i]=s.nextInt();
		}
		for(i=0;i<arr.length;i++)
		{
			arr2[i]=arr[i];
		}
		int sum=arr.length;
		for(i=0;i<arr1.length;i++)
		{
			arr2[sum]=arr1[i];
			sum++;
		}
		Arrays.sort(arr2);
		System.out.println(arr2[arr2.length/2-1]);
	}
}
