import org.apache.xerces.parsers.*;
import org.w3c.dom.*;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    DOMParser parser = new DOMParser();
    parser.parse("file.xml");
    Document doc= parser.getDocument();
    Element root = doc.getDocumentElement();
    System.out.println("Root element: " + root.getTagName());
    Node node1 = root.getFirstChild();
    System.out.println("1st. child: " + node1.getNodeName());
    Node node2 = node1.getNextSibling();
    System.out.println("2nd. child: " + node2.getNodeName());
  }
}

