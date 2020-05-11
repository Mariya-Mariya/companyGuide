package ru.company.entity;

public class Employee {
    private Integer id;
    private String firstName;
    private String middleName;
    private String lastName;
    private Integer codeDepartment;
    private String phone;
    private String email;

    public Employee(int id, String firstName, String middleName, String lastName, int codeDepartment, String phone, String email) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.codeDepartment = codeDepartment;
        this.phone = phone;
        this.email = email;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCodeDepartment() {
        return codeDepartment;
    }

    public void setCodeDepartment(int codeDepartment) {
        this.codeDepartment = codeDepartment;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", codeDepartment=" + codeDepartment +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
