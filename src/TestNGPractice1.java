import org.testng.annotations.Test;

public class TestNGPractice1 
{
 
@Test(priority=1)
 public void testLogin()
 {
    System.out.println("Inside Test Login");	 
 }

@Test(priority=2)
public void testUserName()
{
   System.out.println("Test User Name");	 
}

@Test(priority=3)
public void testPassword()
{
   System.out.println("Test Password");	 
}
	

}
