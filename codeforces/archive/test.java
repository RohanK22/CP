package archive;

public import java.io.*;
import java.util.*;

public class A {
    public static Scanner sc = null;
    public static FileWriter op = null;

    // set
    public static boolean debug = false;
    public static boolean casesPresent = true;

    public static void solve() throws Exception {
        // solve
        int n = gi(), m = gi();
        gs();
        char[][] a = new char[n][m];
        char[][] cpy = new char[n][m];

        for (int i = 0; i < n; i++) {
            String s = gs();
            a[i] = s.toCharArray();
            cpy[i] = s.toCharArray();
        }

        if (n == m && n == 1) {
            println("YES");
            if (a[0][0] == '.') {
                println("W");
            } else {
                println(a[0][0]);
            }
            return;
        }

        boolean Rfirst = false, change = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // println("DEBUG: " + a[i][j] + " " + Rfirst + " " + change);
                if (a[i][j] == '.') {
                    if (Rfirst) {
                        a[i][j] = 'R';
                    } else {
                        a[i][j] = 'W';
                    }
                    Rfirst = !Rfirst;
                } else {
                    if (a[i][j] != (Rfirst ? 'R' : 'W')) {
                        if (!change) {
                            a = cpy;
                            Rfirst = true;
                            i = 0;
                            j = -1;
                            change = !change;
                        } else {
                            println("NO");
                            return;
                        }
                    } else {
                        Rfirst = !Rfirst;
                    }
                }
            }
            if (m % 2 == 0 && m != 1) {
                Rfirst = !Rfirst;
            }
        }

        // yes case
        println("YES");
        for (int i = 0; i < n; i++) {
            String o = "";
            for (int j = 0; j < m; j++) {
                o += a[i][j];
            }
            println(o);
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
        if (debug) {
            sc = new Scanner(new File("input.txt"));
            op = new FileWriter("output.txt");
        } else {
            sc = new Scanner(System.in);
        }

        if (casesPresent) {
            int cases = gi();
            gs();
            for (int c = 0; c < cases; c++)
                solve();
        } else {
            solve();
        }

        if (op != null)
            op.close();
        sc.close();
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
        if (debug) {
            op.write(str + "\n");
        } else {
            System.out.println(str);
        }
    }

    public static void print(String str) throws Exception {
        if (debug) {
            op.write(str);
        } else {
            System.out.print(str);
        }
    }

    public static void println(char str) throws Exception {
        if (debug) {
            op.write("" + str + "\n");
        } else {
            System.out.println(str);
        }
    }

    public static void print(char str) throws Exception {
        if (debug) {
            op.write(str);
        } else {
            System.out.print(str);
        }
    }

    public static void printArr(int[] arr, String sep) throws Exception {
        String str = "";
        for (int i : arr) {
            str += i + sep;
        }
        str = str.trim();
        if (debug) {
            op.write(str + "\n");
        } else {
            System.out.println(str);
        }
    }

    public static void println(long str) throws Exception {
        if (debug) {
            op.write(str + "\n");
        } else {
            System.out.println(str);
        }
    }

    public static void print(long str) throws Exception {
        if (debug) {
            op.write(str + "\n");
        } else {
            System.out.println(str);
        }
    }

    public static void print(int str) throws Exception {
        if (debug) {
            op.write("" + str);
        } else {
            System.out.print(str);
        }
    }

    public static void println(float str) throws Exception {
        if (debug) {
            op.write(str + "\n");
        } else {
            System.out.println(str);
        }
    }

    public static void print(float str) throws Exception {
        if (debug) {
            op.write(Float.toString(str));
        } else {
            System.out.print(str);
        }
    }

    // Getting user input
    public static int gi() {
        return sc.nextInt();
    }

    public static long gl() {
        return sc.nextLong();
    }

    public static float gf() {
        return sc.nextFloat();
    }

    public static int[] gia() {
        String[] sp = sc.nextLine().trim().split(" ");
        int[] arr = new int[sp.length];
        for (int i = 0; i < sp.length; i++) {
            arr[i] = Integer.parseInt(sp[i]);
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
class test {
    
}
