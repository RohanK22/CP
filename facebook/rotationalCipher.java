import java.util.*;
// Add any extra import statements you may need here


class rotationalCipher {

  // Add any helper functions you may need here
  int getRotatedAscii(int ascii, int l, int u, int rotationFactor) {
    int t = rotationFactor % (u - l + 1);
    if(ascii >= l && ascii <= u) {
        if(ascii + t <= u) {
          return ascii + t;
        } else {
          return (l + t - (u - ascii + 1));
        }
    } else {
      return -1;
    }
  }

  String rotationalCipher(String input, int rotationFactor) {
    // 0 - 9  48 - 57
    // a - z 97 - 122
    // A - Z 65 - 90
    StringBuilder sb = new StringBuilder("");
    for(int i = 0; i < input.length(); i++) {
      int ascii = (int) input.charAt(i);
      int newAscii = getRotatedAscii(ascii, 48, 57, rotationFactor);
      if(newAscii != -1) {
        sb.append(String.valueOf((char)newAscii));
        continue;
      }
      newAscii = getRotatedAscii(ascii, 97, 122, rotationFactor);
      if(newAscii != -1) {
        sb.append(String.valueOf((char)newAscii));
        continue;
      }
      newAscii = getRotatedAscii(ascii, 65, 90, rotationFactor);
      if(newAscii != -1) {
        sb.append(String.valueOf((char)newAscii));
        continue;
      }
      sb.append(String.valueOf((char)ascii));
    }
    return sb.toString();
  }











  // These are the tests we use to determine if the solution is correct.
  // You can add your own at the bottom.
  int test_case_number = 1;
  void check(String expected, String output) {
    boolean result = (expected.equals(output));
    char rightTick = '\u2713';
    char wrongTick = '\u2717';
    if (result) {
      System.out.println(rightTick + " Test #" + test_case_number);
    }
    else {
      System.out.print(wrongTick + " Test #" + test_case_number + ": Expected ");
      printString(expected); 
      System.out.print(" Your output: ");
      printString(output);
      System.out.println();
    }
    test_case_number++;
  }
  void printString(String str) {
    System.out.print("[\"" + str + "\"]");
  }
  
  public void run() {
    String input_1 = "All-convoYs-9-be:Alert1.";
    int rotationFactor_1 = 4;
    String expected_1 = "Epp-gsrzsCw-3-fi:Epivx5.";
    String output_1 = rotationalCipher(input_1, rotationFactor_1);
    check(expected_1, output_1);

    String input_2 = "abcdZXYzxy-999.@";
    int rotationFactor_2 = 200;
    String expected_2 = "stuvRPQrpq-999.@";
    String output_2 = rotationalCipher(input_2, rotationFactor_2);
    check(expected_2, output_2);

    // Add your own test cases here
    
  }
  
  public static void main(String[] args) {
    new rotationalCipher().run();
  }
}
