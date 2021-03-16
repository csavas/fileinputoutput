//Carolyn Savas
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import static java.lang.System.*;
import java.util.Collections;
  public class SortNAvg
{
   private ArrayList<Double> list;

   public SortNAvg(ArrayList<Double> l)throws IOException
   {
     int numSort=0;
     Double average=0.0;
     list =l;
     ArrayList<Double> avg =new ArrayList<Double>();
     Collections.sort(list);
     PrintWriter fileOut = new PrintWriter(new FileWriter("Lab3BOutput.txt"));
     for(int i =0; i<list.size(); i++){
       if((i+1)%5 ==0){
         numSort++;
         avg.add(list.get(i));
         average=0.0;
       }
     }
     fileOut.println(avg.size());
     for(int i =0; i < avg.size();i++){
       fileOut.println(avg.get(i));
       average += avg.get(i);
     }
     fileOut.println("Average: " + average/avg.size());
    fileOut.close(); 
   }
}