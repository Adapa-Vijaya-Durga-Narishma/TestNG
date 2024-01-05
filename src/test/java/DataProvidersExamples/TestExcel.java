package DataProvidersExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestExcel {
	
		XSSFSheet ExcelWSheet;

		XSSFWorkbook ExcelWBook;

		XSSFCell Cell;

		XSSFRow Row;
		
		public Object[][] getTable(String fileName,String sheetName)
		{
			String[][] tabArray=null;
			try
			{
			FileInputStream ExcelFile=new FileInputStream(fileName);
			ExcelWBook=new XSSFWorkbook(ExcelFile);
			ExcelWSheet=ExcelWBook.getSheet(sheetName);
			
			int startRow=1;
			int startColumn=1;
			int ci,cj;
			int totalRows=ExcelWSheet.getLastRowNum();
			int totalColumns=2;
			
			tabArray=new String[totalRows][totalColumns];
			ci=0;
			for(int i=startRow;i<totalRows;i++, ci++)
			{
				cj=0;
				for(int j=startColumn;j<totalColumns;j++,cj++)
				{
					XSSFRow row = ExcelWSheet.getRow(i);
                    XSSFCell cell = row.getCell(j);
                    tabArray[ci][cj] = cell.toString();
                    System.out.println(tabArray[ci][cj]);
					
				}
			}
			}
			catch (FileNotFoundException e){

				System.out.println("Could not read the Excel sheet");

				e.printStackTrace();

				}

			catch (IOException e){

				System.out.println("Could not read the Excel sheet");

				e.printStackTrace();

				}

			return(tabArray);
		}
		
	}


