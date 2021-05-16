package co.uk.next.hooks;

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

    private void launchBrowser(String chrome) {
    }

    @After
            public void tearDown()

    {
      closeBrowser();
    }

    private void closeBrowser() {
    }
}
