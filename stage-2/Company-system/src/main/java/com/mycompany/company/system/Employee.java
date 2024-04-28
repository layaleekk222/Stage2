
package com.mycompany.company.system;


public class Employee{
    
    public String name;
    private String id;
    private double salary;
    public int age;
    private Address address;


    public Employee(String name, String id, double salary, int age, Address address) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.age = age;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }


    public Address getAddress() {
        return address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
