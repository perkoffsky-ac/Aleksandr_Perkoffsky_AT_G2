package day18;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","summary"},
        glue = {"day18"},
        features = {"src/test/resources/features/my.feature"},
        strict = true)

public class CucumberRunner {

}
