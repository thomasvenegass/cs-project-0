//Thomas Venegas
//CS 1400
//Asignment 3
//3/1/21

import java.util.Scanner;
public class TaskA 
{
    public static void main(String[] args)
    {
        int numberOfPackages;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many shortbread packages did you purchase?");
        numberOfPackages = keyboard.nextInt();

        if (numberOfPackages > 99)
        {
            System.out.println ("You receive a 50% discount. The total price after the discount is " + numberOfPackages * 5 * .5 + "$");
        }
        else if (numberOfPackages > 49)
        {
            System.out.println ("You receive a 40% discount. The total price after the discount is " + numberOfPackages * 5 * .6 + "$");
        }
        else if (numberOfPackages > 19)
        {
            System.out.println ("You receive a 30% discount. The total price after the discount is " + numberOfPackages * 5 * .7 + "$");
        }
        else if (numberOfPackages > 9)
        {
            System.out.println ("You receive a 20% discount. The total price after the discount is " + numberOfPackages * 5 * .8 + "$");
        }
        else
        {
            System.out.println ("The total price is " + numberOfPackages * 5 + "$");
        }

    }
}
