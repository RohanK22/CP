import java.util.Scanner;
import java.util.ArrayList;

public class NightAtMuseum {
		
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String s= reader.nextLine();
		char start = 'a';
		int ans = 0;
		for(int i = 0; i< s.length();i ++) {
			int diff = Math.abs((int) (s.charAt(i)) - (int) (start));
			if(diff > 13) {
				ans += 26 - diff;
			} else {
				ans += diff;
			}
			start = s.charAt(i);
		}
		System.out.println(ans);
	}
}	
