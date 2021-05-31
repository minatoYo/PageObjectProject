import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



//code page object
public class PageObject {


    WebDriver driver;
//3A(arrange ,asct ,assert )

    @BeforeMethod
    public void ouvrirChrome()
    {
        driver= new ChromeDriver();

        driver.get("https://www.amazon.fr/");

        driver.manage().window().maximize();

        WebElement acc;
        String accepter="sp-cc-accept";

        // acc= driver.findElement(By.xpath(accepter));
        acc= driver.findElement(By.id(accepter));//par css
        acc.click();

    }

    @AfterMethod
    public void fermerchrome()
    {
        driver.quit();
    }


    @Test
    public void test()
    {
        //arrange

        //acts

        HomePage hp=new HomePage(driver);
       hp.entrer_text_nintendoSwitch().aller_sur_loupe();

        RechercheResultatPage  rrp =new RechercheResultatPage (driver);
        rrp.open_first_article();




        //assert
        ArticleOuvert  ao =new ArticleOuvert (driver);
        Assert.assertFalse(ao.isTextCorrect(),"le message n'est pas visible ");



    }

}













//fluent interface quand on enchaine les commandes  en francais desigantion chainée
//draft pull request a cote du pul request
/*
 *dans rechercher taper nitendo switch appuyer le boutton recherche ,prendre le premiere , verifier que le titre contien nointendo switch
 */
/**
 * ajout regle on vas dans setting ensuite branche ensuite add rule ensuite on tape notre branch  ensuite require pull request reviews merging
 */