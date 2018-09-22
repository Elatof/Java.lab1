package com.Elatof;

import com.Elatof.Package.*;

import java.util.Scanner;

public class Main {
public static int i=5;
    public static void main(String[] args) {
        /* Exercise 1: (2) Create a class containing an int and a char that are not initialized, and print
        their values to verify that Java performs default initialization.*/
      First first=new First();
      System.out.println(first.a);
      System.out.println(first.b);
        /*Exercise 2: (1) Following the HelloDate.java example in this chapter, create a “hello,
                world” program that simply displays that statement. You need only a single method in your class
        (the “main” one that gets executed when the program starts). Remember to make it static and
        to include the argument list, even though you don’t use the argument list. Compile the program
        with javac and run it using java. If you are using a different development environment than the
        JDK, learn how to compile and run programs in that environment.*/
       Second second=new Second();
       second.HelloWorld(0);
        /*Exercise 3: (1) Find the code fragments involving ATypeName and turn them into a
        program that compiles and runs.*/
        ATypeName a=new ATypeName();
        /*Exercise 4:  (1) Turn the DataOnly code fragments into a program that compiles and runs.*/
        DataOnly b=new DataOnly();
        /*Exercise 5: (1) Modify the previous exercise so that the values of the data in DataOnly are
        assigned to and printed in main( ).*/
        b.i=23;
        b.d=23.4;
        b.b=false;
        System.out.println(b.i);
        System.out.println(b.d);
        System.out.println(b.b);
        /*Exercise 6:  (2) Write a program that includes and calls the storage( ) method defined as a code fragment in
        this chapter.*/
        Ex_6 c=new Ex_6();
        System.out.println(c.storage("12345"));
        /*Exercise 7:  (1) Turn the Incrementable code fragments into a working program.*/
        Incrementable d=new Incrementable();
        d.increment();
        System.out.println(Main.i);
       /* Exercise 8:  (3) Write a program that demonstrates that, no matter how many objects you create of a
               particular class, there is only one instance of a particular static field in that class.*/
        Incrementable d_1=new Incrementable();
        d_1.increment();
        Incrementable d_2=new Incrementable();
        d_1.increment();
        Incrementable d_3=new Incrementable();
        d_1.increment();
        Incrementable d_4=new Incrementable();
        d_1.increment();
        System.out.println(Main.i);
        /*Exercise 9:  (2) Write a program that demonstrates that autoboxing works for all the primitive types and
                *      their wrappers.*/
        int i = 1;
        Integer I;
        I = i;
        System.out.println(I);

        boolean f= true;
        Boolean B;
        B = f;
        System.out.println(B);

        char ch = 'a';
        Character Ch;
        Ch = ch;
        System.out.println(Ch);

        byte by = 3;
        Byte By;
        By = by;
        System.out.println(By);

        short sh = 6;
        Short Sh;
        Sh = sh;
        System.out.println(Sh);

        long l = 9;
        Long L;
        L = l;
        System.out.println(L);

        float ff = (float) 1.1;
        Float F;
        F = ff;
        System.out.println(F);

        double e = 3.4;
        Double D;
        D = e;
        System.out.println(D);

        /*Exercise 11:    (1) Turn the AllTheColorsOfTheRainbow example into a program that compiles and runs.*/
        AllTheColorsOfTheRainbow g;
        g = new AllTheColorsOfTheRainbow();


    }
}
