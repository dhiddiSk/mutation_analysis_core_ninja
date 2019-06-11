package randomSampling;
import java.io.File;
import java.util.*;

class sampleSizeCalculator{
    Scanner sc = new Scanner(System.in);
    public int sampleSize(){
        double errorToleranceValue = sc.nextFloat();
         double x = 0.25,y = 1.96;
        long sizevalue = (int)(x*Math.pow((y/errorToleranceValue),2));
     return (int) sizevalue;
    }
}
public class Sampling {
        public static void main(String[] args) throws Exception {
             List<File> strings1 = new ArrayList<>();
             List<File> strings2 = new ArrayList<>();
             sampleSizeCalculator obj = new sampleSizeCalculator();
                System.out.println("please enter the path of mutants folder");
                       Scanner sc = new Scanner(System.in);
                       String path = sc.next();
               /*
               *  The below code represents:
               * Here the folder contains the not killed mutants, and those mutants are shuffled and with certain sample size the
               * the elements of the folder are choosen randomly. If  the elements are more than 1000 then one formulas is applied for size calculation
               * and if the elements are less than 100 then 10 percentage of them are choosen randomly.
               * */
               File[] folder = new File(path).listFiles();
               Collections.shuffle(Arrays.asList(folder));
               Random rand = new Random();
               if(folder.length>1000){
                System.out.println("if number of mutants>1000, enter the error tolerance value between 0 t" +
                        "o 1, where 0.1 represents 10% tolerance");
                   int size=obj.sampleSize();
                   System.out.println("the random list of mutants paths are");
                  for(int i=1;i<=size;i++){
                    File file = folder[rand.nextInt(folder.length)];
                    strings1.add(file);
                      System.out.println(strings1.get(i-1));}
               }else{
                     int percentage = (folder.length/15);
                   System.out.println(percentage);
                   System.out.println("the random list of mutants paths are");
                       for(int j=1;j<=percentage;j++){
                         strings2.add(folder[rand.nextInt(folder.length)]);
                          System.out.println(strings2.get(j-1));
                       }
               }

         }
}

