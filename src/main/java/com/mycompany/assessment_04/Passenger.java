/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assessment_04;

/**
 *
 * @author balaj
 */
public class Passenger {
    private String name;
    private int age;
    private String address;
    private int passengerNo;

    public Passenger(String name, int age, String address, int passengerNo) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.passengerNo = passengerNo;
    }

    public void searchTrains() {
        // Logic to search available trains
    }

    public void viewSchedule() {
        // Logic to view train schedule
    }

    public Ticket reserveSeat(Train train) {
        // Logic to reserve a seat and return a ticket
        return new Ticket(this, train);
    }

    public void purchaseTicket(Ticket ticket) {
        // Logic to purchase the ticket
    }

    public void makePayment(double amount) {
        // Logic to make payment
    }

    public void cancelTicket(Ticket ticket) {
        ticket.cancelTicket();
    }
}
