package ex42;
import java.util.Scanner;
import java.util.*;
import java.io.*;
public class App {
    public static void readStuff(Scanner scan, ArrayList<String> stuff) {
        // Reads the input data until there are no lines of text left
        while(scan.hasNext()==true){
            //adds name being read to the list of names
            stuff.add(scan.next().trim());
        }
        printStuff(stuff);
    }
    public static void printStuff(ArrayList<String> stuff)
    {
        //Print the beginning stuff
        System.out.println("Last      First     Salary\n" +
                "--------------------------");
        //Loop through the list and print it out
        for (String s:stuff) {
            System.out.format("%-10s", s);
            char[] a = s.toCharArray();
            if (Character.isDigit(a[0])) {
                System.out.print("\n");
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        //**IMPORTANT** --> Please replace the path with your own <----- **IMPORTANT**
        //Using the useDelimiter function for the new lines and such formatting
        Scanner scan = new Scanner(new File("/Users/briennekohrs/IdeaProjects/kohrs-cop3330-assignment3/src/ex42/exercise42_input.txt")).useDelimiter(",|\\n");
        //initializing ArrayList
        ArrayList<String> stuff = new ArrayList<String>();
        readStuff(scan,stuff);
    }
}