package Classes;
import java.io.*;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

public class CitireExcel {

    public String ReadCellData(int vRow, int vColumn, String xlsx)
    {
        String value=null;          //variable for storing the cell value
        Workbook wb=null;           //initialize Workbook null
        try
        {
//reading data from a file in the form of bytes
            FileInputStream fis=new FileInputStream(xlsx);
//constructs an XSSFWorkbook object, by buffering the whole stream into the memory
            wb=new XSSFWorkbook(fis);
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e1)
        {
            e1.printStackTrace();
        }
        Sheet sheet=wb.getSheetAt(0);   //getting the XSSFSheet object at given index
        Row row=sheet.getRow(vRow); //returns the logical row
        Cell cell=row.getCell(vColumn); //getting the cell representing the given column
        value=cell.getStringCellValue();    //getting cell value
        return value;               //returns the cell value
    }

    public int ReadCellDataInt(int vRow, int vColumn, String xlsx)
    {
        int value;          //variable for storing the cell value
        Workbook wb=null;           //initialize Workbook null
        try
        {
//reading data from a file in the form of bytes
            FileInputStream fis=new FileInputStream(xlsx);
//constructs an XSSFWorkbook object, by buffering the whole stream into the memory
            wb=new XSSFWorkbook(fis);
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e1)
        {
            e1.printStackTrace();
        }
        Sheet sheet=wb.getSheetAt(0);   //getting the XSSFSheet object at given index
        Row row=sheet.getRow(vRow); //returns the logical row
        Cell cell=row.getCell(vColumn); //getting the cell representing the given column
        value= (int) cell.getNumericCellValue();    //getting cell value
        return value;               //returns the cell value
    }

}




