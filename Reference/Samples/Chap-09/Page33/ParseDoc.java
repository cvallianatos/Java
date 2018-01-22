import org.jdom.*;
import org.jdom.output.*;
import org.jdom.input.*;
import org.apache.xerces.dom.*;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    org.w3c.dom.DOMImplementation di = new DOMImplementationImpl();
    org.w3c.dom.Document DOMdoc=di.createDocument(null,"task",null);
    org.w3c.dom.Element root = DOMdoc.getDocumentElement();
    org.w3c.dom.Element todoElement = DOMdoc.createElement("todo");
    root.appendChild(todoElement);
    DOMBuilder dBuilder = new DOMBuilder();
    org.jdom.Document jdoc = dBuilder.build(DOMdoc);
    XMLOutputter op = new XMLOutputter();
    op.output(jdoc,System.out);
  }
}