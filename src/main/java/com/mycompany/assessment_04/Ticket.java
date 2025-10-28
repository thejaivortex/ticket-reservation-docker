/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assessment_04;

/**
 *
 * @author balaj
 */
public class Ticket {
    private int ticketNo;
    private String startingLocation;
    private String destinationLocation;
    private int passengerNo;
    private double paymentAmount;
    private Passenger passenger;
    private Train train;

    public Ticket(Passenger passenger, Train train) {
        this.passenger = passenger;
        this.train = train;
        // assign and generate ticketNo, startingLocation, etc.
    }

    public void cancelTicket() {
        // Logic to cancel the ticket
    }
}

