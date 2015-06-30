package nl.quince.qrs.testtest;

import org.junit.Test;

/**
 * Created by enrico on 25/06/15.
 */
public class ClassToTestTest {

    @Test
    public void testGetTrue() throws Exception {
        org.junit.Assert.assertTrue(new ClassToTest().getTrue());
    }
}