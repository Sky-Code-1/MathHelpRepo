/*
An application to help young children practice their mathematics.  The application
will tailor arithmetic problems based on the competency of the user.  Command line
interaction allows the user to define the level of difficulty and then provide 
answers to randomly generated problems.
 */
package mathshelper;

import java.util.Scanner;

/**
 *
 * @author Your name, student number and FAN here
 */
public class MathsHelper {

    private final Scanner scan;
	
	private int numQuestions;
	private int yearLevel;

    public MathsHelper() {
        scan = new Scanner(System.in);
    }

    public void letsPlay() {
        displayWelcome();
    }

    //-------------------------operational methods------------------------------
    /**
     * Prints messages to the console and prints to an output file
     *
     * @param str the text to be displayed on the console and printed to an
     * output file
     */
    private void printOutput(String str) {
        System.out.print(str);
    }

    /**
     * Defines the Welcome Message text
     */
    private void displayWelcome() {
		printOutput("+------------------------------------------------------------------------+\n");
        printOutput("|                      Welcome to the Math Helper.                       |\n");
        printOutput("|       Use this application to test your knowledge of mathematics.      |\n");
        printOutput("|      This program is intended for children from reception to year 7    |\n");
        printOutput("+------------------------------------------------------------------------+\n");
    }

    /**
     * Defines the Year Menu
     */
    private void displayYearMenu() {
        printOutput("What is your year level? Choose an option from the list below:\n");
        printOutput(" +: addition, -: subtraction, *: multiplication, /: division, %: division with remainder\n");
        printOutput("[0] Reception [+]\n");
        printOutput("[1] Year 1 [+, -]\n");
        printOutput("[2] Year 2 [+, -]\n");
        printOutput("[3] Year 3 [+, -, *, /]\n");
        printOutput("[4] Year 4 [+, -, *, /]\n");
        printOutput("[5] Year 5 [+, -, *, /, negative numbers]\n");
        printOutput("[6] Year 6 [+, -, *, /, negative numbers]\n");
        printOutput("[7] Year 7 [+, -, *, /, %, negative numbers]\n");
    }

    /**
     * Defines the Question Menu
     */
    private void displayQuestionMenu() {
        printOutput("How many questions would you like to attempt? Choose an option from the list below:\n");
        printOutput("[1] 10 questions\n");
        printOutput("[2] 20 questions\n");
        printOutput("[3] 30 questions\n");
        printOutput("[4] 40 questions\n");
        printOutput("[5] 50 questions\n");
    }

    /**
     * Displays the confirmation message to the user and processes user input to
     * determine the accuracy of the information provided. If correct then
     * return true otherwise return false.
     *
     * @param year the selected Year Menu item {0,1,2,3,4,5,6,7}
     * @param questions the selected Question Menu item {1,2,3,4,5}
     * @return boolean based on user's confirmation of correct data entry
     */
    private boolean confirmSessionDetails(int year, int questions) {
        return true;
    }
}
