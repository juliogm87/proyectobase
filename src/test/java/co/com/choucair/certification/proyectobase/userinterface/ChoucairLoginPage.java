package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target FIRST_NAME = Target.the("enter first name").located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("enter last name").located(By.id("lastName"));
    public static final Target EMAIL_ADDRESS = Target.the("write the email").located(By.id("email"));
    public static final Target MONTH = Target.the("select the month").located(By.cssSelector("select#birthMonth"));
    public static final Target DAY = Target.the("select the day").located(By.cssSelector("select#birthDay"));
    public static final Target YEAR = Target.the("select the year").located(By.cssSelector("select#birthYear"));
    public static final Target NEXT_BUTTON = Target.the("button next").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
    public static final Target CITY = Target.the("write the email").located(By.id("city"));
    public static final Target CITY_NEXT = Target.the("button next").located(By.xpath("/html/body/div[3]/div[1]"));
    public static final Target CODIGO_POSTAL = Target.the("write the email").located(By.id("zip"));
    public static final Target NEXT_BUTTON2 = Target.the("button next").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));
    public static final Target NEXT_BUTTON3 = Target.the("button next").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a/span"));
    public static final Target PASSWORD1= Target.the("write the password").located(By.id("password"));
    public static final Target PASSWORD= Target.the("write the confirm password").located(By.id("confirmPassword"));
    public static final Target CHECK1 = Target.the("accept terms of use ").located(By.xpath("//*[@id=\"termOfUse\"]"));
    public static final Target CHECK2 = Target.the("accept terms of use ").located(By.xpath("//*[@id=\"privacySetting\"]"));
    public static final Target BUTTON_FINISH = Target.the("accept terms of use ").located(By.xpath("//*[@id=\"laddaBtn\"]"));
}
