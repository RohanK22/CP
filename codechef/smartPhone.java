/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class smartPhone 
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long nums[] = new long[n];
		for(int i = 0; i< n; i++) {
			nums[i] = sc.nextLong();
		}
		Arrays.sort(nums);
		if(n % 2 ==0) {
			System.out.println(nums[n/2] * (n/2));
		} else {
			System.out.println(nums[n/2] * (n/2 + 1));
		}
	}
}
	

