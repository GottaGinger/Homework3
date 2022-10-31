import java.util.Scanner;
      public class PowersTable {

    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        String Continue = "y";

        while (Continue.equals("y")) {
            System.out.println("Enter an integer:");
            int userInput = input.nextInt();
            System.out.printf("%-10s %-10s %10s %n", "NUMBER", "SQUARED", "CUBED");
            System.out.printf("=======   =======   ========%n");
            for(int i= 1; i <= userInput; i++)
            {
                System.out.printf("%-15d%-15d%-15d\n", i, i*i, i*i*i);
            }
            System.out.println("Continue? (y/n)");
            Continue = input.next();
        }
    }
}


