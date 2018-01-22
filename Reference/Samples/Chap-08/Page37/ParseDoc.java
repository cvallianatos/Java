import org.apache.xerces.dom.*;
import org.w3c.dom.*;
import java.io.*;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    DOMImplementation di = new DOMImplementationImpl();
    Document doc=di.createDocument(null,"tas k",null);
    Element root = doc.getDocumentElement();
    FileWriter fw = new FileWriter("doc.xml");
    fw.write("<?xml version=\"1.0\"?>\n");
    fw.write("<" + root.getNodeName() + ">\n");
    fw.write("</" + root.getNodeName() + ">\n");
    fw.close();
  }
}
