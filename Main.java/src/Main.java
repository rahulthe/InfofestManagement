/*
 Author: Rahul Bicholkar
 Seat no: 24P0320058
 File name:Main.java
 Project Name: College event management system
 Description: A simple INFOFEST management system where the admin can
 add event names, winners of events and otheractivites. The admin can also view all the
 details they have added.
 Project Date: 26/11/2024~
*/


import java.util.*;

class Infofest<E,O,W> { //Generic class
    private E eventschedule;
    private O otheractivities;
    private W winners;

    public Infofest(E eventschedule, O otheractivities, W winners) {
        this.eventschedule = eventschedule;
        this.otheractivities = otheractivities;
        this.winners = winners;
    }

    public E getEventschedule() {
        return eventschedule;
    }

    public O getOtheractivities() {
        return otheractivities;
    }

    public W getWinners() {
        return winners;
    }
}

public class Main {
    private static <E,O,W> void displaydetails(ArrayList<Infofest<E,O,W>> event) { //Generic method
        if (event.isEmpty()) {
            System.out.println("No details");
        } else {
            System.out.println("The details are :");
            for (Infofest<E, O, W> d : event) {
                System.out.println("Event is: " + d.getEventschedule());
                System.out.println("Other activities are: " + d.getOtheractivities());
                System.out.println("Winners are: " + d.getWinners());
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Infofest<String,String,String>> event = new ArrayList<>();

        int choice;
        do {
            System.out.println("Welcome to INFOFEST'24!, please choose the options below");
            System.out.println("1. Enter events, other activites and winners");
            System.out.println("2. Display details");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter event: ");
                    String events = sc.next();
                    System.out.println("Enter other activities: ");
                    String otheract = sc.next();
                    System.out.println("Enter the winners: ");
                    String winners = sc.next();
                    event.add(new Infofest<>(events,otheract,winners));
                break;

                case 2: displaydetails(event);
                    break;

                case 3: break;

                default:System.out.println("Invalid choice");
                break;
            }
        }while(choice!=3);
    }
}
