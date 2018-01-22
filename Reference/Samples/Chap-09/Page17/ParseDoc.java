import org.jdom.*;
import org.jdom.output.*;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    Element task = new Element ("task");
    task.addContent("Backup sales data");
    Element status = new Element ("status");
    status.addContent("Open");
    Element root = new Element ("root");
    root.addContent(task);
    root.addContent(status);
    CDATA secure = new CDATA(" DFGvdsfsLFE!$ds ");
    Element passElement = new Element("password");
    passElement.addContent(secure);
    root.addContent(passElement);
    Document doc = new Document(root);
    XMLOutputter op = new XMLOutputter("    ",true);
    op.output(doc,System.out);
  }
}

