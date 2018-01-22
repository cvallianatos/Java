import org.apache.xerces.dom.*;
import org.w3c.dom.*;
import java.io.*;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    DOMImplementation di = new DOMImplementationImpl();
    Document doc=di.createDocument(null,"task",null);
    Element root = doc.getDocumentElement();
    root.setAttribute("owner", "Andrew");
    root.setAttribute("priority", "high");
    FileWriter fw = new FileWriter("file.xml");
    fw.write("<?xml version=\"1.0\"?>\n");
    fw.write("<" + root.getNodeName());
    NamedNodeMap attribs=root.getAttributes();
    for (int i=0;i<attribs.getLength();i++) {
      fw.write(" "+ attribs.item(i).getNodeName());
      fw.write("=\""+ attribs.item(i).getNodeValue()+"\"");
    }
    fw.write(">\n</" + root.getNodeName() + ">\n");
    fw.close();
  }
}
