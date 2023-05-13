package com.samplecodetests.inheritencePolymorphismInterfacesAabstracts;

class A {
    A() {
        System.out.println("A being created");
    }
    void show() {
        System.out.println("In A - show()");
    }
}
class B extends A {
    B() {
        super();
        System.out.println("B being created");
    }
    void show() {
        System.out.println("In B - show()");
    }

    void showMe() {
        System.out.println("In B - showMe()");
    }
}
public class RuntimePolymorpismExample {

    public static void main(String[] args) {

        //Implicit Upcasting - child object being casted to parent class reference
        A a = new B();
        // below has compilation error : Cannot resolve method 'showMe' in 'A'
        //a.showMe();

        ((B) a).showMe();       // output - In B - showMe()

        //Runtime Polymorphism
        a.show();               // output - In B - show()

        // Below has compilation error: "incompatible types: A cannot be converted to B"
        // Implicit Downcasting
        // B b = new A();

        // Explicit Downcasting example - parent obj being assigned to Child class reference
        // This gives runtime error : "java.lang.ClassCastException: class A can't be cast to class B"
        B b = (B) new A();


    }

}
