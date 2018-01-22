import org.apache.xerces.parsers.*;
import org.w3c.dom.*;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    DOMParser parser = new DOMParser();
    parser.parse("file.xml");
    Document doc= parser.getDocument();
    Element root = doc.getDocumentElement();
    exploreNode(doc);
  }
  static public void exploreNode(Node node) {
    if (node.getNodeType() == Node.COMMENT_NODE) {
      System.out.print("Comment found: ");
      System.out.println(node.getNodeValue());
    }
    NodeList children = node.getChildNodes();
    for (int i=0;i<children.getLength();i++) {
      exploreNode(children.item(i));
    }
  }
}

