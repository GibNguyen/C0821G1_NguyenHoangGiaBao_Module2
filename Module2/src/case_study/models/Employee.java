package case_study.models;

import java.util.Date;

public class Employee extends Person {
    private int employeeId;
    private String level;
    private String position;
    private Double salary;

    public Employee(){}

    public Employee(String name, Date dateOfBirth, String gender, int identityNumber, int phoneNumber, String email, int employeeId, String level, String position, Double salary) {
        super(name, dateOfBirth, gender, identityNumber, phoneNumber, email);
        this.employeeId = employeeId;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
