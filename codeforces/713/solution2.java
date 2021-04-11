import java.util.*;

public class solution2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        reader.nextLine();
        while (n > 0) {
            boolean f = true;

            int r = Integer.parseInt(reader.nextLine());
            char[][] nums = new char[r][r];
            int r1 = 0, r2 = 0, c1 = 0, c2 = 0;
            for (int rr = 0; rr < r; rr++) {
                String s = reader.nextLine();
                for (int c = 0; c < r; c++) {
                    nums[rr][c] = s.charAt(c);
                    if (nums[rr][c] == '*') {
                        if (f) {
                            r1 = rr;
                            c1 = c;
                            f = false;
                        } else {
                            r2 = rr;
                            c2 = c;
                        }
                    }
                }
            }

            if (r1 == r2) {
                int len = Math.abs(c1 - c2);
                if (r1 - len >= 0) {
                    nums[r1 - len][c1] = '*';
                    nums[r2 - len][c2] = '*';

                } else {
                    nums[r1 + len][c1] = '*';
                    nums[r2 + len][c2] = '*';
                }
            } else if (c1 == c2) {
                int len = Math.abs(r1 - r2);
                if (c1 - len >= 0) {
                    nums[r1][c1 - len] = '*';
                    nums[r2][c2 - len] = '*';

                } else {
                    nums[r1][c1 + len] = '*';
                    nums[r2][c2 + len] = '*';

                }
            } else {
                int len = Math.abs(r1 - r2);
                nums[r2 - len][c2] = '*';
                nums[r1 + len][c1] = '*';

            }
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < r; j++) {
                    System.out.print(nums[i][j]);
                }
                System.out.println();
            }

            n--;
        }

        reader.close();
    }
}