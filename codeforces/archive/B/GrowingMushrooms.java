package archive.B;

import java.io.*;
import java.util.*;

public class GrowingMushrooms {
    public static Scanner sc = null;
    public static FileWriter op = null;

    // set
    public static boolean debug = false;
    public static boolean casesPresent = false;

    public static void solve() throws Exception {
        int n = gi(), t1 = gi(), t2 = gi(), k = gi();
        gs();
        HashMap<Double, ArrayList<Integer>> mp = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            int v = gi(), u = gi();
            gs();
            double len = Math.max(t1 * v + t2 * u * (100 - k) / 100.0, t1 * u + t2 * v * (100 - k) / 100.0);
            len = Math.round(len * 100.0) / 100.0;

            if (mp.containsKey(len))
                mp.get(len).add(i);
            else {
                ArrayList<Integer> t = new ArrayList<Integer>();
                t.add(i);
                mp.put(len, t);
            }
        }

        SortedSet<Double> keys = new TreeSet<>(mp.keySet());
        while (!keys.isEmpty()) {
            double key = keys.last();
            Collections.sort(mp.get(key));
            for (int num : mp.get(key)) {
                println(num + " " + key);
            }
            keys.remove(key);
        }
    }

    public static int charToInt(char c) throws Exception {
        return (int) c;
    }

    public static char intToChar(int n) throws Exception {
        return (char) n;
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
