import java.util.ArrayList;
import java.util.function.IntPredicate;

public class Solution {
    public static void main(String[] args) {
        System.out.println(numberPrediction("121_"));
    }

    public static String numberPrediction(String input) {
        String ans = "";
        ArrayList<String> al = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '_') {
                for (int s = 10; s > 0; s--) {
                    if (i - s >= 0) {
                        String search = input.substring(i - s, i);
                        System.out.println("Search String : " + search);
                        int idx = input.substring(0, i).indexOf(search, i - s);
                        if (idx == -1) {
                            ans += String.valueOf(input.charAt(i - 1));
                        } else {
                            System.out.println("Starts at " + idx);
                            ans += String.valueOf(input.charAt(idx + (i - s) + 1));
                        }
                    }
                }
            } else {
                ans += String.valueOf(input.charAt(i));
            }
        }
        return ans;
    }
}