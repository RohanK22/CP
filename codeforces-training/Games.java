import java.util.Scanner;
import java.util.ArrayList;

public class Games {
		
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String s= reader.nextLine();
		int n = Integer.parseInt(s);
		int[] h = new int[n];
		int[] g = new int[n];
		int ans = 0;
		String[] ss = null;
		for(int i = 0;i < n; i++) {
			ss = reader.nextLine().split(" ");
			h[i] = Integer.parseInt(ss[0]);
			g[i] = Integer.parseInt(ss[1]);
		}
		for(int i = 0; i< n; i++) {
			for(int j = 0; j< n; j++ ) {
				if(h[i] == g[j] && i != j) {
					ans +=1;
				}
			}
		}
		System.out.println(ans);
		
	}
}	
