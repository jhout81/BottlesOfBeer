import java.util.Scanner;

public class BottlesOfBeer {

    public static void main(String[] args) {
        //initializing scanner so I can read in from the keyboard
        Scanner in = new Scanner(System.in);
        //initializing variables
        int numBottles;
        int countBottles;
        int countBottlesMinusOne;

        System.out.print("Enter the number of bottles to start with: ");
        //populating variables from user entered number from keyboard
        numBottles = in.nextInt();
        countBottles = numBottles;

        System.out.println();
        //As long as countBottles is >= 0 (true) the while loop will iterate
        while (countBottles >= 0) {

            countBottlesMinusOne = countBottles - 1;
            //prints out appropriate lyrics if countBottles is equal to 1
            if (countBottles == 1) {
                System.out.println(countBottles + " bottle of beer on the wall, " + countBottles + " bottle of beer.");
                System.out.println("Take one down and pass it around, " + countBottlesMinusOne + " bottles of beer on the wall.");
                //prints out appropriate lyrics if countBottles is equal to 0
            } else if (countBottles == 0) {
                System.out.println(countBottles + " bottles of beer on the wall, " + countBottles + " bottles of beer.");
                System.out.println("Go to the store and buy some more, " + numBottles + " bottles of beer on the wall.");
                //prints out appropriate lyrics if countBottlesMinusOne is equal to 1
            } else if (countBottlesMinusOne == 1) {
                System.out.println(countBottles + " bottles of beer on the wall, " + countBottles + " bottles of beer.");
                System.out.println("Take one down and pass it around, " + countBottlesMinusOne + " bottle of beer on the wall.");
                //prints out appropriate lyrics if all if/else statements above are false
            } else {
                System.out.println(countBottles + " bottles of beer on the wall, " + countBottles + " bottles of beer.");
                System.out.println("Take one down and pass it around, " + countBottlesMinusOne + " bottles of beer on the wall.");
            }

            System.out.println();
            //subtracts 1 from countBottles after each iteration of the while loop
            countBottles -= 1;

        }

    }


}
