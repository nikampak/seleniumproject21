package com.cybertek.utilitties;

/*
We will create utility methods for repeated steps that can be use in browsers, and store in this class
 */
public class BrowserUtils {

    // create method name: wait
    // converting milliseconds to seconds
    // handle
    public static void sleep(int second){
        second *= 1000;
        try{
            Thread.sleep(second);
        }catch (InterruptedException e){
            System.out.println("Something happened in sleep method");

        }
    }
}
