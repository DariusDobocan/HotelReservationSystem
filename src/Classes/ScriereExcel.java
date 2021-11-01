package Classes;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ScriereExcel {

    public void WriteCellData(int vRow, int vColumn, String xlsx,String value)
    {
        Workbook wb=null;
        try
        {
//reading data from a file in the form of bytes
            FileInputStream fis=new FileInputStream(xlsx);
//constructs an XSSFWorkbook object, by buffering the whole stream into the memory
            wb=new XSSFWorkbook(fis);

            Sheet sheet = wb.getSheetAt(0);
            Cell cell2Update = sheet.getRow(vRow).getCell(vColumn);
            cell2Update.setCellValue(value);

            fis.close();

            FileOutputStream outputStream = new FileOutputStream(xlsx);
            wb.write(outputStream);
            wb.close();
            outputStream.close();
        }

        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e1)
        {
            e1.printStackTrace();
        }

    }
}
