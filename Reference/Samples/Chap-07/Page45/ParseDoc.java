import org.apache.xerces.parsers.*;
import org.xml.sax.*;
import org.xml.sax.ext.*;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    XMLReader reader = new SAXParser();
    String property = "http://xml.org/sax/properties/lexical-handler";
    reader.setProperty(property, new LexHandler());
    reader.parse("file.xml");}
}
class LexHandler implements LexicalHandler {
  public void comment(char[] ch,  int start, int length) {
    String comment = new String(ch,start,length);
    System.out.println(comment);
  }
  public void endCDATA() {
  }
  public void endDTD() {
  }
  public void endEntity(String name) {
  }
  public void startCDATA() {
  }
  public void startDTD(String name,String publicId,String systemId) {
  }
  public void startEntity(String name) {
  }
}
