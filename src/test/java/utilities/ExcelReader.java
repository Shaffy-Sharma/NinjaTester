package utilities;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;

public class ExcelReader {
	String [] [] credentials = new String [100] [100];
	ArrayList<String> practice = new ArrayList<String>();
	int i = 0,j=0;
	public static int totalRow;

    public List<Map<String, String>> getData(String excelFilePath, String sheetName)throws InvalidFormatException, IOException {
 	   // try-with-resources to ensure workbook is closed automatically
     try (Workbook workbook = WorkbookFactory.create(new File(excelFilePath))) {
         Sheet sheet = workbook.getSheet(sheetName);
         return readSheet(sheet);
     }
    }

    private List<Map<String, String>> readSheet(Sheet sheet) {
        Row row;
        Cell cell;

        totalRow = sheet.getLastRowNum();

        List<Map<String, String>> excelRows = new ArrayList<Map<String, String>>();

        for (int currentRow = 1; currentRow <= totalRow; currentRow++) {

            row = sheet.getRow(currentRow);

            int totalColumn = row.getLastCellNum();

            LinkedHashMap<String, String> columnMapdata = new LinkedHashMap<String, String>();

            for (int currentColumn = 0; currentColumn < totalColumn; currentColumn++) {

                cell = row.getCell(currentColumn);

                String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(currentColumn)
                        .getStringCellValue();

                columnMapdata.put(columnHeaderName, cell.getStringCellValue());
            }

            excelRows.add(columnMapdata);
        }

        return excelRows;
    }

	public int countRow() {
        return totalRow;
    }

    public String readExcelSheet(int rowvalue, int colvalue, String sheetname) throws IOException {
    	
		String path = System.getProperty("user.dir")+"/src/test/resources/testdata/dsAlgoData.xlsx";
		File Excelfile = new File(path);
		
		FileInputStream Fis = new FileInputStream(Excelfile);
		XSSFWorkbook workbook = new XSSFWorkbook(Fis);
		XSSFSheet sheet = workbook.getSheet(sheetname);
		if (sheet == null) {
			System.out.println("Available sheets:");
			for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
				System.out.println("- " + workbook.getSheetName(i));
			}
			throw new IllegalArgumentException("Sheet named '" + sheetname + "' not found in Excel file.");
		}
		
		Iterator<Row> row = sheet.rowIterator();
		while(row.hasNext()) {
			Row currRow = row.next();
			Iterator<Cell> cell = currRow.cellIterator();
			
			while(cell.hasNext()) {
				Cell currCell = cell.next();
				i=currCell.getRowIndex();
				j=currCell.getColumnIndex();				
				credentials[i][j] = currCell.getStringCellValue();
			}
		}
		workbook.close();
		String cellvalue = credentials[rowvalue][colvalue];
		return cellvalue;
	}

    public String getusername(int rownumber) throws IOException {
    	String username = null;	
    	String sheetname = "SignIn";
    	username = readExcelSheet(rownumber, 0, sheetname);
    	LoggerLoad.info("Username is:" + username);
    	return username;	
    }

    public String getpassword(int rownumber) throws IOException {
    	String password = null;	
    	String sheetname = "SignIn";
    	password = readExcelSheet(rownumber, 1, sheetname);
    	LoggerLoad.info("Password is:" + password);
    	return password;	
    }

    public String gettryherecode(int rownumber) throws IOException {
    	String tryherecode = null;	
    	String sheetname = "PythonCode";
    	tryherecode = readExcelSheet(rownumber, 0, sheetname);
    	LoggerLoad.info("Try here code is: " + tryherecode);
    	return tryherecode;
    }
}
