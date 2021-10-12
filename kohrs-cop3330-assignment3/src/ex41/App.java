/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Benjamin Kohrs
 */
package ex41;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.*;

public class App {
    //reads input data and adds names to arraylist
    public static void addNames(Scanner scan, ArrayList<String> listOfNames) {
        // Reads the input data until there are no lines of text left
        while (scan.hasNextLine() == true) {
            //adds name being read to the list of names
            listOfNames.add(scan.nextLine());
        }
    }

    public static void namePrint(ArrayList<String> listOfNames) throws IOException {
        //sets up the file writer
        FileWriter fw = new FileWriter("exercise41_output.txt");
        //Writes the beginning two lines of the output file
        fw.write("Total of " + listOfNames.size() + " names");
        fw.write("\n-----------------");
        //Writes the list of names
        for (String s : listOfNames) {
            fw.write(s);
            fw.write("\n");
        }
        fw.close();
    }

    public static void main(String[] args) throws IOException {
        //setting up the scanner
        //**IMPORTANT** --> Please replace the path with your own <----- **IMPORTANT**
        Scanner scan = new Scanner(new File("/Users/briennekohrs/IdeaProjects/kohrs-cop3330-assignment3/src/ex41/exercise41_input.txt"));
        //initializing ArrayList
        ArrayList<String> listOfNames = new ArrayList<>();
        //adds the names from input file to ArrayList
        addNames(scan, listOfNames);
        //sort function puts ArrayList in alphabetical order
        listOfNames.sort(String.CASE_INSENSITIVE_ORDER);
        scan.close();
        namePrint(listOfNames);
    }
}
