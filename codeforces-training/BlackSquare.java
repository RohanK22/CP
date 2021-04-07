import java.util.Scanner;
import java.util.ArrayList;

public class BlackSquare {
		
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String[] line = reader.nextLine().split(" ");
		int[] nums = new int[line.length];
		for(int i = 0; i< line.length; i++) {
			nums[i] = Integer.parseInt(line[i]);
		}
		String s = reader.nextLine();
		int cal = 0;
		for(int i = 0;i < s.length(); i++) {
			cal += nums[Character.getNumericValue(s.charAt(i)) - 1];
		}
		System.out.println(cal);
	}
}	
