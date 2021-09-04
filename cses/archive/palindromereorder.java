import java.io.*;
import java.util.*;

public class A {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static FastReader sc = null;

    // set
    public static boolean casesPresent = false;

    public static void solve() throws Exception {
        String s = gs();
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        String front = "";
        if (n % 2 == 0) {
            for (Map.Entry<Character, Integer> e : map.entrySet()) {
                if (e.getValue() % 2 != 0) {
                    println("NO SOLUTION");
                    return;
                } else {
                    for (int i = 0; i < e.getValue() / 2; i++) {
                        front += e.getKey();
                    }
                }
            }
            println(front + new StringBuilder(front).reverse().toString());
        } else {
            int oddCount = 0;
            char oddChar = '!';
            for (Map.Entry<Character, Integer> e : map.entrySet()) {
                if (e.getValue() % 2 != 0) {
                    oddChar = e.getKey();
                    if (oddCount < 2)
                        oddCount++;
                    else {
                        println("NO SOLUTION");
                        return;
                    }
                }
                for (int i = 0; i < e.getValue() / 2; i++) {
                    front += e.getKey();
                }
            }
            println(front + String.valueOf(oddChar) + new StringBuilder(front).reverse().toString());
        }

    }

    public static int charToInt(char c) throws Exception {
        return (int) c;
    }

    public static char intToChar(int n) throws Exception {
        return (char) n;
    }

    public static int gcd(int n1, int n2) throws Exception {
        int gcd = 1;

        for (int i = 1; i <= n1 && i <= n2; ++i) {
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }

        return gcd;
    }

    public static void main(String[] args) throws Exception {
        sc = new FastReader();

        if (casesPresent) {
            long cases = gl();
            gs();
            for (int c = 0; c < cases; c++)
                solve();
        } else {
            solve();
        }
    }

    // Max and min
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    // Printing
    public static void println(String str) throws Exception {
        System.out.println(str);

    }

    public static void print(String str) throws Exception {
        System.out.print(str);

    }

    public static void println(char str) throws Exception {
        System.out.println(str);

    }

    public static void print(char str) throws Exception {
        System.out.print(str);

    }

    public static void printArr(int[] arr, String sep) throws Exception {
        String str = "";
        for (int i : arr) {
            str += i + sep;
        }
        str = str.trim();
        System.out.println(str);

    }

    public static void println(long str) throws Exception {
        System.out.println(str);

    }

    public static void print(long str) throws Exception {
        System.out.println(str);

    }

    public static void print(int str) throws Exception {
        System.out.print(str);

    }

    public static void println(float str) throws Exception {

        System.out.println(str);

    }

    public static void print(float str) throws Exception {
        System.out.print(str);

    }

    // Getting user input
    public static int gi() {
        return sc.nextInt();
    }

    public static long gl() {
        return sc.nextLong();
    }

    public static int[] gia() {
        String[] sp = sc.nextLine().trim().split(" ");
        int[] arr = new int[sp.length];
        for (int i = 0; i < sp.length; i++) {
            arr[i] = Integer.parseInt(sp[i]);
        }
        return arr;
    }

    public static long[] gla() {
        String[] sp = sc.nextLine().trim().split(" ");
        long[] arr = new long[sp.length];
        for (int i = 0; i < sp.length; i++) {
            arr[i] = Long.parseLong(sp[i]);
        }
        return arr;
    }

    public static float[] gfa() {
        String[] sp = sc.nextLine().trim().split(" ");
        float[] arr = new float[sp.length];
        for (int i = 0; i < sp.length; i++) {
            arr[i] = Float.parseFloat(sp[i]);
        }
        return arr;
    }

    public static String gs() {
        return sc.nextLine();
    }
}
