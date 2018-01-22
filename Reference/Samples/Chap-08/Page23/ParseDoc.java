import org.apache.xerces.parsers.*;
import org.w3c.dom.*;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    DOMParser parser = new DOMParser();
    parser.parse("file.xml");
    Document doc= parser.getDocument();
    DocumentType DocType = doc.getDoctype();
    System.out.print("DTD Name ");
    System.out.println(DocType.getName());
    System.out.println(DocType.getInternalSubset());
  }
}
