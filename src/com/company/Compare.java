package com.company;

public class Compare {

    public static void main(String[] args) {
        short numberOne = 4;
        short numberTwo = -7;
        if (numberOne > numberTwo) {
            System.out.println("NumberOne is largest");
        } else if (numberTwo > numberOne) {
            System.out.println("NumberTwo is largest");
        }
        if (numberOne < numberTwo) {
            System.out.println("NumberOne is smallest");
        } else if (numberTwo < numberOne) {
            System.out.println("NumberTwo is smallest");
        }
        if (numberOne == numberTwo) {
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Numbers are not equal");
        }
        if (!(numberOne % 2 == 0)) {
            System.out.println("NumberOne is odd");
        } else {
            System.out.println("NumberOne is even");
        }
        if (!(numberTwo % 2 == 0)) {
            System.out.println("NumberTwo is odd");
        } else {
            System.out.println("NumberTwo is even");
        }
        if (numberOne < 0) {
            System.out.println("NumberOne is negative");
        }
        if (numberTwo < 0) {
            System.out.println("NumberTwo is negative");
        }
        if (numberOne > 0) {
            System.out.println("NumberOne is positive");
        }
        if (numberTwo > 0) {
            System.out.println("NumberTwo is positive");
        }
        if (numberOne < 100) {
            System.out.println("NumberOne is less than 100");
        }
        if (numberTwo < 100) {
            System.out.println("NumberTwo is less than 100");
        }
    }
}
