import java.util.Scanner;

public class serejaAndDima {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = Integer.parseInt(reader.nextLine());
		int[] nums = new int[n];
		String[] split = reader.nextLine().split(" ");
		for(int i = 0; i< n; i++) {
			nums[i] = Integer.parseInt(split[i]);	
		}
		int s = 0, d = 0;
		int i = 0, j = n-1; 
		boolean sere = true;
		while(i <=j ) {
			if(nums[i] > nums[j]) {
				if(sere) {
					s += nums[i];
				} else {
					d += nums[i];
				}
				i++;
			} else {
				if (sere) {
					s += nums[j];
				} else {
					d += nums[j];
				}
				j--;
			}
			sere = !sere;
		}
		System.out.println(s + " " + d);
	}
}	
