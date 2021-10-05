package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("what is 2+2?");
        String UserOpinion = input.nextLine();

        if (UserOpinion.contains("1")) {
            System.out.println("you are wrong");
        }
        if (UserOpinion.contains("2")) {
            System.out.println("you are wrong");
        }
        if (UserOpinion.contains("3")) {
            System.out.println("you are wrong");
        }
        if (UserOpinion.contains("4")) {
            System.out.println("you are correct");
        } else {
            System.out.println("you are worong");
        }
    }
}