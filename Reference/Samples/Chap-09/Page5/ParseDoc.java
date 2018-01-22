import org.jdom.*;
import org.jdom.output.*;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    Element root = new Element ("todo");
    Document doc = new Document(root);
    XMLOutputter op = new XMLOutputter();
    op.output(doc,System.out);
  }
}
