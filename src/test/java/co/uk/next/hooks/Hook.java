package co.uk.next.hooks;

import co.uk.next.common.BrowsersManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BrowsersManager
{
    //HOOKS HELP TO OPEN AND CLOSE BROWSERS
    //use @Before io
    @Before
    public void setUp()
    {
        launchBrowser("Chrome");
    }

    @After
            public void tearDown()

    {
      closeBrowser();
    }
}
