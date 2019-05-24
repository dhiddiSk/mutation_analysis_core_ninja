package XMLToMatrix;/*
Reading the XML with the DOM parser in java.

The parser traverses the input xml fileand creates DOM objects.

Dom are linked together in tree like structure
 */
 /*DocumentBuilderFactory Defines a factory API that enables applications to obtain a parser that produces
         DOM object trees from XML documents.
         */

/*DocumentBuilder
             Defines the API to "obtain DOM Document instances" from an XML document.
               Using this class, an application programmer can obtain a Document from XML.
            */


import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;

public class XmlReader {
     public static <xml> void main(String[] args) throws  IOException{
         String filepath = "/home/saikrishna/Practical/mutation_practice/mutation_testing/mutationTesting/src/main/java/XMLToMatrix/mutations.xml";

         try{
             FileInputStream f = new FileInputStream(new File(filepath));
             DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
             DocumentBuilder db = dbf.newDocumentBuilder();
              Document Doc= db.parse(f);
             String s = Doc.getXmlVersion();
               System.out.println(s);
            }
        catch(IOException | ParserConfigurationException | SAXException e){
            e.printStackTrace();
         }
         }
     }

