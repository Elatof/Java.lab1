package com.Elatof;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Three_arguments {
    /*Exercise 10:    (2) Write a program that prints three arguments taken from the command line. To do this, you
     *      will need to index into the command-line array of Strings.*/
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            System.out.println(args[i]);
        }

    }


}
