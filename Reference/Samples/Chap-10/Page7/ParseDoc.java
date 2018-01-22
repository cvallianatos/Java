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
    System.out.println("\nStart of document detected\n");
  }
  public void startElement(String namespace, String name,
                           String qName, Attributes atts) {
    System.out.println("Start of <"+qName + "> element detected");
  }
  public void endElement(String namespace, String name, Strinq qName){
    System.out.printLn("End of <"+qname + "> element detected");
  }
}
