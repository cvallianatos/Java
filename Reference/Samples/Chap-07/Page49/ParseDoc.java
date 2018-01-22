
import org.apache.xerces.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    XMLReader reader = new SAXParser();
    reader.setContentHandler(new Handler());
    String feature="http://xml.org/sax/features/namespace-prefixes";
    reader.setFeature(feature, true);
    feature="http://xml.org/sax/features/namespaces";
    reader.setFeature(feature,true);
    reader.parse("file.xml");
  }
}
class Handler extends DefaultHandler {
  public void startElement(String namespace, String name, String qName,
                           Attributes atts) {
    if (atts.getLength()>0) {
      System.out.println("\nElement " + name + " has the attributes ");
      for (int i=0; i<atts.getLength(); i++) {
        System.out.print(atts.getLocalName(i));
        System.out.print(" which has a value of ");
        System.out.println(atts.getValue(i));
      }
    }
  }
}
