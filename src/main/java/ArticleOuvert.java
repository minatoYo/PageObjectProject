import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ArticleOuvert {

    WebDriver driver;
    public ArticleOuvert(WebDriver driver)
    {
        this.driver=driver;
    }

    public boolean isTextCorrect()
    {
        String res="Nintendo Switch avec paire de Joy-Con Rouge Néon et Bleu Néon";
        WebElement textResult=driver.findElement(By.id("productTitle"));
        return textResult.getText().equals(res);

    }
}
