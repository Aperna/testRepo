


import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks {

    DriverManager DM= new DriverManager();
    @Before
    public void setUP() throws IOException

    {
       DM.OpenBrowser();
    }
    @After
    public void teardown()
    {
        DM.CloseBrowser();
    }
}
