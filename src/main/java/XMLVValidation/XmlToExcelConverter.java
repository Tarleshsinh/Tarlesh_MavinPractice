package XMLVValidation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class XmlToExcelConverter {

    public static void main(String[] args) throws Exception {
        String xmlFilePath = "C:/Users/Admin/Desktop/Sarthak Selenium/Actual.XML"; // Replace with your own XML file path
        String excelFilePath = "C:/Users/Admin/Desktop/Coverted_File/1.xlsx"; // Replace with your own Excel file path

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new FileInputStream(new File(xmlFilePath)));
            
          
            
            
            // Create a new workbook in Excel format
            Workbook workbook = new XSSFWorkbook();
            
            // Create a new sheet in the workbook
            Sheet sheet = workbook.createSheet("Report Data");
            
            // Get the root element of the XML document
            Element rootElement = document.getDocumentElement();
            
            // Get the list of "data" elements in the XML document
            NodeList dataList = rootElement.getElementsByTagName("data");
            
            // Loop through each "data" element and add its values to a new row in the sheet
            for (int i = 0; i < dataList.getLength(); i++) {
                Node dataNode = dataList.item(i);
                if (dataNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element dataElement = (Element) dataNode;
                    
                    // Create a new row in the sheet
                    Row row = sheet.createRow(i);
                    
                    // Get the list of "value" elements for the current "data" element
                    NodeList valueList = dataElement.getElementsByTagName("value");
                    
                    // Loop through each "value" element and add its value to a new cell in the row
                    for (int j = 0; j < valueList.getLength(); j++) {
                        Node valueNode = valueList.item(j);
                        if (valueNode.getNodeType() == Node.ELEMENT_NODE) {
                            Element valueElement = (Element) valueNode;
                            
                            // Create a new cell in the row
                            Cell cell = row.createCell(j);
                            
                            // Set the value of the cell to the text content of the "value" element
                            cell.setCellValue(valueElement.getTextContent());
                            
                            


                        }
                    }
                }
            }
            
            // Write the workbook to an Excel file
            try (FileOutputStream outputStream = new FileOutputStream(new File(excelFilePath))) {
                workbook.write(outputStream);
            }
            
            System.out.println("Conversion complete.");
            System.out.println("Number of data elements: " + dataList.getLength());
            
            
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
            
            
        }
    }
}
