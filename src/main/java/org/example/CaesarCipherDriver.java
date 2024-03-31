package org.example;

//Long Nguyen
//Programming Fundamentals

import java.util.Random;
import java.util.Scanner;

public class CaesarCipherDriver {

    public static void main(String[] args) {

    //Creating Scanner
        Scanner scan = new Scanner(System.in);


    //Declaring Variables
        int min = 0;
        int max = 15;


    //Useless Info
        System.out.println("Welcome to the Cipher Program.");

    //Asking For and Taking Input
        System.out.print("Enter a String of Exactly Twelve Characters You Want to Encrypt: ");
        String input = scan.nextLine();



    //Check if the input has 12 characters
        if (input.length() != 12) {
            System.out.println("Please read directions and rerun it again!");
            return;
        }

    //Scan Characters in the Input
        char input0 = input.charAt(0);
        char input1 = input.charAt(1);
        char input2 = input.charAt(2);
        char input3 = input.charAt(3);
        char input4 = input.charAt(4);
        char input5 = input.charAt(5);
        char input6 = input.charAt(6);
        char input7 = input.charAt(7);
        char input8 = input.charAt(8);
        char input9 = input.charAt(9);
        char input10 = input.charAt(10);
        char input11 = input.charAt(11);


    //Seed Input
        System.out.print("Input a Seed Value: ");
        int inputSeed = scan.nextInt();


    //Generate Keys
        Random randKey = new Random(inputSeed);

        int rKey0 = randKey.nextInt(26);
        int rKey1 = randKey.nextInt(26);
        int rKey2 = randKey.nextInt(26);
        int rKey3 = randKey.nextInt(26);
        int rKey4 = randKey.nextInt(26);
        int rKey5 = randKey.nextInt(26);
        int rKey6 = randKey.nextInt(26);
        int rKey7 = randKey.nextInt(26);
        int rKey8 = randKey.nextInt(26);
        int rKey9 = randKey.nextInt(26);
        int rKey10 = randKey.nextInt(26);
        int rKey11 = randKey.nextInt(26);

    //Displaying Keys
        System.out.println("Keys are: " + rKey0 + rKey1 + rKey2 + rKey3 + rKey4 + rKey5 + rKey6 + rKey7 + rKey8 + rKey9 + rKey10 + rKey11 );

    //Encoding
        char enc0 = (char) (rKey0+input0);
        char enc1 = (char) (rKey1+input1);
        char enc2 = (char) (rKey2+input2);
        char enc3 = (char) (rKey3+input3);
        char enc4 = (char) (rKey4+input4);
        char enc5 = (char) (rKey5+input5);
        char enc6 = (char) (rKey6+input6);
        char enc7 = (char) (rKey7+input7);
        char enc8 = (char) (rKey8+input8);
        char enc9 = (char) (rKey9+input9);
        char enc10 = (char) (rKey10+input10);
        char enc11 = (char) (rKey11+input11);

    //Displaying Encoded Text
        System.out.println("Encoded Text: "+enc0+enc1+enc2+enc3+enc4+enc5+enc6+enc7+enc8+enc9+enc10+enc11);

    //More useless text
        System.out.println("Programming Fundamentals");
        System.out.println("NAME: Long Nguyen");
        System.out.println("PROGRAMMING ASSIGNMENT 1");

    }
}

