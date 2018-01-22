import org.apache.xerces.parsers.*;
import org.w3c.dom.*;
import java.io.*;
public class ParseDoc {
  static void main (String[] args) throws Exception {
    FileWriter fw = new FileWriter("file.xml");
    fw.write("<?xml version=\"1.0\"?>\n");
    fw.close();
  }
}

