package car;

import java.util.ArrayList;
import java.util.Scanner;

public class Showroom {
    //add a car
    //view all cars
    //view a car
    //remove a car
    Scanner scanner = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);



    //ArrayList: ArrayList is a dynamic type of array that is able to increase and shrink in size.
    ArrayList<Car> cars = new ArrayList<Car>();

    public void addCar() {
        System.out.println("Add a new car");
        Car car = new Car();

        System.out.println("Please input the car name: ");
        car.name = scanner.nextLine();

        System.out.println("Please input the car manufacturer: ");
        car.manufacturer = scanner.nextLine();

        System.out.println("Please input the car type: ");
        car.type = scanner.nextLine();

        System.out.println("Please input a car ID: ");
        car.setId(intScanner.nextInt());

        this.cars.add(car);
        System.out.println(car.name + " Added Successfully!");
    }

    public void viewCars() {
        System.out.println("All available cars: ");

        for(Car car: cars) {
            System.out.println("Name: " + car.name + " type: " + car.type);
        }
    }

    public void viewCar() {
        //try catch: helps handle exceptions
        try {
            System.out.println("View single car!");

            System.out.println("Please enter the index of the car: ");
            int carIndex = intScanner.nextInt();


            //arrayList.get(index)
            Car car = this.cars.get(carIndex);
            System.out.println("Name: " + car.name + " Type: " + car.type);
        } catch (Exception ex) {
            System.out.println("Unable to find car. Please try again!");
        }
    }

    public void removeCar() {
        try {
            System.out.println("Please input the index of car to remove: ");
            int carIndex = intScanner.nextInt();

            //arrayList.remove(index)
            cars.remove(carIndex);
            System.out.println("Removed successfully");
        } catch (Exception ex) {
            System.out.println("Unable to remove car. Please try again!");
        }
    }

    public void viewCarById() {
        System.out.println("Please input the ID of car to view");
        int carId = intScanner.nextInt();

        for(Car car: cars) {
            //Check if the id passed is equal to each car in the array list
            if (car.getId() == carId) {
                //arrayList.indexOf(object): returns the index of the element in the array.
                //cars.indexOf(car): returns the index of the car in the array list of cars
                //cars.remove(index): removes the car in that index that was returned
//                cars.remove(cars.indexOf(car));
                System.out.println("Name: " + car.name + " Type: " + car.type);
            } else {
                System.out.println("Car not found!!");
            }
        }
    }
}
