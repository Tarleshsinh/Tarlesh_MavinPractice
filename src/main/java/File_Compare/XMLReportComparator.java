package File_Compare;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class XMLReportComparator {
  
  public static void main(String[] args) {
    String file1Path = "C:/Users/Admin/Desktop/Sarthak Selenium/Expected.XML";
    String file2Path = "C:/Users/Admin/Desktop/Sarthak Selenium/Actual.XML";
    try {
      Document file1 = readXMLFile(file1Path);
      Document file2 = readXMLFile(file2Path);
      if (file1.isEqualNode(file2)) {
        System.out.println("Both the XML files are Matching + Validation is passed");
      } else {
        System.out.println("The reports are not identical");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  public static Document readXMLFile(String filePath) throws ParserConfigurationException, SAXException, IOException {
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = factory.newDocumentBuilder();
    InputStream inputStream = new FileInputStream(new File(filePath));
    Document document = builder.parse(inputStream);
    document.getDocumentElement().normalize();
    return document;
  }
}
