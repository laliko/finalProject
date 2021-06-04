import airbnb.StepObject.airbnbSteps;
import airbnb.utils.chromeRunner;
import org.testng.annotations.Test;

import static airbnb.DataObject.airbnbData.*;

public class airbnbWeb extends chromeRunner {
    @Test
    public void airbnbSignUp() {
        airbnbSteps steps = new airbnbSteps();
        steps
                .navigationMenu()
                .signUp()
                .countryRegion(countryCode)
                .phoneNumber(phoneNumber)
                .continueButt()
                .confNum();
    }
}
