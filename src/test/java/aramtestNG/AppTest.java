package aramtestNG;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;


public class AppTest {

    private static final Logger LOG = LoggerFactory.getLogger(AppTest.class);

    @Test(enabled = false)
    public void simlTest(){
        LOG.info("Good test");
    }

    @Test(enabled = false)
    public void simlTest1(){
        LOG.info("Good test");
    }



}
