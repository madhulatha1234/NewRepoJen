package EcGiJe;

import org.testng.annotations.Test;

public class Demotest2 {
	@Test(groups = "regression")
	public void repo()
	{
		System.out.println("repo");
	}
	@Test(groups = "smoke")
	public void repo2()
	{
		System.out.println("Only smoke2");
	}
	
}
