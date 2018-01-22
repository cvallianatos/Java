import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder=factory.newDocumentBuilder();
    builder.setErrorHandler(new MyErrHandler());
    Document doc=builder.parse("file.xml");
    Element root = doc.getDocumentElement();
    String rootElementName = (root.getTagName());
    System.out.println("The root element name is " + rootElementName);
  }
}
class MyErrHandler implements ErrorHandler {
  public void warning(SAXParseException exception) {}
  public void error(SAXParseException exception) {}
  public void fatalError(SAXParseException exception) {
    System.out.println("\n\n There has been a serious error\n");
    System.out.println("Error message\n" + exception.getMessage());
    System.out.println("\nAt Line: " + exception.getLineNumber());
    System.out.println("\nAt Column: " + exception.getColumnNumber());
  }
}
