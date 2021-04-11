import java.util.*;

public class solution {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        reader.nextLine();
        int c = 0;

        int[] ans = new int[n];
        boolean f = false;
        for (int i = 0; i < n; i++) {
            f = false;
            int l = Integer.parseInt(reader.nextLine());
            String[] s = reader.nextLine().split(" ");
            for (int j = 1; j < l - 1; j++) {
                if (!s[j - 1].equals(s[j]) && !s[j].equals(s[j + 1])) {
                    ans[c++] = j + 1;
                    f = true;
                    break;
                }
            }
            if (f)
                continue;
            if (!s[0].equals(s[1])) {
                ans[c++] = 1;
            } else if (!s[l - 1].equals(s[l - 2])) {
                ans[c++] = l;
            }
        }
        for (int nn : ans) {
            System.out.println(nn);
        }
    }
}