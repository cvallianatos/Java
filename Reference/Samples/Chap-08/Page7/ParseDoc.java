import org.apache.xerces.parsers.*;
import org.w3c.dom.*;
public class ParseDoc {
  public static void main (String[] args) throws Exception {
    DOMParser parser = new DOMParser();
    parser.parse("file2.xml");
    Document doc= parser.getDocument();
    Element root = doc.getDocumentElement();
    String rootElementName = (root.getTagName());
    System.out.println("The root element is " + rootElementName);
    switch ( root.getNodeType() ) {
    case Node.ATTRIBUTE_NODE: break;
    case Node.CDATA_SECTION_NODE: break;
    case Node.COMMENT_NODE: break;
    case Node.DOCUMENT_FRAGMENT_NODE: break;
    case Node.DOCUMENT_NODE: break;
    case Node.DOCUMENT_TYPE_NODE: break;
    case Node.ELEMENT_NODE:
      System.out.print("This is an element");
      break;
    case Node.ENTITY_NODE: break;
    case Node.ENTITY_REFERENCE_NODE: break;
    case Node.NOTATION_NODE: break;
    case Node.PROCESSING_INSTRUCTION_NODE: break;
    case Node.TEXT_NODE: break;
    }
  }
}

