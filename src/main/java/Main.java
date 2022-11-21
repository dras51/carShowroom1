import car.Car;
import car.Showroom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the car showroom!!");

        Showroom showroom = new Showroom();
        Scanner scanner = new Scanner(System.in);

        //Use do while loop to always display the menu options
        String input = "";

        do {
//            System.out.println("Please choose an activity!");
//            System.out.println("1. add car");
//            System.out.println("2. View all cars");
//            System.out.println("3. View single car");
//            System.out.println("4. Remove car" );

            //""" """: the three double quotes is to write the text with the return key
            System.out.println("""
                    Please choose an activity!!
                    
                    1. Add a car
                    2. View all cars
                    3. View single car
                    4. Remove car
                    5. View Car by ID
                    """);

            input = scanner.nextLine();

            //Create a condition that checks what input the user selected and perform an action based on that input
            switch (input) {
                case "quit":
                    System.out.println("Exiting Application!");
                    break;
                case "1":
                    showroom.addCar();
                    break;
                case "2":
                    showroom.viewCars();
                    break;
                case "3":
                    showroom.viewCar();
                    break;
                case "4":
                    showroom.removeCar();
                    break;
                case "5":
                    showroom.viewCarById();
                    break;
                default:
                    System.out.println("Please select a valid input.");
                    break;
            }

        } while(!input.equals("quit"));

        //true
        //logical not
    }
}
