import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EbayHomePageObjectModel {

    //Attribut
    private WebDriver driver;

    // Locators
    private By categorySelect = By.cssSelector("select#gh-cat");
    private By searchInput    = By.cssSelector("input#gh-ac");

    // Konstruktor
    public EbayHomePageObjectModel(WebDriver driver) {
        this.driver = driver;
    }

    // Hjälp Metoder
    public void open() {
        driver.get("https://www.ebay.com");
    }

    public void selectCategoryByText(String text) {
        WebElement selectElement = driver.findElement(categorySelect);
        Select select = new Select(selectElement);
        select.selectByVisibleText(text);
    }

    public void searchFor(String text) {
        WebElement searchElement = driver.findElement(searchInput);
        searchElement.sendKeys(text);
        searchElement.submit();
    }
}
