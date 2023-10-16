package Uncodemy.DemoBlaze;

import org.testng.annotations.DataProvider;

public class LoginCredentials {
	@DataProvider (name = "Login")
	public static String[][] Credentials()
	{
	  String [][] Details = new String[4][2];
	  Details [0][0] = "Vinod.juyal96@gmail.com";
      Details [0][1] = "Juyal@1997";
      Details [1][0] = "Vinod.juyal96@gmail.com";
      Details [1][1] = "Juyal@1996";
      Details [2][0] = "Vinod.juyal95@gmail.com";
      Details [2][1] = "Vinod@1996";
      Details [3][0] = "Vinod.juyal95@gmail.com";
      Details [3][1] = "Vinod@1997";
      return Details;
      
	}

}
