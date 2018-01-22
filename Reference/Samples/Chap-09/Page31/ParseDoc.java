
import org.jdom.*;
import org.jdom.input.*;
import java.util.*;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    SAXBuilder saxobj = new   SAXBuilder();
    Document doc = saxobj.build("file.xml");
    List rootContents = doc.getRootElement().getContent();
    for (Iterator i = rootContents.iterator();i.hasNext();) {
      Object contentObj= i.next();
      if (contentObj instanceof Element) {
        System.out.println ("Element found");
        System.out.println (contentObj.toString());
      }
    }
  }
}

