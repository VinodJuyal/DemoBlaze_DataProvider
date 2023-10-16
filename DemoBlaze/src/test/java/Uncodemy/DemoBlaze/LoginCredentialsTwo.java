package Uncodemy.DemoBlaze;

import org.testng.annotations.DataProvider;

public class LoginCredentialsTwo {
	@DataProvider (name = "Logintwo")
	public static String[][] Credentials()
	{
	  String [][] Details = {{"Vinod.juyal96@gmail.com", "Juyal@1997"},
			  {"Vinod.juyal96@gmail.com", "Juyal@1996"},
			  {"Vinod.juyal95@gmail.com" , "Vinod@1996"},
			  { "Vinod.juyal95@gmail.com" , "Vinod@1997"}
	  };
	 
      return Details;
      
	}

}
