package se.lexicon;

import java.util.Scanner;

public class LoopExamples {
    public static void main(String[] args) {

     boolean isAdult = true;
     while (isAdult){
         Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        if (age >=18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a child");
            isAdult = false;
        }
    }
boolean isContinue = true;
    do{
        System.out.println("## Calculator App ##");
        System.out.println("1.addididtion");
        System.out.println("2.addididtion");
        System.out.println("0.Exit");
    } while (isContinue);

    for ( int i= 1; i<10  ; i++  ){
        if (i== 5){
            continue;
        }
        System.out.println("Iteration: " +i);
    }

}
    {
    }
}
