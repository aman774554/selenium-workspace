package helper;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcel {
	Workbook wb;
	Sheet sh;
	public ReadExcel() throws BiffException, IOException
	{
		wb = Workbook.getWorkbook(new File("C:\\Users\\aman7\\OneDrive\\Desktop\\readingexcel.xlsx"));
	}
	
	public String getExcelData(int ShNo , int row , int col)
	{
		sh = wb.getSheet(ShNo);
		String data = sh.getCell(col,row).getContents();
		return data;
	}
	
	public int getRowCount(int shno)
	{
		sh = wb.getSheet(shno);
		int rows = sh.getRows();
		return rows;
	}

}
