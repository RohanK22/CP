import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class template {
    public static Scanner sc  = null;
    public static FileWriter op = null;
    
    // set
    public static boolean debug = true;
    public static boolean casesPresent = true;
    

    public static void solve() throws Exception {
        // Your solution here
        int n = gi();
        gs();
        int[] a = gia();
        int largestSubseq = 1;
      
        int opsize = (int)Math.pow(2, n);
        ArrayList<Integer> al = new ArrayList<>();
        for (int counter = 1; counter < opsize; counter++)
        {
            for (int j = 0; j < n; j++)
            {
                if (BigInteger.valueOf(counter).testBit(j))
                    al.add(a[j]);
            }
            
            int[] subseq = new int[al.size()];
            for(int num = 0; num < al.size();  num++) {
                subseq[num] = al.get(num);
            }
            al.clear();
            
            if(isStrange(subseq) && subseq.length > largestSubseq) {
                largestSubseq = subseq.length;
            }
        }
        
        println(largestSubseq);
    }

    public static boolean isStrange(int[] nums) throws Exception {
        int e = nums.length;
        int max = Integer.MIN_VALUE;
        for(int y: nums){
            if(max<y) max=y;
        }

        for(int i =0; i<e; i++) {
            for(int j =i+1; j <e; j++) {
                if(Math.abs(nums[i] - nums[j]) < max) {
                    return false;
                }
            }
        }
        return true;
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
