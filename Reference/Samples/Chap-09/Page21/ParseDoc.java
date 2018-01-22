import org.jdom.*;
import org.jdom.output.*;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    Element task = new Element ("task");
    task.addContent("Backup sales data");
    task.setAttribute("checked","yes");
    task.setAttribute("owner","Andrew");
    Element status = new Element ("status");
    status.addContent("Open");
    status.setAttribute("checked","no");
    Element root = new Element ("root");
    root.addContent(task);
    root.addContent(status);
    Document doc = new Document(root);
    XMLOutputter op = new XMLOutputter("    ",true);
    op.output(doc,System.out);
  }
}

