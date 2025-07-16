package utlility_AB;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProvidersAB {

	@DataProvider(name="LoginData")
	public String[][] data() throws IOException{
		
		String path = "./testData/LoginAB.xlsx";
		
		ExcelUtilityAB util = new ExcelUtilityAB(path);
		
		int rowCount = util.getrowCount("Sheet1");
		
		int cellCount = util.getcellCount("Sheet1", 1);
		
		String loginCred[][] = new String[rowCount][cellCount];
		
		for(int r=1;r<=rowCount;r++) {
			
			for(int c=0;c<cellCount;c++) {
				
				loginCred[r-1][c] = util.getcellData("Sheet1", r, c);
						
						
			}
		}
		return loginCred;
		
		
	}
}
