import java.util.Scanner;

public class word{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String a = reader.nextLine();
		int l =0, u = 0;
		for(int i = 0; i< a.length(); i++) {
			if(Character.isUpperCase(a.charAt(i))) {
				u++;
			} else {
				l++;
			}
		}
		if(u >l) {
			System.out.println(a.toUpperCase());
		} else {
			System.out.println(a.toLowerCase());
		}
	}
}	
