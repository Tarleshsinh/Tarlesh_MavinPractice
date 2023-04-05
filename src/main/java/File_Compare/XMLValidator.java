package File_Compare;
import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;

public class XMLValidator {

    public static void main(String[] args) {

        // Specify the location of the XML file and the XML schema file
        File xmlFile = new File("C:/Users/Admin/Desktop/Sarthak Selenium/Expected.XML");
        File xsdFile = new File("C:/Users/Admin/Desktop/Sarthak Selenium/Actual.XML");

        try {
            // Create a SchemaFactory and use it to load the XML schema
            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = schemaFactory.newSchema(xsdFile);

            // Create a Validator from the schema
            Validator validator = schema.newValidator();

            // Validate the XML file against the schema
            validator.validate(new StreamSource(xmlFile));

            System.out.println("Validation successful.");

        } catch (SAXException e) {
            System.out.println("Validation error: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("IO error: " + e.getMessage());
        }
    }
}
