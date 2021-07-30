package archive;

import java.io.*;
import java.util.*;

public class teamOlympiad {
    public static Scanner sc  = null;
    public static FileWriter op = null;
    
    // set
    public static boolean debug = false;
    public static boolean casesPresent = false;
    

    public static void solve() throws Exception {
        // Your solution here
        int n = gi();
        gs();
        int[] stu = gia();
        int lastP =0, lastM =0, lastPE =0;
        int[][] groups = new int[n][3];
        for(int i =0; i< n; i++) {
            int x = stu[i];
            int r = 0;
            switch(x) {
                case 1:r = lastP++;break;
                case 2:r = lastM++; break;
                case 3:r = lastPE++;break;
            }
            groups[r][x - 1] = i+1;
        };
        int gps = Math.min(lastP, Math.min(lastM, lastPE));
        println(gps);
        if(gps != 0) {
            for(int i =0; i<gps; i++) {
                println(groups[i][0] + " " + groups[i][1] + " " + groups[i][2]);
            }
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
