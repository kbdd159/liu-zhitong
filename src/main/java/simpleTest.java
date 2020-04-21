import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class simpleTest {
//    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","E:/2656705285/FileRecv/软件测试作业/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.baidu.com/");
//        System.out.println("Home page title: "+driver.getTitle());
//
//
//        WebElement element = driver.findElement(By.id("kw"));
//        WebElement element = driver.findElement(By.cssSelector("#kw"));
//        element.sendKeys("software testing");
//        element.submit();
//
//        Thread.sleep(10000);
//
//        driver.quit();
//    }
    public String Title(WebDriver webDriver){
       return webDriver.getTitle();
    }


    public String Titles(String selector,WebDriver webDriver) {
        WebElement element = webDriver.findElement(By.cssSelector(selector));
        element.click();
        return webDriver.getTitle();
    }

    public String login1(String selector1,String selector2,String selector3,WebDriver webDriver){
        WebElement element1 = webDriver.findElement(By.cssSelector(selector1));
        element1.click();
        WebElement element2 = webDriver.findElement(By.cssSelector(selector2));
        element2.click();
        WebElement element3 = webDriver.findElement(By.cssSelector(selector3));
        return element3.getText();
    }

    public String login2(String selector1,String selector2,String selector3,String selector4,WebDriver webDriver){
        WebElement element1 = webDriver.findElement(By.cssSelector(selector1));
        element1.click();
        WebElement element2 = webDriver.findElement(By.cssSelector(selector2));
        element2.sendKeys("18720290853");
        WebElement element3 = webDriver.findElement(By.cssSelector(selector3));
        element3.click();
        WebElement element4 = webDriver.findElement(By.cssSelector(selector4));
        return element4.getText();
    }


//    public String login3(String selector1,String selector2,String selector3,String selector4,String selector5,WebDriver webDriver){
//        WebElement element1 = webDriver.findElement(By.cssSelector(selector1));
//        element1.click();
//        WebElement element2 = webDriver.findElement(By.cssSelector(selector2));
//        element2.sendKeys("18720290853");
//        WebElement element3 = webDriver.findElement(By.cssSelector(selector3));
//        element3.sendKeys("123456");
//        WebElement element4 = webDriver.findElement(By.cssSelector(selector4));
//        element4.click();
//        WebElement element5 = webDriver.findElement(By.cssSelector(selector5));
//        return element5.getText();
//    }

}
