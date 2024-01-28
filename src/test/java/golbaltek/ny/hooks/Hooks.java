package golbaltek.ny.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void getLoginApplication() {
		System.out.println("Login The application");
	}
	
	@After
	public void getTearDown() {
		System.out.println("Close the browser");
	}

}
