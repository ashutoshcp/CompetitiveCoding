package org;

import org.codechef.APR.APRIL19B.STRCHTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.mine.date.DateTimeUtilsTest;

@RunWith(Suite.class)
@Suite.SuiteClasses(value = {
        DateTimeUtilsTest.class,
        STRCHTest.class
})
public class SingleClassToRunAllUnitTests {
}
