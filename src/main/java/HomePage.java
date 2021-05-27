import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;
    public HomePage(WebDriver driver)
    {
        this.driver=driver;
    }



    public HomePage entrer_text_nintendoSwitch()
    {
        By text_search=By.id("twotabsearchtextbox");
        driver.findElement(text_search).sendKeys("nintendo switch ");

        return this ;
    }
/*
architecture ,screeshot ,comment ca marché  gonogo dashboard si possible
 */
    public RechercheResultatPage aller_sur_loupe()
    {
        By loupe_search=By.id("nav-search-submit-button");
        driver.findElement(loupe_search).click();
        return new RechercheResultatPage(driver);
    }




}
