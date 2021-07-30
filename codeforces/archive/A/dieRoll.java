package archive;

import java.io.*;
import java.util.*;

public class dieRoll {
    public static Scanner sc  = null;
    public static FileWriter op = null;
    
    // set
    public static boolean debug = false;
    public static boolean casesPresent = false;

    public static void solve() throws Exception {
        // Your solution here
        int[] nums = gia();
        int a= nums[0], b=nums[1];
        int num = 6 - Math.max(a, b) + 1;
        if(num == 6) {
            print("1/1");
        } else if(num %2 ==0 ) {
            print((num/2) +"/" + (6/2));
        } else if( num % 3 ==0) {
            print((num/3) +"/" + (6/3));
        } else {
            print((num) +"/" + (6));
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

    public static void println(int str) throws Exception {
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
