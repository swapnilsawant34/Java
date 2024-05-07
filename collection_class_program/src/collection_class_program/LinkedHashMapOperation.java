package collection_class_program;

import java.util.*;

public class LinkedHashMapOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<Integer, String> employeeMap = new LinkedHashMap<>();

        while (true) {
            System.out.println("Enter your choice:");
            System.out.println("1. Add New Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Delete Employee by ID");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.println("Enter Employee Name: ");
                    String name = scanner.nextLine();
                    employeeMap.put(id, name);
                    System.out.println("Employee added successfully.");
                    break;

                case 2:
                    System.out.println("All Employees:");
                    for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                        System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
                    }
                    break;

                case 3:
                    System.out.println("Enter Employee ID to search: ");
                    int searchId = scanner.nextInt();
                    if (employeeMap.containsKey(searchId)) {
                        System.out.println("Employee found - ID: " + searchId + ", Name: " + employeeMap.get(searchId));
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.println("Enter Employee ID to delete: ");
                    int deleteId = scanner.nextInt();
                    if (employeeMap.containsKey(deleteId)) {
                        employeeMap.remove(deleteId);
                        System.out.println("Employee with ID " + deleteId + " deleted successfully.");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}