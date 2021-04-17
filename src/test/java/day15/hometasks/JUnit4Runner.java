package day15.hometasks;

import day15.SeleniumTest4;
import day15.SeleniumTest5;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({

        SeleniumTest4.class,
        SeleniumTest5.class,
        MoscowColors.class,
        ChoiceLists.class,
        LanguageCurrency.class,
        HotelAvailability.class,
        HotelRating.class

})

public class JUnit4Runner {
}
