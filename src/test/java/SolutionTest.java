import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void backspaceCompareTest1(){
        String s = "ab#c";
        String t = "ad#c";
        boolean actual = new Solution().backspaceCompare(s,t);

        Assert.assertTrue(actual);
    }
    @Test
    public void backspaceCompareTest2(){
        String s = "ab##";
        String t = "c#d#";
        boolean actual = new Solution().backspaceCompare(s,t);

        Assert.assertTrue(actual);
    }
    @Test
    public void backspaceCompareTest3(){
        String s = "a#c";
        String t = "b";
        boolean actual = new Solution().backspaceCompare(s,t);

        Assert.assertFalse(actual);
    }
}
