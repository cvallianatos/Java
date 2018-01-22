import javax.xml.parsers.*;
import org.w3c.dom.*;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder=factory.newDocumentBuilder();
    Document doc=builder.parse("file.xml");
    Element root = doc.getDocumentElement();
    String rootElementName = (root.getTagName());
    System.out.println("The root element name is " + rootElementName);
  }
}

