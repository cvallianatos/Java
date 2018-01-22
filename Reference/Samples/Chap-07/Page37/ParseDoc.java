import org.apache.xerces.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    XMLReader reader = new SAXParser();
    reader.setContentHandler(new Handler());
    reader.parse("file.xml");}
}
class Handler extends DefaultHandler {
  public void startDocument() {
    System.out.print("\n\nStart of document\n");
  }
}

