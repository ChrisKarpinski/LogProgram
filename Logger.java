/****************************************************************************
 *
 * Created by: Chris Karpinski
 * Created on: Sept 2016
 * This program calculates the number of logs that will fit on a truck,
 *     if you know their length
 *
 ****************************************************************************/
import java.util.Scanner;

public class Logging {

 public static void main(String[] args)
 {
// define the variables
 double lengthOfLog;
 double numberOfLogsFit;

// Scanner used to read the input line
 Scanner scan = new Scanner(System.in);

// for loop used for looping the program all over again so multiple calculations can be done
 for(;;) {
 System.out.println("Enter the length of wood (possible input of 0.25, 0.5 or 1): ");
 lengthOfLog = scan.nextDouble();

 if (lengthOfLog == 0.25 || lengthOfLog == 0.5 || lengthOfLog == 1) {
 numberOfLogsFit = 55/lengthOfLog;

 System.out.println("The number of logs that will fit is: " + numberOfLogsFit);

 } else {
// tell the user they entered an invalid length
     System.out.println("Invalid input entered");
 }

 }
 }

}
