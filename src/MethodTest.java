import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * It is used for testing methods in this package
 */
public class MethodTest extends TestCase {
    private Sum sum;

    protected void setUp() throws Exception {
        sum = new Sum();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testSum() {
        int res = sum.sum(100);
        Assert.assertEquals(5050,res);
    }

    public void testSum1() {
        int res = sum.sum1(5);
        Assert.assertEquals(9, res);
    }

    public void testMultiSum(){
        int res = sum.multisum(2);
        Assert.assertEquals(7,res);
    }

    // Test deleteElement Method
    private deleteElement de;
    @Test
    public void testDeleteElement(){
        String str = "We are so happy. We have many apples and fishes to eat.";
        String res = de.deleteElement(str,'a');
        Assert.assertFalse(res.contains("a"));
    }
}

