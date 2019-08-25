package XMLToMatrix;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XmlReader3{
    Hashtable<Integer,String> hashtable3 = new Hashtable<>();
     int NumberOfTests;
     XmlReader3(Hashtable<Integer, String> hashtable2, int after){
         hashtable3 = hashtable2; NumberOfTests=after;
     }

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        /*
        Path of Xml file to be parsed
        @param  int[][] array is to store the results, where rows represent the mutants and columns represent tests
        @param
         */
        final String filePath = "/home/saikrishna/Practical/mutation_practice/mutation_testing/mutationTesting/src/main/java/XMLToMatrix/mutations.xml";
           int[][] array;
           String[] statusArray;
           try{
            FileInputStream file = new FileInputStream(new File(filePath));
            DocumentBuilderFactory DBF = DocumentBuilderFactory.newInstance();
            DocumentBuilder DB = DBF.newDocumentBuilder();
            Document Doc = DB.parse(file);
            /*
            @method getElementsByTagName() refers to get the value of the element from the xml.
             */
            NodeList parentList = Doc.getElementsByTagName("mutation");
            int parentListLength = parentList.getLength();
            /*
            Array: rows-> parentListLength, which is length of the parent list
                  columns-> number of tests in testsuite

            Status Array: Array represents the result of the mutant, whether killed or survived
             */
             array = new int[parentListLength][6];
             statusArray = new String[parentListLength];
           /*
           This loop inspects values inside the parent elements and child attributes and assigns values as killed,survived,no-coverage
            */
            for(int temp = 0; temp < parentListLength; temp++) {
                Node nNode = parentList.item(temp);
                if(nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) nNode;
                    if(element.getAttribute("status").equals("KILLED")){
                        statusArray[temp] = "killed";
                    }else if(element.getAttribute("status").equals("SURVIVED")) {
                        statusArray[temp] = "Surv  ";
                    }else if(element.getAttribute("status").equals("TIMED_OUT")){
                        statusArray[temp] = "TimOut";
                    }else{
                        statusArray[temp] = "NoCov";
                    }
                    /*
                  @param numberOfTestsRun- Number of tests run is the tests executed against that particular mutant
                    */

                    String str1 = element.getAttribute("numberOfTestsRun");
                    int numberOfTestsRun = Integer.parseInt(str1);
                   /*
                  Here the killing tests, which is the child of mutation has some context regarding the tests used to kill.
                   So the context is extracted and then the particular test numbers is found.
                    */
                    NodeList childList1 = element.getElementsByTagName("killingTests");
                    for(int firstChildCount = 0; firstChildCount < childList1.getLength(); firstChildCount++) {
                    /* From "element.getElementsByTagName("killingTests").item(count).getTextContent()" I get an string, some times it is seperated by | and some times not.
                      If the number of tests are greater than one then split them and continue.
                       */
                        String killingTestsString = element.getElementsByTagName("killingTests").item(firstChildCount).getTextContent();
                        if(killingTestsString.contains("|")) {
                                String[] Tests = killingTestsString.split("\\|");
                                int i;
                                for(i = 0; i<Tests.length; i++) {
                                    Pattern pattern1 = Pattern.compile("\\d+");
                                    Matcher matcher1 = pattern1.matcher(Tests[i]);
                                    while(matcher1.find()) {
                                       /*
                                       The string number is the Integer in form of a string
                                        */
                                        String[] stringNumber = new String[Tests.length];
                                        stringNumber[i] = matcher1.group();
                                        int testK = Integer.parseInt(stringNumber[i]);
                                          array[temp][testK-1] = 1;

                                    }
                                }
                        }else if(!killingTestsString.contains("|")){
                            Pattern pattern1 = Pattern.compile("\\d+");
                            Matcher matcher1 = pattern1.matcher(killingTestsString);
                            while (matcher1.find()) {
                                String stringNumber = matcher1.group();
                                 int testK = Integer.parseInt(stringNumber);
                                array[temp][testK-1] = 1;
                            }
                        } else
                            break; }

                     /*
                   Here the SuccedingTests, which is the child of mutation has some context regarding the tests used to kill. So the context is extracted and then the particular test numbers is found.
                    */

                    NodeList childList2 = element.getElementsByTagName("succeedingTests");
                    for(int secondChildCount = 0; secondChildCount < childList2.getLength(); secondChildCount++){
                      /* From "element.getElementsByTagName("SuccedingTests").item(count).getTextContent()" I get an string, some times it is seperated by | and some times not.
                      If the number of tests are greater than one then split them and continue.
                       */

                       String succedingTestsString = element.getElementsByTagName("succeedingTests").item(secondChildCount).getTextContent();
                            if(succedingTestsString.contains("|")) {
                                String[] Tests2 = new String[numberOfTestsRun];
                                Tests2 = succedingTestsString.split("\\|");
                                int j;
                                for(j = 0; j< Tests2.length; j++) {
                                    Pattern pattern2 = Pattern.compile("\\d+");
                                    Matcher matcher2 = pattern2.matcher(Tests2[j]);
                                    while (matcher2.find()) {
                                       /*
                                       The string number is the number in form of a string
                                        */
                                        String[] stringNumber2 = new String[Tests2.length];
                                        stringNumber2[j] = matcher2.group();
                                        int testS=Integer.parseInt(stringNumber2[j]);
                                        array[temp][testS-1]=2;

                                    }
                                }

                        }  else if(!succedingTestsString.contains("|")) {
                            Pattern pattern2 = Pattern.compile("\\d+");
                            Matcher matcher2 = pattern2.matcher(succedingTestsString);
                            while (matcher2.find()) {
                                String stringNumber2 = matcher2.group();
                                int testS = Integer.parseInt(stringNumber2);
                                array[temp][testS-1] = 2;

                            }

                        } else{
                            break;
                        }

                    }

                }

            }
//            for (int i=0;i< array.length;i++){
//                for (int j=0;j< 6;j++){
//                    System.out.print(array[i][j]+" ");
//                }
//                System.out.println();
//            }

               System.out.println("Here the different mutants statuses are represented, Surv is survived, NoCov is No-coverage. The columns represent the tests. Here the 1=killed, and 2=survived");
               System.out.println();
          int counter =1;
        for(int i=0;i< parentListLength;i++) {
            System.out.print("Mutant"+counter+" Status  "+statusArray[i]+" - ");
            for(int j = 0; j < 6; j++){
                System.out.print("    "+array[i][j]+" ");
                    }counter++;
            System.out.println();
                }
        }catch(IOException | ParserConfigurationException | SAXException e) {
            e.printStackTrace();
        }


    }
}