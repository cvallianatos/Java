import org.jdom.*;
import org.jdom.output.*;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    Element task = new Element ("task");
    Attribute verify = new Attribute("checked","yes");
    Attribute owner = new Attribute("owner","Andrew");
    verify.setValue("no");
    task.setAttribute(verify);
    task.setAttribute(owner);
    task.addContent("Backup sales data");
    Element status = new Element ("status");
    status.addContent("Open");
    Attribute manager=(Attribute) owner.clone();
    status.setAttribute(manager);
    Element root = new Element ("root");
    root.addContent(task);
    root.addContent(status);
    Document doc = new Document(root);
    XMLOutputter op = new XMLOutputter("    ",true);
    op.output(doc,System.out);
  }
}
