import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarManufacturer tesla = new CarManufacturer(1, "Tesla");
        tesla.addElectricCars(new Tesla(1001,"Model S",103.0,true,true,true));
        tesla.addElectricCars(new Tesla(1002,"Model X",100.0,true,true,false));
        tesla.addElectricCars(new Tesla(1003,"Model 3",57.5,true,true,false));
        tesla.addElectricCars(new Tesla(1004,"Model Y",78.1,true,true,false));

        CarManufacturer ora = new CarManufacturer(2, "Ora");
        ora.addElectricCars(new Ora(2001,"ORA GOOD CAT",35.5,true,true));
        ora.addElectricCars(new Ora(2002,"ORA BLACK CAT",33.0,true,true));

        System.out.println(tesla);
        System.out.println(ora);

        String name = "";
        int qty = 0;
        String change = "";
        int station = 0;

        Customer customer = new Customer();
        ElectricCar electricCar = new ElectricCar();
        ChargingStation chargingStation1 = new ChargingStation(101,"Johor",75.0);
        ChargingStation chargingStation2 = new ChargingStation(102,"Selangor",85.0);
        ChargingStation chargingStation3 = new ChargingStation(103,"Perak",55.0);

        Scanner input = new Scanner(System.in);
        boolean hasUser = false;
        boolean hasQty = false;
        boolean hasPurcQty = false;
        boolean hasChange = false;
        boolean hasStation = false;

        while(!hasUser)
            // Check if quantity entered correctly
            try {
                System.out.println("May I know your name? ");
                name = input.next();
                input.nextLine();
                hasUser = true;
                customer.setCustomerName(name);
            } catch(InputMismatchException ime) {
                // Display Error message
                System.out.println("Invalid character found, Please enter String only !!");
                // Advance the scanner
                input.nextLine();
            }

        while(!hasQty)
            // Check if quantity entered correctly
            try {
                System.out.println("May I know how many cars you would like to purchase? ");
                qty = input.nextInt();
                input.nextLine();
                hasQty = true;
            } catch(InputMismatchException ime) {
                // Display Error message
                System.out.println("Invalid character found, Please enter numeric values only !!");
                // Advance the scanner
                input.nextLine();
            }

        System.out.println("May I know which electric car you would like to purchase? -Enter carID (eg: 1001) ");
        int[] car = new int[qty];
        for (int i = 0; i < car.length; i++) {
            while (!hasPurcQty)
                // Check if car quantity entered correctly
                try {
                    car[i] = input.nextInt();
                    i++;
                    if (i == car.length) {
                        hasPurcQty = true;
                    }
                } catch (InputMismatchException ime) {
                    // Display Error message
                    System.out.println("Invalid character found, Please enter numeric values only !!");
                    // Advance the scanner
                    input.nextLine();
                }

            for (int cars: car) {
                customer.addElectricCars(cars);
                electricCar.setChargingStation(chargingStation1);
            }
            System.out.println(customer);
        }

        while(!hasChange)
            // Check if user entered correctly
            try {
                System.out.println("The current charging station is " + electricCar.getChargingStation().getLocation() +
                        " and the available charging capacity is " + electricCar.getChargingStation().getAvailableChargingCapacity() +
                        "kWh.\nDo you want to update the charging station? (YES / NO)");
                change = input.next();
                input.nextLine();
                if (change.toUpperCase().equals("YES") || change.toUpperCase().equals("NO"))
                    hasChange = true;
                else System.out.println("Please enter YES or NO only!!\n");
            } catch(InputMismatchException ime) {
                // Display Error message
                System.out.println("Invalid character found, Please enter YES or NO only !!");
                // Advance the scanner
                input.nextLine();
            }

        if (change.toUpperCase().equals("YES")) {
            while(!hasStation)
                // Check if user entered correctly
                try {
                    System.out.println("\nPlease choose from the list below to update\n" +
                            chargingStation1.getChargingStationID() + "\t" + chargingStation1.getLocation() + "\n" +
                            chargingStation2.getChargingStationID() + "\t" + chargingStation2.getLocation() + "\n" +
                            chargingStation3.getChargingStationID() + "\t" + chargingStation3.getLocation() + "\n\n" +
                            "Enter chargingStationID (eg: 101)");
                    station = input.nextInt();
                    input.nextLine();
                    if (station == 101 || station == 102 || station == 103) {
                        hasStation = true;
                    }
                    else System.out.println("Please enter numeric values only!!\n");
                } catch(InputMismatchException ime) {
                    // Display Error message
                    System.out.println("Invalid character found, Please enter numeric values only !!");
                    // Advance the scanner
                    input.nextLine();
                }
            if (station == 101) {
                electricCar.setChargingStation(chargingStation1);
            } else if (station == 102) {
                electricCar.setChargingStation(chargingStation2);
            } else if (station == 103) {
                electricCar.setChargingStation(chargingStation3);
            }
        }

        System.out.println("\n==================================================\nOwner Name: " + customer.getCustomerName().toUpperCase() + "\n==================================================");
        List<ElectricCar> electricCars = customer.getElectricCars();
        if (electricCars.isEmpty()) {
            System.out.println("No cars owned by " + customer.getCustomerName().toUpperCase());
        } else {
            for (ElectricCar electricCarr : electricCars) {
                System.out.println("Car ID: " + electricCarr.getCarID());
                System.out.println("Model: " + electricCarr.getModel());
                System.out.println("Battery Capacity: " + electricCarr.getBatteryCapacity() + " kWh");
                System.out.println("Charging Station: " + electricCar.getChargingStation().getLocation() + "\n");
            }
        }
    }
}