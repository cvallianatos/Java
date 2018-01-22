  I
import org.xml.sax.*;
class Handler implements ContentHandler {
  public void setDocumentLocator(Locator locator) {}
  public void startDocument() {}
  public void endDocument() {}
  public void startElement(String namespace, String name, String qName,
                           Attributes atts) {}
  public void endElement(String namespace, String name, String qName) {}
  public void characters(char[] ch, int start, int length) {}
  public void processingInstruction(String target, String data) {}
  public void startPrefixMapping(String prefix, String uri) {}
  public void endPrefixMapping(String prefix) {}
  public void ignorableWhitespace(char[] ch, int start, int length) {}
  public void skippedEntity(String name) {}
}