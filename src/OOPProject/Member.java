package OOPProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
public class Member {
    Scanner input = new Scanner(System.in);
    private String memberID, name, phoneNumber, email;
    private static int numOfMember;
    Member[] memberArray = new Member[10];

    public Member() {

        numOfMember++;

        setMemberID();
    }

    public Member(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;

        numOfMember++;

        setMemberID();
    }

    public String getMemberID() {

        return memberID;
    }

    private void setMemberID() {
        memberID = String.format("%04d", numOfMember);
    }

    public void registerMember() {
        for (int j = 0; j < memberArray.length; j++) {
            System.out.println("Enter your name");
            String customerName = input.next();

            System.out.println("Enter you phone number: ");
            phoneNumber = input.next();

            System.out.println("Enter you email: ");
            email = input.next();

            memberArray[j] = new Member(customerName, phoneNumber, email);

            System.out.println("Your member ID: " + memberArray[j].getMemberID());

            System.out.println("Register Successfully!\n");
        }
    }

    public void isMember() {

        System.out.println("Name: " + name);
        System.out.println("You are a member.");

    }
}
