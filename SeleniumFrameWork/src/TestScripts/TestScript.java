package TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.Base_Test;
import Generic.Generic_read_excel;
import POM.FaceBookPOM;

public class TestScript extends Base_Test
{
	@Test
	public void FacebookLogin() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		String Username = Generic_read_excel.getData("Sheet1",0,0);
		String Password = Generic_read_excel.getData("Sheet1",0,1);
		
		FaceBookPOM facebook = new FaceBookPOM(driver);
		facebook.SetUsername(Username);
		facebook.Setpassword(Password);
		facebook.Loginclick();
		Assert.fail();     //failing test to get screenshot
	}
}
