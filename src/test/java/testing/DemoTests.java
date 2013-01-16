package testing;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertEquals;

/**
 * author: fjodorekstrom
 */
@ContextConfiguration(locations = "/spring/test-context.xml")
@RunWith(value = SpringJUnit4ClassRunner.class)
public class DemoTests extends TestBaseAbstract{

    String actualTitle = null;

    @Before
    public void before(){
        setUp("http://www.google.com/");
    }

    @Test
    public void testGoogle(){
        actualTitle = driver.getTitle();
        assertEquals("Google", actualTitle);
    }
}
