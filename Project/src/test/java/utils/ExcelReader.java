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
           e.printStackTrace();
        } finally{
            try {
                if (fis!=null) {
                    fis.close();
                }
                if (workbook!=null){
                    workbook.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return cellData;
    }
}