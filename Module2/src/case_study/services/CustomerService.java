package case_study.services;

import case_study.models.Customer;
import case_study.models.Employee;
import case_study.untils.ReadWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomerService implements ICustomerService {
    List<Customer> customerList;
    ReadWriteFile readWriteFile=new ReadWriteFile();

    public CustomerService() {
        customerList = new ArrayList();
    }

    public CustomerService(List<Customer> customerList) {
        this.customerList = customerList;
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void addNew() {
        System.out.println("Enter the name of customer : ");
        String nameCustomer = scanner.nextLine();
        System.out.println("Enter the date of birth of customer (yyyy) : ");
        String dateOfBirthCustomer = scanner.nextLine();
        while (!Pattern.matches("^[0-9]{4}$", dateOfBirthCustomer)) {
            System.out.println("Please Enter Again : ");
            dateOfBirthCustomer = scanner.nextLine();
        }
        System.out.println("Enter the gender of customer (Male/Female) : ");
        String genderCustomer = scanner.nextLine();
        System.out.println("Enter the identity number of customer  : ");
        int identityCustomer = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the phone of customer  : ");
        int phoneCustomer = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the email of customer : ");
        String emailCustomer = scanner.nextLine();
        System.out.println("Enter the ID of customer ");
        int idCustomer = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the type of customer(Diamond, Platinium, Gold, Silver, Member) : ");
        String typeOfCustomer = scanner.nextLine();
        System.out.println("Enter the address of customer : ");
        String addressCustomer = scanner.nextLine();
        Customer customer = new Customer(nameCustomer, dateOfBirthCustomer, genderCustomer, identityCustomer, phoneCustomer, emailCustomer, idCustomer, typeOfCustomer, addressCustomer);
        customerList.add(customer);
        System.out.println("Add Successful");
        readWriteFile.writeListCustomer("E:\\Gia Bao\\Hoc Tap\\Code Gym\\CodeGym\\Module 2\\Module2\\src\\case_study\\data\\Customer",customerList);
    }

    @Override
    public void editInformation() {
        System.out.println("Enter the ID of customer you want to edit : ");
        int idEdit = Integer.parseInt(scanner.nextLine());
        for (Customer customer : customerList) {
            if (idEdit == customer.getCustomerId()) {
                System.out.println("Enter the name of customer : ");
                customer.setName(scanner.nextLine());
                System.out.println("Enter the date of birth of customer(yyyy) : ");
                customer.setDateOfBirth(scanner.nextLine());
                System.out.println("Enter the gender of customerMale/Female) : ");
                customer.setGender(scanner.nextLine());
                System.out.println("Enter the identity number of customer : ");
                customer.setIdentityNumber(Integer.parseInt(scanner.nextLine()));
                System.out.println("Enter the phone of customer : ");
                customer.setPhoneNumber(Integer.parseInt(scanner.nextLine()));
                System.out.println("Enter the email of customer : ");
                customer.setEmail(scanner.nextLine());
                System.out.println("Enter the type of customer : ");
                customer.setTypeOfCustomer(scanner.nextLine());
                System.out.println("Enter the address of customer: ");
                customer.setAddressOfCustomer(scanner.nextLine());
                System.out.println("Edit Successful");
            } else {
                System.out.println("The customer is not exit ");
            }
        }
    }

    @Override
    public void displayList() {
        customerList=new ArrayList<>();
        readWriteFile.readListCustomer("E:\\Gia Bao\\Hoc Tap\\Code Gym\\CodeGym\\Module 2\\Module2\\src\\case_study\\data\\Customer",customerList);
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }
}
