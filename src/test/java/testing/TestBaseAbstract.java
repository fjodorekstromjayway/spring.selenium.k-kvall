package testing;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * author: fjodorekstrom
 */
abstract class TestBaseAbstract {
    @Autowired
    protected WebDriver driver;

    void setUp(String url){
        driver.get(url);
    }

    void tearDown(){

    }

}
