package com.practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class MaxPriceFromExcel
{
	@Test
	public void maxPriceFromExcel() throws Throwable
	{
		FileInputStream fis = new FileInputStream("./Data/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int lastRowNum = wb.getSheet("Sheet2").getLastRowNum();
	// Way-1
		for (int i = 1; i <=lastRowNum; i++)
		{
			String Prices =  wb.getSheet("Sheet2").getRow(i).getCell(2).getStringCellValue();
			
			int pricesNum = Integer.parseInt(Prices);
			
			if(pricesNum>673000)
			{
				System.out.println(wb.getSheet("sheet2").getRow(i).getCell(1).getStringCellValue()+" "+Prices);
			}
		}
	// Way-2
		for (int i = 1; i <=lastRowNum; i++)
		{
			 int Prices = (int) wb.getSheet("Sheet2").getRow(i).getCell(2).getNumericCellValue();
			
			if(Prices>673000)
			{
				System.out.println(wb.getSheet("sheet2").getRow(i).getCell(1).getStringCellValue()+" "+Prices);
			}
		}
	}
}
