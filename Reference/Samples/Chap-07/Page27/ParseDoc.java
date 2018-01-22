import org.apache.xerces.parsers.*;
import org.xml.sax.*;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    XMLReader reader = new SAXParser();
    reader.setContentHandler(new Handler());
    reader.parse("file.xml");
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
  public void processingInstruction(String target, String data) {
    System.out.println("Processing instruction detected");
    System.out.println("The target is "+ target);
    System.out.println("The value is " + data);
  }
  public void startPrefixMapping(String prefix, String uri) {}
  public void endPrefixMapping(String prefix) {}
  public void ignorableWhitespace(char[] ch, int start, int length) {}
  public void skippedEntity(String name) {}
}
