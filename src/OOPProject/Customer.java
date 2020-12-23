package OOPProject;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Customer {
    Scanner input = new Scanner(System.in);

    private String customerName, phoneNumber, email, address;

    public Customer() {

    }

    public Customer(String customerName, String phoneNumber, String email) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getCustomerName() {

        return customerName;

    }

    public void setCustomerName(String customerName) {

        this.customerName = customerName;

    }

    public String getPhoneNumber() {

        return phoneNumber;

    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;

    }

    public String getEmail() {

        return email;

    }

    public void setEmail(String email) {

        this.email = email;

    }

    public String getAddress() {

        return address;

    }

    public void setAddress(String address) {

        this.address = address;

    }

    public void displayCustomerDetails() {

        System.out.println("Name: " + this.customerName);
        System.out.println("Phone number: " + this.phoneNumber);
        System.out.println("Email: " + this.email);

    }
}
