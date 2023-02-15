package XMLVValidation;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.io.File;

public class XMLComparator {
    public static void main(String[] args) {
        try {
            //Parse both XML files
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document expectedDoc = builder.parse(new File("C:/Users/Admin/Desktop/Sarthak Selenium/Actual.XML"));
            Document actualDoc = builder.parse(new File("C:/Users/Admin/Desktop/Sarthak Selenium/Expected.XML"));

            //Compare both XML documents
            boolean isEqual = compareNode(expectedDoc, actualDoc);

            if (isEqual) {
                System.out.println("XML Report validation is Passed");
            } else {
                System.out.println("XML files are different.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean compareNode(Node expectedNode, Node actualNode) {
        //Check if the node name is the same
        if (!expectedNode.getNodeName().equals(actualNode.getNodeName())) {
            return false;
        }

        //Check if the node value is the same
        if (expectedNode.getNodeValue() == null && actualNode.getNodeValue() != null ||
                expectedNode.getNodeValue() != null && !expectedNode.getNodeValue().equals(actualNode.getNodeValue())) {
            return false;
        }

        //Check if the node type is the same
        if (expectedNode.getNodeType() != actualNode.getNodeType()) {
            return false;
        }

        //Check if the number of child nodes is the same
        NodeList expectedChildren = expectedNode.getChildNodes();
        NodeList actualChildren = actualNode.getChildNodes();

        if (expectedChildren.getLength() != actualChildren.getLength()) {
            return false;
        }

        //Compare the child nodes
        for (int i = 0; i < expectedChildren.getLength(); i++) {
            Node expectedChild = expectedChildren.item(i);
            Node actualChild = actualChildren.item(i);

            if (!compareNode(expectedChild, actualChild)) {
                return false;
            }
        }

        return true;
    }
}
