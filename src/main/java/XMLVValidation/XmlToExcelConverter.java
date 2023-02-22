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


import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlToExcelConverter {
    public static void main(String[] args) {
        try {
            // Parse both XML files
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document expectedDoc = builder.parse(new File("C:/Users/Admin/Desktop/Sarthak Selenium/Expected.XML"));
            Document actualDoc = builder.parse(new File("C:/Users/Admin/Desktop/Sarthak Selenium/Actual.XML"));

            // Compare both XML documents
            List<String> results = compareNode(expectedDoc.getDocumentElement(), actualDoc.getDocumentElement());

            if (results.isEmpty()) {
                System.out.println("XML Report validation is Passed");
            } else {
                System.out.println("XML files are different.");
                for (String result : results) {
                    System.out.println(result);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static List<String> compareNode(Node expectedNode, Node actualNode) {
        List<String> results = new ArrayList<>();

        // Check if the node name is the same
        if (!expectedNode.getNodeName().equals(actualNode.getNodeName())) {
            results.add("Mismatched tag name: " + expectedNode.getNodeName() + " vs " + actualNode.getNodeName());
        }

        // Check if the node value is the same
        if (expectedNode.getNodeValue() == null && actualNode.getNodeValue() != null ||
                expectedNode.getNodeValue() != null && !expectedNode.getNodeValue().equals(actualNode.getNodeValue())) {
            results.add("Mismatched tag value: " + expectedNode.getNodeValue() + " vs " + actualNode.getNodeValue());
        }

        // Check if the number of child nodes is the same
        NodeList expectedChildren = expectedNode.getChildNodes();
        NodeList actualChildren = actualNode.getChildNodes();

        if (expectedChildren.getLength() != actualChildren.getLength()) {
            results.add("Mismatched number of child nodes: " + expectedChildren.getLength() + " vs " + actualChildren.getLength());
        }

        // Compare the child nodes
        for (int i = 0; i < expectedChildren.getLength(); i++) {
            Node expectedChild = expectedChildren.item(i);
            Node actualChild = actualChildren.item(i);

            List<String> childResults = compareNode(expectedChild, actualChild);
            results.addAll(childResults);
        }

        return results;
    }
}
