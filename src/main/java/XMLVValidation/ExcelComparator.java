package XMLVValidation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelComparator {

    public static void main(String[] args) throws IOException {
        String file1Path = "C:/Users/Admin/Desktop/File_Compare/Excel_compare_Files/Expected.XLSX"; // Replace with your own file path
        String file2Path = "C:/Users/Admin/Desktop/File_Compare/Excel_compare_Files/Actual.XLSX"; // Replace with your own file path
        
     // Create file input streams for both files
        FileInputStream file1Stream = new FileInputStream(new File(file1Path));
        FileInputStream file2Stream = new FileInputStream(new File(file2Path));

        try {
            // Create workbooks for both files
            Workbook workbook1 = new XSSFWorkbook(file1Stream);
            Workbook workbook2 = new XSSFWorkbook(file2Stream);

            // Compare the data in each sheet
            for (int i = 0; i < workbook1.getNumberOfSheets(); i++) {
                Sheet sheet1 = workbook1.getSheetAt(i);
                Sheet sheet2 = workbook2.getSheetAt(i);

                // Compare the data in each row
                for (int j = 0; j < sheet1.getPhysicalNumberOfRows(); j++) {
                    Row row1 = sheet1.getRow(j);
                    Row row2 = sheet2.getRow(j);

                    // Compare the data in each cell
                    for (int k = 0; k < row1.getPhysicalNumberOfCells(); k++) {
                        Cell cell1 = row1.getCell(k);
                        Cell cell2 = row2.getCell(k);

                        if (cell1.getCellType() != cell2.getCellType()) {
                            System.out.println("Cell type mismatch at sheet " + (i + 1) +
                                    ", row " + (j + 1) + ", column " + (k + 1));
                        } else {
                            switch (cell1.getCellType()) {
                                case STRING:
                                    if (!cell1.getStringCellValue().equals(cell2.getStringCellValue())) {
                                        System.out.println("String value mismatch at sheet " + (i + 1) +
                                                ", row " + (j + 1) + ", column " + (k + 1));
                                    }
                                    break;
                                case NUMERIC:
                                    if (cell1.getNumericCellValue() != cell2.getNumericCellValue()) {
                                        System.out.println("Numeric value mismatch at sheet " + (i + 1) +
                                                ", row " + (j + 1) + ", column " + (k + 1));
                                    }
                                    break;
                                case BOOLEAN:
                                    if (cell1.getBooleanCellValue() != cell2.getBooleanCellValue()) {
                                        System.out.println("Boolean value mismatch at sheet " + (i + 1) +
                                                ", row " + (j + 1) + ", column " + (k + 1));
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                    }
                }
            }

            System.out.println("Comparison complete.");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        	
            // Close input streams
            if (file1Stream != null) {
                try {
                    file1Stream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (file2Stream != null) {
                try {
                    file2Stream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
}



