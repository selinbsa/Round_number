import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Taking number from user
        System.out.println("Enter the number you want to round: ");
        double number = scanner.nextDouble();

        //rounding the number to the next lower integer
        int floor_number = (int) Math.floor(number);

        //rounding the number to the next upper integer
        int ceil_number = (int) Math.ceil(number);

        //Rounding to the nearest integer
        int round_number = (int) Math.round(number);

        //Showing result
        System.out.println("Rounding down: " + floor_number);
        System.out.println("Rounding up: " + ceil_number);
        System.out.println("Rounding to the nearest integer: " + round_number);


    }
}