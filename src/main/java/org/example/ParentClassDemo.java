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
    }
    public static void main(String[] args) {
        ChildClassDemo cd = new ChildClassDemo();
        cd.engine();
    }
}