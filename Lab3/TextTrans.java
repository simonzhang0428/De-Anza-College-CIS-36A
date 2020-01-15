/**
 * @author Simon Zhang
 * @author Thanh Le
 * CIS 36B
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TextTrans {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Texting Translator!");

        String[] abbrevations = new String[150];
        String[] translations = new String[150];
        int numElement = 0;
        //something wrong here, maybe need to update the numElement first
        //how to rename one variable， 右键refactor->rename

        //read file into parallel array
        Scanner inputAbb = new Scanner("abbreviation.txt");
        Scanner inputTrans = new Scanner("translation.txt");


        while (inputAbb.hasNext() && inputTrans.hasNext()) {
            abbrevations[numElement] = inputAbb.nextLine();
            translations[numElement] = inputTrans.nextLine();
            numElement++;
        }

        inputAbb.close();
        inputTrans.close();

        for (int i = 0; i < numElement; i++) {
            System.out.println("Here is the Abb:");
            System.out.println(abbrevations[i]);
            System.out.println("\nHere is the Trans:");
            System.out.println(translations[i]);
        }


        System.out.println("\nGoodbye!");
    }


    /**
     * Inserts a String element into an array at a specified index
     * @param array the list of String values
     * @param numElements the current number of elements stored
     * @indexToInsert the location in the array to insert the new element
     * @param newValue the new String value to insert in the array
     */

    public static void insert(String array[], int numElements,
                              int indexToInsert, String newValue) {

    }

    /**
     * Removes a String element from an array at a specified index
     * @param array the list of String values
     * @param numElements the current number of elements stored
     * @param indexToRemove where in the array to remove the element
     */

    public static void remove(String array[], int numElements, int indexToRemove) {
        return;
    }

    /**
     * Print an array of Strings either to the console
     * or a file
     * @param names the list of abbreviations
     * @param translations the list of corresponding translations
     * @param numElements the current number of elements stored
     * @param file the file name
     */
    public static void printFile(String[] abbreviations, String[] translations,
                                 int numElements, String file) throws IOException {
        return;
    }

    /**
     * Searches for a specified String in a list
     * @param array the array of Strings
     * @param value the String to serach for
     * @param numElements the number of elements in the list
     * @return the index where value is located in the array
     */
    public static int linearSearch(String array[], String value, int numElements) {
        return -1;
    }

}

