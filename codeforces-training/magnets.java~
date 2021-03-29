import java.util.Scanner;

public class magnets {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
	 	int n = reader.nextInt(), c = 0;
		if(n==1) {
			reader.nextLine();
			reader.nextLine();
			System.out.println(1);
	      		return;
		}		
		reader.nextLine();
		String start = reader.nextLine();
		String next = reader.nextLine();
		System.out.println("Start: " + start);
		System.out.println("End: " + next);
		for(int i=0; i< n  - 1; i++) {
			if(start.charAt(1) == next.charAt(0))
				c++;
			if(n == 2) {
				break;
			}
			start = next;
			next = reader.nextLine();
		}
			
		System.out.println(c + 1);
	}
}	
