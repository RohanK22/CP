import java.util.Scanner;
import java.lang.Character;

public class petyaAndStrings {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String a = reader.nextLine();
		String b = reader.nextLine();
		for(int i = 0; i< a.length(); i++) {
			if(Character.toLowerCase(a.charAt(i)) == Character.toLowerCase(b.charAt(i))) {
				continue;
			}
			if(Character.toLowerCase(a.charAt(i)) > Character.toLowerCase(b.charAt(i))) {
		       		System.out.println("1");
				return;
		 	} else {
				System.out.println("-1");
				return;
			}
		}
		System.out.println("0");
	}
}	
