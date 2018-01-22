import org.apache.xerces.parsers.*;
import org.xml.sax.*;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    XMLReader reader = new SAXParser();
    reader.setContentHandler(new Handler());
    reader.parse("file.xml");}
}
class Handler implements ContentHandler {
  public void startDocument() {}
  public void endDocument() {}
  public void setDocumentLocator(Locator locator) {}
  public void startElement(String namespace, String name, String qName,
                           Attributes atts) {
    if (atts.getLength()>0) {
      System.out.println("\nElement " + name + " has attributes ");
      for (int i=0; i<atts.getLength(); i++) {
        System.out.println(atts.getLocalName(i));
      }
    }
  }
  public void endElement(String namespace, String name, String qName) {}
  public void characters(char[] ch, int start, int length) {}
  public void processingInstruction(String target, String data) {}
  public void startPrefixMapping(String prefix, String uri) {}
  public void endPrefixMapping(String prefix) {}
  public void ignorableWhitespace(char[] ch, int start, int length) {}
  public void skippedEntity(String name) {}
}
