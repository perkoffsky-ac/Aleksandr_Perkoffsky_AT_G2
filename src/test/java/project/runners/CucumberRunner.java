package project.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","summary"},
        glue = {"project"},
        features = {"src/test/resources/features/booking/Price.feature",
                "src/test/resources/features/booking/HotelAvailability.feature",
                "src/test/resources/features/booking/HotelRating.feature",
                "src/test/resources/features/booking/LanguageCurrency.feature",
                "src/test/resources/features/booking/MoscowColors.feature",
                "src/test/resources/features/demoqa/ChoiceLists.feature",
                "src/test/resources/features/booking/Madrid.feature"},
        strict = true)

public class CucumberRunner {

}
