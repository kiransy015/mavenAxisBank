package UseCases;

import org.testng.annotations.Test;

import mavenPaypal.CommonMethods;



public class axisBankFundTransfer {

	
	@Test
	public static void axisBankTransferAmt(){
		//Calling mavenPhonePay common method
		CommonMethods cm = new CommonMethods();
		cm.transferAmt("Naveen", "Kumar", "500");
		
		//Calling mavenPhonePay @Test method
		phonePayFundTransfer ft = new phonePayFundTransfer();
		ft.phonePayTransferAmt();
	}


}
