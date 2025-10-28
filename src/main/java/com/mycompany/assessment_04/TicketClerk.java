/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assessment_04;

/**
 *
 * @author balaj
 */
public class TicketClerk {
    private String name;
    private String location;

    public TicketClerk(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void reserveSeat(Passenger passenger, Train train) {
        passenger.reserveSeat(train);
    }

    public void reserveTicket(Passenger passenger, Train train) {
        Ticket ticket = passenger.reserveSeat(train);
        passenger.purchaseTicket(ticket);
    }

    public void cancelTicket(Passenger passenger, Ticket ticket) {
        passenger.cancelTicket(ticket);
    }

    public void receivePayment(Passenger passenger, double amount) {
        passenger.makePayment(amount);
    }
}

