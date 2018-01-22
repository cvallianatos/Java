import org.jdom.*;
import org.jdom.output.*;
import org.jdom.input.*;
import java.io.*;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    Element task = new Element ("task");
    task.addContent("Backup sales");
    EntityRef andRef = new EntityRef("amp");
    task.addContent(andRef);
    task.addContent(" data reports");
    Element status = new Element ("status");
    status.addContent("Open");
    Element root = new Element ("root");
    root.addContent(task);
    root.addContent(status);
    Document doc = new Document(root);
    FileWriter fw = new FileWriter("doc.xml");
    XMLOutputter op = new XMLOutputter("    ",true);
    op.output(doc,fw);
    fw.close();
  }
}
