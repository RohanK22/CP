import java.io.*;
import java.util.*;

public class A {
    public static Scanner sc  = null;
    public static FileWriter op = null;
    
    // set
    public static boolean debug = false;
    public static boolean casesPresent = false;
    

    public static void solve() throws Exception {
        int n = gi();

        if(n == 0) {
            println(1);
            return;
        }

        switch(n % 4) {
            case 1: println(8);break;
            case 2: println(4);break;
            case 3: println(2);break;
            case 0: println(6);break;
        }
        
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
