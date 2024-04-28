
package com.mycompany.company.system;

import java.util.ArrayList;


public class Department {
    
    public String name;
    public Address address;
    public Employee head;
    ArrayList<Office> offices;

    public Department(String name, Address address, Employee head) {
        this.name = name;
        this.address = address;
        this.head = head;
        this.offices = new ArrayList<>();
    }
    
    public void addOffice(Office office) {
        this.offices.add(office);
    }
    
    public void removeOffice(Office office) {
        this.offices.remove(office);
    }
}
