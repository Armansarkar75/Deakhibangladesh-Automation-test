package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeakhiBangladesh {

	public static void main(String[] args) {
		System.setProperty(("Webdriver.Chrome.driver"), ("C:\\Users\\User\\Downloads\\Driver\\chromedriver_win32\\chromedriver.exe"));
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://db.bpwork.xyz/pages/event.html#");
		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[2]/div")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/div")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[4]/a")).click();
        driver.findElement(By.id("title")).sendKeys("amader bari");
        driver.findElement(By.xpath("/html/body/div[5]/form/div[2]/div[2]/div[2]/div/p")).sendKeys("sirajganj");
        //driver.findElement(By.id("image")).sendKeys("amader bari");
        driver.findElement(By.xpath("/html/body/div[5]/form/div[4]/button")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[5]/a")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[6]/a")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[7]/a")).click();
        driver.findElement(By.id("name")).sendKeys("Arman sarkar");
        driver.findElement(By.id("email")).sendKeys("armansarkar715@gmail.com");
        driver.findElement(By.id("mobile")).sendKeys("01311848915");
        driver.findElement(By.id("message")).sendKeys("about sylhet");
        driver.findElement(By.xpath("/html/body/div[5]/div[2]/form/button")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[8]/a")).click();
        //driver.close();

	}

}
