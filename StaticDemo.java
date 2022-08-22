package Week2.Day4;

import com.sun.corba.se.impl.encoding.CDROutputObject;
// 1)WAP of static keyword with all possible ways. (variable,method,class.block)
class OuterClass {
    static {
        System.out.println("This is a OuterClass's static block");
    }

    static int counter = 100;     // Static variable

    public static class InnerClass {            // Static Class

        static int innerCounter = 200;            // Static variable inside Inner class
        static void display() {                 // Static function
            System.out.println("This is display() function of inner class ....");
        }
    }


}

public class StaticDemo {
    static {
        System.out.println("This is main class's static initializer block");
    }
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass.display();          // static function of static class called.

        System.out.println(OuterClass.counter);    // Static variable printed .


        System.out.println(OuterClass.InnerClass.innerCounter);  // Inner class's static variable


    }
}

