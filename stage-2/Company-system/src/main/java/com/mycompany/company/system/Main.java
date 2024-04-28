

package com.mycompany.company.system;


public class Main {

    public static void main(String[] args) {
        
        Address add1 = new Address("NY", "LA", "109", "A910");
        Employee companyHead = new Employee("TEST1", "1AE", 300, 50, add1);
        Employee dept1head = new Employee("TEST2", "12AE", 300, 50, add1);
        Employee dept2head = new Employee("TEST3", "13AE", 300, 50, add1);
        
        EmployeeBuilder empBuilder = new EmployeeBuilder();
        
        Employee officeemp1 = empBuilder.setName("TEST1").setId("120AB").setAddress(add1).setAge(30).setSalary(200).build();
        Employee officeemp2 = empBuilder.setName("TEST2").setId("121AB").setAddress(add1).setAge(31).setSalary(300).build();
        Employee officeemp3 = empBuilder.setName("TEST3").setId("122AB").setAddress(add1).setAge(32).setSalary(400).build();
        Employee officeemp4 = empBuilder.setName("TEST4").setId("123AB").setAddress(add1).setAge(33).setSalary(500).build();
        
        officeemp1.setAddressFormatter(new CustomAddressFormatter());

        // Create the company
        Company co = Company.getCompany("TEST COMPANY", companyHead);
        
        // Create departments
        Department dept1 = new Department("TEST DEPT1", add1, dept1head);
        Department dept2 = new Department("TEST DEPT2", add1, dept2head);
        
        // Add departments to the company
        co.addDepartment(dept1);
        co.addDepartment(dept2);
        
        // Create offices
        Office off1 = new Office("OFFICE1", dept1head);
        Office off2 = new Office("OFFICE2", dept2head);
        Office off3 = new Office("OFFICE3", dept1head);
        Office off4 = new Office("OFFICE4", dept2head);
        
        // Add offices to departments
        dept1.addOffice(off1);
        dept1.addOffice(off2);
        dept2.addOffice(off3);
        dept2.addOffice(off4);
        
        // Add employees to offices
        off1.addEmployee(officeemp1);
        off2.addEmployee(officeemp2);
        off3.addEmployee(officeemp3);
        off4.addEmployee(officeemp4);
    }
}
