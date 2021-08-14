import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;

public class celenium {

    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);


        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.aac.ac.il/");
        driver.manage().window().maximize();
        WebElement personalInfoElement = driver.findElement(By.cssSelector("a[href='https://portal.aac.ac.il']"));
        personalInfoElement.click();
        WebElement username = driver.findElement(By.id("Ecom_User_ID"));
        username.sendKeys("danielor");
        WebElement password = driver.findElement(By.id("Ecom_Password"));
        password.sendKeys("0507979478");
        WebElement submit = driver.findElement(By.id("wp-submit"));
        submit.sendKeys(Keys.ENTER);
        driver.get("https://moodle.aac.ac.il/login/index.php");





            try {
                Thread.sleep(3250);
            } catch (InterruptedException e) {}

            int counter = 0;

            List<WebElement> courses = driver.findElements(By.cssSelector("a[class = \"aalink coursename\"]"));
            for (int i = 1; i < courses.size(); i++) {

                String course = courses.get(i).getText();

                System.out.println(i + "\n" + course);
                counter = i++;
            }
            System.out.println("you have " + counter + " courses.");

            System.out.println("please enter your   course number:");
            int CourseTyped = s.nextInt();
            WebElement CourseRequest = courses.get(CourseTyped - 1);
            CourseRequest.click();



        int logout=0;
        while (logout != -1) {
            System.out.println(" to logout please press -1");
            logout = s.nextInt();
        }

    WebElement userMenu = driver.findElement(By.className("usermenu"));
                    userMenu.click();
    WebElement Exit = driver.findElement(By.id("actionmenuaction-6"));
                    Exit.click();
        WebElement Exit0=driver.findElement(By.cssSelector("a[href=\"https://portal.aac.ac.il/AGLogout\"]"));
        Exit0.click();

}
        }