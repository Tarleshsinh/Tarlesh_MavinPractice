package File_Compare;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelComparator {

  public static void main(String[] args) {
    String file1Path = "C:/Users/Admin/Desktop/File_Compare/Excel_compare_Files/Expected.XLSX";
    String file2Path = "C:/Users/Admin/Desktop/File_Compare/Excel_compare_Files/Actual.XLSX";
    try {
      Workbook file1 = readExcelFile(file1Path);
      Workbook file2 = readExcelFile(file2Path);
      if (compareExcelFiles(file1, file2)) {
        System.out.println("The Excel files are identical");
      } else {
        System.out.println("The Excel files are not identical");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  private static Workbook readExcelFile(String filePath) throws IOException {
    FileInputStream inputStream = new FileInputStream(filePath);
    Workbook workbook = WorkbookFactory.create(inputStream);
    inputStream.close();
    return workbook;
  }

  public static boolean compareExcelFiles(Workbook file1, Workbook file2) {
    int numberOfSheets = file1.getNumberOfSheets();
    if (numberOfSheets != file2.getNumberOfSheets()) {
      return false;
    }
    for (int i = 0; i < numberOfSheets; i++) {
      Sheet sheet1 = file1.getSheetAt(i);
      Sheet sheet2 = file2.getSheetAt(i);
      if (!sheet1.getSheetName().equals(sheet2.getSheetName())) {
        return false;
      }
      int numberOfRows = sheet1.getPhysicalNumberOfRows();
      if (numberOfRows != sheet2.getPhysicalNumberOfRows()) {
        return false;
      }
      for (int j = 0; j < numberOfRows; j++) {
        Row row1 = sheet1.getRow(j);
        Row row2 = sheet2.getRow(j);
        int numberOfCells = row1.getPhysicalNumberOfCells();
        if (numberOfCells != row2.getPhysicalNumberOfCells()) {
          return false;
        }
        for (int k = 0; k < numberOfCells; k++) {
          Cell cell1 = row1.getCell(k);
          Cell cell2 = row2.getCell(k);
          if (cell1.getCellType() != cell2.getCellType()) {
            System.out.println("Mismatched value in cell: [" + j + "," + k + "]");
            System.out.println("Expected value type: " + cell1.getCellType());
            System.out.println("Actual value type: " + cell2.getCellType());
            return false;
          }
          if (cell1.getCellType() == CellType.STRING) {
            if (!cell1.getStringCellValue().equals(cell2.getStringCellValue())) {
              System.out.println("Mismatched value in cell: [" + j + "," + k + "]");
              System.out.println("Expected value: " + cell1.getStringCellValue());
              System.out.println("Actual value: " + cell2.getStringCellValue());
              return false;
            }
          } else if (cell1.getCellType() == CellType.NUMERIC) {
            if (cell1.getNumericCellValue() != cell2.getNumericCellValue()) {
              System.out.println("Mismatched value in cell: [" + j + "," + k + "]");
              System.out.println("Expected value: " + cell1.getNumericCellValue());
              System.out.println("Actual value: " + cell2.getNumericCellValue());
              return false;
            }
          }
        }
      }
    }
    return true;
  }
}
