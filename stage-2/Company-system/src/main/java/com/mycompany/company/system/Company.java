
package com.mycompany.company.system;

import java.util.ArrayList;


/** Singleton class. */
public class Company {
    
    public String name;
    public Employee head;
    private static Company company; /* static instance holds the only avaialbe instance of this class. */
    ArrayList<Department> departments;
    

    /** private constructor to prevent constructing companies from other classes. */
    private Company(String name, Employee head) {
        this.name = name;
        this.head = head;
        this.departments = new ArrayList<>();
    }
    
    public void addDepartment(Department department) {
        this.departments.add(department);
    }
    
    public void removeDepartment(Department department) {
        this.departments.remove(department);
    }
    
    /** static method to get Company instance.
     *  1. if the instance is null => construct new one.
     *  2. return the instance. 
     */
    public static Company getCompany(String name, Employee head) {
        
        if(Company.company == null) {
            
            Company.company = new Company(name, head);
        }
        
        return Company.company;
    }
}
