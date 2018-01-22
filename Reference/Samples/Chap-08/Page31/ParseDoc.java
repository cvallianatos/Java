import org.apache.xerces.parsers.*;
import org.w3c.dom.*;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    DOMParser parser = new DOMParser();
    parser.parse("file.xml");
    Document doc= parser.getDocument();
    DocumentType DocType = doc.getDoctype();
    NamedNodeMap nm = DocType.getNotations();
    System.out.println("Number of notation declarations: " + nm.getLength());
    for (int i=0;i<nm.getLength();i++) {
      Notation node=(Notation)nm.item(i);
      System.out.println("\nName: " + node.getNodeName());
      System.out.println("Name: " + node.getSystemId());
    }
  }
}

  
