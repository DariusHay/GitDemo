package org.example;

public class ParentClassDemo {
    String color = "red";
    public void gear(){
        System.out.println("Gear code is implemented");
    }
    public void brakes(){
        System.out.println("Brakes code is implemented");
    }
    public void audioSystem(){
        System.out.println("Audio System code is implemented");
        //GitDemo
        System.out.println("Adding new lines for github purposes.");
        System.out.println("Adding new lines for github purposes 2.");
        System.out.println("Adding new lines for github purposes 5.");
        System.out.println("Adding new lines for github purposes 6. Develop branch");

        //Git-Practice
        System.out.println("Adding new lines for github purposes 3.");
        System.out.println("Adding new lines for github purposes 4.");
    }
    public static void main(String[] args) {
        ChildClassDemo cd = new ChildClassDemo();
        cd.engine();
    }
}