package case_study.controllers;

import case_study.services.CustomerService;
import case_study.services.EmployeeService;
import case_study.services.FacilityService;

import java.util.Scanner;

public class FuramaController {
    static EmployeeService employeeService = new EmployeeService();
    static CustomerService customerService = new CustomerService();
    static FacilityService facilityService = new FacilityService();
    static void displayMenu() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("-----Main Menu------" + "\n" +
                    "1.Employee Management" + "\n" +
                    "2.Customer Management" + "\n" +
                    "3.Facility Management " + "\n" +
                    "4.Booking Management" + "\n" +
                    "5.Promotion Management" + "\n" +
                    "6.Exit" + "\n");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1.Display list employees " + "\n" +
                            "2.Add new employee " + "\n" +
                            "3.Edit employee " + "\n" +
                            "4.Return main menu " + "\n");
                    int choiceFirst = Integer.parseInt(input.nextLine());
                    switch (choiceFirst) {
                        case 1:
                            employeeService.displayList();
                            break;
                        case 2:
                            employeeService.addNew();
                            break;
                        case 3:
                            employeeService.editInformation();
                            break;
                        case 4:
                            displayMenu();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1.Display list customers " + "\n" +
                            "2.Add new customer " + "\n" +
                            "3.Edit customer " + "\n" +
                            "4.Return main menu " + "\n");
                    int choiceSecond = Integer.parseInt(input.nextLine());
                    switch (choiceSecond) {
                        case 1:
                            customerService.displayList();
                            break;
                        case 2:
                            customerService.addNew();
                            break;
                        case 3:
                            customerService.editInformation();
                            break;
                        case 4:
                            displayMenu();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1.Display list facility " + "\n" +
                            "2.Add new facility " + "\n" +
                            "3.Display list facility maintenance " + "\n" +
                            "4.Return main menu " + "\n");
                    int choiceThird = Integer.parseInt(input.nextLine());
                    switch (choiceThird) {
                        case 1:
                            facilityService.displayListFacility();
                            break;
                        case 2:
                            System.out.println("1.Add new villa " + "\n" +
                                    "2.Add new House " + "\n" +
                                    "3.Add new Room " + "\n" +
                                    "4.Return main menu " + "\n");
                            int choiceFourth = Integer.parseInt(input.nextLine());
                            switch (choiceFourth) {
                                case 1:
                                    facilityService.addNewVilla();
                                    break;
                                case 2:
                                    facilityService.addNewHouse();
                                    break;
                                case 3:
                                    facilityService.addNewRoom();
                                    break;
                                case 4:
                                    displayMenu();
                                    break;
                            }
                            break;
                        case 3:
                            break;
                        case 4:
                            displayMenu();
                            break;
                    }
                    break;
                case 4:
                    System.out.println("1.Add new booking " + "\n" +
                            "2.Display list booking " + "\n" +
                            "3.Create new constracts " + "\n" +
                            "4.Display list contracts " + "\n" +
                            "5.Edit contracts " + "\n" +
                            "6.Return main menu " + "\n");
                    break;
                case 5:
                    System.out.println("1.Display list customers use service " + "\n" +
                            "2.Display list customers get voucher" + "\n" +
                            "3.Return main menu" + "\n");
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        try {
            displayMenu();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());

        }
    }
}

