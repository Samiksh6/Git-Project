
import org.testng.annotations.Test;


public class tcid {

	@Test
	public void test()
	{
		String str = "[TestClass name=class testCases.ValidLogin_hashmap]";
		
		String out[] = str.split("\\.");
		
		System.out.println(out[0]);
	}
}
