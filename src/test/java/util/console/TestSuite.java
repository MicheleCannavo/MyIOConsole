package util;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import util.console.TestInput;
import util.console.TestOutput;

@RunWith(Suite.class)
@Suite.SuiteClasses({
  TestOutput.class,   TestInput.class })
class JunitTestSuite {
}