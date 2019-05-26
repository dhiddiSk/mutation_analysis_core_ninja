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


import org.apache.cassandra.streaming.StreamOut;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import org.w3c.dom.Node;
import javax.xml.parsers.*;
import java.io.*;
public class XmlReader {
    public static <xml> void main(String[] args) throws  IOException{
        final String filepath = "/home/saikrishna/Practical/mutation_practice/mutation_testing/mutationTesting/src/main/java/XMLToMatrix/mutations.xml";//
         try {
            FileInputStream f = new FileInputStream(new File(filepath));
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document Doc = db.parse(f); //declaring the Doc as the variable, which stores the tree structure of file.
                /*'
                To obtain the context of the node at
               System.out.println(Doc.getElementsByTagName("mutation").item(6).getTextContent());
               Here Document.getDocumentElement() gives the root  and element represents <mutations>----------</mutations>, Empty element is <mutations><mutations>

                */
            System.out.println(Doc.getDocumentElement().getNodeName());
            System.out.println("***********************************************************************");
            NodeList Parent_List = Doc.getElementsByTagName("mutation");
            for ( int temp = 0; temp < Parent_List.getLength(); temp++) {

                     /*
                     Here the item Numbers represents the childs of the rootnode(mutations)
                     This loop represents the iteration on all the childs of the root
                      */
                Node nNode = Parent_List.item(temp);
                System.out.println("\nCurrent Element :" + temp);
                System.out.print(nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.print("Status: ");
                    System.out.println(eElement.getAttribute("status"));
                    System.out.print("No.of test runs: ");
                    System.out.println(eElement.getAttribute("numberOfTestsRun"));

                        NodeList Child_List1 = eElement.getElementsByTagName("killingTests");
                           for(int count =0;count<Child_List1.getLength();count++){
                               System.out.print("killingTests : ");
                               System.out.println(eElement.getElementsByTagName("killingTests").item(count).getTextContent());


                           }
                    NodeList Child_List2 = eElement.getElementsByTagName("succeedingTests");

                    for(int count1 =0;count1<Child_List2.getLength();count1++){
                                 System.out.print("succeedingTests : ");
                                  System.out.println(eElement.getElementsByTagName("succeedingTests").item(count1).getTextContent());


                    }





                    //System.out.println("succeedingTests");
                    //System.out.println(eElement.getElementsByTagName("succeedingTests").item(temp).getTextContent());

                }
            }
        }

        catch(IOException | ParserConfigurationException | SAXException e){
            e.printStackTrace();
         }
   }
}

/*
extend
by adding some loops or other code to give 'null' as output, when there is no content
by verifying the statuses if there are any other statuses, what to do, should I accept or not.



 */