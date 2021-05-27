import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RechercheResultatPage {

    WebDriver driver;
    public RechercheResultatPage (WebDriver driver)
    {
        this.driver=driver;
    }

    public ArticleOuvert open_first_article()
    {
        By article_nintendo= By.cssSelector("[data-asin='B07WKNQ8JT']");
        driver.findElement(article_nintendo).click();
        return new ArticleOuvert(driver);
    }

}
