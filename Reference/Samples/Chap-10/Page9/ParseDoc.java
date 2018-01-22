import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    SAXParserFactory factory = SAXParserFactory.newInstance();
    factory.setValidating(true);
    SAXParser parser=factory.newSAXParser();
    if (parser.isValidating()) {
      System.out.println("Validation is enabled");
    }
    parser.parse("file.xml", new Handler());
  }
}
class Handler extends DefaultHandler {
  public void startDocument() {
    System.out.print("\n\nStart of document detected\n");
  }
}
