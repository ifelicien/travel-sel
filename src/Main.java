import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        display();

    }

    static double vacationSelection() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Where would you like to travel:");
        System.out.print("1.\tHawaii\n2.\tBahamas\n3.\tCancun\n4.\tLas Vegas\n5.\tEurope\n");

        int choice = myScanner.nextInt();
        double price;
        String destination;


        switch (choice) {
            case 1:
                System.out.println("Hawaii");
                price = 50.00;
                return price;
            case 2:
                System.out.println("Bahamas");
                price = 40.00;
                return price;
            case 3:
                System.out.println("Cancun");
                price = 60.00;
                return price;
            case 4:
                System.out.println("Las Vegas");
                price = 35.00;
                return price;
            case 5:
                System.out.println("Europe");
                price = 90.00;
                return price;
            default:
                System.out.println("Invalid Selection");
                return vacationSelection();
        }
    }

    static String destinationName(double price){
        String destination;

        if (price == 50){
            destination = "Hawaii";
            return destination;
        }
        else if (price == 40){
            destination = "Bahamas";
            return destination;
        }
        else if (price == 60){
            destination = "Cancun";
            return destination;
        }
        else if (price == 35){
            destination = "Las Vegas";
            return destination;
        }
        else if (price == 90){
            destination = "Europe";
            return destination;
        }
        else{
            System.out.println("Invalid Selection");
            return null;
        }
    }

    static double airlineSelection() {
        Scanner airline_scanner = new Scanner(System.in);
        System.out.println("Please select and airline: ");
        System.out.print("1.\tUS Air\n2.\tDelta\n3.\tSouthWest Airline\n4.\tContinental\n5.\tAmerican Airline\n");

        int selector = airline_scanner.nextInt();
        double price2;

        switch (selector) {
            case 1:
                System.out.println("Hawaii");
                price2 = 50.00;
                return price2;
            case 2:
                System.out.println("Bahamas");
                price2 = 40.00;
                return price2;
            case 3:
                System.out.println("Cancun");
                price2 = 60.00;
                return price2;
            case 4:
                System.out.println("Las Vegas");
                price2 = 35.00;
                return price2;
            case 5:
                System.out.println("Europe");
                price2 = 90.00;
                return price2;
            default:
                System.out.println("Invalid Selection");
                return airlineSelection();
        }
    }

    static String airlineName(double price2){
        String airline;

        if (price2 == 50){
            airline = "Hawaii";
            return airline;
        }
        else if (price2 == 40){
            airline = "Bahamas";
            return airline;
        }
        else if (price2 == 60){
            airline = "Cancun";
            return airline;
        }
        else if (price2 == 35){
            airline = "Las Vegas";
            return airline;
        }
        else if (price2 == 90){
            airline = "Europe";
            return airline;
        }
        else{
            System.out.println("Invalid Selection");
            return null;
        }
    }

    static int passengers(){
        Scanner passengerSelector = new Scanner(System.in);
        System.out.println("How many passengers are traveling");
        System.out.println("1. one passenger\n2. Two Passengers");

        int passenger = passengerSelector.nextInt();

        if (passenger == 1){
            return passenger;
        }
        else if(passenger == 2){
            return passenger;
        }
        else{
            System.out.println("invalid Selection");
            return 0;
        }

    }

    static double tripTotal(double price, double price2, int passenger){
        double total = (price + price2) * passenger;
        return total;
    }


    static void display(){
        double destPrice = vacationSelection();
        double airfare = airlineSelection();
        String myDestination = destinationName(destPrice);
        String myAirline = airlineName(airfare);
        int passengerNum = passengers();

        double myTotal = (destPrice + airfare) * passengerNum;

        System.out.println("Your destination is: " + myDestination + " for $" + destPrice);
        System.out.println("Your chosen Airline is: " + myAirline + " for $" + airfare);
        System.out.println("The number of people flying is " + passengerNum);
        System.out.println("Your total is: " + myTotal);
    }
}

