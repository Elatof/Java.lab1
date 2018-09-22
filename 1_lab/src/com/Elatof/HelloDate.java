package com.Elatof;

import java.util.Date;
/* Exercise 12: (2) Find the code for the second version of HelloDate.java, which is the simple
        comment documentation example. Execute Javadoc on the file and view the results with your
        Web browser.*/
/** The first Thinking in Java example program.
        * Displays a string and today's date.
        * @author Bruce Eckel
        * @author www.MindView.net
        * @version 4.0
        */
public class HelloDate {
    /** Entry point to class & application.
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, it's: ");
        System.out.println(new Date());
    }
}
