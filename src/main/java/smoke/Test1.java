package smoke;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

    @Test(retryAnalyzer = Retry.class)
    public void test1() {
        System.out.println("Test 1");
        Assert.fail();
    }

}
