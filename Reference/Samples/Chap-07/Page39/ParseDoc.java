import org.apache.xerces.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    XMLReader reader = new SAXParser();
    reader.setContentHandler(new Handler());
    reader.setEntityResolver(new MyResolver());
    String feature="http://xml.org/sax/features/external-general-entities";
    if (reader.getFeature(feature)) {
      System.out.print("The feature\n" + feature + "\nis enabled.\n\n");
      reader.parse("file.xml");
    };
  }
}
class MyResolver implements EntityResolver {
  public InputSource resolveEntity (String publicId, String systemId) {
    System.out.println("Resolving entities using " + systemId);
    return null;
  }
}
class Handler extends DefaultHandler {
}
