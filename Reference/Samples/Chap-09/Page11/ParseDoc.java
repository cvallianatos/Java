import org.jdom.*;
import org.jdom.output.*;
import org.jdom.input.SAXBuilder;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    SAXBuilder saxobj = new   SAXBuilder();
    Document doc = saxobj.build("file.xml");
    XMLOutputter op = new XMLOutputter();
    op.output(doc,System.out);
  }
}

