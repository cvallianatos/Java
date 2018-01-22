import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    SAXParserFactory factory = SAXParserFactory.newInstance();
    factory.setFeature("http://xml.org/sax/features/validation", true);
    boolean validation;
    validation=factory.getFeature("http://xml.org/sax/features/validation");
    if (validation) {
      System.out.println("Validation is enabled");
    }
    SAXParser parser=factory.newSAXParser();
    parser.parse("file.xml", new Handler());
  }
}
class Handler extends DefaultHandler {
  public void startDocument() {
    System.out.print("\n\nStart of document detected\n");
  }
}
