import org.apache.xerces.parsers.*;
import org.xml.sax.*;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    XMLReader reader = new SAXParser();
    reader.setContentHandler(new Handler());
    reader.parse("file.xml");}
}
class Handler implements ContentHandler {
  private Locator locator;
  public void startDocument() {}
  public void endDocument() {}
  public void setDocumentLocator(Locator locator) {
    this.locator = locator;
  }
  public void startElement(String namespace, String name, String qName,
                           Attributes atts) {
    System.out.print("On line " + locator.getLineNumber());
    System.out.println(" Start of element '" + name + "' detected ");
  }
  public void endElement(String namespace, String name, String qName) {}
  public void characters(char[] ch, int start, int length) {}
  public void processingInstruction(String target, String data) {}
  public void startPrefixMapping(String prefix, String uri) {}
  public void endPrefixMapping(String prefix) {}
  public void ignorableWhitespace(char[] ch, int start, int length) {}
  public void skippedEntity(String name) {}
}
