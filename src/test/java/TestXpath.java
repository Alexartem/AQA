import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestXpath extends WebdriverSetup {


    @Test
    public void checkTitle() {
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("My Store"));
    }

    @Test
    public void checkLogo() {
        WebElement logo = driver.findElementByCssSelector("#header_logo > a > img");
        logo.click();
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("My Store")); //check that click on logo returns you to main page
    }

    @Test
    public void registration() throws InterruptedException {
        WebElement sign_in = driver.findElementByCssSelector("#header > div.nav > div > div > nav > div.header_user_info > a");
        sign_in.click();
        WebElement emailRegField = driver.findElementByCssSelector("#email_create");
        String generatedMail = (mail(12)+"@gmail.com");
//        System.out.println(generatedMail);
        emailRegField.sendKeys(generatedMail);

        WebElement submitButton = driver.findElementByCssSelector("#SubmitCreate");
        submitButton.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("id_gender1")));
//        wait.until(ExpectedConditions.(By.id("id_gender1")));
        WebElement radioButtonMr = driver.findElementById("id_gender1");

        radioButtonMr.click();
        Assert.assertTrue(radioButtonMr.isSelected());

        WebElement firstName = driver.findElementByXPath("//*[@id=\"customer_firstname\"]");
        firstName.sendKeys("Alex");

        WebElement lastName = driver.findElementByCssSelector("#customer_lastname");
        lastName.sendKeys("superQA");

        WebElement emailYPI = driver.findElementByXPath("//*[@id=\"email\"]");
        String emailYPItext =  emailYPI.getAttribute("value");
//        System.out.println(emailYPItext);

        Assert.assertTrue("Field mail is not populated ",emailYPItext.contains(generatedMail));

        WebElement passwordField = driver.findElementByXPath("//*[@id=\"passwd\"]");
        passwordField.sendKeys(generatedMail);

        WebElement dayOfBirth = driver.findElementByXPath("//*[@id=\"days\"]");
        dayOfBirth.sendKeys("31");

        WebElement monthOfBirth = driver.findElementByXPath("//*[@id=\"months\"]");
        monthOfBirth.sendKeys("july");

        WebElement yearOfBirth = driver.findElementByXPath("//*[@id=\"years\"]");
        yearOfBirth.sendKeys("1900");

        WebElement newsletterCheckbox = driver.findElementByXPath("//*[@id=\"uniform-newsletter\"]");
        newsletterCheckbox.click();  //доделать проверку или отмечен чекбокс


        WebElement specialOffersCheckbox = driver.findElementByXPath("//*[@id=\"optin\"]");
        specialOffersCheckbox.click(); //доделать проверку на то или отмечен чекбокс

        WebElement newsletterText = driver.findElementByXPath("//*[@id=\"account-creation_form\"]/div[1]/div[7]/label");
        String NewsLetterSignUp = newsletterText.getText();
//        System.out.println(NewsLetterSignUp);
        Assert.assertTrue(NewsLetterSignUp.equals("Sign up for our newsletter!"));

        WebElement specialOffersText = driver.findElementByXPath("//*[@id=\"account-creation_form\"]/div[1]/div[8]/label");
        String SpecialOfferText = specialOffersText.getText();
        Assert.assertTrue(SpecialOfferText.equals("Receive special offers from our partners!"));

        WebElement company = driver.findElementByXPath("//*[@id=\"address1\"]");
        company.sendKeys("CustomerTimes corp");

        WebElement address = driver.findElementByXPath("//*[@id=\"address1\"]");
        address.sendKeys("Address, address, blah-blah-blah");

        WebElement addressDescription = driver.findElementByXPath("//*[@id=\"account-creation_form\"]/div[2]/p[4]/span");
        String addressDescriptionText = addressDescription.getText();
        Assert.assertTrue(addressDescriptionText.equals("Street address, P.O. Box, Company name, etc."));

        WebElement addressLine2 = driver.findElementByXPath("//*[@id=\"address2\"]");
        addressLine2.sendKeys("50");

        WebElement city = driver.findElementByXPath("//*[@id=\"city\"]");
        city.sendKeys("Kyiv");

        WebElement state = driver.findElementByXPath("//*[@id=\"id_state\"]");
        state.sendKeys("Virginia");

        WebElement zipPostalCode = driver.findElementByXPath("//*[@id=\"postcode\"]");
        zipPostalCode.sendKeys("00000");

        WebElement country = driver.findElementByXPath("//*[@id=\"id_country\"]");
        company.sendKeys("Ukraine");

        WebElement additionalInformation = driver.findElementByXPath("//*[@id=\"other\"]");
        additionalInformation.sendKeys("qwertyuiopasdfghjklzxcvbnm,./1234567890");

        WebElement phoneWarning = driver.findElementByXPath("//*[@id=\"account-creation_form\"]/div[2]/p[11]");
        String phoneWarningText = phoneWarning.getText();
        Assert.assertTrue(phoneWarningText.equals("You must register at least one phone number."));

        WebElement homePhome = driver.findElementByXPath("//*[@id=\"phone\"]");
        homePhome.sendKeys("+380937583374");

        WebElement mobilePhone = driver.findElementByXPath("//*[@id=\"phone_mobile\"]");
        mobilePhone.sendKeys("+380937583374");

        WebElement myAddress = driver.findElementByXPath("//*[@id=\"alias\"]");
        myAddress.sendKeys("Address Blah Blah Blah");

        WebElement requirementHint = driver.findElementByXPath("//*[@id=\"account-creation_form\"]/div[4]/p/span");
        String requiredHintText = requirementHint.getText();
        Assert.assertTrue(requiredHintText.equals("*Required field"));

        WebElement registerButton = driver.findElementByXPath("//*[@id=\"submitAccount\"]");
        registerButton.click();

























    }



}
