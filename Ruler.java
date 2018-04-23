/* Name: Nicholas Keen
 * Course: CIS 201 - Computer Science I
 * Section: 003
 * Assignment: 5
 */
import java.util.*;

public class Ruler {

    public static void main(String[] args) {

        Scanner inches = new Scanner(System.in);
        System.out.print("How many inches long" +
                           " will the ruler be? ");
        drawRuler(inches.nextInt());
    }

    //draws the ruler
    public static void drawRuler(int inches) {

        top(inches);
        marks(inches);
        bottom(inches);
    }

    //prints out the top of the ruler
    public static void top(int inches) {

         System.out.print(" ");
         for(int i = 1; i <= 4*inches; i++) {
             System.out.print("_");
         }
         System.out.println("_");
    }

    //prints out the ' and | markings
    // on the ruler
    public static void marks(int inches) {

        System.out.print("|");
        for(int i = 1; i <= inches * 2; i++) {
            System.out.print("'|");
        }
        System.out.println("'|");
    }

    //prints out the bottom
    //portion of the ruler
    public static void bottom(int inches) {

        System.out.print("|");
        for(int i = 1; i <= inches; i++) {
            for(int j = 1; j <= 3 - i/10; j++) {
                System.out.print("_");
            }
            System.out.print(i);
        }
        System.out.println("_|");
    }   
}