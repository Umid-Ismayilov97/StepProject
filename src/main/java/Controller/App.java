package Controller;

import Additional.Person;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean exit=false;
        int flightId,seatsCount;
        String destination;

        Scanner scanner = new Scanner(System.in);
        System.out.println("**BOOKING APPLICATION**\n");
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Enter your surname : ");
        String surname = scanner.nextLine();
        Person person = new Person(name,surname);

        StringBuilder print = new StringBuilder();
        print.append("+--------------------------------------------------------+\n");
        print.append("|        TICKET RESERVATION SYSTEM (KIEV  AIRWAYS)       |\n");
        print.append("+--------------------------------------------------------+\n");
        print.append("| 1. ONLINE BOARD                                        |\n");
        print.append("| 2. SHOW THE FLIGHT INFO                                |\n");
        print.append("| 3. SEARCH FLIGHTS                                      |\n");
        print.append("| 4. BOOK FLIGHT                                         |\n");
        print.append("| 5. CANCEL                                              |\n");
        print.append("| 6. MY FLIGHT                                           |\n");
        print.append("| 6. EXIT                                                |\n");
        print.append("+--------------------------------------------------------+\n");

        do{
            System.out.println(print.toString());
            System.out.println("Enter menu number : ");
            int menunumber = scanner.nextInt();
            switch (menunumber) {
                case 1:
                    System.out.println("-> ONLINE BOARD <-");
                    System.out.println("- - - - -");
                    //flightController.getonlineboard();
                    System.out.println("- - - - -");
                break;
                case 2:
                    System.out.println("-> FLIGHTS INFO <-");
                    System.out.println("ENTER FLIGHT NUMBER : ");
                    flightId = scanner.nextInt();
                    System.out.println("- - - - -");
                   // flightController.getflightInfo(flightId);
                    System.out.println("- - - - -");
                    break;
                case 3:
                    System.out.println("-> SEARCH FLIGHTS <-");
                    System.out.println("ENTER THE DESTINATION : ");
                    destination = scanner.nextLine();
                    System.out.println("- - - - -");
                   // flightController.getflightInfo(destination);
                    System.out.println("- - - - -");
                    break;
                case 4:
                    System.out.println("-> BOOK A FLIGHT <-");
                    System.out.println("ENTER FLIGHT ID : ");
                    flightId = scanner.nextInt();
                    System.out.println("ENTER THE COUNT : ");
                    seatsCount = scanner.nextInt();
                    System.out.println("- - - - -");
                    //bookingController.book(person,flightId,seatsCount);
                    System.out.println("- - - - -");
                    break;
                case 5:
                    System.out.println("-> CANCEL THE FLIGHT <-");
                    System.out.println("ENTER THE BOOK FOR CANCEL : ");
                    flightId = scanner.nextInt();
                    System.out.println("- - - - -");
                   // bookingController.book(flightId);
                    System.out.println("- - - - -");

                    break;
                case 6:
                    System.out.println("-> MY FLIGHTS <-");
                    System.out.println("- - - - -");
                   // bookingController.myFlights(person);
                    System.out.println("- - - - -");

                    break;
                case 7:
                    System.out.println("CLOSING APLICATION ");
                    exit = true;
                    break;
                default:
                    System.out.println(" WRONG MENU NUMBER ");
            }
        } while (!exit);

    }
}
