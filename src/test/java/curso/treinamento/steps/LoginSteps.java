package curso.treinamento.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

@SuppressWarnings("deprecation")
public class LoginSteps {

	public WebDriver driver;

	@Dado("que eu deseje logar no sistema")
	public void que_eu_deseje_logar_no_sistema() {

		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\windows\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.phptravels.net/admin");
	}

	@Dado("que eu esteja na tela de login")
	public void que_eu_esteja_na_tela_de_login() {

		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\windows\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.phptravels.net/admin");
	}

	@Quando("faço o ligin no sistema {string} e senha {string}")
	public void faço_o_ligin_no_sistema_e_senha(String user, String pass) {

		driver.findElement(By.name("email")).sendKeys(user);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("/html/body/div[1]/form[1]/div[1]/div/div[1]/label/div/ins")).click();
		// driver.findElement(By.xpath("/html/body/div[1]/form[1]/button")).click();
		driver.findElement(By.xpath("//span[text()='Login']")).click();

	}

	@Quando("faço login com o usuário {string} e senha {string}")
	public void faço_login_com_o_usuário_e_senha(String user, String pass) {

		driver.findElement(By.name("email")).sendKeys(user);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("/html/body/div[1]/form[1]/div[1]/div/div[1]/label/div/ins")).click();
		// driver.findElement(By.xpath("/html/body/div[1]/form[1]/button")).click();
		driver.findElement(By.xpath("//span[text()='Login']")).click();

	}

	@Então("sou autenticado")
	public void sou_autenticado() throws InterruptedException {

		Thread.sleep(5000);
		Assert.assertTrue(
				driver.findElement(By.xpath("//a[@href='https://www.phptravels.net/admin/logout']")).isDisplayed());

	}
	@Então("e apresentada a mensagem The Email field must contain a valid email address.")
	public void e_apresentada_a_mensagem_The_Email_Filed_must_contains_a_valid_email_address() throws InterruptedException {
		
		Thread.sleep(2000);
	    Assert.assertEquals(
	    		driver.findElement(By.xpath("/html/body/div[1]/form[1]/div[2]/div/p")).isDisplayed(), driver);
	    	
    }

}
