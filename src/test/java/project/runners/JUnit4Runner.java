package project.runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import project.tests.BookingTest;
import project.tests.DemoqaTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({

        BookingTest.class,
        DemoqaTest.class
})

public class JUnit4Runner {
}
