/*
You were hired by PAGCOR as part of the programming team incharge of automating its BINGO game. 
Your task is to write a program that will accept an integer number whose value is from 1 to 75. 
Thereafter, your program should determine and print the letter that corresponds to that number. 
That is, numbers 
1 to 15 corresponds to the letter ‘B’, 
16 to 30 corresponds to the letter ‘I’, 
31 to 45 corresponds to the letter ‘N’, 
46 to 60 corresponds to the letter ‘G’ and 
61 to 75 corresponds to the letter ‘O’.
*/

import java.util.Scanner;

class Clemente_ConditionalControlStructure {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("BINGO Game");
        System.out.println("From numbers 1 to 75");

        int number = 0;
        
        System.out.print("Enter a number: ");
        number = input.nextInt();

        while(number > 75){
            System.out.print("Input out of range. Re-enter a number: ");
            number = input.nextInt();
        }

        if (number >= 1 && number <= 15) {
            System.out.println(number + " corresponds to letter B.");
        } else if (number >= 16 && number <= 30) {
            System.out.println(number + " corresponds to letter I.");
        } else if (number >= 31 && number <= 45) {
            System.out.println(number + " corresponds to letter N.");
        } else if (number >= 46 && number <= 60) {
            System.out.println(number + " corresponds to letter G.");
        } else if (number >= 61 && number <= 75) {
            System.out.println(number + " corresponds to letter O.");
        }

    }
}