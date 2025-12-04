import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EbayTest {

    @Test
    public void testVanGoghArt(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");

        Select select = new Select(driver.findElement(By.cssSelector("select#gh-cat")));
        select.selectByIndex(2);
        WebElement searchElement =  driver.findElement(By.cssSelector("input#gh-ac"));
        searchElement.sendKeys("van Gogh");
        searchElement.submit();
    }
}
