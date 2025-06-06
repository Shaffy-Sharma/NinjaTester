package utilities;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.apache.poi.ss.usermodel.*;
import java.io.File;



public class ExcelReader 
{
	public static int totalRow;

    public List<Map<String, String>> getData(String excelFilePath, String sheetName)throws InvalidFormatException, IOException {


 	   // try-with-resources to ensure workbook is closed automatically
     try (Workbook workbook = WorkbookFactory.create(new File(excelFilePath)))
     {
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

}
