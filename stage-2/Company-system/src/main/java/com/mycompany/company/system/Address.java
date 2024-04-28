
package com.mycompany.company.system;


public class Address {
    
    public String city;
    public String state;
    public String streetNo;
    public String postalCode;

    public Address(String city, String state, String streetNo, String postalCode) {
        this.city = city;
        this.state = state;
        this.streetNo = streetNo;
        this.postalCode = postalCode;
    }
    
    public String getStreetNo() {
        return this.streetNo;
    }
    
    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }
    
    @Override
    public String toString() {
        return "Address{" + "city=" + city + ", state=" + state + ", streetNo=" + streetNo + ", postalCode=" + postalCode + '}';
    }
}
