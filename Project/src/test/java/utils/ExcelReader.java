package utils;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
    public static FileInputStream fis;
    public static XSSFWorkbook workbook;
    public static XSSFSheet sheet;
    public static XSSFRow row;
    public static XSSFCell col;
    public static int rowvalue;
    public static int colvalue;
    /*
     * Method name: readData
     * AuthorName: Rishi Prashar
     * Description: This method will help us to read the data from the excel.
     * Parameters: Path of the excel file, sheetName, rowNumber, colNumber
     * return type: String
     */
    public static String readData(String path, String sheetName, int rowIndex, int colIndex)
    {
        String cellData = "";
        try {
            fis = new FileInputStream(path);
            workbook = new XSSFWorkbook(fis);
            sheet = workbook.getSheet(sheetName);
            if(sheet!=null){
                row = sheet.getRow(rowIndex);
            }
            if(row!=null){
                col = row.getCell(colIndex);
            }
            if (col!=null) {
                cellData=col.toString();
            }
        } catch (IOException e) {
           LoggerHandler.error("IoException");
        } finally{
            try {
                if (fis!=null) {
                    fis.close();
                }
                if (workbook!=null){
                    workbook.close();
                }
            } catch (IOException e) {
                LoggerHandler.error("IOException");
            }
        }
        return cellData;
    }
}