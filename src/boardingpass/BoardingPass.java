package boardingpass;

import java.util.Scanner;

public class BoardingPass {

    //generate first part of boarding pass with date, origin, destination, ETA, and departure time
    public void flightInfo (Scanner input, PersonInfo x) {

        //input for departure date
        System.out.println("Please input your departure date (MM/DD/YYYY): ");
        String date = input.nextLine();
        x.setDate(date);

        //input for origin
        System.out.println("Please input your origin city(Ex. Atlanta, GA): ");
        String origin = input.nextLine();
        x.setOrigin(origin);

        //input for destination
        System.out.println("Please input your destination city(Ex. Tampa, FL): ");
        String destination = input.nextLine();
        x.setDestination(destination);

        //input for departure time
        System.out.println("Please input the time for your departure(Ex. 11:00 AM/ PM): ");
        String departureTime = input.nextLine();
        x.setDepartureTime(departureTime);

    }

    //ETA generator

    //generate second part of boarding pass with name, email, phone number, gender, and age
    public void userInfo(Scanner input, PersonInfo x) {

        //input for name
        System.out.println("Please enter your name (Ex. Ryan Smith): ");
        String name = input.nextLine();
        x.setName(name);

        //input for email
        System.out.println("Please enter a valid email (Ex. ryansmith@gmail.com): ");
        String email = input.nextLine();
        //validating email format
        while(!email.matches("^([\\w-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([\\w-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$")) {
            System.out.println("Please re-enter your email in the correct format");
            email = input.nextLine();
        }
        x.setEmail(email);

        //input for phone number
        System.out.println("Please enter a valid phone number(Ex. 123-456-7890): ");
        String number = input.nextLine();
        //validating phone number length
        while(number.length() != 10) {
            System.out.println("Invalid phone number. Try again.");
            number = input.nextLine();
        }
        x.setPhoneNumber(number);

        //input for gender
        System.out.println("Please enter your gender (F/M): ");
        String gender = input.nextLine();
        x.setGender(gender);

        //input for age
        System.out.println("Please enter your age (Ex. 45): ");
        int age = input.nextInt();
        x.setAge(age);
    }

    //generate ticket price with discounts
    public void ticketPrice(PersonInfo x) {
        //generate random price within 100 to 1000 for the user
        int ticketPrice = (int) Math.floor(((100 + Math.random() * 1000) * 10)/10);

        //reduce prices based on if the person:
        //age <= 12
        //age >= 60
        //gender = female
        if(x.getAge() <= 12) {
            System.out.println("The ticket price is $" + ticketPrice);
            System.out.println("Children 12 and under get a 50% discount!");
            int discountPrice = (int)(ticketPrice - (ticketPrice * 0.5));
            System.out.println("Ticket price after the discount: $" + discountPrice);
        } else if (x.getAge() >= 60) {
            System.out.println("The ticket price is $" + ticketPrice);
            System.out.println("Adults 60 years or older get a senior citizen discount of 60%!");
            int discountPrice = (int)(ticketPrice - (ticketPrice * 0.6));
            System.out.println("Ticket price after the discount: $" + discountPrice);
        } else if (x.getGender().toUpperCase().contains("F")) {
            System.out.println("The ticket price is $" + ticketPrice);
            System.out.println("Women get a 25% discount!");
            int discountPrice = (int)(ticketPrice - (ticketPrice * 0.25));
            System.out.println("Ticket price after the discount: $" + discountPrice);
        } else {
            System.out.println("Ticket price: $" + ticketPrice);
        }
    }

    //generate random boarding pass number
    public void boardingPassNumber(PersonInfo x) {
        int r1 = (int)Math.floor((Math.random()*(999999999 - 100000000)) + 1);
        x.setBoardingPassNumber(r1);
    }

    //print boarding pass will all flight info
    public void printBoardingPass(PersonInfo x) {
        System.out.println("Here is your boarding pass with all of your information!");
        System.out.println(x.getName().toUpperCase());
        System.out.println("Departing from " + x.getOrigin().toUpperCase());
        System.out.println("Arriving in " + x.getDestination().toUpperCase());
        System.out.println("Date of departure: " + x.getDate());
        System.out.println("Time of departure: " + x.getDepartureTime());
        System.out.println("Boarding pass number: " + x.getBoardingPassNumber());
    }
}
