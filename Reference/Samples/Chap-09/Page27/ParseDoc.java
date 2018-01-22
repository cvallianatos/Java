import org.jdom.*;
import org.jdom.output.*;
import org.jdom.input.*;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    SAXBuilder saxobj = new   SAXBuilder();
    Document doc = saxobj.build("file.xml");
    XMLOutputter op = new XMLOutputter("  ",true);
    System.out.println("Original Document.");
    op.output(doc,System.out);
    Element root=doc.getRootElement();
    if (root.getChild("status").getText().equals("Closed")) {
      root.removeChild("status");
      root.removeChild("task");
    }
    System.out.println("Current Document.");
    op.output(doc,System.out);
  }
}
