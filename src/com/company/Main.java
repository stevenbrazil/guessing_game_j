package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        int chances = 6;
        int maxNum = 20;
        Random rand = new Random();
        int randNum = rand.nextInt(maxNum) + 1;
        
        while(count <= 5){
            count++;
            System.out.println("You have " + (chances - count) + " chances left...");
            System.out.println("Enter a number between 1 and 20: ");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            if(choice > 20 || choice < 1){
                System.out.println("Please choose a number between 1 and 20");
                count--;
            }else if (choice == randNum){
                System.out.println("You have chosen correctly!");
                break;
            }else if (choice > randNum){
                System.out.println("The number is lower...");
                
            }else if (choice < randNum){
                System.out.println("The number is higher...");
            }else {
                System.out.println("Invalid selection...Please choose a number");
                count--;
            }
            
            
        }
    }
}
