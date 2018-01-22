import org.apache.xerces.dom.*;
import org.apache.xerces.parsers.*;
import org.w3c.dom.*;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    DOMImplementation di = new DOMImplementationImpl();
    Document doc=di.createDocument(null,"task",null);
    Element root = doc.getDocumentElement();
    Element todoElement = doc.createElement("todo");
    Text todoText= doc.createTextNode("Backup Sales Data");
    todoElement.appendChild(todoText);
    root.appendChild(todoElement);
    exploreNode(root);
  }
  static public void exploreNode(Node node) {
    if (node.getNodeType() == Node.ELEMENT_NODE) {
      System.out.println("<" + node.getNodeName() + ">");
      if (node.getFirstChild().getNodeType() == Node.TEXT_NODE) {
        System.out.println(node.getFirstChild().getNodeValue());
      }
      NodeList children = node.getChildNodes();
      for (int i=0;i<children.getLength();i++) {
        exploreNode(children.item(i));
      }
      System.out.println("</" + node.getNodeName() + ">");
    }
  }
}

