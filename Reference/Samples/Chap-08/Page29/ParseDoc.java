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
    if (node.getNodeType() == Node.CDATA_SECTION_NODE) {
      System.out.println("Start of CDATA Section");
      System.out.println(node.getNodeValue());
      System.out.println("End of CDATA Section");
    }
    NodeList children = node.getChildNodes();
    for (int i=0;i<children.getLength();i++) {
      exploreNode(children.item(i));
    }
  }
}
