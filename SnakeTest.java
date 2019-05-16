import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SnakeTest {

	private Snake peter;
	private Snake takis;
	
	@Before
	public void setUp() throws Exception {
		peter = new Snake("Peter S", 10, "coffee");
		takis = new Snake("Takis Z", 80, "vegetables");
		
		
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testIsHealthy()
	{
		if(peter.isHealthy() == true){
			System.out.println("peter is healthy.");
		}
		else
		{
			fail("peter is not healthy.");
		}
	}
	
	@Test
	public void testFitsInCage()
	{
		if(takis.fitsInCage(100) == true)
		{
			System.out.println("Takis fits in cage.");
		}
		else
		{
			fail("Takis doesn't fits in cage.");
		}
	}
		


}