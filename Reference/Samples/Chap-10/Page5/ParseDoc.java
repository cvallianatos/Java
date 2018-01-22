import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    SAXParserFactory factory = SAXParserFactory.newInstance();
    SAXParser parser=factory.newSAXParser();
    parser.parse("file.xml", new Handler());
  }
}
class Handler extends DefaultHandler {
  public void startDocument() {
    System.out.print("\n\nStart of document detected\n");
  }
}

