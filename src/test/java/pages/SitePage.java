package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;


public class SitePage {

public SitePage(WebDriver driver){
    PageFactory.initElements(Driver.getDriver("chrome"), this);


}
    @FindBy (xpath = "//div[@class='cell Instances rowsSection']//descendant::div[@class='gwt-PushButton small gwt-PushButton-up']//parent::td")
    public WebElement ec1;

    @FindBy (xpath = "//tr[@class='EC2InstanceRow itemsTableDataRow table']//input[@class='gwt-TextBox input']")
    public WebElement ec1TExt;

    @FindBy(xpath = "(//div[@class='gwt-HTML field SF_EC2_INSTANCE_FIELD_TYPE instanceTypeField rowDialogSelectorFieldView']//parent::td//following-sibling::td//div[@class='gwt-PushButton gwt-PushButton-up'])[1]")
    public WebElement chooseTi;

    @FindBy (xpath = "//div[.='t1.micro']//parent::td//preceding-sibling::td//input")
    public WebElement t1Button;

    @FindBy(xpath = "//div[@class='gwt-HTML field SF_EC2_INSTANCE_FIELD_TYPE instanceTypeField rowDialogSelectorFieldView']")
    public WebElement changedLinux;

    @FindBy (xpath = "//button[.='Close and Save']")
    public WebElement closeAndSave;

    @FindBy(xpath = "(//div[@class='gwt-HTML field SF_EC2_INSTANCE_FIELD_TYPE instanceTypeField rowDialogSelectorFieldView']//parent::td//following-sibling::td//div[@class='gwt-PushButton gwt-PushButton-up'])[2]")
    public WebElement chooset2micro;

    @FindBy(xpath = "//div[.='t2.micro']//parent::td//preceding-sibling::td//input")
    public WebElement t2micro;

    @FindBy (xpath = "(//tr[@class='EC2InstanceRow itemsTableDataRow table']//input[@class='gwt-TextBox input'])[2]")
    public WebElement ec1Text2;

    @FindBy(xpath = "(//tr[@class='EC2InstanceRow itemsTableDataRow table']//input[@class='gwt-TextBox input'])[3]")
    public WebElement ec1Text3;

    @FindBy(xpath = "(//div[@class='gwt-HTML field SF_EC2_INSTANCE_FIELD_TYPE instanceTypeField rowDialogSelectorFieldView']//parent::td//following-sibling::td//div[@class='gwt-PushButton gwt-PushButton-up'])[3]")
    public WebElement chooset2medium;

    @FindBy(xpath = "//div[.='t2.medium']//parent::td//preceding-sibling::td//input")
    public WebElement t2medium;

    @FindBy(xpath = "(//tr[@class='EC2InstanceRow itemsTableDataRow table']//input[@class='gwt-TextBox input'])[4]")
    public WebElement ec1Text4;

    @FindBy(xpath = "(//div[@class='gwt-HTML field SF_EC2_INSTANCE_FIELD_TYPE instanceTypeField rowDialogSelectorFieldView']//parent::td//following-sibling::td//div[@class='gwt-PushButton gwt-PushButton-up'])[4]")
    public WebElement chooset2large;

    @FindBy(xpath = "//div[.='t2.large']//parent::td//preceding-sibling::td//input")
    public WebElement t2Large;

    @FindBy(xpath = "(//tr[@class='EC2InstanceRow itemsTableDataRow table']//input[@class='gwt-TextBox input'])[5]")
    public WebElement ec1Text5;

    @FindBy(xpath = "(//div[@class='gwt-HTML field SF_EC2_INSTANCE_FIELD_TYPE instanceTypeField rowDialogSelectorFieldView']//parent::td//following-sibling::td//div[@class='gwt-PushButton gwt-PushButton-up'])[5]")
    public WebElement chooset2xlarge;

    @FindBy(xpath = "//div[.='t2.xlarge']//parent::td//preceding-sibling::td//input")
    public WebElement t2XLarge;

    @FindBy (xpath = "//div[@class='billLabel']")
    public WebElement billBtn;

    @FindBy (xpath = "//div[.='$ 14.64']")
    public WebElement price1;

    @FindBy(xpath = "//div[.='$ 8.50']")
    public WebElement price2;

    @FindBy (xpath = "//div[.='$ 33.97']")
    public WebElement price3;

    @FindBy (xpath = "//div[.='$ 67.93']")
    public WebElement price4;

    @FindBy (xpath = "//div[.='$ 135.86']")
    public WebElement price5;

    @FindBy (xpath = "//div[@class='gwt-TabBarItem gwt-TabBarItem-selected']//div[.='Estimate of your Monthly Bill ($ 246.05)']")
    public WebElement estimatedPrice;

    @FindBy(xpath = "//div[@class='restLabel']")
    public WebElement servicesPage;

    @FindBy(xpath = "(//table[@class='SF_EC2_INSTANCE_FIELD_USAGE field usageField']//select)[4]")
    public WebElement selectBtn;

    @FindBy (xpath = "//div[.='$ 14.64']")
    public WebElement newPrice1;

    @FindBy(xpath = "//div[.='$ 8.50']")
    public WebElement newPrice2;

    @FindBy (xpath = "//div[.='$ 33.97']")
    public WebElement newPrice3;

    @FindBy (xpath = "//div[.='$ 39.91']")
    public WebElement newPrice4;

    @FindBy (xpath = "//div[.='$ 135.86']")
    public WebElement newPrice5;

    @FindBy(xpath = "//button[.='Save and Share']")
    public WebElement saveShareBtn;

    @FindBy(xpath = "//input[@class='gwt-TextBox SC_SOLUTION_Input']")
    public WebElement nameField;

    @FindBy(xpath = "//textarea[@class='gwt-TextArea SC_INCLUDES_Input']")
    public WebElement includesField;

    @FindBy(xpath = "//button[.='OK']")
    public WebElement okBtn;

    @FindBy(xpath = "//a[@id='saveURL']")
    public WebElement url;

    @FindBy(xpath = "//div[.='$ 218.03']")
    public WebElement pricePerMonth;

    @FindBy (xpath = "//div[@class='gwt-TabBarItem gwt-TabBarItem-selected']//div[.='Estimate of your Monthly Bill ($ 218.03)']")
    public WebElement newestimatedPrice;

}
