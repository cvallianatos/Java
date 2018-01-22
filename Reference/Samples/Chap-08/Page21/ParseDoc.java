import org.apache.xerces.parsers.*;
import org.w3c.dom.*;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    DOMParser parser = new DOMParser();
    parser.parse("file.xml");
    Document doc= parser.getDocument();
    DocumentType DocType = doc.getDoctype();
    NamedNodeMap nm = DocType.getEntities();
    for (int i=0;i<nm.getLength();i++) {
      Node node=nm.item(i);
      System.out.println("\nEntity Name: " + node.getNodeName());
      NodeList children = node.getChildNodes();
      for (int x=0;x<children.getLength();x++) {
        System.out.println("Definition: " + children.item(x).getNodeValue());
      }
    }
  }
}
