/**
 * @author Sicong Zhang (Simon)
 * @author Thanh Le
 * CIS 36B
 */

import java.io.*;
import java.util.Scanner;

public class Halleys {
    public static void main(String[] args)
    throws  IOException {

        final int MAX_NUMBER_OF_DATA = 1000;
        int size = 0;

        //read file into temperate array, count the size
        String[] tempArray = new String[MAX_NUMBER_OF_DATA];
        File infile = new File("years.txt");
        Scanner input = new Scanner(infile);
        while(input.hasNext()) {
            tempArray[size] = input.next();
            size++;
        }
        //System.out.println(size);

        //move the string from temperate array to actual years array,
        //check if it contains B, replace BC, with space
        //else replace, with space
        //convert to int, use Integer.parseInt(string), with BC, multiply -1
        String[] stringArray = new String[size];
        int[] years = new int[size];

        for(int i = 0; i < size; i++) {
            if(tempArray[i].contains("BC")) {
                stringArray[i] = tempArray[i].replace("BC,", "");
                years[i] = Integer.parseInt(stringArray[i]) * (-1);
            } else {
                stringArray[i] = tempArray[i].replace(",", "");
                years[i] = Integer.parseInt(stringArray[i]);
            }
            //System.out.println(years[i]);
        }

        //prompt user to enter an integer, year, parse if contains BC
        System.out.println("Welcome!\n");
        System.out.print("Enter a year between 240BC and 2200 or 'x' to exit: ");
        Scanner in = new Scanner(System.in);
        String userYearString = in.next();
        int userYearInt;
        int location;

        while(!(userYearString.equals("x"))) {
            if (userYearString.contains("BC")) {
                userYearString = userYearString.replace("BC", "");
                userYearInt = Integer.parseInt(userYearString) * (-1);
            } else {
                userYearInt = Integer.parseInt(userYearString);
            }

            //check boundary
            if (userYearInt < -240 || userYearInt >2134) {
                System.out.println("Invalid date!\n");
            } else {

                location = binarySearch(years, userYearInt);

                //check before 2020 or after
                if (userYearInt < 2020) {
                    if (location == -1) {
                        System.out.println("Halley's Comet did not appear in the year " + userYearString + "\n");
                    } else {
                        System.out.println("Halley's Comet did appear in the year " + userYearString + "\n");
                    }
                } else {
                    if (location == -1) {
                        System.out.println("Halley's Comet will not appear in the year " + userYearString + "\n");
                    } else {
                        System.out.println("Halley's Comet will appear in the year " + userYearString + "\n");
                    }
                }
            }

            System.out.print("Enter a year between 240BC and 2200 or 'x' to exit: ");
            userYearString = in.next();


        }

        in.close();

        System.out.println("\nGoodbye! ");

    }

    /**
     * Search the array to indicate whether token is found and return the index
     * @param dates int array indicate the years the Halley's comet appear
     * @param year user guess about the year Halley's appearance
     * @return the index if found, otherwise return -1
     */
    public static int binarySearch(int[] dates, int year) {
        int low = 0;
        int high = dates.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (dates[mid] == year)
                return mid;
            if (dates[mid] < year) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;

    }

}

    /**
     * my problem is enter 87BC, return 87, not 87BC
     * any suggestion? too many if else.
     *
     * sample output:
     * Welcome!
     *
     * Enter a year between 240BC and 2200 or 'x' to exit: 67
     * Halley's Comet did not appear in the year 67.
     *
     * Enter a year between 240BC and 2200 or 'x' to exit: 66
     * Halley's Comet did appear in the year 66.
     *
     * Enter a year between 240BC and 2200 or 'x' to exit: 2020
     * Halley's Comet will not appear in the year 2020.
     *
     * Enter a year between 240BC and 2200 or 'x' to exit: 2061
     * Halley's Comet will appear in the year 2061.
     *
     * Enter a year between 240BC and 2200 or 'x' to exit: 87BC
     * Halley's Comet did appear in the year 87BC.
     *
     * Enter a year between 240BC and 2200 or 'x' to exit: 88BC
     * Halley's Comet did not appear in the year 88BC.
     *
     * Enter a year between 240BC and 2200 or 'x' to exit: 300BC
     * Invalid date!
     *
     * Enter a year between 240BC and 2200 or 'x' to exit: 2300
     * Invalid date!
     *
     * Enter a year between 240BC and 2200 or 'x' to exit: x
     *
     * Goodbye!
     */
