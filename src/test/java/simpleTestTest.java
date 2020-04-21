import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class simpleTestTest{

    simpleTest st = new simpleTest();

//按钮selector:#TANGRAM__PSP_3__submit
//提示selector:#TANGRAM__PSP_3__error
//用户名selector:#TANGRAM__PSP_3__userName
//密码selector:#TANGRAM__PSP_3__password
//用户名登陆selector:#TANGRAM__PSP_3__footerULoginBtn
//安全认证selector:#pass-slide-tipInfo774

    @Test
    public void title(){
        System.setProperty("webdriver.chrome.driver","E:/2656705285/FileRecv/软件测试作业/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://baidu.com/");
        String actual = st.Title(driver);
        assertEquals("百度一下，你就知道",actual);
    }


    @Test
    public void bar(){
        System.setProperty("webdriver.chrome.driver","E:/2656705285/FileRecv/软件测试作业/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://baidu.com/");
        String actual = st.Titles("#u1 > a:nth-child(6)",driver);
        assertEquals("百度贴吧——全球最大的中文社区",actual);
    }


    @Test
    public void testLogin1() {
        System.setProperty("webdriver.chrome.driver","E:/2656705285/FileRecv/软件测试作业/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://passport.baidu.com/v2/?login&tpl=mn&u=http%3A%2F%2Fwww.baidu.com%2F&sms=5");
        String actual = st.login1("#TANGRAM__PSP_3__footerULoginBtn","#TANGRAM__PSP_3__submit","#TANGRAM__PSP_3__error",driver);
        assertEquals("请您输入手机/邮箱/用户名",actual);
    }


    @Test
    public void testLogin2(){
        System.setProperty("webdriver.chrome.driver","E:/2656705285/FileRecv/软件测试作业/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://passport.baidu.com/v2/?login&tpl=mn&u=http%3A%2F%2Fwww.baidu.com%2F&sms=5");
        String actual = st.login2("#TANGRAM__PSP_3__footerULoginBtn","#TANGRAM__PSP_3__userName","#TANGRAM__PSP_3__submit","#TANGRAM__PSP_3__error",driver);
        assertEquals("请您输入密码",actual);
    }

//    @Test
//    public void testLogin3(){
//        System.setProperty("webdriver.chrome.driver","E:/2656705285/FileRecv/软件测试作业/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://passport.baidu.com/v2/?login&tpl=mn&u=http%3A%2F%2Fwww.baidu.com%2F&sms=5");
//        String actual = st.login3("#TANGRAM__PSP_3__footerULoginBtn",
//                "#TANGRAM__PSP_3__userName",
//                "#TANGRAM__PSP_3__password",
//                "#TANGRAM__PSP_3__submit",
//                "#vcode-slide-bottom-p686",
//                driver);
//        assertEquals("滑至最右 完成验证",actual);
//    }
}
