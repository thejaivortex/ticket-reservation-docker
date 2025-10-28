/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assessment_04;

/**
 *
 * @author balaj
 */

public class Assessment_04 {
    public static void main(String[] args) {
       System.out.println("Testing begins...");
       Passenger p = new Passenger("Alice", 25, "123 Main St", 1);
       Train t = new Train("Express", 101);
       TicketClerk clerk = new TicketClerk("Bob", "Central Station");
       clerk.reserveTicket(p, t);
       System.out.println("Reservation completed.");

    }
}