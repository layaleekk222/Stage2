
package com.mycompany.company.system;

import java.util.ArrayList;


public class Office {
    
    public String number;
    public ArrayList<Employee> employees;
    public Employee head;

    public Office(String number, Employee head) {
        this.number = number;
        this.head = head;
        this.employees = new ArrayList<>();
    }
    
    public void addEmployee(Employee emp) {
        this.employees.add(emp);
    }
    
    public void removeEmployee(Employee emp) {
        this.employees.remove(emp);
    }
}
