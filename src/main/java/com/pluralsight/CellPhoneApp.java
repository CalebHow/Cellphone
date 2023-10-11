package com.pluralsight;
import java.util.Scanner;
public class CellPhoneApp {

    public static void main(String[] args) {
        Cellphone phone = new Cellphone();
        Scanner input = new Scanner(System.in);

        System.out.print("What is your serial number? ");
        phone.setSerialNumber(input.nextInt());
        input.nextLine();
        System.out.print("What model is your phone? ");
        phone.setModel(input.nextLine());
        System.out.print("Who is your carrier? ");
        phone.setCarrier(input.nextLine());
        System.out.print("What is the phone number? ");
        phone.setPhoneNumber(input.nextLine());
        System.out.print("Who owns this phone? ");
        phone.setOwner(input.nextLine());

        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrierCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }
}
