package SecondTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelFile {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fs= new FileInputStream("./data/Testscript.xlsx");
Workbook wb= WorkbookFactory.create(fs);
int count = wb.getSheet("Sheet1").getLastRowNum();
System.out.println(count);

for(int i=1;i<=count;i++)
{
	String un = wb.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
	String pw = wb.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
	System.out.println(un+" "+pw);
}
	}

}
