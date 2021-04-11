import java.util.*;

public class G {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        reader.nextLine();
        int num = 0, i = 0;
        boolean f = false;
        while (n > 0) {
            num = Integer.parseInt(reader.nextLine());
            i = 1;
            f = false;
            if (num == 1) {
                System.out.println(1);
                n--;
                continue;
            }
            while (i < num) {
                if (sumD(i) == num) {
                    System.out.println(i);
                    f = true;
                    break;
                }
                i++;
            }
            if (f == false) {
                System.out.println(-1);
            }
            n--;
        }

        reader.close();
    }

    public static int sumD(int n) {
        int s = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                s += i;
            }
        }
        return s + n;
    }

}