import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.npa.pages.NpaLoginPage;
import com.npa.pages.NpaTestBase;

public class NpaLoginPageTest extends NpaTestBase{
	
	public static NpaLoginPage LoginPage;
	
	
	
	public NpaLoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		Home_Page_Launch();
		LoginPage = new NpaLoginPage();
		
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		LoginPage.login(("Naveen.v@thoughtgreen.com"), ("01011990"));
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
