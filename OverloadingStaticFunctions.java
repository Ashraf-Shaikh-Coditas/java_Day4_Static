package Week2.Day4;

// 3.1)Can we Overload static methods in Java

public class OverloadingStaticFunctions {
    public static void display(int num) {
        System.out.println(num+" is displayed");
    }

    public static void display() {
        System.out.println(" Nothing is  displayed");
    }

    public static void display(float num) {
        System.out.println(num+" is displayed");
    }

    public static void display(char c) {
        System.out.println(c+" is displayed");
    }

    public static void main(String[] args) {
        display();
        display(2);
        display(2.33f);
        display('A');
    }
}

// In case of overloading static methods : Program executes successfully . As Overloading static
// methods is possible

/*

Nothing is  displayed
2 is displayed
2.33 is displayed
A is displayed



* */