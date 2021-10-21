import org.junit.*;
import static org.junit.Assert.*;

public class Tests
{
    
    @Test
    public void test1()
    {
        Solution solution = new Solution();

        assertEquals("1212", solution.numberPrediction("121_"));
    }

    @Test
    public void test2()
    {
        Solution solution = new Solution();

        assertEquals("12123434121234", solution.numberPrediction("121_343_1_1_3_"));
    }

    @Test
    public void test3()
    {
        Solution solution = new Solution();

        assertEquals("12123123123", solution.numberPrediction("121_312____"));
    }

    @Test
    public void test4()
    {
        Solution solution = new Solution();

        assertEquals("131232432", solution.numberPrediction("13123243_"));
    }

    @Test
    public void test5()
    {
        Solution solution = new Solution();

        assertEquals("12342351234", solution.numberPrediction("1234235123_"));
    }

    @Test
    public void test6()
    {
        Solution solution = new Solution();

        assertEquals("700000007", solution.numberPrediction("70000000_"));
    }

    @Test
    public void test7()
    {
        Solution solution = new Solution();

        assertEquals("100000000012000000000210000000001", solution.numberPrediction("10000000001200000000021000000000_"));
    }

    @Test
    public void test8()
    {
        Solution solution = new Solution();

        assertEquals("100000000001200000000002100000000002", solution.numberPrediction("10000000000120000000000210000000000_"));
    }

    @Test
    public void test9()
    {
        Solution solution = new Solution();

        assertEquals("112233112233", solution.numberPrediction("1_2_3_11____"));
    }

    @Test
    public void test10()
    {
        Solution solution = new Solution();

        assertEquals("000", solution.numberPrediction("___"));
    }

    @Test
    public void test11()
    {
        Solution solution = new Solution();

        assertEquals("43127435926350613352415886760955388689837433252198168992662929327768929921981804928762981934364769323343436476957693078576760629193434364763829112268168904926760601193476307077689049204312334343060374", solution.numberPrediction("43127435926350613352415886760955388_8983743325219_168_926629293_776892_9_1_8_8049287_298_9343647_9_2334_4_6_7__57__30785__7__62_1____4_____382__1226816__04__67___0119_47__0_0_7___0___0_3__3_____06_37_"));
    }

    @Test
    public void test12()
    {
        Solution solution = new Solution();

        assertEquals("10593842310632722312830779632863907072928931742438940705409205409010409351307307689675779203893128347255557734674938809759367575255554445675752593659015901536590108097593677346391742438940701080980986", solution.numberPrediction("1059384231063272231283077963_86390_07292893174_4389407054_9205___0104__35130_3__68_67577_2_38_3_2__47255__7_34674938809759_6_5_525_5_44_56____2_9__5_0_5__153_____08________7___3_17_______0__1____8___6"));
    }
}