package com.samplecodetests.java8examples.java8features.Interfaces;

public class DefaultInterfaceExample {

    public static void main(String[] args) {
        DefaultInterface.displayStaticMethod();

        DefaultInterface child = new Child();
        child.displayDefaultMethod();
        child.displayNormalMethod();
    }

}

interface DefaultInterface {

    public default void displayDefaultMethod() {
        System.out.println("Display inside default method");
    }

    void displayNormalMethod();

    static void displayStaticMethod() {
        System.out.println("Display inside static method");
    }
}

class Child implements DefaultInterface {

    @Override
    public void displayNormalMethod() {
        System.out.println("Display from normal method");
    }
}