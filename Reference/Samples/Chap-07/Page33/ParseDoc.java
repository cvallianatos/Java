import org.apache.xerces.parsers.*;
import org.xml.sax.*;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    XMLReader reader = new SAXParser();
    reader.setContentHandler(new Handler());
    reader.setErrorHandler(new MyErrHandler());
    reader.parse("file.xml");}
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
class Handler implements ContentHandler {
  public void startDocument() {}
  public void endDocument() {}
  public void setDocumentLocator(Locator locator) {}
  public void startElement(String namespace, String name, String qName,
                           Attributes atts) {}
  public void endElement(String namespace, String name, String qName) {}
  public void characters(char[] ch, int start, int length) {}
  public void processingInstruction(String target, String data) {}
  public void startPrefixMapping(String prefix, String uri) {}
  public void endPrefixMapping(String prefix) {}
  public void ignorableWhitespace(char[] ch, int start, int length) {}
  public void skippedEntity(String name) {}
}


