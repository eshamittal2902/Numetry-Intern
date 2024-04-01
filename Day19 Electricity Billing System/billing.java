import java.util.*;

public class billing {
    static Scanner scanner = new Scanner(System.in);
    static List<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        int option;
        do {
            System.out.println("Choose an option:");
            System.out.println("1. Add a new customer");
            System.out.println("2. Enter reading details");
            System.out.println("3. Generate bill for a customer");
            System.out.println("4. Generate all bills");
            System.out.println("5. Exit");
            option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                    enterReadingDetails();
                    break;
                case 3:
                    generateBillForCustomer();
                    break;
                case 4:
                    generateAllBills();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (option != 5);
    }

    static void addCustomer() {
        System.out.println("Enter customer name:");
        String name = scanner.nextLine();
        System.out.println("Enter customer address:");
        String address = scanner.nextLine();
        customers.add(new Customer(name, address));
        System.out.println("Customer added successfully.");
    }

    static void enterReadingDetails() {
        System.out.println("Enter customer name:");
        String name = scanner.nextLine();
        Customer customer = findCustomerByName(name);
        if (customer != null) {
            System.out.println("Enter Your Current Reading:");
            int currentReading = scanner.nextInt();
            scanner.nextLine(); 
            System.out.println("Enter Your Previous Reading:");
            int previousReading = scanner.nextInt();
            scanner.nextLine(); 
            customer.addReading(new Reading(currentReading, previousReading));
            System.out.println("Reading details added successfully.");
        } else {
            System.out.println("Customer not found.");
        }
    }

    static void generateBillForCustomer() {
        System.out.println("Enter customer name:");
        String name = scanner.nextLine();
        Customer customer = findCustomerByName(name);
        if (customer != null) {
            customer.generateBill();
        } else {
            System.out.println("Customer not found.");
        }
    }

    static void generateAllBills() {
        for (Customer customer : customers) {
            customer.generateBill();
        }
    }

    static Customer findCustomerByName(String name) {
        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(name)) {
                return customer;
            }
        }
        return null;
    }
}

class Customer {
    private String name;
    private String address;
    private List<Reading> readings;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
        this.readings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addReading(Reading reading) {
        readings.add(reading);
    }

    public void generateBill() {
        if (readings.size() >= 2) {
            Reading currentReading = readings.get(readings.size() - 1);
            Reading previousReading = readings.get(readings.size() - 2);
            int unitsConsumed = currentReading.getCurrentReading() - previousReading.getCurrentReading();
            double billAmount = unitsConsumed * 5.0; 
            System.out.println("Customer: " + name);
            System.out.println("Address: " + address);
            System.out.println("Units Consumed: " + unitsConsumed);
            System.out.println("Bill Amount: Rs." + billAmount);
        } else {
            System.out.println("Insufficient readings to generate bill for customer: " + name);
        }
    }
}

class Reading {
    private int currReading;
    private int prevReading;

    public Reading(int currentReading, int previousReading) {
        this.currReading = currentReading;
        this.prevReading = previousReading;
    }

    public int getCurrentReading() {
        return currReading;
    }

    public int getPreviousReading() {
        return prevReading;
    }
}

