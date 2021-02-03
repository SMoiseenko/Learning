package by.moiseenko;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.XMLFormatter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Runner {

  private static final Logger LOG = LogManager.getLogger(Runner.class.getName());
  public static void main(String[] args) {
    Workbook wb = new HSSFWorkbook();
    Sheet sheet = wb.createSheet("FirstPage");
    Row row = sheet.createRow(0);
    Cell name = row.createCell(0);
    name.setCellValue("Siarhei");
    Cell birthday  = row.createCell(1);
    DataFormat format = wb.createDataFormat();
    CellStyle dateStyle = wb.createCellStyle();
    dateStyle.setDataFormat(format.getFormat("dd.mm.yyyy"));
    birthday.setCellStyle(dateStyle);
    birthday.setCellValue(LocalDate.of(1987,3,20));
    sheet.autoSizeColumn(1);
    try {
      wb.write(new FileOutputStream("target/test.xls"));
    } catch (IOException e) {
      LOG.error(e);
    }

  }

}
