import org.apache.xerces.parsers.*;
import org.xml.sax.*;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    XMLReader reader = new SAXParser();
    reader.setDTDHandler(new Handler());
    reader.parse("file.xml");
  }
}
class Handler implements DTDHandler {
  public void notationDecl(String name, String publicId, String systemId) {
    System.out.println("A notation declaration has been found");
    System.out.println("Name " + name);
    System.out.println("The public ID is " + publicId);
    System.out.println("The system ID is " + systemId);
  }
  public void unparsedEntityDecl(String name, String publicId,
                                 String systemId, String notationName) {}
}
