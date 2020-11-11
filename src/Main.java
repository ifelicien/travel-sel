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


        switch (choice) {
            case 1:
                System.out.println("Hawaii");
                price = 50;
                return price;
            case 2:
                System.out.println("Bahamas");
                price = 40;
                return price;
            case 3:
                System.out.println("Cancun");
                price = 60;
                return price;
            case 4:
                System.out.println("Las Vegas");
                price = 35;
                return price;
            case 5:
                System.out.println("Europe");
                price = 90;
                return price;
            default:
                System.out.println("Invalid Selection");
        }
        return 0;

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
                price2 = 50;
                return price2;
            case 2:
                System.out.println("Bahamas");
                price2 = 40;
                return price2;
            case 3:
                System.out.println("Cancun");
                price2 = 60;
                return price2;
            case 4:
                System.out.println("Las Vegas");
                price2 = 35;
                return price2;
            case 5:
                System.out.println("Europe");
                price2 = 90;
                return price2;
            default:
                System.out.println("Invalid Selection");
        }
        return 0;
    }

    static void passengers(){

    }


    static void display(){
        System.out.println("destination: " + vacationSelection());
        System.out.println("Airline: " + airlineSelection());
    }
}

