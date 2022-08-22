package Week2.Day4;

//3.2) Can we Override static methods in Java

class Parent {
    public static void show() {
        System.out.println("Parent's static show() method called.");
    }
}

class Child extends Parent {
    public static void show() {
        System.out.println("Child's static show() method called .");
    }
}
public class OverridingStaticMethod {
    public static void main(String[] args) {
        Parent.show();
        Child.show();
    }
}

// Program executes successfully . We get desired output as well. But this is not Overriding .
// It is called Method Hiding . This is because static methods are resolved at compile time.

/*

Parent's static show() method called.
Child's static show() method called .

* */