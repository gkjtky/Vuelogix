package pagepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TNSTCloginpage {
    WebDriver driver;

    @FindBy(name = "txtUserLoginID")
    WebElement loginId;

    @FindBy(name = "txtPassword")
    WebElement loginPassword;

    @FindBy(xpath = "/html/body/form/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[6]/table/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[4]/td[3]/span")
    WebElement captcha;

    @FindBy(name = "txtCaptchaCode")
    WebElement captchaInput;

    @FindBy(xpath = "/html/body/form/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[6]/table/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[3]/td[2]/div/table/tbody/tr/td[3]/div/a")
    WebElement loginButton;

    public TNSTCloginpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setValues(String username, String pswd) {
        loginId.sendKeys(username);
        loginPassword.sendKeys(pswd);
        // Get captcha text after initialization
        String captchaText = captcha.getText().trim();
        captchaInput.sendKeys(captchaText);
    }

    public void loginClick() {
        loginButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Waiting
        wait.until(ExpectedConditions.invisibilityOf(loginButton));
    }
}
