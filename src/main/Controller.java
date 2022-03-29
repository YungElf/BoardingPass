package main;

import boardingpass.BoardingPass;
import boardingpass.PersonInfo;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        //generating Scanner object, boarding pass object, and person info project
        Scanner input = new Scanner(System.in);
        BoardingPass pass = new BoardingPass();
        PersonInfo x = new PersonInfo();

        //calling methods from boarding pass class on person info object
        //we can change what our application says below..just putting general statements for everything
        System.out.println("Hello! Welcome to Team Five Airlines!");
        System.out.println("To help you find your next adventure, please fill out the following details");
        pass.flightInfo(input, x);

        System.out.println("Please fill out information below to receive your ticket price and boarding pass");
        pass.userInfo(input, x);

        pass.ticketPrice(x);
        pass.boardingPassNumber(x);
        pass.printBoardingPass(x);
    }
}
