package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {
    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in);
        printReverse(input);
    }

    private static void printReverse(final Scanner input) {
        if(!input.hasNextLine()){
            return;
        }
        else{
            String str = input.nextLine();
            System.out.println(str);
            printReverse(input);
            System.out.println(str);
        }
    }
}
