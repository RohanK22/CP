import java.io.*;
import java.util.*;

public class A {
    public static Scanner sc = null;
    public static FileWriter op = null;

    // set
<<<<<<< HEAD
    public static boolean debug = false;
    public static boolean casesPresent = true;

    public static void solve() throws Exception {
        int n = gi();
        gs();
        long[] a = gla();

        long ugliness = Integer.MAX_VALUE;
        long op = 0;
        while (getUgliness(a, n, op) <= ugliness) {
            ugliness = getUgliness(a, n, op);
            // println("TEST:" + ugliness);

            // modify hist
            long largest = Integer.MIN_VALUE;
            for (long num : a) {
                if (num > largest) {
                    largest = num;
                }
            }

            if (largest <= 0) {
                break;
            }

            int i = 0;
            while (i < n) {
                if (a[i] == largest) {
                    a[i]--;
                    op++;
                    // break;
                }
                i++;
            }

        }
        println(ugliness);
    }

    public static long getUgliness(long[] a, int n, long op) {
        long s = 0;
        for (int i = 1; i < n; i++) {
            s += Math.abs(a[i] - a[i - 1]);
        }
        s += a[0];
        if (a[n - 1] != 0) {
            s += a[n - 1];
        }
        return s + op;
=======
    public static boolean debug = true;
    public static boolean casesPresent = false;
    

    public static void solve() throws Exception {
        int n = gi(), a = gi();gs();
        int[] t = gia();

<<<<<<< HEAD
        
=======
        for(int i = 0;i < n; i++) {
            score = 0;
            int f = i, b = i, t = a[i];
            while(f <= n -1 && a[f] <= t) {
                score++;
                t = a[f];
                f++;
            }

            t = a[i];
            while(b >= 0 && a[b] <= t) {
                score++;
                t = a[b];
                b--;
            }

            score--;

            // println(score);
            if(score > max)
                max = score;

        }

        println(max);
>>>>>>> d2e5c5daf89d4624505147cd410fa48923bec642
>>>>>>> 68ef8b1ff49b0b2b26c1f94e30c0179492eb031e
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
