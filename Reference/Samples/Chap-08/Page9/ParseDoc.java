import org.apache.xerces.parsers.*;
import org.w3c.dom.*;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    DOMParser parser = new DOMParser();
    parser.parse("file.xml");
    Document doc= parser.getDocument();
    Element root = doc.getDocumentElement();
    String rootElementName = (root.getTagName());
    System.out.println("The root element is " + rootElementName);
    NodeList children = root.getChildNodes();
    System.out.println("It has "+ children.getLength() + " child nodes\n");
    for (int i=0;i<children.getLength();i++) {
      System.out.println(children.item(i).getNodeName());
    }
  }
}
