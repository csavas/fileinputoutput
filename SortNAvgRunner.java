//Carolyn Savas
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import static java.lang.System.*;

public class SortNAvgRunner
{
   public static void main ( String[] args )throws IOException
   {
     Scanner file = new Scanner( new File("Lab3Binput.txt"));
     ArrayList ray = new ArrayList<Double>();
     int i = file.nextInt();
     while(file.hasNextDouble()){
       ray.add(file.nextDouble());
     }
     SortNAvg one = new SortNAvg(ray);
     
     
   }
}  