import org.junit.*;
import static org.junit.Assert.*;

public class Tests {

    @Test
    public void test1() {
        Arti solution = new Arti();

        assertArrayEquals(
                new String[] { "VISA",
                        "This is a secret but my card number is *************! Shhhh! Don't tell anyone!" },
                solution.redactCardDetails(
                        "This is a secret but my card number is 4000000000000! Shhhh! Don't tell anyone!"));
    }

    @Test
    public void test2() {
        Arti solution = new Arti();

        assertArrayEquals(new String[] { "MASTERCARD", "123-****************-123 oops! Don't read that!!" },
                solution.redactCardDetails("123-5200000000000000-123 oops! Don't read that!!"));
    }

    @Test
    public void test3() {
        Arti solution = new Arti();

        assertArrayEquals(new String[] { "MASTERCARD", "****************123456789" },
                solution.redactCardDetails("5300000000000000123456789"));
    }

    @Test
    public void test4() {
        Arti solution = new Arti();

        assertArrayEquals(new String[] { "MASTERCARD", "98767****************" },
                solution.redactCardDetails("987675400000000000000"));
    }

    @Test
    public void test5() {
        Arti solution = new Arti();

        assertArrayEquals(new String[] { "AMEX", "***************" }, solution.redactCardDetails("370000000000000"));
    }

    @Test
    public void test6() {
        Arti solution = new Arti();

        assertArrayEquals(new String[] { "NONE", "15986700000000000000075670987654321" },
                solution.redactCardDetails("15986700000000000000075670987654321"));
    }

    @Test
    public void test7() {
        Arti solution = new Arti();

        assertArrayEquals(new String[] { "NONE", "No private data here!" },
                solution.redactCardDetails("No private data here!"));
    }

    @Test
    public void test8() {
        Arti solution = new Arti();

        assertArrayEquals(new String[] { "MASTERCARD", "blah blah blah blah **************** blah blah blah" },
                solution.redactCardDetails("blah blah blah blah 5100000000000000 blah blah blah"));
    }

    @Test
    public void test9() {
        Arti solution = new Arti();

        assertArrayEquals(new String[] { "AMEX", "secret secrets: ***************" },
                solution.redactCardDetails("secret secrets: 340000000000000"));
    }

    @Test
    public void test10() {
        Arti solution = new Arti();

        assertArrayEquals(new String[] { "VISA", "dont read this -> ************* <- no! stop!" },
                solution.redactCardDetails("dont read this -> 4111111111111 <- no! stop!"));
    }
}