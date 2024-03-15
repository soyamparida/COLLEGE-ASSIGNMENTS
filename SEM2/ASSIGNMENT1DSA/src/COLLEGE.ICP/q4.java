package assignmentpractice1;
import java.util.Scanner;
public class q4 {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);

        // Generating a random number between 1 and 9
        
/*
        System.out.print("Guess the number: ");
        int userGuess = sc.nextInt();

        if (userGuess == compGuess) {
            System.out.println("You got it right!");
        } else if (userGuess + 1 == compGuess || userGuess - 1 == compGuess) {
            System.out.println("Almost got it!");
        } else {
            System.out.println("You got it wrong.");
        }

        System.out.println("Computer's guess: " + compGuess);
        sc.close();
        */
	  //  Scanner sc = new Scanner(System.in);
/*
        System.out.print("Enter the (x, y) coordinate: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Point is at the origin.");
        } else if (x == 0) {
            System.out.println("(" + x + ", " + y + ") is on the y-axis.");
        } else if (y == 0) {
            System.out.println("(" + x + ", " + y + ") is on the x-axis.");
        } else {
            String quadrant;
            if (x > 0 && y > 0) {
                quadrant = "quadrant I";
            } else if (x < 0 && y > 0) {
                quadrant = "quadrant II";
            } else if (x < 0 && y < 0) {
                quadrant = "quadrant III";
            } else {
                quadrant = "quadrant IV";
            }
            System.out.println("(" + x + ", " + y + ") is in " + quadrant);
        }

        sc.close();
        */
	  //  Scanner sc = new Scanner(System.in);
/*
        System.out.print("Enter the marks obtained (out of 100): ");
        int mark = sc.nextInt();

        String grade;

        switch (mark / 10) {
            case 10, 9 -> grade = "O";
            case 8 -> grade = "A";
            case 7 -> grade = "B";
            case 6 -> grade = "C";
            case 5 -> grade = "D";
            case 4 -> grade = "E";
            default -> grade = "F";
	}
	*/
	   
	    Scanner sc = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int input = sc.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int dayElapsed = sc.nextInt();

        String today = ""; String futureDay = "";

        switch (input) {
            case 0 -> today = "Sunday";
            case 1 -> today = "Monday";
            case 2 -> today = "Tuesday";
            case 3 -> today = "Wednesday";
            case 4 -> today = "Thursday";
            case 5 -> today = "Friday";
            case 6 -> today = "Saturday";
        }

        switch ((input + dayElapsed) % 7 ) {
            case 0 -> futureDay = "Sunday";
            case 1 -> futureDay = "Monday";
            case 2 -> futureDay = "Tuesday";
            case 3 -> futureDay = "Wednesday";
            case 4 -> futureDay = "Thursday";
            case 5 -> futureDay = "Friday";
            case 6 -> futureDay = "Saturday";
        }

        System.out.println("Today is " + today + " and the future day is " + futureDay);
        sc.close();
    }
}