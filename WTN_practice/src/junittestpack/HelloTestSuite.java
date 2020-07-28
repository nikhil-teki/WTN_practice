package junittestpack;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({HelloTest.class, HelloTest2.class })
public class HelloTestSuite {

}
