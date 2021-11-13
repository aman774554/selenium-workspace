package advance;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcel {

	public static void main(String[] args) throws InterruptedException, BiffException, IOException {
		Workbook wb = Workbook.getWorkbook(new File("C:\\Users\\aman7\\OneDrive\\Desktop\\readingexcel.xls"));
		Sheet sh= wb.getSheet("abc");
		
		for(int i=1; i<sh.getRows(); i++)
		{
			System.out.println("aman");
			System.out.println("U name : " + sh.getCell(0,i).getContents());
			System.out.println("Password : " + sh.getCell(1,i).getContents());
		}
		
		

	}

}
