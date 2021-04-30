package day15.hometasks;

import day15.TestPrice;
import day15.TestSearchingResults;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({

        TestPrice.class,
        TestSearchingResults.class,
        TestMoscowColors.class,
        TestChoiceLists.class,
        TestLanguageCurrency.class,
        TestHotelAvailability.class,
        TestHotelRating.class

})

public class JUnit4Runner {
}
