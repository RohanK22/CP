
class Solution {

    

    public static boolean isThereAPath(int c, int x1, int y1, int x2, int y2) {
        if (x1 == x2 && y1 == y2) {
            return true;
        } else if ((int)Math.floor(Math.sqrt(x1 + y1)) == (int) Math.ceil(Math.sqrt(x1 + y1)) || (x1 > x2) || (y1 > y2)) {
            return false;
        } else {
            boolean right = isThereAPath(c, x1 + y1, y1, x2, y2);
            boolean up = isThereAPath(c, x1, x1 + y1, x2, y2);
            boolean diag = isThereAPath(c, x1 + c, y1 + c, x2, y2);
            
            return right || up || diag;
        }
    }
    public static void main(String[] args) {
        System.out.println(isThereAPath( 0, 0, 0, 3, 3));
    }
}