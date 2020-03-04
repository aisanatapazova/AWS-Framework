package test;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SitePage;

import java.text.DecimalFormat;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TestClass extends TestBase{

    @Test
    public void addInstance(){
        driver.get("https://calculator.s3.amazonaws.com/index.html");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        SitePage page=new SitePage(driver);
        extentTest=extentReports.createTest("This is for filling EC2 info");
        page.ec1.click();
        page.chooseTi.click();
        page.t1Button.click();
        page.closeAndSave.click();
        page.ec1TExt.sendKeys("T1 Linux Micro");

        page.ec1.click();
        page.chooset2micro.click();
        page.t2micro.click();
        page.closeAndSave.click();
        page.ec1Text2.sendKeys("T1 Linux Micro 2");


        page.ec1.click();
        page.chooset2medium.click();
        page.t2medium.click();
        page.closeAndSave.click();
        page.ec1Text3.sendKeys("T2 Linux Medium");


        page.ec1.click();
        page.chooset2large.click();
        page.t2Large.click();
        page.closeAndSave.click();
        page.ec1Text4.sendKeys("T2 Linux Large");


        page.ec1.click();
        page.chooset2xlarge.click();
        page.t2XLarge.click();
        page.closeAndSave.click();
        page.ec1Text5.sendKeys("T2 Linux XtraLarge");

        double d1=gettingPrices(page.price1);
        double d2=gettingPrices(page.price2);
        double d3=gettingPrices(page.price3);
        double d4=gettingPrices(page.price4);
        double d5=gettingPrices(page.price5);
        double sum=d1+d2+d3+d4+d5;
        System.out.println(sum);
        page.billBtn.click();
        String priceEst=page.estimatedPrice.getText().substring(33,39);
        double dEst=Double.parseDouble(priceEst);
        DecimalFormat df = new DecimalFormat("0.00");
        double priceWithDiscount=Double.parseDouble(df.format(sum - 14.85));
        System.out.println(dEst);
        Assert.assertEquals(dEst, priceWithDiscount);

        page.servicesPage.click();
        Select select=new Select(page.selectBtn);
        select.selectByVisibleText("Hours/Week");
        Assert.assertEquals(page.price1.getText(), page.newPrice1.getText());
        Assert.assertEquals(page.price2.getText(), page.newPrice2.getText());
        Assert.assertEquals(page.price3.getText(), page.newPrice3.getText());
        double newd4=gettingPrices(page.newPrice4);
        Assert.assertNotEquals(d4, newd4);
        Assert.assertEquals(page.price5.getText(), page.newPrice5.getText());

        page.billBtn.click();
        page.saveShareBtn.click();
        page.nameField.sendKeys("EC2 Test Configuration");
        page.includesField.sendKeys("Includes 5 EC2 Instances");
        page.okBtn.click();
        page.url.click();
        String mainWindow=driver.getWindowHandle();
        Set<String> allWindows=driver.getWindowHandles();
        for (String window:allWindows){
            if (!mainWindow.equals(window)){
                driver.switchTo().window(window);
            }
        }
        double monthlyPrice=gettingPrices(page.pricePerMonth);
        String priceEst2=page.newestimatedPrice.getText().substring(33,39);
        double dEst2=Double.parseDouble(priceEst2);
        Assert.assertEquals(monthlyPrice, dEst2);
    }
}





























//    List<WebElement> textField=driver.findElements(By.xpath("//tr[@class='EC2InstanceRow itemsTableDataRow table']//input[@class='gwt-TextBox input']"));
//
//    List<String> texts=new ArrayList<String>();
//        texts.add("T1 Linux Micro (Free)");
//                texts.add("T1 Linux Micro 2");
//                texts.add("T2 Linux Medium");
//                texts.add("T2 Linux Large");
//                texts.add("T2 Linux XtraLarge");
//
//                int index=1;
//                for (WebElement text:textField){
//                driver.get("https://calculator.s3.amazonaws.com/index.html");
//                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//                SitePage page1=new SitePage(driver);
//                page1.ec1.click();
//                text
//                }
