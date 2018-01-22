import org.apache.xerces.parsers.*;
import org.w3c.dom.*;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    DOMParser parser = new DOMParser();
    parser.parse("file.xml");
    Document doc= parser.getDocument();
    Element root = doc.getDocumentElement();
    exploreNode(root);
  }
  static public void exploreNode(Node node) {
    if (node.getNodeType() == Node.ELEMENT_NODE) {
      System.out.println("<" + node.getNodeName() + ">");
      NodeList children = node.getChildNodes();
      for (int i=0;i<children.getLength();i++) {
        exploreNode(children.item(i));
      }
    }
  }
}
