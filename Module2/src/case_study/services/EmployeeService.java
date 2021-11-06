package case_study.services;

import case_study.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeService implements IEmployeeSercice {
     List<Employee> employeeList;

    public EmployeeService() {
         employeeList = new ArrayList();
    }

    public EmployeeService(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void addNew() {
        System.out.println("Enter the name of employee : ");
        String nameEmployee = scanner.nextLine();
        System.out.println("Enter the date of birth of employee(yyyy) : ");
        String dateOfBirthEmployee = scanner.nextLine();
        while (!Pattern.matches("^[0-9]{4}$", dateOfBirthEmployee)) {
            System.out.println("Please Enter Again : ");
            dateOfBirthEmployee = scanner.nextLine();
        }
        System.out.println("Enter the gender of employee(Male/Female) : ");
        String genderEmployee = scanner.nextLine();
        System.out.println("Enter the identity number of employee : ");
        int identityEmployee = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the phone of employee : ");
        int phoneEmployee = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the email of employee : ");
        String emailEmployee = scanner.nextLine();
        System.out.println("Enter the ID of Employee");
        int idEmployee = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the level of Employee: ");
        String levelEmployee = scanner.nextLine();
        System.out.println("Enter the possition of Employee: ");
        String possitionEmployee = scanner.nextLine();
        System.out.println("Enter the salary of Employee: ");
        double salaryEmployee = Double.parseDouble(scanner.nextLine());
        Employee employee = new Employee(nameEmployee,dateOfBirthEmployee,genderEmployee,identityEmployee,phoneEmployee,emailEmployee,idEmployee,levelEmployee,possitionEmployee,salaryEmployee);
        employeeList.add(employee);
        System.out.println("Add Successful");
    }

    @Override
    public void editInformation() {
        System.out.println("Enter the ID of employee you want to edit : ");
        int idEdit = Integer.parseInt(scanner.nextLine());
        for(Employee employee:employeeList){
            if(idEdit==employee.getEmployeeId()){
                System.out.println("Enter the name of employee : ");
                employee.setName(scanner.nextLine());
                System.out.println("Enter the date of birth of employee(yyyy) : ");
                employee.setDateOfBirth(scanner.nextLine());
                System.out.println("Enter the gender of employee(Male/Female) : ");
                employee.setGender(scanner.nextLine());
                System.out.println("Enter the identity number of employee : ");
                employee.setIdentityNumber(Integer.parseInt(scanner.nextLine()));
                System.out.println("Enter the phone of employee : ");
                employee.setPhoneNumber(Integer.parseInt(scanner.nextLine()));
                System.out.println("Enter the email of employee : ");
                employee.setEmail(scanner.nextLine());
                System.out.println("Enter the level of Employee: ");
                employee.setLevel(scanner.nextLine());
                System.out.println("Enter the possition of Employee: ");
                employee.setPosition(scanner.nextLine());
                System.out.println("Enter the salary of Employee: ");
                employee.setSalary(Double.valueOf(scanner.nextLine()));
                System.out.println("Edit Successful");
            }
            else {
                System.out.println("The employee is not exit ");
            }
        }
    }

    @Override
    public void displayList() {
        for(Employee employee:employeeList){
            System.out.println(employee);
        }
    }
}
