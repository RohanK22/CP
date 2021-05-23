import java.io.*;
import java.util.*;

public class solution {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());

        for(int i = 0; i< n; i++) {
            String[] row = reader.nextLine().split(" ");
            int s = Integer.parseInt(row[0]), sum = 0 ;
            int f = Integer.parseInt(row[1]);

            String[] stones = reader.nextLine().split(" ");
            int[] weights = new int[s];
            
            for(int j = 0; j< s; j++) {
                weights[j] = Integer.parseInt(stones[j]);
                sum += weights[j];
            }

            if(sum == f) {
                System.out.println("NO");
                continue;
            }

            if( sum < f) {
                System.out.println("YES");
                String res = "";
                for(int w = s- 1;w >=0; w--) {
                    res += weights[w] + " ";
                }
                System.out.println(res.trim());
                continue;
            }

            Arrays.sort(weights);
            String res = solve(weights, f);
            if(res.contains("*") || res.equals("")) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                System.out.println(res);
            }
        }

        reader.close();
    }

    public static String solve(int[] weights, int f) {
        int s = weights.length;
        if(s == 1 && weights[0] == f) {
            return "*";
        }
        if(weights[s - 1] > f) {
                String res = "";
                for(int w = s- 1;w >=0; w--) {
                    res += weights[w] + " ";
                }
                return (res.trim());
            } else {
                
                String res = "";
                int sum = 0, c = 0;
                ArrayList<Integer> rem = new ArrayList<>();
                for(int w = 0; w <s; w++) {

                    sum += weights[w];
                    if(sum < f) {

                    } else if(sum == f)  {
                        if(w==s-1)
                            return "*";
                        else {
                            sum -= weights[w];
                            rem.add(weights[w]);
                            continue;
                        }
                    } else {
                        res = "";
                        for(w = s- 1;w >=0; w--) {
                            res += weights[w] + " ";
                        }
                        return (res.trim());
                    }
                    res += weights[w] + " ";
                }
                String remStr = "";
                for(int r: rem) {
                    remStr += r + " ";
                }
                return (res.trim()) + " " + remStr.trim();
            }

    }
}