import org.apache.xerces.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.ext.*;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    XMLReader reader = new SAXParser();
    reader.setContentHandler(new Handler());
    String property="http://xml.org/sax/properties/declaration-handler";
    reader.setProperty(property, new Handler2());
    reader.parse("file.xml");}
}
class Handler2 implements DeclHandler {
  public void elementDecl(String name, String model) {
    System.out.println("Found Element Declaration");
    System.out.println("Name: " + name);
    System.out.println("Model: " + model);
  }
  public void attributeDecl(String eName,String aName,String type,
                            String valueDefault,String value) {
  }
  public void internalEntityDecl(String name,String value) {
  }
  public void externalEntityDecl(String name, String publicId,
                                 String systemId) {
  }
}

