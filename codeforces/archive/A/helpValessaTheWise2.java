import java.io.*;
import java.util.*;

public class A {
    public static Scanner sc  = null;
    public static FileWriter op = null;
    
    // set
    public static boolean debug = false;
    public static boolean casesPresent = false;
    

    public static void solve() throws Exception {
        int r1 = gi(), r2 = gi(); 
        int c1 = gi(), c2 = gi();
        int d1 = gi(), d2 = gi();
        for(int a = 1; a <= 9; a++)
            for(int b = 1; b <= 9; b++)
                for(int c = 1; c <= 9; c++)
                    for(int d = 1; d <= 9; d++) {
                        if(a == b || a == c || a == d) continue;
                        if(b == a || b == c || b == d) continue;
                        if(c == a || c == b || c == d) continue;
                        if(a + b != r1 || c + d != r2) continue;
                        if(a + c != c1 || b + d != c2) continue;
                        if(a + d != d1 || b + c != d2) continue;
                        println("" + a + " " + b);
                        println("" + c + " " + d);
                        return;
                    } 
        println("-1");
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
        if(debug) {
            sc = new Scanner(new File("input.txt"));
            op = new FileWriter("output.txt");
        } else {
            sc = new Scanner(System.in);
        }

        if(casesPresent) {
            int cases = gi();
            gs();
            for(int c = 0; c< cases; c++) 
                solve();
        } else {
            solve();
        }
        
        if(op != null) op.close();
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
        if(debug) {
            op.write(str + "\n");
        } else {
            System.out.println(str);
        }
    }

    public static void print(String str) throws Exception {
        if(debug) {
            op.write(str);
        } else {
            System.out.print(str);
        }
    }

    public static void println(char str) throws Exception {
        if(debug) {
            op.write("" + str + "\n");
        } else {
            System.out.println(str);
        }
    }

    public static void print(char str) throws Exception {
        if(debug) {
            op.write(str);
        } else {
            System.out.print(str);
        }
    }

    public static void printArr(int[] arr, String sep) throws Exception {
        String str = "";
        for(int i: arr) {
            str += i + sep;
        }
        str = str.trim();
        if(debug) {
            op.write(str + "\n");
        } else {
            System.out.println(str);
        }
    }
    
    public static void println(long str) throws Exception {
        if(debug) {
            op.write(str + "\n");
        } else {
            System.out.println(str);
        }
    }

    public static void print(long str) throws Exception {
        if(debug) {
            op.write(str + "\n");
        } else {
            System.out.println(str);
        }
    }

    public static void print(int str) throws Exception {
        if(debug) {
            op.write(str);
        } else {
            System.out.print(str);
        }
    }

    public static void println(float str) throws Exception {
        if(debug) {
            op.write(str + "\n");
        } else {
            System.out.println(str);
        }
    }

    public static void print(float str) throws Exception {
        if(debug) {
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
        for(int i = 0; i< sp.length; i++) {
            arr[i] = Integer.parseInt(sp[i]);
        }
        return arr;
    }

    public static float[] gfa() {
        String[] sp = sc.nextLine().trim().split(" ");
        float[] arr = new float[sp.length];
        for(int i = 0; i< sp.length; i++) {
            arr[i] = Float.parseFloat(sp[i]);
        }
        return arr;
    }

    public static String gs() {
        return sc.nextLine();
    }
}
